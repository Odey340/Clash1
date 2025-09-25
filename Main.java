import java.util.*;
public class Main {

	public static void main(String[] args) {
		String[] hand = {"Snowball","Zap","Dark Prince","Dart Goblin"};
		
		String[] opponentPlays = {"Hog Rider", "Minions", "Giant", "Skeleton Army", "Musketeer"};
		Random rand = new Random();
		for(int i = 0; i < 5; i++) {
			String opponentCard = opponentPlays[rand.nextInt(opponentPlays.length)];
			System.out.println("opponent played: " + opponentCard);
			
			String bestCounter = chooseBestCounter(opponentCard, hand);
			System.out.println("AI plays: " + bestCounter + "\n");
			
		}

	}
	
	public static String chooseBestCounter(String opponentCard, String[] hand) {
		switch(opponentCard) {
		case "Skeleton Army":
			return "Zap";
		case "Minions":
            return "Snowball"; // slows & damages
        case "Hog Rider":
            return "Dark Prince"; // tanky defense
        case "Giant":
            return "Dark Prince"; // best DPS option
        case "Musketeer":
            return "Dart Goblin"; // ranged chip
        default:
            return hand[0]; // fallback
		}
	}

}
