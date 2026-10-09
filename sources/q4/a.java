package q4;
public final class a {
    public final int f45967a;
    public int f45968b;
    public int f45969c;
    public int d;
    public int f45970e;
    public int f45971f;
    public int f45972g;
    public int h;
    public int f45973i;
    public final b f45974j;

    public a(b bVar, int i10, int i11) {
        this.f45974j = bVar;
        this.f45967a = i10;
        this.f45968b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f45974j;
        int[] iArr = (int[]) bVar.f45977a;
        int[] iArr2 = (int[]) bVar.f45978b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MIN_VALUE;
        for (int i17 = this.f45967a; i17 <= this.f45968b; i17++) {
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
        this.f45970e = i16;
        this.f45971f = i14;
        this.f45972g = i11;
        this.h = i15;
        this.f45973i = i12;
        this.f45969c = i13;
    }

    public final int b() {
        return ((this.f45973i - this.h) + 1) * ((this.f45972g - this.f45971f) + 1) * ((this.f45970e - this.d) + 1);
    }
}
