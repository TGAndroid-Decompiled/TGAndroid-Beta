package q4;
public final class a {
    public final int f45965a;
    public int f45966b;
    public int f45967c;
    public int d;
    public int f45968e;
    public int f45969f;
    public int f45970g;
    public int h;
    public int f45971i;
    public final b f45972j;

    public a(b bVar, int i10, int i11) {
        this.f45972j = bVar;
        this.f45965a = i10;
        this.f45966b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f45972j;
        int[] iArr = (int[]) bVar.f45975a;
        int[] iArr2 = (int[]) bVar.f45976b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MIN_VALUE;
        for (int i17 = this.f45965a; i17 <= this.f45966b; i17++) {
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
        this.f45968e = i16;
        this.f45969f = i14;
        this.f45970g = i11;
        this.h = i15;
        this.f45971i = i12;
        this.f45967c = i13;
    }

    public final int b() {
        return ((this.f45971i - this.h) + 1) * ((this.f45970g - this.f45969f) + 1) * ((this.f45968e - this.d) + 1);
    }
}
