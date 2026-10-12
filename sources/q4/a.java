package q4;
public final class a {
    public final int f43296a;
    public int f43297b;
    public int f43298c;
    public int d;
    public int e;
    public int f43299f;
    public int f43300g;
    public int h;
    public int f43301i;
    public final b f43302j;

    public a(b bVar, int i10, int i11) {
        this.f43302j = bVar;
        this.f43296a = i10;
        this.f43297b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f43302j;
        int[] iArr = (int[]) bVar.f43305a;
        int[] iArr2 = (int[]) bVar.f43306b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MIN_VALUE;
        for (int i17 = this.f43296a; i17 <= this.f43297b; i17++) {
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
        this.f43299f = i14;
        this.f43300g = i11;
        this.h = i15;
        this.f43301i = i12;
        this.f43298c = i13;
    }

    public final int b() {
        return ((this.f43301i - this.h) + 1) * ((this.f43300g - this.f43299f) + 1) * ((this.e - this.d) + 1);
    }
}
