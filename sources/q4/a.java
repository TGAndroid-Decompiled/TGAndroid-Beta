package q4;
public final class a {
    public final int f45912a;
    public int f45913b;
    public int f45914c;
    public int d;
    public int f45915e;
    public int f45916f;
    public int f45917g;
    public int h;
    public int f45918i;
    public final b f45919j;

    public a(b bVar, int i10, int i11) {
        this.f45919j = bVar;
        this.f45912a = i10;
        this.f45913b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f45919j;
        int[] iArr = (int[]) bVar.f45922a;
        int[] iArr2 = (int[]) bVar.f45923b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MIN_VALUE;
        for (int i17 = this.f45912a; i17 <= this.f45913b; i17++) {
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
        this.f45915e = i16;
        this.f45916f = i14;
        this.f45917g = i11;
        this.h = i15;
        this.f45918i = i12;
        this.f45914c = i13;
    }

    public final int b() {
        return ((this.f45918i - this.h) + 1) * ((this.f45917g - this.f45916f) + 1) * ((this.f45915e - this.d) + 1);
    }
}
