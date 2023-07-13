/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonfour;

import java.util.Scanner;

/**
 *
 * @author A.E.A
 */
public class Lessonfour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        //user name , age salary subject
//        System.out.println("Welcome");
//        System.out.println("Enter Your Name : ");
//        String name;
        Scanner input = new Scanner(System.in);
//        name = input.nextLine();
//        System.out.println("Enter your age : ");
//        int age = input.nextInt();
//        System.out.println("Enter your salary : ");
//        double salary = input.nextDouble();
//        System.out.println("are your ok");
//        boolean satus = input.nextBoolean();
//        System.out.println("ahmed said \n  your age is  , Enter your salary :    , your statues :  ");
//        double x = 5.6, y = 10.6;
//        int z = (int) x + (int) y;
//        int zz = (int) (x + y);
//        System.out.println("z " + z);
//        System.out.println("zz " + zz);
//        System.out.println(x+y);
//        String firstName = "ahmed", secondName = "mohamed";
//        System.out.println(firstName.concat(secondName).concat(firstName));
//        int x = 9, y = -125;
//        System.out.println(Math.min(y, x));
//        System.out.println((int) Math.sqrt(x));
//        System.out.println(Math.cbrt(y));
//        System.out.println(Math.pow(1, 5));
//        System.out.println(Math.round(12.4));
//        System.out.println(Math.floor(12.4));
//        System.out.println(Math.ceil(12.4));
//        System.out.println(Math.abs(y));
//        System.out.println(Math.random());

//            if(10>11) System.out.println("hello");
//            else System.out.println("not bigger");
//        System.err.println("enter grade");
//        double grade = input.nextDouble();
//        if (grade >= 50 && grade < 60) {
//            System.out.println("مقبول");
//        } else if(grade >=60 &grade<70){
//            System.out.println("جيد");
//        } else if(grade >=70 &grade<80){
//            System.out.println("جيد جدا");
//        } else if(grade >=80 &grade<100){
//            System.out.println("ممتاز");
//        }else if(grade >100){
//             System.out.println("ادخل الدرجة الصحيحة");
//        }else {
//            System.out.println("راسب");
//        }
        String a;
        if (10 > 5) {
            a = "sad";
        } else {
            a = "good";
        }
        a = (10 > 5) ? "sad" : "good";
        System.out.println(a);
        int x;
        if (10 > 5) {
            x = 10;

        } else {
            x = 15;
        }
        x = (10 > 5) ? 10 : 15;
        System.out.println(x);
        //enter your name ,enter your grade 
        System.out.println("قم بعمل برنامج يسمع للمتسخدم بادخال االسم والرقم والهوايات والكلية ودرجتة ، واذا كانت الدرجة اكبر \n" +
"من 50 واصغر من 60 قم بطباعة مقبول وهكذا \n" +
"وقم في النهاية بطباعة كل البيانات");
    }

}
