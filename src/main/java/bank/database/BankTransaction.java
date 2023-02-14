package bank.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bank.Enums.TransactionStats;
import bank.Enums.TransactionType;
import bank.Modals.Transaction;

/**
 * BankTransaction
 */
public class BankTransaction {
  private final Connection conn = CreateConnection.conn;
  
  protected void insertTransaction(Transaction transaction) {
    try {
      PreparedStatement stmt = conn.prepareStatement("INSERT INTO BankTrans VALUES(?, ?, ?, ?, ?, ?, ?)");
      stmt.setString(1, transaction.transactionID);
      stmt.setString(2, transaction.accountNumber);
      stmt.setDouble(3, transaction.oldBalance);
      stmt.setString(4, transaction.transactionType.name());
      stmt.setDouble(5, transaction.transactionAmount);
      stmt.setDouble(6, transaction.newBalance);
      stmt.setString(7, transaction.transactionStats.name());

      stmt.executeUpdate();

      updateBankTransactionTable(transaction);
      
      if (transaction.transactionStats == TransactionStats.Valid)
          insertIntoValid(transaction);
      else
          insertIntoInValid(transaction);
           
    } catch (SQLException e) {
      StackTraceElement element = e.getStackTrace()[0];
      System.err.println("File: " + element.getFileName() +"Line Number: " + element.getLineNumber());
      System.err.println("Error Code: " + e.getErrorCode());
      System.err.println("Error Message: " + e.getMessage());
    }
  }

  protected Transaction getTransaction(String transactionID) {
    try {
      PreparedStatement stmt = conn.prepareStatement("SELECT TransID, AcctNo, OldBal, TransType, TransAmt, NewBal, TransStat FROM BankTrans WHERE TransID = ?");
      stmt.setString(1, transactionID);
      
      ResultSet res = stmt.executeQuery();
      res.next();

      Transaction transaction = new Transaction(
          res.getString("TransID"),
          res.getString("AcctNo"),
          res.getDouble("OldBal"),
          TransactionType.valueOf(res.getString("TransType")),
          res.getDouble("TransAmt"),
          res.getDouble("NewBal"),
          TransactionStats.valueOf(res.getString("TransStat"))
        );

      return transaction;
    } catch (SQLException e) {
      StackTraceElement element = e.getStackTrace()[0];
      System.err.println("File: " + element.getFileName() +"Line Number: " + element.getLineNumber());
      System.err.println("Error Code: " + e.getErrorCode());
      System.err.println("Error Message: " + e.getMessage());

      return Transaction.defaultTransaction();
    }
  }

  public ArrayList<Transaction> getAllTransactions() {
    ArrayList<Transaction> transactions = new ArrayList<>();

    try {
      PreparedStatement stmt = conn.prepareStatement("SELECT TransID, AcctNo, OldBal, TransType, TransAmt, NewBal, TransStat FROM BankTrans");
      ResultSet res = stmt.executeQuery();

      while (res.next()) {
        Transaction transaction = new Transaction(
          res.getString("TransID"),
          res.getString("AcctNo"),
          res.getDouble("OldBal"),
          TransactionType.valueOf(res.getString("TransType")),
          res.getDouble("TransAmt"),
          res.getDouble("NewBal"),
          TransactionStats.valueOf(res.getString("TransStat"))
        );
        transactions.add(transaction);
      }
      return transactions;

    } catch (SQLException e) {
      StackTraceElement element = e.getStackTrace()[0];
      System.err.println("File: " + element.getFileName() +"Line Number: " + element.getLineNumber());
      System.err.println("Error Code: " + e.getErrorCode());
      System.err.println("Error Message: " + e.getMessage());

      return transactions;
    }
  }

