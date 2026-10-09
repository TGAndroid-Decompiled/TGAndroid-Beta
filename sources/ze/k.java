package ze;

import cf.o;
public final class k extends ef.a {
    public final cf.n f54428a;
    public boolean f54429b;
    public int f54430c;

    public k(cf.n nVar) {
        this.f54428a = nVar;
    }

    @Override
    public final boolean b(cf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f54429b && this.f54430c == 1) {
            this.f54429b = false;
        }
        return true;
    }

    @Override
    public final cf.a e() {
        return this.f54428a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f54429b = true;
            this.f54430c = 0;
        } else if (this.f54429b) {
            this.f54430c++;
        }
        return q3.h.a(dVar.f54379b);
    }
}
