package p0;
public final class a {
    public static final byte[] f53082e = new byte[1792];
    public final CharSequence f53083a;
    public final int f53084b;
    public int f53085c;
    public char d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f53082e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f53083a = charSequence;
        this.f53084b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f53083a;
        char charAt = charSequence.charAt(this.f53085c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f53085c);
            this.f53085c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f53085c--;
        char c10 = this.d;
        if (c10 < 1792) {
            return f53082e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
