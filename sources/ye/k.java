package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f46761a;
    public boolean f46762b;
    public int f46763c;

    public k(bf.n nVar) {
        this.f46761a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f46762b && this.f46763c == 1) {
            this.f46762b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f46761a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f46762b = true;
            this.f46763c = 0;
        } else if (this.f46762b) {
            this.f46763c++;
        }
        return q3.h.a(dVar.f46716b);
    }
}
