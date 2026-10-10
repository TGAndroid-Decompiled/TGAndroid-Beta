package ze;

import cf.o;
public final class k extends ef.a {
    public final cf.n f54474a;
    public boolean f54475b;
    public int f54476c;

    public k(cf.n nVar) {
        this.f54474a = nVar;
    }

    @Override
    public final boolean b(cf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f54475b && this.f54476c == 1) {
            this.f54475b = false;
        }
        return true;
    }

    @Override
    public final cf.a e() {
        return this.f54474a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f54475b = true;
            this.f54476c = 0;
        } else if (this.f54475b) {
            this.f54476c++;
        }
        return q3.h.a(dVar.f54425b);
    }
}
