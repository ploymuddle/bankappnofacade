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
    ArrayList<CustomerIf> custAccounts = new ArrayList();
    MyBankFacade() {
        //Customer1
       ArrayList<AccountIf> cust1Accounts = new ArrayList();
       AccountIf acc1 = new BankAccount(1001);
       cust1Accounts.add(acc1);
       acc1 = new BankAccount(1002);
       cust1Accounts.add(acc1);
       CustomerIf cust1 = new BankCustomer("Max", cust1Accounts);
       custAccounts.add(cust1);
       
       //Customer2
       ArrayList<AccountIf> cust2Accounts = new ArrayList();
       AccountIf acc2 = new BankAccount(2001);
       cust2Accounts.add(acc2);
       acc2 = new BankAccount(2002);
       cust2Accounts.add(acc2);
       CustomerIf cust2 = new BankCustomer("Min", cust2Accounts);
       custAccounts.add(cust2);
    }
    
    public void doDeposit(double amt, CustomerIf cust, int accNo){
      
       cust.getAccount(accNo).deposit(amt);
    }
    public AccountIf getBankAccount(CustomerIf cust, int accNo){
        return cust.getAccount(accNo);
    }
    
    public CustomerIf getBankCustomer(String custName) {
  
        for(CustomerIf cust : custAccounts){
            if(cust.getCustomerName().equals(custName)){
               return cust;
            }
        }
        return null;
    }
}
