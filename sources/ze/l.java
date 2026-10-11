package ze;

import cf.o;
import cf.p;
import cf.r;
public final class l extends ef.a {
    public final o f54520a = new p();
    public final int f54521b;
    public boolean f54522c;

    public l(int i10) {
        this.f54521b = i10;
    }

    @Override
    public final boolean b(cf.a aVar) {
        if (this.f54522c) {
            cf.a aVar2 = (cf.a) ((p) this.f54520a.f4651b);
            return true;
        }
        return true;
    }

    @Override
    public final cf.a e() {
        return this.f54520a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        boolean z10 = false;
        if (dVar.h) {
            if (((p) this.f54520a.f4652c) != null) {
                cf.a e7 = dVar.h().e();
                this.f54522c = ((e7 instanceof r) || (e7 instanceof o)) ? true : true;
                return q3.h.a(dVar.f54470e);
            }
            return null;
        }
        int i10 = dVar.f54472g;
        int i11 = this.f54521b;
        if (i10 >= i11) {
            return new q3.h(-1, dVar.f54469c + i11, false);
        }
        return null;
    }
}
