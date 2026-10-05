package q4;
public final class a {
    public final int f44811a;
    public int f44812b;
    public int f44813c;
    public int d;
    public int f44814e;
    public int f44815f;
    public int f44816g;
    public int h;
    public int f44817i;
    public final b f44818j;

    public a(b bVar, int i10, int i11) {
        this.f44818j = bVar;
        this.f44811a = i10;
        this.f44812b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f44818j;
        int[] iArr = (int[]) bVar.f44821a;
        int[] iArr2 = (int[]) bVar.f44822b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f44811a; i17 <= this.f44812b; i17++) {
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
        this.f44814e = i13;
        this.f44815f = i11;
        this.f44816g = i14;
        this.h = i12;
        this.f44817i = i15;
        this.f44813c = i16;
    }

    public final int b() {
        return ((this.f44817i - this.h) + 1) * ((this.f44816g - this.f44815f) + 1) * ((this.f44814e - this.d) + 1);
    }
}
