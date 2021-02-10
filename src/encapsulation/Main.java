package encapsulation;
public class Main {
    public static void main(String[] args) {

        Account account = new Account();
        account.setAccountName("Euro account");
        account.setAccountNo(1);
        account.setAccountBalance(78561);
        System.out.println(account.toString());
        


        Person person = new Person();

        person.setName("Ion");
        person.setAge(30);
        person.setAddress("Zentagesse");
        person.setNationality("Romanian");
        person.setOccupation("It Developer");
        System.out.println(person.toString());


    }

}