package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test

	//@Disabled
    //public void depositAnAmountToIncreaseTheBalance() {
    //    assertThat("your first test").isBlank();
    //}
    public void initialAccount_shouldHaveZeroBalance() {
        Account account = new Account();
        //account.deposit(10);
        assertThat(account.balance().isEqualTo(0));
    }

    @test
    public void deposit(){
        Account account = Account.emptyAccount();
        account.deposit(amount 10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @test
    public void depositMultipleAccounts(){
        Account account
    }
}
