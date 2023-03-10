/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bank.GUI;

import bank.Enums.TransactionStats;
import bank.Enums.TransactionType;
import bank.Modals.Transaction;
import bank.database.BankTransaction;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ritik
 */
public class TransactionsGUI extends javax.swing.JFrame {

    /**
     * Creates new form TransactionsGUI
     */
    public TransactionsGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        transactionID = new javax.swing.JTextField();
        accNo = new javax.swing.JTextField();
        oldBalance = new javax.swing.JTextField();
        transactionAmount = new javax.swing.JTextField();
        newBalance = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        getAllTransactions = new javax.swing.JButton();
        getValidTransaction = new javax.swing.JButton();
        getInvalidTransaction = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        deposit = new javax.swing.JRadioButton();
        withdraw = new javax.swing.JRadioButton();

        buttonGroup2.add(deposit);
        buttonGroup2.add(withdraw);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(740, 480));
        setMinimumSize(new java.awt.Dimension(740, 480));
        setPreferredSize(new java.awt.Dimension(480, 640));
        setSize(new java.awt.Dimension(740, 480));

        jLabel1.setText("TransactionID");

        jLabel2.setText("Transaction Type");

        jLabel3.setText("Transaction Amount");

        jLabel4.setText("Account No.");

        jLabel5.setText("Old Balance");

        jLabel6.setText("New Balance");

        insert.setText("Insert Transaction");
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
        });

        getAllTransactions.setText("Get All Transaction");
        getAllTransactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getAllTransactionsMouseClicked(evt);
            }
        });

        getValidTransaction.setText("Get Valid Transaction");
        getValidTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getValidTransactionMouseClicked(evt);
            }
        });

        getInvalidTransaction.setText("Get Invalid Transaction");
        getInvalidTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getInvalidTransactionMouseClicked(evt);
            }
        });

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Account No.", "Old Balance", "Transaction Type", "Transaction Amount", "New Balance", "Valid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transactionTable);

        deposit.setText("Deposit");

        withdraw.setText("Withdraw");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insert)
                        .addGap(82, 82, 82)
                        .addComponent(getAllTransactions))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(transactionID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(accNo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(oldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(deposit)
                                    .addComponent(withdraw))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(transactionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(newBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(getValidTransaction)
                                .addGap(38, 38, 38)
                                .addComponent(getInvalidTransaction)
                                .addGap(52, 52, 52))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(transactionID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transactionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(accNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(oldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(withdraw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deposit)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insert)
                    .addComponent(getAllTransactions)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(getInvalidTransaction)
                        .addComponent(getValidTransaction)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
        // TODO add your handling code here:
        String _transactionID = transactionID.getText();
        String _accountNo = accNo.getText();
        double _oldBalance = Double.parseDouble(oldBalance.getText());
        double _transactionAmount = Double.parseDouble(transactionAmount.getText());
        double _newBalance = Double.parseDouble(newBalance.getText());
        TransactionType _transactionType = withdraw.isSelected() ? TransactionType.W : TransactionType.D;
        TransactionStats _transactionStats = TransactionStats.Invalid;
        
        if (_transactionType.equals(TransactionType.D) && _oldBalance + _transactionAmount == _newBalance)
            _transactionStats = TransactionStats.Valid;
        else if (_transactionType.equals(TransactionType.W) && _oldBalance - _transactionAmount == _newBalance && _newBalance >= 0)
            _transactionStats = TransactionStats.Valid;
        
        Transaction transaction = new Transaction(_transactionID, _accountNo, _oldBalance, _transactionType, _transactionAmount, _newBalance, _transactionStats);
        transaction.insertTransaction();
    }//GEN-LAST:event_insertMouseClicked

    private void getAllTransactionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getAllTransactionsMouseClicked
        BankTransaction bnk = new BankTransaction();
        ArrayList<Transaction> transactions = bnk.getAllTransactions();
        
        DefaultTableModel table = (DefaultTableModel) transactionTable.getModel();
        table.setRowCount(0);
        
        for (int i=0; i<transactions.size(); i++) {
            Transaction t = transactions.get(i);
            Object[] value = new Object[] {t.transactionID, t.accountNumber, t.oldBalance, t.transactionType.toString(), t.transactionAmount, t.newBalance, t.transactionStats.toString()};
            
            table = (DefaultTableModel) transactionTable.getModel();
            table.addRow(value);
        }
    }//GEN-LAST:event_getAllTransactionsMouseClicked

    private void getValidTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getValidTransactionMouseClicked
        // TODO add your handling code here:
                BankTransaction bnk = new BankTransaction();
        ArrayList<Transaction> transactions = bnk.getValidTransactions();
        
        DefaultTableModel table = (DefaultTableModel) transactionTable.getModel();
        table.setRowCount(0);
        
        for (int i=0; i<transactions.size(); i++) {
            Transaction t = transactions.get(i);
            Object[] value = new Object[] {t.transactionID, t.accountNumber, t.oldBalance, t.transactionType.toString(), t.transactionAmount, t.newBalance, t.transactionStats.toString()};
            
            table = (DefaultTableModel) transactionTable.getModel();
            table.addRow(value);
        }
    }//GEN-LAST:event_getValidTransactionMouseClicked

    private void getInvalidTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getInvalidTransactionMouseClicked
        BankTransaction bnk = new BankTransaction();
        ArrayList<Transaction> transactions = bnk.getInValidTransactions();
        
        DefaultTableModel table = (DefaultTableModel) transactionTable.getModel();
        table.setRowCount(0);
        
        for (int i=0; i<transactions.size(); i++) {
            Transaction t = transactions.get(i);
            Object[] value = new Object[] {t.transactionID, t.accountNumber, t.oldBalance, t.transactionType.toString(), t.transactionAmount, t.newBalance, t.transactionStats.toString()};
            
            table = (DefaultTableModel) transactionTable.getModel();
            table.addRow(value);
        }
    }//GEN-LAST:event_getInvalidTransactionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransactionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accNo;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton deposit;
    private javax.swing.JButton getAllTransactions;
    private javax.swing.JButton getInvalidTransaction;
    private javax.swing.JButton getValidTransaction;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField newBalance;
    private javax.swing.JTextField oldBalance;
    private javax.swing.JTextField transactionAmount;
    private javax.swing.JTextField transactionID;
    private javax.swing.JTable transactionTable;
    private javax.swing.JRadioButton withdraw;
    // End of variables declaration//GEN-END:variables
}
