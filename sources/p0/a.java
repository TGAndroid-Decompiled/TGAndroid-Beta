package p0;
public final class a {
    public static final byte[] f43650e = new byte[1792];
    public final CharSequence f43651a;
    public final int f43652b;
    public int f43653c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f43650e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f43651a = charSequence;
        this.f43652b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f43651a;
        char charAt = charSequence.charAt(this.f43653c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f43653c);
            this.f43653c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f43653c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f43650e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
