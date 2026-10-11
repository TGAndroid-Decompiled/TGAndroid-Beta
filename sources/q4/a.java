package q4;
public final class a {
    public final int f46076a;
    public int f46077b;
    public int f46078c;
    public int d;
    public int f46079e;
    public int f46080f;
    public int f46081g;
    public int h;
    public int f46082i;
    public final b f46083j;

    public a(b bVar, int i10, int i11) {
        this.f46083j = bVar;
        this.f46076a = i10;
        this.f46077b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f46083j;
        int[] iArr = (int[]) bVar.f46086a;
        int[] iArr2 = (int[]) bVar.f46087b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MIN_VALUE;
        for (int i17 = this.f46076a; i17 <= this.f46077b; i17++) {
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
        this.f46079e = i16;
        this.f46080f = i14;
        this.f46081g = i11;
        this.h = i15;
        this.f46082i = i12;
        this.f46078c = i13;
    }

    public final int b() {
        return ((this.f46082i - this.h) + 1) * ((this.f46081g - this.f46080f) + 1) * ((this.f46079e - this.d) + 1);
    }
}
