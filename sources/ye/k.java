package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f47020a;
    public boolean f47021b;
    public int f47022c;

    public k(bf.n nVar) {
        this.f47020a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f47021b && this.f47022c == 1) {
            this.f47021b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f47020a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f47021b = true;
            this.f47022c = 0;
        } else if (this.f47021b) {
            this.f47022c++;
        }
        return q3.h.a(dVar.f46975b);
    }
}
