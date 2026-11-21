package p0;
public final class a {
    public static final byte[] f55097e = new byte[1792];
    public final CharSequence f55098a;
    public final int f55099b;
    public int f55100c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f55097e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f55098a = charSequence;
        this.f55099b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f55098a;
        char charAt = charSequence.charAt(this.f55100c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f55100c);
            this.f55100c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f55100c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f55097e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
