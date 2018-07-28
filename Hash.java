import java.security.MessageDigest;

public class Hash {
  public static String applyHash(String input) {
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(input.getBytes("UTF-8"));

			StringBuffer hexHash = new StringBuffer();

			for (int i = 0; i < hash.length; i++) {
				String hexHash = Integer.toHexString(0xff & hash[i]);
				if (hexHash.length() == 1 { hexHash.append('0'); }
		    hexHash.append(hexHash);
			}
      return hexHash.toString();
    } catch (Exception e) {
      throw new RunTimeException(e);
    }
  }
}