package t4;
public final class a {
    public final int f57595a;
    public int f57596b;
    public int f57597c;
    public int d;
    public int f57598e;
    public int f57599f;
    public int f57600g;
    public int h;
    public int f57601i;
    public final b f57602j;

    public a(b bVar, int i7, int i10) {
        this.f57602j = bVar;
        this.f57595a = i7;
        this.f57596b = i10;
        a();
    }

    public final void a() {
        b bVar = this.f57602j;
        int[] iArr = (int[]) bVar.f57605a;
        int[] iArr2 = (int[]) bVar.f57606b;
        int i7 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        for (int i16 = this.f57595a; i16 <= this.f57596b; i16++) {
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
        this.f57598e = i15;
        this.f57599f = i13;
        this.f57600g = i10;
        this.h = i14;
        this.f57601i = i11;
        this.f57597c = i12;
    }

    public final int b() {
        return ((this.f57601i - this.h) + 1) * ((this.f57600g - this.f57599f) + 1) * ((this.f57598e - this.d) + 1);
    }
}
