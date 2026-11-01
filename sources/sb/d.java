package sb;

import android.content.Context;
import b2.h;
import e2.o0;
import jb.g;
import x7.ia;
public final class d extends h {
    public final g f48147b;

    public d(g gVar) {
        super(3);
        this.f48147b = gVar;
    }

    @Override
    public final Object Q0(Object obj) {
        a bVar;
        rb.a aVar = (rb.a) obj;
        Context b10 = this.f48147b.b();
        k6.e.f10937b.getClass();
        if (k6.e.a(b10) >= 204700000) {
            bVar = new o0(b10, aVar);
        } else {
            bVar = new b(b10, aVar);
        }
        return new e(aVar, bVar, ia.b());
    }
}
