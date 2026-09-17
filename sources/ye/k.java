package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f50065a;
    public boolean f50066b;
    public int f50067c;

    public k(bf.n nVar) {
        this.f50065a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f50066b && this.f50067c == 1) {
            this.f50066b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50065a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f50066b = true;
            this.f50067c = 0;
        } else if (this.f50066b) {
            this.f50067c++;
        }
        return q3.h.a(dVar.f50016b);
    }
}
