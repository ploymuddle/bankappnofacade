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
       //Customer1
       ArrayList<AccountIf> cust1Accounts = new ArrayList();
       AccountIf acc1 = new BankAccount(1001);
       cust1Accounts.add(acc1);
       acc1 = new BankAccount(1002);
       cust1Accounts.add(acc1);
       CustomerIf cust1 = new BankCustomer("Max", cust1Accounts);
       //Customer2
       ArrayList<AccountIf> cust2Accounts = new ArrayList();
       AccountIf acc2 = new BankAccount(2001);
       cust2Accounts.add(acc2);
       acc2 = new BankAccount(2002);
       cust2Accounts.add(acc2);
       CustomerIf cust2 = new BankCustomer("Min", cust2Accounts);
       
       System.out.println("Customer and account information");
       System.out.println("Name = " + cust1.getCustomerName());
       System.out.println("Has " + cust1.getNumAccounts() + " accounts");
       
    //getBankAccount
       MyBankFacade.getBankAccount(cust1,1001);
       MyBankFacade.getBankAccount(cust1,1002);
    //doDeposit
       MyBankFacade.doDeposit(1000, cust1, 1002);
       MyBankFacade.getBankAccount(cust1,1002);
       MyBankFacade.doDeposit(500, cust1, 1002);
       MyBankFacade.getBankAccount(cust1,1002);
       
    //getBankCustomer
       MyBankFacade.getBankCustomer(cust1);
    }
    
}
