package tf;
public final class f {
    public boolean f47862a;
    public float f47863b;
    public float f47864c;
    public float d;
    public float f47865e;
    public float f47866f;
    public float f47867g;
    public boolean h;
    public int f47868i;
    public float f47869j;
    public float f47870k;
    public float f47871l;
    public float f47872m;

    public final f clone() {
        ?? obj = new Object();
        obj.f47862a = this.f47862a;
        obj.f47863b = this.f47863b;
        obj.f47864c = this.f47864c;
        obj.d = this.d;
        obj.f47865e = this.f47865e;
        obj.f47866f = this.f47866f;
        obj.f47867g = this.f47867g;
        obj.h = this.h;
        obj.f47868i = this.f47868i;
        obj.f47869j = this.f47869j;
        obj.f47870k = this.f47870k;
        obj.f47871l = this.f47871l;
        obj.f47872m = this.f47872m;
        return obj;
    }

    public final int b() {
        return this.f47868i;
    }

    public final boolean c() {
        return this.f47862a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f10, float f11, float f12, int i9, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        this.f47862a = z10;
        this.f47863b = f10;
        this.f47864c = f11;
        this.f47866f = f13;
        this.f47867g = f12;
        this.f47868i = i9;
        while (true) {
            int i10 = this.f47868i;
            if (i10 >= 0) {
                break;
            }
            this.f47868i = i10 + 360;
        }
        while (true) {
            int i11 = this.f47868i;
            if (i11 >= 360) {
                this.f47868i = i11 - 360;
            } else {
                this.f47869j = f16;
                this.f47870k = f17;
                this.d = f18;
                this.f47865e = f19;
                this.f47871l = f14;
                this.f47872m = f15;
                this.h = z11;
                return;
            }
        }
    }
}
