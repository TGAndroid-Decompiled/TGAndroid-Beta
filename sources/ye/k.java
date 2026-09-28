package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f47045a;
    public boolean f47046b;
    public int f47047c;

    public k(bf.n nVar) {
        this.f47045a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f47046b && this.f47047c == 1) {
            this.f47046b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f47045a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f47046b = true;
            this.f47047c = 0;
        } else if (this.f47046b) {
            this.f47047c++;
        }
        return q3.h.a(dVar.f47000b);
    }
}
