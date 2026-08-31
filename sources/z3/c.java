package z3;

import h5.w;
import k7.u6;
public final class c {
    public final int f50969a;
    public int f50970b;
    public int f50971c;
    public long d;
    public final boolean f50972e;
    public final w f50973f;
    public final w f50974g;
    public int h;
    public int f50975i;

    public c(w wVar, w wVar2, boolean z4) {
        this.f50974g = wVar;
        this.f50973f = wVar2;
        this.f50972e = z4;
        wVar2.F(12);
        this.f50969a = wVar2.x();
        wVar.F(12);
        this.f50975i = wVar.x();
        u6.a("first_chunk must be 1", wVar.g() == 1);
        this.f50970b = -1;
    }

    public final boolean a() {
        long v;
        int i10;
        int i11 = this.f50970b + 1;
        this.f50970b = i11;
        if (i11 == this.f50969a) {
            return false;
        }
        boolean z4 = this.f50972e;
        w wVar = this.f50973f;
        if (z4) {
            v = wVar.y();
        } else {
            v = wVar.v();
        }
        this.d = v;
        if (this.f50970b == this.h) {
            w wVar2 = this.f50974g;
            this.f50971c = wVar2.x();
            wVar2.G(4);
            int i12 = this.f50975i - 1;
            this.f50975i = i12;
            if (i12 > 0) {
                i10 = wVar2.x() - 1;
            } else {
                i10 = -1;
            }
            this.h = i10;
        }
        return true;
    }
}
