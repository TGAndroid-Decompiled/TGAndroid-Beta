package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f46915a;
    public boolean f46916b;
    public int f46917c;

    public k(bf.n nVar) {
        this.f46915a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f46916b && this.f46917c == 1) {
            this.f46916b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f46915a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f46916b = true;
            this.f46917c = 0;
        } else if (this.f46916b) {
            this.f46917c++;
        }
        return q3.h.a(dVar.f46870b);
    }
}
