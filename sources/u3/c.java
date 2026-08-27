package u3;

import d5.z;
import h3.t1;

public final class c {

    public final int f48273a;

    public int f48274b;

    public int f48275c;
    public long d;

    public final boolean f48276e;

    public final z f48277f;

    public final z f48278g;
    public int h;

    public int f48279i;

    public c(z zVar, z zVar2, boolean z10) throws t1 {
        this.f48278g = zVar;
        this.f48277f = zVar2;
        this.f48276e = z10;
        zVar2.C(12);
        this.f48273a = zVar2.u();
        zVar.C(12);
        this.f48279i = zVar.u();
        h7.q.a("first_chunk must be 1", zVar.e() == 1);
        this.f48274b = -1;
    }

    public final boolean a() {
        int i10 = this.f48274b + 1;
        this.f48274b = i10;
        if (i10 == this.f48273a) {
            return false;
        }
        boolean z10 = this.f48276e;
        z zVar = this.f48277f;
        this.d = z10 ? zVar.v() : zVar.s();
        if (this.f48274b == this.h) {
            z zVar2 = this.f48278g;
            this.f48275c = zVar2.u();
            zVar2.D(4);
            int i11 = this.f48279i - 1;
            this.f48279i = i11;
            this.h = i11 > 0 ? zVar2.u() - 1 : -1;
        }
        return true;
    }
}
