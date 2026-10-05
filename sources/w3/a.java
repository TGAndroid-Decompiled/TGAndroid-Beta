package w3;

import e2.v;
public final class a {
    public final int f48478a;
    public int f48479b;
    public int f48480c;
    public long d;
    public final boolean f48481e;
    public final v f48482f;
    public final v f48483g;
    public int h;
    public int f48484i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f48483g = vVar;
        this.f48482f = vVar2;
        this.f48481e = z10;
        vVar2.J(12);
        this.f48478a = vVar2.B();
        vVar.J(12);
        this.f48484i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f48479b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f48479b + 1;
        this.f48479b = i11;
        if (i11 == this.f48478a) {
            return false;
        }
        boolean z11 = this.f48481e;
        v vVar = this.f48482f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f48479b == this.h) {
            v vVar2 = this.f48483g;
            this.f48480c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f48484i - 1;
            this.f48484i = i12;
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
