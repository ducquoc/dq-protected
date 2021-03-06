package vn.ducquoc.cc.execute;

/**
 * @see //github.com/ducquoc/fresher-training/blob/master/java5-examples/src/main/java/vn/ducquoc/beginner/efficiency/PhongDoanEuler.java
 * @see //bitbucket.org/ducquoc/dq-training/src/master/execute-sample/src/main/java/vn/ducquoc/sample/reflection/PrivateAccessExecutor.java
 */
@SuppressWarnings("unused")
public class App {

  public static Integer ANSWER_TO_LIFE_AND_UNIVERSE = 42;
  public static int MAGIC_NUM1 = ANSWER_TO_LIFE_AND_UNIVERSE - 229985494;
  public static int MAGIC_NUM2 = ANSWER_TO_LIFE_AND_UNIVERSE - 147909691;
  public static long MAGIC_DUC = ANSWER_TO_LIFE_AND_UNIVERSE - 9223372036854695718L;
  public static long MAGIC_QUOC = ANSWER_TO_LIFE_AND_UNIVERSE - 9223372036829082599L;

  public static void main(String[] args) {

    System.out.println(jUtilRandom(MAGIC_DUC) + jUtilRandom(MAGIC_QUOC));
  }

  public static String jUtilRandom(long param) {
    java.util.Random rand = new java.util.Random(param);
    StringBuffer sb = new StringBuffer();
    for (int i = 0;; i++) {
      int k = rand.nextInt(27);
      if (k == 0)
        break;

      sb.append((char) ('`' + k));
    }

    return sb.toString();
  }

}
