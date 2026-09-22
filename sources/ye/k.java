package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f47088a;
    public boolean f47089b;
    public int f47090c;

    public k(bf.n nVar) {
        this.f47088a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f47089b && this.f47090c == 1) {
            this.f47089b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f47088a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f47089b = true;
            this.f47090c = 0;
        } else if (this.f47089b) {
            this.f47090c++;
        }
        return q3.h.a(dVar.f47043b);
    }
}
