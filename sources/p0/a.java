package p0;
public final class a {
    public static final byte[] f54487e = new byte[1792];
    public final CharSequence f54488a;
    public final int f54489b;
    public int f54490c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f54487e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f54488a = charSequence;
        this.f54489b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f54488a;
        char charAt = charSequence.charAt(this.f54490c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f54490c);
            this.f54490c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f54490c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f54487e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
