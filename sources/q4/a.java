package q4;
public final class a {
    public final int f41429a;
    public int f41430b;
    public int f41431c;
    public int d;
    public int e;
    public int f41432f;
    public int f41433g;
    public int h;
    public int f41434i;
    public final b f41435j;

    public a(b bVar, int i10, int i11) {
        this.f41435j = bVar;
        this.f41429a = i10;
        this.f41430b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f41435j;
        int[] iArr = (int[]) bVar.f41438a;
        int[] iArr2 = (int[]) bVar.f41439b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f41429a; i17 <= this.f41430b; i17++) {
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
        this.f41432f = i11;
        this.f41433g = i14;
        this.h = i12;
        this.f41434i = i15;
        this.f41431c = i16;
    }

    public final int b() {
        return ((this.f41434i - this.h) + 1) * ((this.f41433g - this.f41432f) + 1) * ((this.e - this.d) + 1);
    }
}
