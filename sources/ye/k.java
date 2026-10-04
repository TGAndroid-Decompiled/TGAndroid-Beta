package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f50917a;
    public boolean f50918b;
    public int f50919c;

    public k(bf.n nVar) {
        this.f50917a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f50918b && this.f50919c == 1) {
            this.f50918b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50917a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f50918b = true;
            this.f50919c = 0;
        } else if (this.f50918b) {
            this.f50919c++;
        }
        return q3.h.a(dVar.f50868b);
    }
}
