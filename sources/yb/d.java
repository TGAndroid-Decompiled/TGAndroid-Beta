package yb;

import a8.ab;
import android.content.Context;
import bi.b1;
import h2.p0;
import pb.g;
public final class d extends b1 {
    public final g f59250b;

    public d(g gVar) {
        super(4);
        this.f59250b = gVar;
    }

    @Override
    public final Object Q0(Object obj) {
        a bVar;
        xb.a aVar = (xb.a) obj;
        Context b10 = this.f59250b.b();
        n6.e.f20498b.getClass();
        if (n6.e.a(b10) >= 204700000) {
            bVar = new p0(b10, aVar);
        } else {
            bVar = new b(b10, aVar);
        }
        return new e(aVar, bVar, ab.d());
    }
}
