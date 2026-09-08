package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f50064a;
    public boolean f50065b;
    public int f50066c;

    public k(bf.n nVar) {
        this.f50064a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f50065b && this.f50066c == 1) {
            this.f50065b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50064a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f50065b = true;
            this.f50066c = 0;
        } else if (this.f50065b) {
            this.f50066c++;
        }
        return q3.h.a(dVar.f50015b);
    }
}
