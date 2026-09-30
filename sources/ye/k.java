package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f47152a;
    public boolean f47153b;
    public int f47154c;

    public k(bf.n nVar) {
        this.f47152a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f47153b && this.f47154c == 1) {
            this.f47153b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f47152a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f47153b = true;
            this.f47154c = 0;
        } else if (this.f47153b) {
            this.f47154c++;
        }
        return q3.h.a(dVar.f47107b);
    }
}
