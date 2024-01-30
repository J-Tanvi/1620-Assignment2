//creates a new object called 'Player'
public class Player {
    //initializes the properties for a 'Player
    public int num;
    public int sum;

    //creates two dice and sets them to random numbers 1-6
    int dice1 = (int)(Math.random() * 6) + 1;
    int dice2 = (int)(Math.random() * 6) + 1;

    //Creates an instance of 'Player'
    Player (int num, int sum){
        this.num = num;
        this.sum = sum;
    }

    //rolls the dice, adds to the sum, and goes to display()
    public void roll (){
        dice1 = (int)(Math.random() * 6) + 1;
        dice2 = (int)(Math.random() * 6) + 1;
        sum += dice1 + dice2;
        display();
    }

    //displays the results and checks to see if there are any doublets that need re-rolling
    public void display (){
        System.out.println("Player " + num + " rolls a " + dice1 + " and a " + dice2);
        System.out.println("Player "  + num + " now has " + sum);
        if (dice1 == dice2){
            roll();
        }
    }
}
