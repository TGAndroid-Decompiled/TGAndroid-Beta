package p0;
public final class a {
    public static final byte[] f44071e = new byte[1792];
    public final CharSequence f44072a;
    public final int f44073b;
    public int f44074c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f44071e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f44072a = charSequence;
        this.f44073b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f44072a;
        char charAt = charSequence.charAt(this.f44074c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f44074c);
            this.f44074c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f44074c--;
        char c3 = this.d;
        if (c3 < 1792) {
            return f44071e[c3];
        }
        return Character.getDirectionality(c3);
    }
}
