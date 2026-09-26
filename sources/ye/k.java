package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f47043a;
    public boolean f47044b;
    public int f47045c;

    public k(bf.n nVar) {
        this.f47043a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f47044b && this.f47045c == 1) {
            this.f47044b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f47043a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f47044b = true;
            this.f47045c = 0;
        } else if (this.f47044b) {
            this.f47045c++;
        }
        return q3.h.a(dVar.f46998b);
    }
}
