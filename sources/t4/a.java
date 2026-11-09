package t4;
public final class a {
    public final int f55429a;
    public int f55430b;
    public int f55431c;
    public int d;
    public int f55432e;
    public int f55433f;
    public int f55434g;
    public int h;
    public int f55435i;
    public final b f55436j;

    public a(b bVar, int i7, int i10) {
        this.f55436j = bVar;
        this.f55429a = i7;
        this.f55430b = i10;
        a();
    }

    public final void a() {
        b bVar = this.f55436j;
        int[] iArr = (int[]) bVar.f55439a;
        int[] iArr2 = (int[]) bVar.f55440b;
        int i7 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        for (int i16 = this.f55429a; i16 <= this.f55430b; i16++) {
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
        this.f55432e = i15;
        this.f55433f = i13;
        this.f55434g = i10;
        this.h = i14;
        this.f55435i = i11;
        this.f55431c = i12;
    }

    public final int b() {
        return ((this.f55435i - this.h) + 1) * ((this.f55434g - this.f55433f) + 1) * ((this.f55432e - this.d) + 1);
    }
}
