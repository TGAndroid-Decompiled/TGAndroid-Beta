package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f47044a;
    public boolean f47045b;
    public int f47046c;

    public k(bf.n nVar) {
        this.f47044a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f47045b && this.f47046c == 1) {
            this.f47045b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f47044a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f47045b = true;
            this.f47046c = 0;
        } else if (this.f47045b) {
            this.f47046c++;
        }
        return q3.h.a(dVar.f46999b);
    }
}
