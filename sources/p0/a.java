package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f40748a;
    public final int f40749b;
    public int f40750c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f40748a = charSequence;
        this.f40749b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f40748a;
        char charAt = charSequence.charAt(this.f40750c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f40750c);
            this.f40750c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f40750c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
