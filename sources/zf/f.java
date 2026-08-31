package zf;
public final class f {
    public boolean f51123a;
    public float f51124b;
    public float f51125c;
    public float d;
    public float f51126e;
    public float f51127f;
    public float f51128g;
    public boolean h;
    public int f51129i;
    public float f51130j;
    public float f51131k;
    public float f51132l;
    public float f51133m;

    public final f clone() {
        ?? obj = new Object();
        obj.f51123a = this.f51123a;
        obj.f51124b = this.f51124b;
        obj.f51125c = this.f51125c;
        obj.d = this.d;
        obj.f51126e = this.f51126e;
        obj.f51127f = this.f51127f;
        obj.f51128g = this.f51128g;
        obj.h = this.h;
        obj.f51129i = this.f51129i;
        obj.f51130j = this.f51130j;
        obj.f51131k = this.f51131k;
        obj.f51132l = this.f51132l;
        obj.f51133m = this.f51133m;
        return obj;
    }

    public final int b() {
        return this.f51129i;
    }

    public final boolean c() {
        return this.f51123a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z4, float f10, float f11, float f12, int i10, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z10) {
        this.f51123a = z4;
        this.f51124b = f10;
        this.f51125c = f11;
        this.f51127f = f13;
        this.f51128g = f12;
        this.f51129i = i10;
        while (true) {
            int i11 = this.f51129i;
            if (i11 >= 0) {
                break;
            }
            this.f51129i = i11 + 360;
        }
        while (true) {
            int i12 = this.f51129i;
            if (i12 >= 360) {
                this.f51129i = i12 - 360;
            } else {
                this.f51130j = f16;
                this.f51131k = f17;
                this.d = f18;
                this.f51126e = f19;
                this.f51132l = f14;
                this.f51133m = f15;
                this.h = z10;
                return;
            }
        }
    }
}
