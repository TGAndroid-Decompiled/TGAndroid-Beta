package wf;
public final class f {
    public boolean f49911a;
    public float f49912b;
    public float f49913c;
    public float d;
    public float f49914e;
    public float f49915f;
    public float f49916g;
    public boolean h;
    public int f49917i;
    public float f49918j;
    public float f49919k;
    public float f49920l;
    public float f49921m;

    public final f clone() {
        ?? obj = new Object();
        obj.f49911a = this.f49911a;
        obj.f49912b = this.f49912b;
        obj.f49913c = this.f49913c;
        obj.d = this.d;
        obj.f49914e = this.f49914e;
        obj.f49915f = this.f49915f;
        obj.f49916g = this.f49916g;
        obj.h = this.h;
        obj.f49917i = this.f49917i;
        obj.f49918j = this.f49918j;
        obj.f49919k = this.f49919k;
        obj.f49920l = this.f49920l;
        obj.f49921m = this.f49921m;
        return obj;
    }

    public final int b() {
        return this.f49917i;
    }

    public final boolean c() {
        return this.f49911a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f9, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f49911a = z10;
        this.f49912b = f9;
        this.f49913c = f10;
        this.f49915f = f12;
        this.f49916g = f11;
        this.f49917i = i10;
        while (true) {
            int i11 = this.f49917i;
            if (i11 >= 0) {
                break;
            }
            this.f49917i = i11 + 360;
        }
        while (true) {
            int i12 = this.f49917i;
            if (i12 >= 360) {
                this.f49917i = i12 - 360;
            } else {
                this.f49918j = f15;
                this.f49919k = f16;
                this.d = f17;
                this.f49914e = f18;
                this.f49920l = f13;
                this.f49921m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
