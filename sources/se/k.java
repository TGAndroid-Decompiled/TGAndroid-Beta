package se;

import ve.o;
public final class k extends xe.a {
    public final ve.n f48243a;
    public boolean f48244b;
    public int f48245c;

    public k(ve.n nVar) {
        this.f48243a = nVar;
    }

    @Override
    public final boolean b(ve.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f48244b && this.f48245c == 1) {
            this.f48244b = false;
        }
        return true;
    }

    @Override
    public final ve.a e() {
        return this.f48243a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f48244b = true;
            this.f48245c = 0;
        } else if (this.f48244b) {
            this.f48245c++;
        }
        return q3.h.a(dVar.f48198b);
    }
}
