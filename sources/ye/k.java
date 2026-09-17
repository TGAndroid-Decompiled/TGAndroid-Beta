package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f46788a;
    public boolean f46789b;
    public int f46790c;

    public k(bf.n nVar) {
        this.f46788a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f46789b && this.f46790c == 1) {
            this.f46789b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f46788a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f46789b = true;
            this.f46790c = 0;
        } else if (this.f46789b) {
            this.f46790c++;
        }
        return q3.h.a(dVar.f46743b);
    }
}
