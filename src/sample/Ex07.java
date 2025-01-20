package sample;

import java.time.LocalDate;


public class Ex07 {
    public static void main(String[] args) {
        
    LocalDate localdate = LocalDate.of(1999,12,9);

    int year = localdate.getYear();
    int month = localdate.getMonthValue();
    int dayOfMonth = localdate.getDayOfMonth();
    
    System.out.println("私の誕生日は" + year + "年" + month + "月" + dayOfMonth + "日です");
    
    }
}
