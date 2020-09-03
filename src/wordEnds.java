public class wordEnds {
  public String wordEnds(String str, String word) {

    int lenw = word.length();
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length() - lenw + 1; i++) {
      String s = str.substring(i, i + lenw);
      if (i != 0 && s.equals(word)) {
        String s2 = str.substring(i - 1, i);
        result.append(s2);
      }
      if (i != str.length() - lenw && s.equals(word)) {
        String s3 = str.substring(i + lenw, i + lenw + 1);
        result.append(s3);
      }
    }
    return result.toString();
  }
}
