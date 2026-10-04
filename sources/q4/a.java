package q4;
public final class a {
    public final int f44797a;
    public int f44798b;
    public int f44799c;
    public int d;
    public int f44800e;
    public int f44801f;
    public int f44802g;
    public int h;
    public int f44803i;
    public final b f44804j;

    public a(b bVar, int i10, int i11) {
        this.f44804j = bVar;
        this.f44797a = i10;
        this.f44798b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f44804j;
        int[] iArr = (int[]) bVar.f44807a;
        int[] iArr2 = (int[]) bVar.f44808b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f44797a; i17 <= this.f44798b; i17++) {
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
        this.f44800e = i13;
        this.f44801f = i11;
        this.f44802g = i14;
        this.h = i12;
        this.f44803i = i15;
        this.f44799c = i16;
    }

    public final int b() {
        return ((this.f44803i - this.h) + 1) * ((this.f44802g - this.f44801f) + 1) * ((this.f44800e - this.d) + 1);
    }
}
