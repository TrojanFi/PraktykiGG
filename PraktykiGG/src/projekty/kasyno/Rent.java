package projekty.kasyno;

public class Rent {

    public void rentMoney(Player player){
        player.setMoney(player.getMoney() + 100);
        player.setRent(player.getRent() + 1);
    }


}
