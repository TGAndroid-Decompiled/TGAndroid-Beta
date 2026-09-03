package yf;
public final class f {
    public boolean f47273a;
    public float f47274b;
    public float f47275c;
    public float d;
    public float e;
    public float f47276f;
    public float f47277g;
    public boolean h;
    public int f47278i;
    public float f47279j;
    public float f47280k;
    public float f47281l;
    public float f47282m;

    public final f clone() {
        ?? obj = new Object();
        obj.f47273a = this.f47273a;
        obj.f47274b = this.f47274b;
        obj.f47275c = this.f47275c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f47276f = this.f47276f;
        obj.f47277g = this.f47277g;
        obj.h = this.h;
        obj.f47278i = this.f47278i;
        obj.f47279j = this.f47279j;
        obj.f47280k = this.f47280k;
        obj.f47281l = this.f47281l;
        obj.f47282m = this.f47282m;
        return obj;
    }

    public final int b() {
        return this.f47278i;
    }

    public final boolean c() {
        return this.f47273a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z4, float f10, float f11, float f12, int i10, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z10) {
        this.f47273a = z4;
        this.f47274b = f10;
        this.f47275c = f11;
        this.f47276f = f13;
        this.f47277g = f12;
        this.f47278i = i10;
        while (true) {
            int i11 = this.f47278i;
            if (i11 >= 0) {
                break;
            }
            this.f47278i = i11 + 360;
        }
        while (true) {
            int i12 = this.f47278i;
            if (i12 >= 360) {
                this.f47278i = i12 - 360;
            } else {
                this.f47279j = f16;
                this.f47280k = f17;
                this.d = f18;
                this.e = f19;
                this.f47281l = f14;
                this.f47282m = f15;
                this.h = z10;
                return;
            }
        }
    }
}
