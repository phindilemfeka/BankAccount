import java.util.UUID;

public class ChequeAccount extends BankAccount {

    public ChequeAccount(double accountBalance, UUID accountNumber, double withdrawalFeeCharge) {
        super(accountBalance, accountNumber, withdrawalFeeCharge);
    }
}
