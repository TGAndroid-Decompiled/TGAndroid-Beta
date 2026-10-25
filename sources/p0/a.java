package p0;
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence f46467a;
    public final int f46468b;
    public int f46469c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f46467a = charSequence;
        this.f46468b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f46467a;
        char charAt = charSequence.charAt(this.f46469c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f46469c);
            this.f46469c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f46469c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
