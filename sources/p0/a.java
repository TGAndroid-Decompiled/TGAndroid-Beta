package p0;
public final class a {
    public static final byte[] f43978e = new byte[1792];
    public final CharSequence f43979a;
    public final int f43980b;
    public int f43981c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f43978e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f43979a = charSequence;
        this.f43980b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f43979a;
        char charAt = charSequence.charAt(this.f43981c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f43981c);
            this.f43981c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f43981c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f43978e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
