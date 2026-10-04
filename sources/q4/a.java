package q4;
public final class a {
    public final int f44796a;
    public int f44797b;
    public int f44798c;
    public int d;
    public int f44799e;
    public int f44800f;
    public int f44801g;
    public int h;
    public int f44802i;
    public final b f44803j;

    public a(b bVar, int i10, int i11) {
        this.f44803j = bVar;
        this.f44796a = i10;
        this.f44797b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f44803j;
        int[] iArr = (int[]) bVar.f44806a;
        int[] iArr2 = (int[]) bVar.f44807b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f44796a; i17 <= this.f44797b; i17++) {
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
        this.f44799e = i13;
        this.f44800f = i11;
        this.f44801g = i14;
        this.h = i12;
        this.f44802i = i15;
        this.f44798c = i16;
    }

    public final int b() {
        return ((this.f44802i - this.h) + 1) * ((this.f44801g - this.f44800f) + 1) * ((this.f44799e - this.d) + 1);
    }
}
