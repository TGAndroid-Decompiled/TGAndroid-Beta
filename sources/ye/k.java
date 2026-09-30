package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f47046a;
    public boolean f47047b;
    public int f47048c;

    public k(bf.n nVar) {
        this.f47046a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f47047b && this.f47048c == 1) {
            this.f47047b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f47046a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f47047b = true;
            this.f47048c = 0;
        } else if (this.f47047b) {
            this.f47048c++;
        }
        return q3.h.a(dVar.f47001b);
    }
}
