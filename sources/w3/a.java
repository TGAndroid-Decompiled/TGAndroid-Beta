package w3;

import e2.v;
public final class a {
    public final int f48463a;
    public int f48464b;
    public int f48465c;
    public long d;
    public final boolean f48466e;
    public final v f48467f;
    public final v f48468g;
    public int h;
    public int f48469i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f48468g = vVar;
        this.f48467f = vVar2;
        this.f48466e = z10;
        vVar2.J(12);
        this.f48463a = vVar2.B();
        vVar.J(12);
        this.f48469i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f48464b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f48464b + 1;
        this.f48464b = i11;
        if (i11 == this.f48463a) {
            return false;
        }
        boolean z11 = this.f48466e;
        v vVar = this.f48467f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f48464b == this.h) {
            v vVar2 = this.f48468g;
            this.f48465c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f48469i - 1;
            this.f48469i = i12;
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
