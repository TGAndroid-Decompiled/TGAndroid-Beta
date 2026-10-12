package w3;

import e2.v;
public final class a {
    public final int f49997a;
    public int f49998b;
    public int f49999c;
    public long d;
    public final boolean f50000e;
    public final v f50001f;
    public final v f50002g;
    public int h;
    public int f50003i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f50002g = vVar;
        this.f50001f = vVar2;
        this.f50000e = z10;
        vVar2.J(12);
        this.f49997a = vVar2.B();
        vVar.J(12);
        this.f50003i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f49998b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f49998b + 1;
        this.f49998b = i11;
        if (i11 == this.f49997a) {
            return false;
        }
        boolean z11 = this.f50000e;
        v vVar = this.f50001f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f49998b == this.h) {
            v vVar2 = this.f50002g;
            this.f49999c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f50003i - 1;
            this.f50003i = i12;
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
