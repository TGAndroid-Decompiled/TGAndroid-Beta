package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f50925a;
    public boolean f50926b;
    public int f50927c;

    public k(bf.n nVar) {
        this.f50925a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f50926b && this.f50927c == 1) {
            this.f50926b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50925a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f50926b = true;
            this.f50927c = 0;
        } else if (this.f50926b) {
            this.f50927c++;
        }
        return q3.h.a(dVar.f50876b);
    }
}
