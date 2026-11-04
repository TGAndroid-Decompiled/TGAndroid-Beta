package vb;

import android.content.Context;
import ci.u0;
import g2.q0;
import mb.g;
import z7.fa;
public final class d extends u0 {
    public final g f56509b;

    public d(g gVar) {
        super(4);
        this.f56509b = gVar;
    }

    @Override
    public final Object Q0(Object obj) {
        a bVar;
        ub.a aVar = (ub.a) obj;
        Context b10 = this.f56509b.b();
        m6.e.f19189b.getClass();
        if (m6.e.a(b10) >= 204700000) {
            bVar = new q0(b10, aVar);
        } else {
            bVar = new b(b10, aVar);
        }
        return new e(aVar, bVar, fa.b());
    }
}
