package p0;
public final class a {
    public static final byte[] f45142e = new byte[1792];
    public final CharSequence f45143a;
    public final int f45144b;
    public int f45145c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f45142e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f45143a = charSequence;
        this.f45144b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f45143a;
        char charAt = charSequence.charAt(this.f45145c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f45145c);
            this.f45145c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f45145c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f45142e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
