package p0;
public final class a {
    public static final byte[] f43649e = new byte[1792];
    public final CharSequence f43650a;
    public final int f43651b;
    public int f43652c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f43649e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f43650a = charSequence;
        this.f43651b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f43650a;
        char charAt = charSequence.charAt(this.f43652c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f43652c);
            this.f43652c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f43652c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f43649e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
