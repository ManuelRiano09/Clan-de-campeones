package clan.campeones.model;

public class Invocador {

    private String gameTag;
    private int level;
    private String range;
    private byte honor;
    private int coins;

    public Invocador (String gameTag, int level, String range) {
        this.gameTag = gameTag;
        this.level = level;
        this.range = range;
    }

    public String getGameTag() {
        return gameTag;
    }

    public void setGameTag(String gameTag) {
        this.gameTag = gameTag;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public byte getHonor() {
        return honor;
    }

    public void setHonor(byte honor) {
        this.honor = honor;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
