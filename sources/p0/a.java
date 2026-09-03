package p0;
public final class a {
    public static final byte[] f44102e = new byte[1792];
    public final CharSequence f44103a;
    public final int f44104b;
    public int f44105c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f44102e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f44103a = charSequence;
        this.f44104b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f44103a;
        char charAt = charSequence.charAt(this.f44105c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f44105c);
            this.f44105c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f44105c--;
        char c3 = this.d;
        if (c3 < 1792) {
            return f44102e[c3];
        }
        return Character.getDirectionality(c3);
    }
}
