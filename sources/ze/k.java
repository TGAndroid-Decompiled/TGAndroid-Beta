package ze;

import cf.o;
public final class k extends ef.a {
    public final cf.n f54430a;
    public boolean f54431b;
    public int f54432c;

    public k(cf.n nVar) {
        this.f54430a = nVar;
    }

    @Override
    public final boolean b(cf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f54431b && this.f54432c == 1) {
            this.f54431b = false;
        }
        return true;
    }

    @Override
    public final cf.a e() {
        return this.f54430a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f54431b = true;
            this.f54432c = 0;
        } else if (this.f54431b) {
            this.f54432c++;
        }
        return q3.h.a(dVar.f54381b);
    }
}
