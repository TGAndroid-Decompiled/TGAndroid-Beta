package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f47033a;
    public boolean f47034b;
    public int f47035c;

    public k(bf.n nVar) {
        this.f47033a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f47034b && this.f47035c == 1) {
            this.f47034b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f47033a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f47034b = true;
            this.f47035c = 0;
        } else if (this.f47034b) {
            this.f47035c++;
        }
        return q3.h.a(dVar.f46988b);
    }
}
