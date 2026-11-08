package t4;
public final class a {
    public final int f55416a;
    public int f55417b;
    public int f55418c;
    public int d;
    public int f55419e;
    public int f55420f;
    public int f55421g;
    public int h;
    public int f55422i;
    public final b f55423j;

    public a(b bVar, int i7, int i10) {
        this.f55423j = bVar;
        this.f55416a = i7;
        this.f55417b = i10;
        a();
    }

    public final void a() {
        b bVar = this.f55423j;
        int[] iArr = (int[]) bVar.f55426a;
        int[] iArr2 = (int[]) bVar.f55427b;
        int i7 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        for (int i16 = this.f55416a; i16 <= this.f55417b; i16++) {
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
        this.f55419e = i15;
        this.f55420f = i13;
        this.f55421g = i10;
        this.h = i14;
        this.f55422i = i11;
        this.f55418c = i12;
    }

    public final int b() {
        return ((this.f55422i - this.h) + 1) * ((this.f55421g - this.f55420f) + 1) * ((this.f55419e - this.d) + 1);
    }
}
