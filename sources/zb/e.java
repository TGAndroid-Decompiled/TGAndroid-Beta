package zb;

import android.content.Context;
import x7.ha;
public final class e extends b2.g {
    public final qb.g f51536b;

    public e(qb.g gVar) {
        super(4);
        this.f51536b = gVar;
    }

    @Override
    public final Object N0(Object obj) {
        b cVar;
        yb.a aVar = (yb.a) obj;
        Context b10 = this.f51536b.b();
        k6.e.f14842b.getClass();
        if (k6.e.a(b10) >= 204700000) {
            cVar = new a(b10, aVar);
        } else {
            cVar = new c(b10, aVar);
        }
        return new f(aVar, cVar, ha.b());
    }
}
