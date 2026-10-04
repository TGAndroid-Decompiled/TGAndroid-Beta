package p0;
public final class a {
    public static final byte[] f43964e = new byte[1792];
    public final CharSequence f43965a;
    public final int f43966b;
    public int f43967c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f43964e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f43965a = charSequence;
        this.f43966b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f43965a;
        char charAt = charSequence.charAt(this.f43967c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f43967c);
            this.f43967c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f43967c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f43964e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
