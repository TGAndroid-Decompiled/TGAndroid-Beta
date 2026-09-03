package zf;
public final class f {
    public boolean f51159a;
    public float f51160b;
    public float f51161c;
    public float d;
    public float f51162e;
    public float f51163f;
    public float f51164g;
    public boolean h;
    public int f51165i;
    public float f51166j;
    public float f51167k;
    public float f51168l;
    public float f51169m;

    public final f clone() {
        ?? obj = new Object();
        obj.f51159a = this.f51159a;
        obj.f51160b = this.f51160b;
        obj.f51161c = this.f51161c;
        obj.d = this.d;
        obj.f51162e = this.f51162e;
        obj.f51163f = this.f51163f;
        obj.f51164g = this.f51164g;
        obj.h = this.h;
        obj.f51165i = this.f51165i;
        obj.f51166j = this.f51166j;
        obj.f51167k = this.f51167k;
        obj.f51168l = this.f51168l;
        obj.f51169m = this.f51169m;
        return obj;
    }

    public final int b() {
        return this.f51165i;
    }

    public final boolean c() {
        return this.f51159a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z4, float f10, float f11, float f12, int i10, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z10) {
        this.f51159a = z4;
        this.f51160b = f10;
        this.f51161c = f11;
        this.f51163f = f13;
        this.f51164g = f12;
        this.f51165i = i10;
        while (true) {
            int i11 = this.f51165i;
            if (i11 >= 0) {
                break;
            }
            this.f51165i = i11 + 360;
        }
        while (true) {
            int i12 = this.f51165i;
            if (i12 >= 360) {
                this.f51165i = i12 - 360;
            } else {
                this.f51166j = f16;
                this.f51167k = f17;
                this.d = f18;
                this.f51162e = f19;
                this.f51168l = f14;
                this.f51169m = f15;
                this.h = z10;
                return;
            }
        }
    }
}
