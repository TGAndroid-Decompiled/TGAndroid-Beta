package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f42517a;
    public final int f42518b;
    public int f42519c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f42517a = charSequence;
        this.f42518b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f42517a;
        char charAt = charSequence.charAt(this.f42519c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f42519c);
            this.f42519c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f42519c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
