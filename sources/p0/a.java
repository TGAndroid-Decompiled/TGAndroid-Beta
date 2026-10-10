package p0;
public final class a {
    public static final byte[] f45188e = new byte[1792];
    public final CharSequence f45189a;
    public final int f45190b;
    public int f45191c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f45188e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f45189a = charSequence;
        this.f45190b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f45189a;
        char charAt = charSequence.charAt(this.f45191c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f45191c);
            this.f45191c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f45191c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f45188e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
