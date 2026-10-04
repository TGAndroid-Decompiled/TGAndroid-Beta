package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f50916a;
    public boolean f50917b;
    public int f50918c;

    public k(bf.n nVar) {
        this.f50916a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f50917b && this.f50918c == 1) {
            this.f50917b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50916a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f50917b = true;
            this.f50918c = 0;
        } else if (this.f50917b) {
            this.f50918c++;
        }
        return q3.h.a(dVar.f50867b);
    }
}
