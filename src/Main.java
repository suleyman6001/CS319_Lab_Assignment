import java.util.*;

public class Main {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    ArrayList<Integer> list3 = new ArrayList<Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();
    ArrayOrganizer organizer = new ArrayOrganizer();

    list1.add(100);
    list1.add(500);
    list1.add(900);
    list2.add(800);
    list2.add(600);
    list2.add(300);
    list3.add(400);
    list3.add(700);
    list3.add(200);

    result = organizer.concatAndSort(list1, list2, list3);
    System.out.print( "Result => " );
    System.out.println( result );

    System.out.println( "------------------------------------------------------" );
    Player player1 = new Player( "Tom" );
    Player player2 = new Player( "John" );
    Player player3 = new Player( "Jones" );
    Player player4 = new Player( "Henry" );

    Die die = new Die();
    int point;

    for ( int i = 0; i < 5; i++ ) {
        for ( int j = 1; j < 5; j++ ) {
            point = die.rollDie();
            if ( j == 1 ) {
                player1.addScore( point );
            }

            else if( j == 2 ) {
                player2.addScore( point );
            }

            else if( j == 3 ) {
                player3.addScore( point );
            }

            else {
                player4.addScore( point );
            }
        }
    }

    System.out.println(player1);
    System.out.println(player2);
    System.out.println(player3);
    System.out.println(player4);
}