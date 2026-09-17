package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f50036a;
    public boolean f50037b;
    public int f50038c;

    public k(bf.n nVar) {
        this.f50036a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f50037b && this.f50038c == 1) {
            this.f50037b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50036a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f50037b = true;
            this.f50038c = 0;
        } else if (this.f50037b) {
            this.f50038c++;
        }
        return q3.h.a(dVar.f49987b);
    }
}
