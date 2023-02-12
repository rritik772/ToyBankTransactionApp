package bank.Modals;

import java.text.MessageFormat;

import bank.Enums.TransactionStats;
import bank.Enums.TransactionType;
import bank.database.BankTransaction;

/**
 * Transaction
 */
public class Transaction extends BankTransaction {

  public String transactionID;
  public String accountNumber;
  public double oldBalance;
  public TransactionType transactionType;
  public double transactionAmount;
  public double newBalance;
  public TransactionStats transactionStats;

  public Transaction(
      String transactionID,
      String accountNumber,
      double oldBalance,
      TransactionType transactionType,
      double transactionAmount,
      double newBalance,
      TransactionStats transactionStats
    ) {
      this.transactionID = transactionID;
      this.accountNumber = accountNumber;
      this.oldBalance = oldBalance;
      this.transactionType = transactionType;
      this.transactionAmount = transactionAmount;
      this.newBalance = newBalance;
      this.transactionStats = transactionStats;
  }

  public void insertTransaction() {
    super.insertTransaction(this);
  }

  public Transaction getTransaction() {
    return super.getTransaction(this.transactionID);
  }

  public static Transaction defaultTransaction() {
    return new Transaction("", "", 0, TransactionType.W, 0, 0, TransactionStats.Invalid);
  }

  public String toString() {
    return MessageFormat.format("\n" +
        " transactionID      : {0}\n" +
        " accountNumber      : {1}\n" +
        " oldBalance         : {2}\n" +
        " transactionType    : {3}\n" +
        " transactionAmount  : {4}\n" +
        " newBalance         : {5}\n" + 
        " transactionStats   : {6}\n"
      , transactionID, accountNumber, oldBalance, transactionType, transactionAmount, newBalance, transactionStats);
  }
}
