import java.io.InputStream;
import java.util.Scanner;
import java.lang.*;
/**
 * Write a description of class Password here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Password
{
    // instance variables - replace the example below with your own
    public String password;

    /**
     * Constructor for objects of class Password
     */
    public Password()
    {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Input Password: " );
        this.password = scanner.nextLine();
    }

    public boolean main (String[] args)
    {
        boolean isTrue = false;
        if (checkLength(password)){
            if(checkLowerCase(password)){
                if(checkUpperCase(password)){
                    if(checkDigit(password)){
                        if(checkSpecial(password)){
                            System.out.println( "Password is valid" );
                            isTrue = true;
                        }
                    }
                }
            }
        }
        return isTrue;
    }

    public boolean checkLength (String password){

        if((password.length() > 7) && (password.length() < 31)){
            System.out.println( "Password length is valid" );
            return true;
        }
        else return false;
    }

    public boolean checkUpperCase (String password){
        boolean hasUpperCase = false;
        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i)))
                hasUpperCase =  true;

        }
        if (hasUpperCase = true)
            System.out.println( "Password has Upper case" );
        return hasUpperCase;

    }

    public boolean checkLowerCase (String password){
        boolean hasLowerCase = false;
        for (int i = 0; i < password.length(); i++){
            if (Character.isLowerCase(password.charAt(i)))
                hasLowerCase =  true;

        }
        if (hasLowerCase = true)
            System.out.println( "Password has Lower case" );
        return hasLowerCase;

    }

    public boolean checkDigit (String password){
        boolean hasDigit = false;
        if (password.matches(".*[0-9].*")) { 
            hasDigit = true;
        } 
        if (hasDigit = true)
            System.out.println( "Password has Digit" );
        return hasDigit;
    }

    public boolean checkSpecial (String password){
        boolean hasSpecial = false;
        if (password.matches("^.*[^a-zA-Z0-9 ].*$")) { 
            hasSpecial = true;
        } 
        if (hasSpecial = true)
            System.out.println( "Password has Special" );
        return hasSpecial;
    }
}

