package z3;

import h5.w;
import k7.u6;
public final class c {
    public final int f47344a;
    public int f47345b;
    public int f47346c;
    public long d;
    public final boolean e;
    public final w f47347f;
    public final w f47348g;
    public int h;
    public int f47349i;

    public c(w wVar, w wVar2, boolean z4) {
        this.f47348g = wVar;
        this.f47347f = wVar2;
        this.e = z4;
        wVar2.F(12);
        this.f47344a = wVar2.x();
        wVar.F(12);
        this.f47349i = wVar.x();
        u6.a("first_chunk must be 1", wVar.g() == 1);
        this.f47345b = -1;
    }

    public final boolean a() {
        long v;
        int i10;
        int i11 = this.f47345b + 1;
        this.f47345b = i11;
        if (i11 == this.f47344a) {
            return false;
        }
        boolean z4 = this.e;
        w wVar = this.f47347f;
        if (z4) {
            v = wVar.y();
        } else {
            v = wVar.v();
        }
        this.d = v;
        if (this.f47345b == this.h) {
            w wVar2 = this.f47348g;
            this.f47346c = wVar2.x();
            wVar2.G(4);
            int i12 = this.f47349i - 1;
            this.f47349i = i12;
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
