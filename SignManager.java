import java.lang.StringBuilder;

/**
 * 2つの文字列を比較して差分の文字数を求める
 *
 * @author GenbuYogi feat.YG
 */
public class SignManager {
    private String prevSign;
    private String nextSign;

    SignManager(String prevSign, String nextSign) {
        this.prevSign = prevSign;
        this.nextSign = nextSign;
    }

    /**
     * 2つの文字列を比較して差分の文字数を数える
     * 
     * @param prev 変更前の文字列 
     * @param next 変更後の文字列 
     * @return 変更するのに足りない文字数
     */
    public int countAddOrder(String prev, String next) {
        StringBuilder sb = new StringBuilder(next);
        for (int i = 0; i < prev.length(); i++) {
            int index = sb.indexOf(prev.substring(i, i+1));
            if (index != -1) {
                sb.deleteCharAt(index);
            }
        }

        return sb.length();
    }

    @Override
    public String toString() {
        return String.valueOf(countAddOrder(this.prevSign, this.nextSign));
    }
}
