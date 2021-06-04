package achoo;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem1
{
    public static void main( String[] args )
    {
        Scanner a = new Scanner(System.in);
        System.out.print( "What is your name? " );
        String name = a.nextLine();
        String msg = "Hello, " + name + ", nice to meet you!";
        System.out.println(msg);
    }
}
