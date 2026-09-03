package qd;

import k7.g8;
import ld.e0;
public class s extends ld.a implements wc.d {
    public final uc.c d;

    public s(uc.c cVar, uc.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public void f(Object obj) {
        a.g(e0.r(obj), g8.b(this.d));
    }

    @Override
    public void g(Object obj) {
        this.d.resumeWith(e0.r(obj));
    }

    @Override
    public final wc.d getCallerFrame() {
        uc.c cVar = this.d;
        if (cVar instanceof wc.d) {
            return (wc.d) cVar;
        }
        return null;
    }

    @Override
    public final boolean z() {
        return true;
    }
}
