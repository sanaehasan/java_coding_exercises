package com.techreturners.exercise001;
import java.util.*; 
import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise001 {
    public String capitalizeWord(String word) {
        
       return word.substring(0, 1).toUpperCase()+ word.substring(1);
       
    }

    public String generateInitials(String firstName, String lastName) {

        return firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
   
       double result =originalPrice + (originalPrice*vatRate/100);
       BigDecimal bd  = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
       return bd.doubleValue();

        
    }

    public String reverse(String sentence) {
        String result="";
        for(int i =sentence.length()-1; i>=0; i--){
            result = result+sentence.charAt(i);    
        } 
        return result;
    }

    public int countLinuxUsers(List<User> users) {
        int count =0;
        for(User us : users ){
            if(us.getType()=="Linux"){
                count++;
            }
        }
        return count;
    }
}
