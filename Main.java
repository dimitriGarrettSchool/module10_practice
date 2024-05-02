import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*ArrayList<String> nams = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; ++i)
        {
            nams.add(SafeInput.getNonZeroLenString(scanner, "name: "));
        }

        for (int i = 0; i < nams.size(); ++i)
        {
            System.out.println(nams.get(i));

            if (nams.get(i).length() > 6)
            {
                nams.remove(i--);
            }
        }

        System.out.println("-----------");

        for (String string : nams)
        {
            System.out.println(string);
        }

        ArrayList<Double> d = new ArrayList<Double>();

        d.add(100.0);
        d.add(100.0);
        d.add(100.0);
        d.add(100.0);
        d.add(100.0);

        d.add(SafeInput.getDouble(new Scanner(System.in), "num: "));
        d.add(SafeInput.getDouble(new Scanner(System.in), "num: "));

        double avg = 0.0;

        for (int i = 0; i < 7; ++i)
        {
            avg += d.get(i);
        }

        avg /= 7.0;

        System.out.println("Avg: " + avg);*/

        ArrayList<String> teams = new ArrayList<String>();

        teams.add("Lakers");
        teams.add("Knicks");
        teams.add("Celtics");
        teams.add("Warriors");
        teams.add("Grizzlies");
        teams.add("Pistons");
        teams.add("Magic");
        teams.add("Bucks");

        Collections.shuffle(teams);

        Random random = new Random();
        for (int i = 0; i < 4; ++i)
        {
            int score1 = random.nextInt(60, 120);
            int score2 = random.nextInt(60, 120);

            System.out.println("Score for: " + teams.get(i * 2) + " was " + score1);
            System.out.println("Score for: " + teams.get(i * 2 + 1) + " was " + score2);

            if (score1 > score2)
            {
                System.out.println(teams.get(i * 2) + " won!");
            }

            else if (score1 < score2)
            {
                System.out.println(teams.get(i * 2 + 1) + " won!");
            }

            else {
                System.out.println("It was a tie!");
            }
        }
    }
}