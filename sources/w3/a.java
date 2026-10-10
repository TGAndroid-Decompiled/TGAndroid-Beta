package w3;

import e2.v;
public final class a {
    public final int f49805a;
    public int f49806b;
    public int f49807c;
    public long d;
    public final boolean f49808e;
    public final v f49809f;
    public final v f49810g;
    public int h;
    public int f49811i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f49810g = vVar;
        this.f49809f = vVar2;
        this.f49808e = z10;
        vVar2.J(12);
        this.f49805a = vVar2.B();
        vVar.J(12);
        this.f49811i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f49806b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f49806b + 1;
        this.f49806b = i11;
        if (i11 == this.f49805a) {
            return false;
        }
        boolean z11 = this.f49808e;
        v vVar = this.f49809f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f49806b == this.h) {
            v vVar2 = this.f49810g;
            this.f49807c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f49811i - 1;
            this.f49811i = i12;
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
