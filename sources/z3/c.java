package z3;

import h5.w;
import k7.u6;
public final class c {
    public final int f51006a;
    public int f51007b;
    public int f51008c;
    public long d;
    public final boolean f51009e;
    public final w f51010f;
    public final w f51011g;
    public int h;
    public int f51012i;

    public c(w wVar, w wVar2, boolean z4) {
        this.f51011g = wVar;
        this.f51010f = wVar2;
        this.f51009e = z4;
        wVar2.F(12);
        this.f51006a = wVar2.x();
        wVar.F(12);
        this.f51012i = wVar.x();
        u6.a("first_chunk must be 1", wVar.g() == 1);
        this.f51007b = -1;
    }

    public final boolean a() {
        long v;
        int i10;
        int i11 = this.f51007b + 1;
        this.f51007b = i11;
        if (i11 == this.f51006a) {
            return false;
        }
        boolean z4 = this.f51009e;
        w wVar = this.f51010f;
        if (z4) {
            v = wVar.y();
        } else {
            v = wVar.v();
        }
        this.d = v;
        if (this.f51007b == this.h) {
            w wVar2 = this.f51011g;
            this.f51008c = wVar2.x();
            wVar2.G(4);
            int i12 = this.f51012i - 1;
            this.f51012i = i12;
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
