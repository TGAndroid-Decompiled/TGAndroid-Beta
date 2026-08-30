package yf;
public final class f {
    public boolean f47209a;
    public float f47210b;
    public float f47211c;
    public float d;
    public float e;
    public float f47212f;
    public float f47213g;
    public boolean h;
    public int f47214i;
    public float f47215j;
    public float f47216k;
    public float f47217l;
    public float f47218m;

    public final f clone() {
        ?? obj = new Object();
        obj.f47209a = this.f47209a;
        obj.f47210b = this.f47210b;
        obj.f47211c = this.f47211c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f47212f = this.f47212f;
        obj.f47213g = this.f47213g;
        obj.h = this.h;
        obj.f47214i = this.f47214i;
        obj.f47215j = this.f47215j;
        obj.f47216k = this.f47216k;
        obj.f47217l = this.f47217l;
        obj.f47218m = this.f47218m;
        return obj;
    }

    public final int b() {
        return this.f47214i;
    }

    public final boolean c() {
        return this.f47209a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z4, float f10, float f11, float f12, int i10, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z10) {
        this.f47209a = z4;
        this.f47210b = f10;
        this.f47211c = f11;
        this.f47212f = f13;
        this.f47213g = f12;
        this.f47214i = i10;
        while (true) {
            int i11 = this.f47214i;
            if (i11 >= 0) {
                break;
            }
            this.f47214i = i11 + 360;
        }
        while (true) {
            int i12 = this.f47214i;
            if (i12 >= 360) {
                this.f47214i = i12 - 360;
            } else {
                this.f47215j = f16;
                this.f47216k = f17;
                this.d = f18;
                this.e = f19;
                this.f47217l = f14;
                this.f47218m = f15;
                this.h = z10;
                return;
            }
        }
    }
}
