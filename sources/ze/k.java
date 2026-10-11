package ze;

import cf.o;
public final class k extends ef.a {
    public final cf.n f54517a;
    public boolean f54518b;
    public int f54519c;

    public k(cf.n nVar) {
        this.f54517a = nVar;
    }

    @Override
    public final boolean b(cf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f54518b && this.f54519c == 1) {
            this.f54518b = false;
        }
        return true;
    }

    @Override
    public final cf.a e() {
        return this.f54517a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f54518b = true;
            this.f54519c = 0;
        } else if (this.f54518b) {
            this.f54519c++;
        }
        return q3.h.a(dVar.f54468b);
    }
}
