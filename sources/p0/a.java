package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f40946a;
    public final int f40947b;
    public int f40948c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f40946a = charSequence;
        this.f40947b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f40946a;
        char charAt = charSequence.charAt(this.f40948c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f40948c);
            this.f40948c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f40948c--;
        char c3 = this.d;
        if (c3 < 1792) {
            return e[c3];
        }
        return Character.getDirectionality(c3);
    }
}
