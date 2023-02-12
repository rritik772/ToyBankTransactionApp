package bank;

import java.util.ArrayList;
import java.util.Properties;

import bank.Enums.TransactionStats;
import bank.Enums.TransactionType;
import bank.GUI.TransactionsGUI;
import bank.Modals.Transaction;
import bank.database.BankTransaction;
import bank.database.CreateConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started" );

        Properties props = new Properties();
        props.setProperty("url", "jdbc:mysql://ap-south.connect.psdb.cloud:3306/projecta");
        props.setProperty("username", args[0]);
        props.setProperty("password", args[1]);

        CreateConnection conn = new CreateConnection(props);
        conn.getConnection();

        TransactionsGUI.main(args);
//        System.out.println( "isConnected: " + conn.isConnected());
//
//        BankTransaction bnk = new BankTransaction();
//
//        System.out.println("---- All Transactions ----");
//        ArrayList<Transaction> transactions = bnk.getAllTransactions();
//        System.out.println(transactions);
//
//        System.out.println("\n---- Valid Transactions ----");
//        transactions = bnk.getValidTransactions();
//        System.out.println(transactions);
//
//        System.out.println("\n---- InValid Transaction ----");
//        transactions = bnk.getInValidTransactions();
//        System.out.println(transactions);
//
//        System.out.println("\n---- Insert a new Transaction ----");
//        Transaction transaction = new Transaction("T003", "2002", 5500, TransactionType.D, 1000, 6500, TransactionStats.Valid);
//        transaction.insertTransaction();
//
//        System.out.println("\n---- Latest Transactions ----");
//        transactions = bnk.getAllTransactions();
//        System.out.println(transactions);
    }
}
