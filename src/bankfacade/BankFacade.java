/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       MyBankFacade obj = new MyBankFacade();
       AccountIf acc = null;
       
       CustomerIf cust = obj.getBankCustomer("Max");
       System.out.println("Customer and account information");
       System.out.println("Name = " + cust.getCustomerName());
       System.out.println("Has " + cust.getNumAccounts() + " accounts");
       
       //---------Account Max-------//
    //getBankAccount
       acc = obj.getBankAccount(cust,1001);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       acc = obj.getBankAccount(cust,1002);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
    //doDeposit
       obj.doDeposit(1000, cust, 1002);
       acc = obj.getBankAccount(cust,1002);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       obj.doDeposit(500, cust, 1002);
       acc =  obj.getBankAccount(cust,1002);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       
//       //---------Account Min-------//
//    //getBankAccount
//       acc = obj.getBankAccount(cust,2001);
//       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
//       acc = obj.getBankAccount(cust,2002);
//       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
//    //doDeposit
//       obj.doDeposit(1000, cust, 2001);
//       acc = obj.getBankAccount(cust,2001);
//       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
//       obj.doDeposit(500, cust, 2002);
//       acc =  obj.getBankAccount(cust,2002);
//       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       
    //getBankCustomer
       System.out.println("Your Account");
       ArrayList<AccountIf> accounts = cust.getllAccounts();
       for(AccountIf account : accounts) {
           System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
       }
    }
    
}
