package encapsulation;

public class Account {
    private int accountNo;
    private int accountBalance;
    private String accountName;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "" +
                "accountNo: " + accountNo +
                ", accountBalance: " + accountBalance +
                ", accountName '" + accountName + '\'' ;


    }
}


