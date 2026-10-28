package q4;
public final class a {
    public final int f46991a;
    public int f46992b;
    public int f46993c;
    public int d;
    public int e;
    public int f46994f;
    public int f46995g;
    public int h;
    public int f46996i;
    public final b f46997j;

    public a(b bVar, int i10, int i11) {
        this.f46997j = bVar;
        this.f46991a = i10;
        this.f46992b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f46997j;
        int[] iArr = (int[]) bVar.f47000a;
        int[] iArr2 = (int[]) bVar.f47001b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MIN_VALUE;
        for (int i17 = this.f46991a; i17 <= this.f46992b; i17++) {
            int i18 = iArr[i17];
            i13 += iArr2[i18];
            int i19 = (i18 >> 10) & 31;
            int i20 = (i18 >> 5) & 31;
            int i21 = i18 & 31;
            if (i19 > i16) {
                i16 = i19;
            }
            if (i19 < i10) {
                i10 = i19;
            }
            if (i20 > i11) {
                i11 = i20;
            }
            if (i20 < i14) {
                i14 = i20;
            }
            if (i21 > i12) {
                i12 = i21;
            }
            if (i21 < i15) {
                i15 = i21;
            }
        }
        this.d = i10;
        this.e = i16;
        this.f46994f = i14;
        this.f46995g = i11;
        this.h = i15;
        this.f46996i = i12;
        this.f46993c = i13;
    }

    public final int b() {
        return ((this.f46996i - this.h) + 1) * ((this.f46995g - this.f46994f) + 1) * ((this.e - this.d) + 1);
    }
}
