package q4;
public final class a {
    public final int f44197a;
    public int f44198b;
    public int f44199c;
    public int d;
    public int f44200e;
    public int f44201f;
    public int f44202g;
    public int h;
    public int f44203i;
    public final b f44204j;

    public a(b bVar, int i10, int i11) {
        this.f44204j = bVar;
        this.f44197a = i10;
        this.f44198b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f44204j;
        int[] iArr = (int[]) bVar.f44207a;
        int[] iArr2 = (int[]) bVar.f44208b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f44197a; i17 <= this.f44198b; i17++) {
            int i18 = iArr[i17];
            i16 += iArr2[i18];
            int i19 = (i18 >> 10) & 31;
            int i20 = (i18 >> 5) & 31;
            int i21 = i18 & 31;
            if (i19 > i13) {
                i13 = i19;
            }
            if (i19 < i10) {
                i10 = i19;
            }
            if (i20 > i14) {
                i14 = i20;
            }
            if (i20 < i11) {
                i11 = i20;
            }
            if (i21 > i15) {
                i15 = i21;
            }
            if (i21 < i12) {
                i12 = i21;
            }
        }
        this.d = i10;
        this.f44200e = i13;
        this.f44201f = i11;
        this.f44202g = i14;
        this.h = i12;
        this.f44203i = i15;
        this.f44199c = i16;
    }

    public final int b() {
        return ((this.f44203i - this.h) + 1) * ((this.f44202g - this.f44201f) + 1) * ((this.f44200e - this.d) + 1);
    }
}