  public ArrayList<Transaction> getValidTransactions() {
    ArrayList<Transaction> transactions = new ArrayList<>();

    try {
      PreparedStatement stmt = conn.prepareStatement("SELECT TransID, AcctNo, OldBal, TransType, TransAmt, NewBal, TransStat FROM BankTrans WHERE TransID in (SELECT TransID from ValidTrans)");
      ResultSet res = stmt.executeQuery();

      while (res.next()) {
        Transaction transaction = new Transaction(
          res.getString("TransID"),
          res.getString("AcctNo"),
          res.getDouble("OldBal"),
          TransactionType.valueOf(res.getString("TransType")),
          res.getDouble("TransAmt"),
          res.getDouble("NewBal"),
          TransactionStats.valueOf(res.getString("TransStat"))
        );
        transactions.add(transaction);
      }
      return transactions;

    } catch (SQLException e) {
      StackTraceElement element = e.getStackTrace()[0];
      System.err.println("File: " + element.getFileName() +"Line Number: " + element.getLineNumber());
      System.err.println("Error Code: " + e.getErrorCode());
      System.err.println("Error Message: " + e.getMessage());

      return transactions;
    }
  }

  public ArrayList<Transaction> getInValidTransactions() {
    ArrayList<Transaction> transactions = new ArrayList<>();

    try {
      PreparedStatement stmt = conn.prepareStatement("SELECT TransID, AcctNo, OldBal, TransType, TransAmt, NewBal, TransStat  FROM BankTrans WHERE TransID in (SELECT TransID from InValidTrans)");
      ResultSet res = stmt.executeQuery();

      while (res.next()) {
        Transaction transaction = new Transaction(
          res.getString("TransID"),
          res.getString("AcctNo"),
          res.getDouble("OldBal"),
          TransactionType.valueOf(res.getString("TransType")),
          res.getDouble("TransAmt"),
          res.getDouble("NewBal"),
          TransactionStats.valueOf(res.getString("TransStat"))
        );
        transactions.add(transaction);
      }
      return transactions;

    } catch (SQLException e) {
      StackTraceElement element = e.getStackTrace()[0];
      System.err.println("File: " + element.getFileName() +"Line Number: " + element.getLineNumber());
      System.err.println("Error Code: " + e.getErrorCode());
      System.err.println("Error Message: " + e.getMessage());

      return transactions;
    }
  }
  
  private void insertIntoValid(Transaction transaction) {
    try {
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO ValidTrans VALUES(?, ?, ?, ?)");
        stmt.setString(1, transaction.transactionID);
        stmt.setString(2, transaction.transactionType.name());
        stmt.setDouble(3, transaction.transactionAmount);
        stmt.setString(4, transaction.transactionStats.name());

        stmt.executeUpdate();
    } catch (SQLException e) {
      StackTraceElement element = e.getStackTrace()[0];
      System.err.println("File: " + element.getFileName() +"Line Number: " + element.getLineNumber());
      System.err.println("Error Code: " + e.getErrorCode());
      System.err.println("Error Message: " + e.getMessage());
    }
  }
  
  private void insertIntoInValid(Transaction transaction) {
    try {
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO InValidTrans VALUES(?, ?, ?, ?)");
        stmt.setString(1, transaction.transactionID);
        stmt.setString(2, transaction.transactionType.name());
        stmt.setDouble(3, transaction.transactionAmount);
        stmt.setString(4, transaction.transactionStats.name());

        stmt.executeUpdate();
    } catch (SQLException e) {
      StackTraceElement element = e.getStackTrace()[0];
      System.err.println("File: " + element.getFileName() +"Line Number: " + element.getLineNumber());
      System.err.println("Error Code: " + e.getErrorCode());
      System.err.println("Error Message: " + e.getMessage());
    }
  }

  private void updateBankTransactionTable(Transaction transaction) {
    try {
      PreparedStatement stmt = conn.prepareStatement("UPDATE BankTrans SET NewBal = ?, TransStat = ? WHERE TransID = ?");
      stmt.setDouble(1, transaction.newBalance);
      stmt.setString(2, transaction.transactionStats.name());
      stmt.setString(3, transaction.transactionID);

      stmt.executeUpdate();
    } catch (SQLException e) {
      System.err.println("Error Code: " + e.getErrorCode());
      System.err.println("Error Message: " + e.getMessage());
      System.out.print("*** Stack trace ***");
      e.printStackTrace();
    }
  }
}
