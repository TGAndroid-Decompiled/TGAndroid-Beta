package ye;

import bf.o;
import bf.p;
import bf.r;
public final class l extends df.a {
    public final o f46796a = new p();
    public final int f46797b;
    public boolean f46798c;

    public l(int i10) {
        this.f46797b = i10;
    }

    @Override
    public final boolean b(bf.a aVar) {
        if (this.f46798c) {
            bf.a aVar2 = (bf.a) ((p) this.f46796a.f3552b);
            return true;
        }
        return true;
    }

    @Override
    public final bf.a e() {
        return this.f46796a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        boolean z10 = false;
        if (dVar.h) {
            if (((p) this.f46796a.f3553c) != null) {
                bf.a e = dVar.h().e();
                this.f46798c = ((e instanceof r) || (e instanceof o)) ? true : true;
                return q3.h.a(dVar.e);
            }
            return null;
        }
        int i10 = dVar.f46751g;
        int i11 = this.f46797b;
        if (i10 >= i11) {
            return new q3.h(-1, dVar.f46749c + i11, false);
        }
        return null;
    }
}
