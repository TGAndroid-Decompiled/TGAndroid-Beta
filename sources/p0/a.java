package p0;
public final class a {
    public static final byte[] f55056e = new byte[1792];
    public final CharSequence f55057a;
    public final int f55058b;
    public int f55059c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f55056e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f55057a = charSequence;
        this.f55058b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f55057a;
        char charAt = charSequence.charAt(this.f55059c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f55059c);
            this.f55059c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f55059c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f55056e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
