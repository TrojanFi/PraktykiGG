package projekty.kasyno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    Scanner scanner = new Scanner(System.in);
    private List<String> rewards = new ArrayList<>(20);
    private List<Integer> rewardsPrice = new ArrayList<>(20);

    public void addRewards(){
        rewards.add("A");
        rewards.add("B");
        rewards.add("C");
        rewards.add("D");
        rewards.add("E");
        rewardsPrice.add(23);
        rewardsPrice.add(45);
        rewardsPrice.add(56);
        rewardsPrice.add(11);
        rewardsPrice.add(87);

    }

    public void buyReward(Player player){
        System.out.println(rewards);
        System.out.println("Co kupujesz?[0] - [..]");
        int choice = scanner.nextInt();
        player.setOurRewards(rewards.get(choice));
        player.setMoney(player.getMoney() - rewardsPrice.get(choice));
        rewards.remove(choice);
        rewardsPrice.remove(choice);

    }
}
