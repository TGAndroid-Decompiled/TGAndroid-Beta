package y7;

import a8.xa;
import a8.ya;
import android.content.Context;
public final class e9 implements c9 {
    public final u9.m f60846a;
    public final a9 f60847b;

    public e9(Context context, a9 a9Var) {
        this.f60847b = a9Var;
        m5.a aVar = m5.a.f20855e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new ya(c10, 4));
        }
        this.f60846a = new u9.m(new ya(c10, 5));
    }

    @Override
    public final void a(xa xaVar) {
        l5.a aVar;
        this.f60847b.getClass();
        o5.r rVar = (o5.r) this.f60846a.get();
        if (xaVar.f713b != 0) {
            aVar = l5.a.a(xaVar.F());
        } else {
            aVar = new l5.a(null, xaVar.F(), l5.d.f19701b, null);
        }
        rVar.a(aVar, new n2.a0(8));
    }
}
