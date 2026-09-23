package q4;
public final class a {
    public final int f41091a;
    public int f41092b;
    public int f41093c;
    public int d;
    public int e;
    public int f41094f;
    public int f41095g;
    public int h;
    public int f41096i;
    public final b f41097j;

    public a(b bVar, int i10, int i11) {
        this.f41097j = bVar;
        this.f41091a = i10;
        this.f41092b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f41097j;
        int[] iArr = (int[]) bVar.f41100a;
        int[] iArr2 = (int[]) bVar.f41101b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f41091a; i17 <= this.f41092b; i17++) {
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
        this.f41094f = i11;
        this.f41095g = i14;
        this.h = i12;
        this.f41096i = i15;
        this.f41093c = i16;
    }

    public final int b() {
        return ((this.f41096i - this.h) + 1) * ((this.f41095g - this.f41094f) + 1) * ((this.e - this.d) + 1);
    }
}
