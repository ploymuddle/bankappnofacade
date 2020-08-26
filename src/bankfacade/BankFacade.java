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
       //create Accounts
       ArrayList<AccountIf> cust1Accounts = new ArrayList();
       AccountIf acc11 = new BankAccount(1001);
       AccountIf acc12 = new BankAccount(1001);
       cust1Accounts.add(acc11);
       cust1Accounts.add(acc12);
       CustomerIf cust1 = new BankCustomer("Max", cust1Accounts );
       ArrayList<AccountIf> cust2Accounts = new ArrayList();
       AccountIf acc21 = new BankAccount(2001);
       AccountIf acc22 = new BankAccount(2002);
       cust2Accounts.add(acc21);
       cust2Accounts.add(acc22);
       CustomerIf cust2 = new BankCustomer("Min", cust2Accounts );
       
       //solution
       System.out.println("Customer and account information");
       System.out.println("Name = " + cust1.getCustomerName());
       System.out.println("Has " + cust1.getNumAccounts() + " accounts");
       
       MyBankFacade.doDeposit(1000,cust1,1001);
       MyBankFacade.doDeposit(500,cust1,1001);
//       MyBankFacade.getBankAccount(cust1,1001);
       AccountIf acc = cust1.getAccount(1001);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
//       acc = cust1.getAccount(1001);
//       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
//       acc.deposit(1000);
//       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
//       ArrayList<AccountIf> accounts = cust1.getllAccounts();
//       for(AccountIf account : accounts) {
//           System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
//       }
    }
    
}
