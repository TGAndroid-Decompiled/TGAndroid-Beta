package uf;

public final class f {

    public boolean f48584a;

    public float f48585b;

    public float f48586c;
    public float d;

    public float f48587e;

    public float f48588f;

    public float f48589g;
    public boolean h;

    public int f48590i;

    public float f48591j;

    public float f48592k;

    public float f48593l;

    public float f48594m;

    public final f clone() {
        f fVar = new f();
        fVar.f48584a = this.f48584a;
        fVar.f48585b = this.f48585b;
        fVar.f48586c = this.f48586c;
        fVar.d = this.d;
        fVar.f48587e = this.f48587e;
        fVar.f48588f = this.f48588f;
        fVar.f48589g = this.f48589g;
        fVar.h = this.h;
        fVar.f48590i = this.f48590i;
        fVar.f48591j = this.f48591j;
        fVar.f48592k = this.f48592k;
        fVar.f48593l = this.f48593l;
        fVar.f48594m = this.f48594m;
        return fVar;
    }

    public final int b() {
        return this.f48590i;
    }

    public final boolean c() {
        return this.f48584a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f10, float f11, float f12, int i10, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        this.f48584a = z10;
        this.f48585b = f10;
        this.f48586c = f11;
        this.f48588f = f13;
        this.f48589g = f12;
        this.f48590i = i10;
        while (true) {
            int i11 = this.f48590i;
            if (i11 >= 0) {
                break;
            } else {
                this.f48590i = i11 + 360;
            }
        }
        while (true) {
            int i12 = this.f48590i;
            if (i12 < 360) {
                this.f48591j = f16;
                this.f48592k = f17;
                this.d = f18;
                this.f48587e = f19;
                this.f48593l = f14;
                this.f48594m = f15;
                this.h = z11;
                return;
            }
            this.f48590i = i12 - 360;
        }
    }
}
