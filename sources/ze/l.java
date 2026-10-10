package ze;

import cf.o;
import cf.p;
import cf.r;
public final class l extends ef.a {
    public final o f54477a = new p();
    public final int f54478b;
    public boolean f54479c;

    public l(int i10) {
        this.f54478b = i10;
    }

    @Override
    public final boolean b(cf.a aVar) {
        if (this.f54479c) {
            cf.a aVar2 = (cf.a) ((p) this.f54477a.f4652b);
            return true;
        }
        return true;
    }

    @Override
    public final cf.a e() {
        return this.f54477a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        boolean z10 = false;
        if (dVar.h) {
            if (((p) this.f54477a.f4653c) != null) {
                cf.a e7 = dVar.h().e();
                this.f54479c = ((e7 instanceof r) || (e7 instanceof o)) ? true : true;
                return q3.h.a(dVar.f54427e);
            }
            return null;
        }
        int i10 = dVar.f54429g;
        int i11 = this.f54478b;
        if (i10 >= i11) {
            return new q3.h(-1, dVar.f54426c + i11, false);
        }
        return null;
    }
}
