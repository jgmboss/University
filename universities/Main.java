import java.util.ArrayList;
public class Main
{
    public static void main (String arg[]){
        ArrayList<University> ranking = new ArrayList<University>();
        ranking.add(new University(10, "Surrey", "England"));
        for (int i = 0; i < ranking.size(); i++){
            System.out.println(ranking.get(i).getRanking());
        }
    }
}
