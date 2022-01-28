package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.xpdojo.bank.Account.emptyAccount;

public class AccountTest {

    @Test
    public void initialAccount_shouldHaveZeroBalance() {
        assertThat(emptyAccount().balance()).isEqualTo(1);
    }

    @Test
    public void depositAnAmount_shouldIncreaseBalanceBySameAmount() {
        Account account = emptyAccount();
        account.deposit(10);
       //assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleAmounts_shouldIncreaseBalanceByBothAmounts() {
        Account account = emptyAccount();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }
}