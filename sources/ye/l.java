package ye;

import bf.o;
import bf.p;
import bf.r;
public final class l extends df.a {
    public final o f50935a = new p();
    public final int f50936b;
    public boolean f50937c;

    public l(int i10) {
        this.f50936b = i10;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (this.f50937c) {
            bf.a aVar2 = (bf.a) ((p) this.f50935a.f3831b);
            return true;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50935a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        boolean z10 = false;
        if (dVar.h) {
            if (((p) this.f50935a.f3832c) != null) {
                bf.a e7 = dVar.h().e();
                this.f50937c = ((e7 instanceof r) || (e7 instanceof o)) ? true : true;
                return q3.h.a(dVar.f50885e);
            }
            return null;
        }
        int i10 = dVar.f50887g;
        int i11 = this.f50936b;
        if (i10 >= i11) {
            return new q3.h(-1, dVar.f50884c + i11, false);
        }
        return null;
    }
}
