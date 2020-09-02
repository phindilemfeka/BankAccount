package Dao;

import Dao.BankAccount;

import java.util.UUID;

public class FixedDeposit extends BankAccount {
   // private final double accountBalance = 0.00;

    public FixedDeposit(UUID accountNumber, double withdrawalFeeCharge) {
        super(accountNumber, withdrawalFeeCharge);
    }
}
