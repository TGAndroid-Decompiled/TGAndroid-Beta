package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f40651a;
    public final int f40652b;
    public int f40653c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f40651a = charSequence;
        this.f40652b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f40651a;
        char charAt = charSequence.charAt(this.f40653c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f40653c);
            this.f40653c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f40653c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
