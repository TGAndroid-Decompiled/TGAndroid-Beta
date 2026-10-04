package ye;

import bf.o;
import bf.p;
import bf.r;
public final class l extends df.a {
    public final o f50928a = new p();
    public final int f50929b;
    public boolean f50930c;

    public l(int i10) {
        this.f50929b = i10;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (this.f50930c) {
            bf.a aVar2 = (bf.a) ((p) this.f50928a.f3831b);
            return true;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50928a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        boolean z10 = false;
        if (dVar.h) {
            if (((p) this.f50928a.f3832c) != null) {
                bf.a e7 = dVar.h().e();
                this.f50930c = ((e7 instanceof r) || (e7 instanceof o)) ? true : true;
                return q3.h.a(dVar.f50878e);
            }
            return null;
        }
        int i10 = dVar.f50880g;
        int i11 = this.f50929b;
        if (i10 >= i11) {
            return new q3.h(-1, dVar.f50877c + i11, false);
        }
        return null;
    }
}
