package p0;
public final class a {
    public static final byte[] f45178e = new byte[1792];
    public final CharSequence f45179a;
    public final int f45180b;
    public int f45181c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f45178e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f45179a = charSequence;
        this.f45180b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f45179a;
        char charAt = charSequence.charAt(this.f45181c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f45181c);
            this.f45181c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f45181c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f45178e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
