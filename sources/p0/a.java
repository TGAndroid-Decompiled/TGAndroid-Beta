package p0;
public final class a {
    public static final byte[] f52952e = new byte[1792];
    public final CharSequence f52953a;
    public final int f52954b;
    public int f52955c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f52952e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f52953a = charSequence;
        this.f52954b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f52953a;
        char charAt = charSequence.charAt(this.f52955c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f52955c);
            this.f52955c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f52955c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f52952e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
