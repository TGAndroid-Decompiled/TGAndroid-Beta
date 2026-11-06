package t4;
public final class a {
    public final int f55324a;
    public int f55325b;
    public int f55326c;
    public int d;
    public int f55327e;
    public int f55328f;
    public int f55329g;
    public int h;
    public int f55330i;
    public final b f55331j;

    public a(b bVar, int i7, int i10) {
        this.f55331j = bVar;
        this.f55324a = i7;
        this.f55325b = i10;
        a();
    }

    public final void a() {
        b bVar = this.f55331j;
        int[] iArr = (int[]) bVar.f55334a;
        int[] iArr2 = (int[]) bVar.f55335b;
        int i7 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        for (int i16 = this.f55324a; i16 <= this.f55325b; i16++) {
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
        this.f55327e = i15;
        this.f55328f = i13;
        this.f55329g = i10;
        this.h = i14;
        this.f55330i = i11;
        this.f55326c = i12;
    }

    public final int b() {
        return ((this.f55330i - this.h) + 1) * ((this.f55329g - this.f55328f) + 1) * ((this.f55327e - this.d) + 1);
    }
}
