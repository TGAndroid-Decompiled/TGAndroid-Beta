package p0;
public final class a {
    public static final byte[] f52978e = new byte[1792];
    public final CharSequence f52979a;
    public final int f52980b;
    public int f52981c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f52978e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f52979a = charSequence;
        this.f52980b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f52979a;
        char charAt = charSequence.charAt(this.f52981c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f52981c);
            this.f52981c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f52981c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f52978e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
