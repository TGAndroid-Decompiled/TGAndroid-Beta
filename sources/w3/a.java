package w3;

import e2.v;
public final class a {
    public final int f49989a;
    public int f49990b;
    public int f49991c;
    public long d;
    public final boolean f49992e;
    public final v f49993f;
    public final v f49994g;
    public int h;
    public int f49995i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f49994g = vVar;
        this.f49993f = vVar2;
        this.f49992e = z10;
        vVar2.J(12);
        this.f49989a = vVar2.B();
        vVar.J(12);
        this.f49995i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f49990b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f49990b + 1;
        this.f49990b = i11;
        if (i11 == this.f49989a) {
            return false;
        }
        boolean z11 = this.f49992e;
        v vVar = this.f49993f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f49990b == this.h) {
            v vVar2 = this.f49994g;
            this.f49991c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f49995i - 1;
            this.f49995i = i12;
            if (i12 > 0) {
                i10 = vVar2.B() - 1;
            } else {
                i10 = -1;
            }
            this.h = i10;
        }
        return true;
    }
}
