package yd;

import td.e0;
import v7.w6;
public class s extends td.a implements ed.d {
    public final cd.c d;

    public s(cd.c cVar, cd.h hVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public void b(Object obj) {
        a.g(e0.r(obj), w6.b(this.d));
    }

    @Override
    public void g(Object obj) {
        this.d.resumeWith(e0.r(obj));
    }

    @Override
    public final ed.d getCallerFrame() {
        cd.c cVar = this.d;
        if (cVar instanceof ed.d) {
            return (ed.d) cVar;
        }
        return null;
    }

    @Override
    public final boolean z() {
        return true;
    }
}
