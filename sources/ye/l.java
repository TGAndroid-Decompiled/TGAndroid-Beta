package ye;

import bf.o;
import bf.p;
import bf.r;
public final class l extends df.a {
    public final o f50920a = new p();
    public final int f50921b;
    public boolean f50922c;

    public l(int i10) {
        this.f50921b = i10;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (this.f50922c) {
            bf.a aVar2 = (bf.a) ((p) this.f50920a.f3831b);
            return true;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50920a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        boolean z10 = false;
        if (dVar.h) {
            if (((p) this.f50920a.f3832c) != null) {
                bf.a e7 = dVar.h().e();
                this.f50922c = ((e7 instanceof r) || (e7 instanceof o)) ? true : true;
                return q3.h.a(dVar.f50870e);
            }
            return null;
        }
        int i10 = dVar.f50872g;
        int i11 = this.f50921b;
        if (i10 >= i11) {
            return new q3.h(-1, dVar.f50869c + i11, false);
        }
        return null;
    }
}
