package p0;
public final class a {
    public static final byte[] f55101e = new byte[1792];
    public final CharSequence f55102a;
    public final int f55103b;
    public int f55104c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f55101e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f55102a = charSequence;
        this.f55103b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f55102a;
        char charAt = charSequence.charAt(this.f55104c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f55104c);
            this.f55104c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f55104c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f55101e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
