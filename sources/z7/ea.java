package z7;

import android.content.Context;
import b8.kg;
import b8.lg;
public final class ea implements ca {
    public final t9.n f59857a;
    public final aa f59858b;

    public ea(Context context, aa aaVar) {
        this.f59858b = aaVar;
        l5.a aVar = l5.a.f18036e;
        n5.s.b(context);
        n5.q c2 = n5.s.a().c(aVar);
        if (l5.a.d.contains(new k5.c("json"))) {
            new t9.n(new lg(c2, 6));
        }
        this.f59857a = new t9.n(new lg(c2, 7));
    }

    @Override
    public final void a(kg kgVar) {
        k5.a aVar;
        this.f59858b.getClass();
        n5.r rVar = (n5.r) this.f59857a.get();
        if (kgVar.f2722b != 0) {
            aVar = k5.a.a(kgVar.F());
        } else {
            aVar = new k5.a(null, kgVar.F(), k5.d.f16878b, null);
        }
        rVar.a(aVar, new l2.d(27));
    }
}
