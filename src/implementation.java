package EmailApp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class implementation {

    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private int mailboxcapacity;

    public implementation(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = getDepart();
        this.password = randomPass(8);
        this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + this.department + "@gmail.com";
        setAlternateEmail("Yournamewithdepartment@Company.com");
        setMailboxcapacity(500);
    } 

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getMailboxcapacity() {
        return mailboxcapacity;
    }

    public void setMailboxcapacity(int mailboxcapacity) {
        this.mailboxcapacity = mailboxcapacity;
    }

    private String getDepart() {
        int choice;
        String selected = null;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(
                    "Choose the Department:\n1. Business\n2. Development\n3. Accounts\n0. None\n Enter Your Choice: ");
            choice = Integer.parseInt(bf.readLine());
            if (choice == 1) {
                selected = "Business"; 
            } else if (choice == 2) {
                selected = "Development";
            } else if (choice == 3) {
                selected = "Accounts";
            } else {
                selected = "None";
            }
        } catch (Exception e) {
            System.out.println("Invalid input Provided");
        }
        return selected.substring(0, 3);
    }

    private String randomPass(int length) {
        String set = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * set.length());
            password[i] = set.charAt(random);
        }
        return new String(password);
    }

    @Override
    public String toString() {
        return "[Department=" + department + ", Email=" + email
                + ", Firstname=" + firstname + ", Lastname=" + lastname + ", Mailboxcapacity=" + mailboxcapacity + "mb"
                + ", Generated Password=" + password + "]";
    }
}
