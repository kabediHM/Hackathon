import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       boolean run = true;
       while(run){
        Scanner Stadium = new Scanner(System.in);
        System.out.println("Hi, What sport do you want to play, Soccer or Basketball or just go to a playground?");
        String Sport = Stadium.nextLine();
        System.out.println("Nice " +  Sport  + " Is a great and fun thing to do"  );
        if (Sport.equals("Soccer")|| Sport.equals("soccer")|| Sport.equals("SOCCER")){
            System.out.println("There are many soccer Soccer fields in the Bronx such as:" );
            System.out.println("The field in Crotona: Crotona Park, NY 10457 which closes 10PM");
            System.out.println("Will Cintron Soccer Fields at 1038 Balcom Ave, Bronx, NY 10465 which is open all day");
            System.out.println("The field in Starlight park at which is open all day" );
            System.out.println("Van Cortland Park located at 5770 Broadway, Bronx, NY 10471 and closes at 9PM" );
            System.out.println("Soccer Field 2 located at Rev. T Wendell Foster Park, 1055 Jerome Ave, Bronx, NY 10452");
            System.out.println("Ferry Point Park Field 1 at 491 Hutchinson Riv Pkwy, Bronx, NY 10465 which is open all day");
            System.out.println("Maccombs Dam Park located at E. 157 St &, W 161st St, Bronx, NY 10451 and open until 10PM");
            System.out.println("The field in Mott Playground located at Mott Playground, Morris Ave, Bronx, NY 10456");
            System.out.println("Parque de Los Niños Soccer field located at 1175 Morrison Ave, Bronx, NY 10472");
            System.out.println("The field in Watson Gleason Playground located at Noble Ave &, Watson Ave, 10472");
            System.out.println("The field in Givan Square located at Givan Square, Bronx, NY 10469");
            System.out.println("West Bronx Athletic Field at Jesup Ave, Bronx, NY 10452");
            System.out.println("ALbertson Soccer Field at Bronx Park East &, Allerton Ave, Bronx, NY 10467");
            System.out.println("MS 45 Mini-Pitch located at 2464 Lorillard Pl, Bronx, NY 10458 at 10PM");
            System.out.println("St.James Soccer Field at 2550 Jerome Ave, Bronx, NY 10468");
            System.out.println("South Field at Lehman College, CUNY Bronx, NY 10468");
            System.out.println("P.S. 093 Albert G. Oliver Mini-Pitch at 1535 Story Ave, Bronx, NY 10473");
            System.out.println("Joseph Yancey Track and Field at East 161st St. &, Macombs Dam Bridge, Bronx, NY 10451 and closes at 10PM");
            System.out.println("M.S. 180 Mini-Pitch at 700 Baychester Ave, Bronx, NY 10475");
        } 
        if (Sport.equals("Basketball")|| Sport.equals("basketball")|| Sport.equals("BASKETBALL")){
            System.out.println("Bronx Park Basketball Courts at Bronx Park E. &, Unionport Rd, Bronx, NY 10462 at 10PM");
            System.out.println("St. James Park Basketball Courts at 2550 Jerome Ave, Bronx, NY 10468 and closes at 6PM");
            System.out.println("The court in Crotana Park at Crotona Park, Bronx, NY 10457 and closing 10PM");
            System.out.println("Foster park Basketball courts at R3JG+M44, Bronx, NY 10452");
            System.out.println("Section 4 Basketball court at 140 Bellamy Loop, Bronx, NY 10475 and open all day");
            System.out.println("Basketball courts at Bryant Ave, Bronx, NY 10459");
            System.out.println("Cleopatra Basketball courts at R3WW+38, Bronx, NY 10457 which closes at 6PM");
            System.out.println("Basketbal Court at 500 Mac Cracken Ave, Bronx, NY 10468");
            System.out.println("Basketball Court at Noble Playground, 3101, 1541 Bronx River Ave, Bronx, NY 10460");
            System.out.println("Watson Gleason Basketball Courts at Watson Avenue &, Rosedale Ave, 10472");
            System.out.println("Basketball Court at 40 Mac Cracken Ave, Bronx, NY 10453 and open all day");
            System.out.println("Magenta Basketball Court located at 3330 Olinville Ave, Bronx, NY 10467 and closing at 9:30PM");
            System.out.println("Basketball half courts at 1130 Morris Ave, Bronx, NY 10456");
            System.out.println("Basketball Court at Pulaski Park, Bruckner Boulevard &, Willis Ave, Bronx, NY 10454");
            System.out.println("Basketball Court in Bailey Playground at 3401 Bailey Ave, Bronx, NY 10463");
            System.out.println("Basketball Court at 565 Hollywood Ave, Bronx, NY 10465");
            System.out.println("Carver LoopBasketball Court at 99 Carver Loop, Bronx, NY 10475");
        }
        if (Sport.equals("Playground")|| Sport.equals("playground")|| Sport.equals("PLAYGROUND")){
            System.out.println("Brady Playground at 2222 Bronx Pk E, Bronx, NY 10462 closing at 10PM");
            System.out.println("Ben Abrams Playgrounds located at Boston Rd &, Bronx Pk E, 10462 closing at 6PM");
            System.out.println("Waring Playground at Bronx Park E. &, Waring Ave, Bronx, NY 10467 closing at 6PM");
            System.out.println("Noble Playground at 3101, 1541 Bronx River Ave, Bronx, NY 10460 closing at 6PM");
            System.out.println("Ciccarone Park 2426 Hughes Ave, Bronx, NY 10458 at closing at 6PM");
            System.out.println("Grand Playground at 2146 Grand Ave, Bronx, NY 10453 closing at 6PM");
            System.out.println("Colucci Playground at Hutchinson River Pkwy. E. bet. Wilkinson Ave. and E. 197 St, Bronx, NY 10461 closing at 6PM");
            System.out.println("Captain Rivera Playground at 720 E 156th St, Bronx, NY 10455");
            System.out.println("Bridge Playground at Boscobel Pl, Bronx, NY 10452 closing at 6PM");
            System.out.println("Morton Playground at 1835 Dr M.L.K. Jr Blvd, Bronx, NY 10453 closing at 6PM");
            System.out.println("Lyons Square Playground Bryant Ave, Bronx, NY 10459 closing at 6PM");
            System.out.println("Martin Van Buren Playground located at Crotona Park East, Bronx, NY 10457 closing at 6PM");
            System.out.println("Admiral Farrgut Playground located at Cross Bronx Expy, Bronx, NY 10457 closing at 6PM");
            System.out.println("Grove Hill Playground located at 615 E 158th St, Bronx, NY 10456 closing at 6PM");
            System.out.println("Captain William Harry Thompson Playground located at 1585 E 174th St, Bronx, NY 10472 closing at 6PM");
            System.out.println("Gouverneur Playground at 3711 Third Ave, Bronx, NY 10456 closing at 6PM");
            System.out.println("Half-Nelson Playground at 1631 Nelson Ave, Bronx, NY 10453 closing at 6PM");
            System.out.println("Story Playground at 1820 Story Ave, Bronx, NY 1047 closing at 6PM");
            System.out.println("Patterson Playground located at 448 College Ave #5709, Bronx, NY 10451 closing at 6PM");
            System.out.println("Fox Playground located at 744 Fox St, Bronx, NY 10455 closing at 6PM");
        }
            System.out.println("Would you like to find the location for other sports to play");
            String sports = Stadium.nextLine();
            if (sports.equals("no")||sports.equals("No")){
                 run = false;
            }
        
    }
}
}
