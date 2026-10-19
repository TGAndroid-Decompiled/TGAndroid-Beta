package q4;
public final class a {
    public final int f44378a;
    public int f44379b;
    public int f44380c;
    public int d;
    public int e;
    public int f44381f;
    public int f44382g;
    public int h;
    public int f44383i;
    public final b f44384j;

    public a(b bVar, int i10, int i11) {
        this.f44384j = bVar;
        this.f44378a = i10;
        this.f44379b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f44384j;
        int[] iArr = (int[]) bVar.f44387a;
        int[] iArr2 = (int[]) bVar.f44388b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MIN_VALUE;
        for (int i17 = this.f44378a; i17 <= this.f44379b; i17++) {
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
        this.f44381f = i14;
        this.f44382g = i11;
        this.h = i15;
        this.f44383i = i12;
        this.f44380c = i13;
    }

    public final int b() {
        return ((this.f44383i - this.h) + 1) * ((this.f44382g - this.f44381f) + 1) * ((this.e - this.d) + 1);
    }
}
