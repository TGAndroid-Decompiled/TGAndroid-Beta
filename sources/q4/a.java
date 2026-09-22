package q4;
public final class a {
    public final int f41462a;
    public int f41463b;
    public int f41464c;
    public int d;
    public int e;
    public int f41465f;
    public int f41466g;
    public int h;
    public int f41467i;
    public final b f41468j;

    public a(b bVar, int i10, int i11) {
        this.f41468j = bVar;
        this.f41462a = i10;
        this.f41463b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f41468j;
        int[] iArr = (int[]) bVar.f41471a;
        int[] iArr2 = (int[]) bVar.f41472b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f41462a; i17 <= this.f41463b; i17++) {
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
        this.e = i13;
        this.f41465f = i11;
        this.f41466g = i14;
        this.h = i12;
        this.f41467i = i15;
        this.f41464c = i16;
    }

    public final int b() {
        return ((this.f41467i - this.h) + 1) * ((this.f41466g - this.f41465f) + 1) * ((this.e - this.d) + 1);
    }
}
