package se;

import ve.o;
import ve.q;
public final class l extends xe.a {
    public final o f48257a = new df.c();
    public final int f48258b;
    public boolean f48259c;

    public l(int i10) {
        this.f48258b = i10;
    }

    @Override
    public final boolean b(ve.a aVar) {
        if (this.f48259c) {
            ve.a aVar2 = (ve.a) ((df.c) this.f48257a.f5877b);
            return true;
        }
        return true;
    }

    @Override
    public final ve.a e() {
        return this.f48257a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final q3.h h(d dVar) {
        boolean z10 = false;
        if (dVar.h) {
            if (((df.c) this.f48257a.f5878c) != null) {
                ve.a e = dVar.h().e();
                this.f48259c = ((e instanceof q) || (e instanceof o)) ? true : true;
                return q3.h.a(dVar.e);
            }
            return null;
        }
        int i10 = dVar.f48212g;
        int i11 = this.f48258b;
        if (i10 >= i11) {
            return new q3.h(-1, dVar.f48210c + i11, false);
        }
        return null;
    }
}
