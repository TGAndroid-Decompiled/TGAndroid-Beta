package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f47067a;
    public boolean f47068b;
    public int f47069c;

    public k(bf.n nVar) {
        this.f47067a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f47068b && this.f47069c == 1) {
            this.f47068b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f47067a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f47068b = true;
            this.f47069c = 0;
        } else if (this.f47068b) {
            this.f47069c++;
        }
        return q3.h.a(dVar.f47022b);
    }
}
