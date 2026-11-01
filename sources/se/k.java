package se;

import ve.o;
public final class k extends xe.a {
    public final ve.n f48254a;
    public boolean f48255b;
    public int f48256c;

    public k(ve.n nVar) {
        this.f48254a = nVar;
    }

    @Override
    public final boolean b(ve.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f48255b && this.f48256c == 1) {
            this.f48255b = false;
        }
        return true;
    }

    @Override
    public final ve.a e() {
        return this.f48254a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f48255b = true;
            this.f48256c = 0;
        } else if (this.f48255b) {
            this.f48256c++;
        }
        return q3.h.a(dVar.f48209b);
    }
}
