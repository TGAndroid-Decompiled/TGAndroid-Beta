package ze;

import cf.o;
import cf.p;
import cf.r;
public final class l extends ef.a {
    public final o f54665a = new p();
    public final int f54666b;
    public boolean f54667c;

    public l(int i10) {
        this.f54666b = i10;
    }

    @Override
    public final boolean b(cf.a aVar) {
        if (this.f54667c) {
            cf.a aVar2 = (cf.a) ((p) this.f54665a.f4650b);
            return true;
        }
        return true;
    }

    @Override
    public final cf.a e() {
        return this.f54665a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        boolean z10 = false;
        if (dVar.h) {
            if (((p) this.f54665a.f4651c) != null) {
                cf.a e7 = dVar.h().e();
                this.f54667c = ((e7 instanceof r) || (e7 instanceof o)) ? true : true;
                return q3.h.a(dVar.f54615e);
            }
            return null;
        }
        int i10 = dVar.f54617g;
        int i11 = this.f54666b;
        if (i10 >= i11) {
            return new q3.h(-1, dVar.f54614c + i11, false);
        }
        return null;
    }
}
