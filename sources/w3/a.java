package w3;

import e2.v;
public final class a {
    public final int f49882a;
    public int f49883b;
    public int f49884c;
    public long d;
    public final boolean f49885e;
    public final v f49886f;
    public final v f49887g;
    public int h;
    public int f49888i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f49887g = vVar;
        this.f49886f = vVar2;
        this.f49885e = z10;
        vVar2.J(12);
        this.f49882a = vVar2.B();
        vVar.J(12);
        this.f49888i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f49883b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f49883b + 1;
        this.f49883b = i11;
        if (i11 == this.f49882a) {
            return false;
        }
        boolean z11 = this.f49885e;
        v vVar = this.f49886f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f49883b == this.h) {
            v vVar2 = this.f49887g;
            this.f49884c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f49888i - 1;
            this.f49888i = i12;
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
