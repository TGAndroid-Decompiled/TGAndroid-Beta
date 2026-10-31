package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f44517a;
    public final int f44518b;
    public int f44519c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f44517a = charSequence;
        this.f44518b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f44517a;
        char charAt = charSequence.charAt(this.f44519c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f44519c);
            this.f44519c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f44519c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
