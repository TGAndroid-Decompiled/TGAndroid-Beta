package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f44325a;
    public final int f44326b;
    public int f44327c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f44325a = charSequence;
        this.f44326b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f44325a;
        char charAt = charSequence.charAt(this.f44327c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f44327c);
            this.f44327c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f44327c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
