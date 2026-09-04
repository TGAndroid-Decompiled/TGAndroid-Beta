package q4;
public final class a {
    public final int f44169a;
    public int f44170b;
    public int f44171c;
    public int d;
    public int f44172e;
    public int f44173f;
    public int f44174g;
    public int h;
    public int f44175i;
    public final b f44176j;

    public a(b bVar, int i10, int i11) {
        this.f44176j = bVar;
        this.f44169a = i10;
        this.f44170b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f44176j;
        int[] iArr = (int[]) bVar.f44179a;
        int[] iArr2 = (int[]) bVar.f44180b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f44169a; i17 <= this.f44170b; i17++) {
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
        this.f44172e = i13;
        this.f44173f = i11;
        this.f44174g = i14;
        this.h = i12;
        this.f44175i = i15;
        this.f44171c = i16;
    }

    public final int b() {
        return ((this.f44175i - this.h) + 1) * ((this.f44174g - this.f44173f) + 1) * ((this.f44172e - this.d) + 1);
    }
}
