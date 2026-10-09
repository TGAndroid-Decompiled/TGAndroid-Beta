package p0;
public final class a {
    public static final byte[] f45144e = new byte[1792];
    public final CharSequence f45145a;
    public final int f45146b;
    public int f45147c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f45144e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f45145a = charSequence;
        this.f45146b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f45145a;
        char charAt = charSequence.charAt(this.f45147c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f45147c);
            this.f45147c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f45147c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f45144e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
