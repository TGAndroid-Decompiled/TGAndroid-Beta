package z3;

import h5.w;
import k7.t6;
public final class c {
    public final int f47280a;
    public int f47281b;
    public int f47282c;
    public long d;
    public final boolean e;
    public final w f47283f;
    public final w f47284g;
    public int h;
    public int f47285i;

    public c(w wVar, w wVar2, boolean z4) {
        this.f47284g = wVar;
        this.f47283f = wVar2;
        this.e = z4;
        wVar2.F(12);
        this.f47280a = wVar2.x();
        wVar.F(12);
        this.f47285i = wVar.x();
        t6.a("first_chunk must be 1", wVar.g() == 1);
        this.f47281b = -1;
    }

    public final boolean a() {
        long v;
        int i10;
        int i11 = this.f47281b + 1;
        this.f47281b = i11;
        if (i11 == this.f47280a) {
            return false;
        }
        boolean z4 = this.e;
        w wVar = this.f47283f;
        if (z4) {
            v = wVar.y();
        } else {
            v = wVar.v();
        }
        this.d = v;
        if (this.f47281b == this.h) {
            w wVar2 = this.f47284g;
            this.f47282c = wVar2.x();
            wVar2.G(4);
            int i12 = this.f47285i - 1;
            this.f47285i = i12;
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
