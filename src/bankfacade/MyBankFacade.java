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
 * @author PLOYMUDDLE
 */
public class MyBankFacade {
    private static AccountIf acc;
    
    public static void doDeposit(double amt, CustomerIf cust, int accNo){
      
       ArrayList<AccountIf> cust1Accounts = new ArrayList();
       acc = cust.getAccount(accNo);
       acc.deposit(amt);
       cust1Accounts.add(acc);
       cust = new BankCustomer(cust.getCustomerName(), cust1Accounts);
    }
    public static void getBankAccount(CustomerIf cust, int accNo){
//       acc = cust.getAccount(12346);
//       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
//       ArrayList<AccountIf> accounts = cust.getllAccounts();
//       for(AccountIf account : accounts) {
//           System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
//       }
    }
    public ArrayList<AccountIf> getBanCustomer(String custName) {
        
        return null;
    }
}
