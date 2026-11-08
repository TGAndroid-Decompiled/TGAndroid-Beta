package y7;

import a8.wa;
import a8.xa;
import android.content.Context;
public final class f9 implements d9 {
    public final u9.n f59026a;
    public final b9 f59027b;

    public f9(Context context, b9 b9Var) {
        this.f59027b = b9Var;
        m5.a aVar = m5.a.f19872e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.n(new xa(c10, 4));
        }
        this.f59026a = new u9.n(new xa(c10, 5));
    }

    @Override
    public final void a(wa waVar) {
        l5.a aVar;
        this.f59027b.getClass();
        o5.r rVar = (o5.r) this.f59026a.get();
        if (waVar.f700b != 0) {
            aVar = l5.a.a(waVar.E());
        } else {
            aVar = new l5.a(null, waVar.E(), l5.d.f18176b, null);
        }
        rVar.a(aVar, new ni.a(3));
    }
}
