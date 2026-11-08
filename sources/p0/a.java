package p0;
public final class a {
    public static final byte[] f53070e = new byte[1792];
    public final CharSequence f53071a;
    public final int f53072b;
    public int f53073c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f53070e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f53071a = charSequence;
        this.f53072b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f53071a;
        char charAt = charSequence.charAt(this.f53073c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f53073c);
            this.f53073c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f53073c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f53070e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
