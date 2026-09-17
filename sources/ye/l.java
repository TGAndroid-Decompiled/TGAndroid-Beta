package ye;

import bf.o;
import bf.p;
import bf.r;
public final class l extends df.a {
    public final o f50068a = new p();
    public final int f50069b;
    public boolean f50070c;

    public l(int i10) {
        this.f50069b = i10;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (this.f50070c) {
            bf.a aVar2 = (bf.a) ((p) this.f50068a.f2665b);
            return true;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f50068a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        boolean z10 = false;
        if (dVar.h) {
            if (((p) this.f50068a.f2666c) != null) {
                bf.a e7 = dVar.h().e();
                this.f50070c = ((e7 instanceof r) || (e7 instanceof o)) ? true : true;
                return q3.h.a(dVar.f50018e);
            }
            return null;
        }
        int i10 = dVar.f50020g;
        int i11 = this.f50069b;
        if (i10 >= i11) {
            return new q3.h(-1, dVar.f50017c + i11, false);
        }
        return null;
    }
}
