package ye;

import bf.o;
public final class k extends df.a {
    public final bf.n f50035a;
    public boolean f50036b;
    public int f50037c;

    public k(bf.n nVar) {
        this.f50035a = nVar;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.f50036b && this.f50037c == 1) {
            this.f50036b = false;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50035a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.f50036b = true;
            this.f50037c = 0;
        } else if (this.f50036b) {
            this.f50037c++;
        }
        return q3.h.a(dVar.f49986b);
    }
}
