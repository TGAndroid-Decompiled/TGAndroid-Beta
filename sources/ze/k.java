package ze;

import cf.o;
public final class k extends ef.a {
    public final cf.n f54662a;
    public boolean f54663b;
    public int f54664c;

    public k(cf.n nVar) {
        this.f54662a = nVar;
    }

    @Override
    public final boolean b(cf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f54663b && this.f54664c == 1) {
            this.f54663b = false;
        }
        return true;
    }

    @Override
    public final cf.a e() {
        return this.f54662a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f54663b = true;
            this.f54664c = 0;
        } else if (this.f54663b) {
            this.f54664c++;
        }
        return q3.h.a(dVar.f54613b);
    }
}
