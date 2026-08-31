package rb;
public final class a {
    public static final a h;
    public final int[] f46790a;
    public final int[] f46791b;
    public final b f46792c;
    public final b d;
    public final int f46793e;
    public final int f46794f;
    public final int f46795g;

    static {
        new a(4201, 4096, 1);
        new a(1033, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        h = new a(285, 256, 0);
        new a(301, 256, 1);
    }

    public a(int i10, int i11, int i12) {
        this.f46794f = i10;
        this.f46793e = i11;
        this.f46795g = i12;
        this.f46790a = new int[i11];
        this.f46791b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f46790a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f46791b[this.f46790a[i15]] = i15;
        }
        this.f46792c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public final b a(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 == 0) {
                return this.f46792c;
            }
            int[] iArr = new int[i10 + 1];
            iArr[0] = i11;
            return new b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public final int b(int i10) {
        if (i10 != 0) {
            int i11 = this.f46791b[i10];
            return this.f46790a[(this.f46793e - i11) - 1];
        }
        throw new ArithmeticException();
    }

    public final int c(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            int[] iArr = this.f46791b;
            return this.f46790a[(iArr[i10] + iArr[i11]) % (this.f46793e - 1)];
        }
        return 0;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f46794f) + ',' + this.f46793e + ')';
    }
}
