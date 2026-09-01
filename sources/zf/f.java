package zf;
public final class f {
    public boolean f51124a;
    public float f51125b;
    public float f51126c;
    public float d;
    public float f51127e;
    public float f51128f;
    public float f51129g;
    public boolean h;
    public int f51130i;
    public float f51131j;
    public float f51132k;
    public float f51133l;
    public float f51134m;

    public final f clone() {
        ?? obj = new Object();
        obj.f51124a = this.f51124a;
        obj.f51125b = this.f51125b;
        obj.f51126c = this.f51126c;
        obj.d = this.d;
        obj.f51127e = this.f51127e;
        obj.f51128f = this.f51128f;
        obj.f51129g = this.f51129g;
        obj.h = this.h;
        obj.f51130i = this.f51130i;
        obj.f51131j = this.f51131j;
        obj.f51132k = this.f51132k;
        obj.f51133l = this.f51133l;
        obj.f51134m = this.f51134m;
        return obj;
    }

    public final int b() {
        return this.f51130i;
    }

    public final boolean c() {
        return this.f51124a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z4, float f10, float f11, float f12, int i10, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z10) {
        this.f51124a = z4;
        this.f51125b = f10;
        this.f51126c = f11;
        this.f51128f = f13;
        this.f51129g = f12;
        this.f51130i = i10;
        while (true) {
            int i11 = this.f51130i;
            if (i11 >= 0) {
                break;
            }
            this.f51130i = i11 + 360;
        }
        while (true) {
            int i12 = this.f51130i;
            if (i12 >= 360) {
                this.f51130i = i12 - 360;
            } else {
                this.f51131j = f16;
                this.f51132k = f17;
                this.d = f18;
                this.f51127e = f19;
                this.f51133l = f14;
                this.f51134m = f15;
                this.h = z10;
                return;
            }
        }
    }
}
