package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f43896a;
    public final int f43897b;
    public int f43898c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f43896a = charSequence;
        this.f43897b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f43896a;
        char charAt = charSequence.charAt(this.f43898c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f43898c);
            this.f43898c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f43898c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
