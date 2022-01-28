package org.xpdojo.bank;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.assertj.core.api.Assert;

public class Account {

    private int balance;

    public static Account emptyAccount(){
        return new Account();
    }
    private Account() {
        balance = 0;
    }

    public int balance(){
        return balance;
    }

    public void  deposit(int amount){
        balance = amount;
    }





}
