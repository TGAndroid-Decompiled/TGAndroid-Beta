package p0;
public final class a {
    public static final byte[] f43971e = new byte[1792];
    public final CharSequence f43972a;
    public final int f43973b;
    public int f43974c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f43971e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f43972a = charSequence;
        this.f43973b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f43972a;
        char charAt = charSequence.charAt(this.f43974c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f43974c);
            this.f43974c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f43974c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f43971e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
