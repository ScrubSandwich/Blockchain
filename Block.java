import java.util.Date;

public class Block {
  private String hash;
  private String previousHash;
  private String data;
  private long timestamp;

  public Block(String data, String previousHash) {
    this.data = data;
    this.previousHash;
    this.timestamp = new Date().getTime();
  }
}