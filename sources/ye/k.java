package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f47089a;
    public boolean f47090b;
    public int f47091c;

    public k(bf.n nVar) {
        this.f47089a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f47090b && this.f47091c == 1) {
            this.f47090b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f47089a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f47090b = true;
            this.f47091c = 0;
        } else if (this.f47090b) {
            this.f47091c++;
        }
        return q3.h.a(dVar.f47044b);
    }
}
