package x7;

import android.content.Context;
import b8.kg;
import b8.lg;
public final class c9 implements a9 {
    public final t9.n f58259a;
    public final y8 f58260b;

    public c9(Context context, y8 y8Var) {
        this.f58260b = y8Var;
        l5.a aVar = l5.a.f18036e;
        n5.s.b(context);
        n5.q c2 = n5.s.a().c(aVar);
        if (l5.a.d.contains(new k5.c("json"))) {
            new t9.n(new lg(c2, 2));
        }
        this.f58259a = new t9.n(new lg(c2, 3));
    }

    @Override
    public final void a(kg kgVar) {
        k5.a aVar;
        this.f58260b.getClass();
        n5.r rVar = (n5.r) this.f58259a.get();
        if (kgVar.f2722b != 0) {
            aVar = k5.a.a(kgVar.F());
        } else {
            aVar = new k5.a(null, kgVar.F(), k5.d.f16878b, null);
        }
        rVar.a(aVar, new l2.d(27));
    }
}
