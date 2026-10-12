package p0;
public final class a {
    public static final byte[] f45032e = new byte[1792];
    public final CharSequence f45033a;
    public final int f45034b;
    public int f45035c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f45032e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f45033a = charSequence;
        this.f45034b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f45033a;
        char charAt = charSequence.charAt(this.f45035c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f45035c);
            this.f45035c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f45035c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f45032e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
