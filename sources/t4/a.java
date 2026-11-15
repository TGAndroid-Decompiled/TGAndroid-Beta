package t4;
public final class a {
    public final int f57011a;
    public int f57012b;
    public int f57013c;
    public int d;
    public int f57014e;
    public int f57015f;
    public int f57016g;
    public int h;
    public int f57017i;
    public final b f57018j;

    public a(b bVar, int i7, int i10) {
        this.f57018j = bVar;
        this.f57011a = i7;
        this.f57012b = i10;
        a();
    }

    public final void a() {
        b bVar = this.f57018j;
        int[] iArr = (int[]) bVar.f57021a;
        int[] iArr2 = (int[]) bVar.f57022b;
        int i7 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        for (int i16 = this.f57011a; i16 <= this.f57012b; i16++) {
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
        this.f57014e = i15;
        this.f57015f = i13;
        this.f57016g = i10;
        this.h = i14;
        this.f57017i = i11;
        this.f57013c = i12;
    }

    public final int b() {
        return ((this.f57017i - this.h) + 1) * ((this.f57016g - this.f57015f) + 1) * ((this.f57014e - this.d) + 1);
    }
}
