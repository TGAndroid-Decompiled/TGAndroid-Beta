package ze;

import cf.o;
public final class k extends ef.a {
    public final cf.n f54551a;
    public boolean f54552b;
    public int f54553c;

    public k(cf.n nVar) {
        this.f54551a = nVar;
    }

    @Override
    public final boolean b(cf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f54552b && this.f54553c == 1) {
            this.f54552b = false;
        }
        return true;
    }

    @Override
    public final cf.a e() {
        return this.f54551a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f54552b = true;
            this.f54553c = 0;
        } else if (this.f54552b) {
            this.f54553c++;
        }
        return q3.h.a(dVar.f54502b);
    }
}
