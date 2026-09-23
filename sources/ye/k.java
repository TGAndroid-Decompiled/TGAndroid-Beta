package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f46719a;
    public boolean f46720b;
    public int f46721c;

    public k(bf.n nVar) {
        this.f46719a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f46720b && this.f46721c == 1) {
            this.f46720b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f46719a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f46720b = true;
            this.f46721c = 0;
        } else if (this.f46720b) {
            this.f46721c++;
        }
        return q3.h.a(dVar.f46674b);
    }
}
