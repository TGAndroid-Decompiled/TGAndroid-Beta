package q4;
public final class a {
    public final int f40516a;
    public int f40517b;
    public int f40518c;
    public int d;
    public int e;
    public int f40519f;
    public int f40520g;
    public int h;
    public int f40521i;
    public final b f40522j;

    public a(b bVar, int i10, int i11) {
        this.f40522j = bVar;
        this.f40516a = i10;
        this.f40517b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f40522j;
        int[] iArr = (int[]) bVar.f40525a;
        int[] iArr2 = (int[]) bVar.f40526b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f40516a; i17 <= this.f40517b; i17++) {
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
        this.f40519f = i11;
        this.f40520g = i14;
        this.h = i12;
        this.f40521i = i15;
        this.f40518c = i16;
    }

    public final int b() {
        return ((this.f40521i - this.h) + 1) * ((this.f40520g - this.f40519f) + 1) * ((this.e - this.d) + 1);
    }
}
