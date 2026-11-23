package p0;
public final class a {
    public static final byte[] f55182e = new byte[1792];
    public final CharSequence f55183a;
    public final int f55184b;
    public int f55185c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f55182e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f55183a = charSequence;
        this.f55184b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f55183a;
        char charAt = charSequence.charAt(this.f55185c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f55185c);
            this.f55185c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f55185c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f55182e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
