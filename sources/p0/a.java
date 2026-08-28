package p0;
public final class a {
    public static final byte[] f45320e = new byte[1792];
    public final CharSequence f45321a;
    public final int f45322b;
    public int f45323c;
    public char d;

    static {
        for (int i9 = 0; i9 < 1792; i9++) {
            f45320e[i9] = Character.getDirectionality(i9);
        }
    }

    public a(CharSequence charSequence) {
        this.f45321a = charSequence;
        this.f45322b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f45321a;
        char charAt = charSequence.charAt(this.f45323c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f45323c);
            this.f45323c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f45323c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f45320e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
