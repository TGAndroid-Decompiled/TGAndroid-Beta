package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f46793a;
    public boolean f46794b;
    public int f46795c;

    public k(bf.n nVar) {
        this.f46793a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f46794b && this.f46795c == 1) {
            this.f46794b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f46793a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f46794b = true;
            this.f46795c = 0;
        } else if (this.f46794b) {
            this.f46795c++;
        }
        return q3.h.a(dVar.f46748b);
    }
}
