package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your Choice 3:Rock(O), 4:Paper(___), 5: Scissor(>8) ");
        int thr = sc.nextInt();

        if(thr==3){
            System.out.println("You choose Rock O ");}
        else if(thr==4) {
            System.out.println("You choose Paper ___ ");
        }
        else if(thr==5){
            System.out.println("You choose Scissor >8 ");
        }
        Random choice = new Random();
        int toss;
        toss = choice.nextInt(3);
        switch(toss) {
            case 0:
                System.out.println("I choose Rock O ");
                break;
            case 1:
                System.out.println("I choose paper ___");
                break;
            case 2:
                System.out.println("I choose scissor >8 ");
                break;
        }
            if (thr == 3 && toss == 0)//Rock to rock
            {
                System.out.println("tie Rock to rock (｡◕‿◕｡) ");
        }
               else if(thr==3&&toss==1)//Rock to paper
                {
                    System.out.println("You loose,paper covers rock (｡◕‿◕｡) ");
                }
                else if(thr==3&&toss==2)//rock to Scissor
                {
                    System.out.println("You Win, Rock breaks Scissor ( ఠൠఠ )ﾉ");
                }
                if (thr == 4 && toss == 0)//paper to rock
            {
                System.out.println("You Win,paper covers rock ( ఠൠఠ )ﾉ ");
        }
               else if(thr==4&&toss==1)//paper to paper
                {
                    System.out.println("tie,paper to paper ");
                }
                else if(thr==4&&toss==2)//paper to scissor
                {
                    System.out.println("You loose, scissor cuts paper (｡◕‿◕｡) ");
                }
                if (thr == 5 && toss == 0)//scissor to rock
            {
                System.out.println("You loose, Rock breaks scissor (｡◕‿◕｡) ");
        }
               else if(thr==5&&toss==1)//scissor to paper
                {
                    System.out.println("You Win,Scissor cuts paper ( ఠൠఠ )ﾉ ");
                }
                else if(thr==5&&toss==2)//scissor to scissor
                {
                    System.out.println("tie, Scissor to Scissor (｡◕‿◕｡) ");
                }
                else if (thr<3 || thr> 5){
            System.out.println("Wrong choice, You loose (｡◕‿◕｡) ");
        }

    }
}
