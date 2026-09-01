package z3;

import h5.w;
import k7.u6;
public final class c {
    public final int f50970a;
    public int f50971b;
    public int f50972c;
    public long d;
    public final boolean f50973e;
    public final w f50974f;
    public final w f50975g;
    public int h;
    public int f50976i;

    public c(w wVar, w wVar2, boolean z4) {
        this.f50975g = wVar;
        this.f50974f = wVar2;
        this.f50973e = z4;
        wVar2.F(12);
        this.f50970a = wVar2.x();
        wVar.F(12);
        this.f50976i = wVar.x();
        u6.a("first_chunk must be 1", wVar.g() == 1);
        this.f50971b = -1;
    }

    public final boolean a() {
        long v;
        int i10;
        int i11 = this.f50971b + 1;
        this.f50971b = i11;
        if (i11 == this.f50970a) {
            return false;
        }
        boolean z4 = this.f50973e;
        w wVar = this.f50974f;
        if (z4) {
            v = wVar.y();
        } else {
            v = wVar.v();
        }
        this.d = v;
        if (this.f50971b == this.h) {
            w wVar2 = this.f50975g;
            this.f50972c = wVar2.x();
            wVar2.G(4);
            int i12 = this.f50976i - 1;
            this.f50976i = i12;
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
