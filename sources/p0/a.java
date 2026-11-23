package p0;
public final class a {
    public static final byte[] f55066e = new byte[1792];
    public final CharSequence f55067a;
    public final int f55068b;
    public int f55069c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f55066e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f55067a = charSequence;
        this.f55068b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f55067a;
        char charAt = charSequence.charAt(this.f55069c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f55069c);
            this.f55069c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f55069c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f55066e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
