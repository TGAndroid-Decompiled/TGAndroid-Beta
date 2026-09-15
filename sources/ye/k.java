package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f46765a;
    public boolean f46766b;
    public int f46767c;

    public k(bf.n nVar) {
        this.f46765a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f46766b && this.f46767c == 1) {
            this.f46766b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f46765a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f46766b = true;
            this.f46767c = 0;
        } else if (this.f46766b) {
            this.f46767c++;
        }
        return q3.h.a(dVar.f46720b);
    }
}
