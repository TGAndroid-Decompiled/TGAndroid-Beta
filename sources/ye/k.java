package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f50932a;
    public boolean f50933b;
    public int f50934c;

    public k(bf.n nVar) {
        this.f50932a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f50933b && this.f50934c == 1) {
            this.f50933b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50932a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f50933b = true;
            this.f50934c = 0;
        } else if (this.f50933b) {
            this.f50934c++;
        }
        return q3.h.a(dVar.f50883b);
    }
}
