package pg;
public final class f {
    public boolean f53471a;
    public float f53472b;
    public float f53473c;
    public float d;
    public float f53474e;
    public float f53475f;
    public float f53476g;
    public boolean h;
    public int f53477i;
    public float f53478j;
    public float f53479k;
    public float f53480l;
    public float f53481m;

    public final f clone() {
        ?? obj = new Object();
        obj.f53471a = this.f53471a;
        obj.f53472b = this.f53472b;
        obj.f53473c = this.f53473c;
        obj.d = this.d;
        obj.f53474e = this.f53474e;
        obj.f53475f = this.f53475f;
        obj.f53476g = this.f53476g;
        obj.h = this.h;
        obj.f53477i = this.f53477i;
        obj.f53478j = this.f53478j;
        obj.f53479k = this.f53479k;
        obj.f53480l = this.f53480l;
        obj.f53481m = this.f53481m;
        return obj;
    }

    public final int b() {
        return this.f53477i;
    }

    public final boolean c() {
        return this.f53471a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f10, float f11, float f12, int i3, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        this.f53471a = z10;
        this.f53472b = f10;
        this.f53473c = f11;
        this.f53475f = f13;
        this.f53476g = f12;
        this.f53477i = i3;
        while (true) {
            int i10 = this.f53477i;
            if (i10 >= 0) {
                break;
            }
            this.f53477i = i10 + 360;
        }
        while (true) {
            int i11 = this.f53477i;
            if (i11 >= 360) {
                this.f53477i = i11 - 360;
            } else {
                this.f53478j = f16;
                this.f53479k = f17;
                this.d = f18;
                this.f53474e = f19;
                this.f53480l = f14;
                this.f53481m = f15;
                this.h = z11;
                return;
            }
        }
    }
}
