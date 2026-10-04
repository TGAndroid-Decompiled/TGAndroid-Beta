package p0;
public final class a {
    public static final byte[] f43963e = new byte[1792];
    public final CharSequence f43964a;
    public final int f43965b;
    public int f43966c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f43963e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f43964a = charSequence;
        this.f43965b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f43964a;
        char charAt = charSequence.charAt(this.f43966c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f43966c);
            this.f43966c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f43966c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f43963e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
