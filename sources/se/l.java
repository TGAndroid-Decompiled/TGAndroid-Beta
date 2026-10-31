package se;

import ve.o;
import ve.q;
public final class l extends xe.a {
    public final o f48246a = new df.c();
    public final int f48247b;
    public boolean f48248c;

    public l(int i10) {
        this.f48247b = i10;
    }

    @Override
    public final boolean b(ve.a aVar) {
        if (this.f48248c) {
            ve.a aVar2 = (ve.a) ((df.c) this.f48246a.f5877b);
            return true;
        }
        return true;
    }

    @Override
    public final ve.a e() {
        return this.f48246a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        boolean z10 = false;
        if (dVar.h) {
            if (((df.c) this.f48246a.f5878c) != null) {
                ve.a e = dVar.h().e();
                this.f48248c = ((e instanceof q) || (e instanceof o)) ? true : true;
                return q3.h.a(dVar.e);
            }
            return null;
        }
        int i10 = dVar.f48201g;
        int i11 = this.f48247b;
        if (i10 >= i11) {
            return new q3.h(-1, dVar.f48199c + i11, false);
        }
        return null;
    }
}
