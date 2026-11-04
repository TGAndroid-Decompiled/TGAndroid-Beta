package s4;
public final class a {
    public final int f54638a;
    public int f54639b;
    public int f54640c;
    public int d;
    public int f54641e;
    public int f54642f;
    public int f54643g;
    public int h;
    public int f54644i;
    public final b f54645j;

    public a(b bVar, int i3, int i10) {
        this.f54645j = bVar;
        this.f54638a = i3;
        this.f54639b = i10;
        a();
    }

    public final void a() {
        b bVar = this.f54645j;
        int[] iArr = (int[]) bVar.f54648a;
        int[] iArr2 = (int[]) bVar.f54649b;
        int i3 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        for (int i16 = this.f54638a; i16 <= this.f54639b; i16++) {
            int i17 = iArr[i16];
            i12 += iArr2[i17];
            int i18 = (i17 >> 10) & 31;
            int i19 = (i17 >> 5) & 31;
            int i20 = i17 & 31;
            if (i18 > i15) {
                i15 = i18;
            }
            if (i18 < i3) {
                i3 = i18;
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
        this.d = i3;
        this.f54641e = i15;
        this.f54642f = i13;
        this.f54643g = i10;
        this.h = i14;
        this.f54644i = i11;
        this.f54640c = i12;
    }

    public final int b() {
        return ((this.f54644i - this.h) + 1) * ((this.f54643g - this.f54642f) + 1) * ((this.f54641e - this.d) + 1);
    }
}
