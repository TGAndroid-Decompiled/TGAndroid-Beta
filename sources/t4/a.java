package t4;
public final class a {
    public final int f55300a;
    public int f55301b;
    public int f55302c;
    public int d;
    public int f55303e;
    public int f55304f;
    public int f55305g;
    public int h;
    public int f55306i;
    public final b f55307j;

    public a(b bVar, int i7, int i10) {
        this.f55307j = bVar;
        this.f55300a = i7;
        this.f55301b = i10;
        a();
    }

    public final void a() {
        b bVar = this.f55307j;
        int[] iArr = (int[]) bVar.f55310a;
        int[] iArr2 = (int[]) bVar.f55311b;
        int i7 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        for (int i16 = this.f55300a; i16 <= this.f55301b; i16++) {
            int i17 = iArr[i16];
            i12 += iArr2[i17];
            int i18 = (i17 >> 10) & 31;
            int i19 = (i17 >> 5) & 31;
            int i20 = i17 & 31;
            if (i18 > i15) {
                i15 = i18;
            }
            if (i18 < i7) {
                i7 = i18;
            }
            if (i19 > i10) {
                i10 = i19;
            }
            if (i19 < i13) {
                i13 = i19;
            }
            if (i20 > i11) {
                i11 = i20;
            }
            if (i20 < i14) {
                i14 = i20;
            }
        }
        this.d = i7;
        this.f55303e = i15;
        this.f55304f = i13;
        this.f55305g = i10;
        this.h = i14;
        this.f55306i = i11;
        this.f55302c = i12;
    }

    public final int b() {
        return ((this.f55306i - this.h) + 1) * ((this.f55305g - this.f55304f) + 1) * ((this.f55303e - this.d) + 1);
    }
}
