package y7;

import a8.xa;
import a8.ya;
import android.content.Context;
public final class e9 implements c9 {
    public final u9.m f60239a;
    public final a9 f60240b;

    public e9(Context context, a9 a9Var) {
        this.f60240b = a9Var;
        m5.a aVar = m5.a.f20466e;
        o5.t.b(context);
        o5.r c10 = o5.t.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new ya(c10, 4));
        }
        this.f60239a = new u9.m(new ya(c10, 5));
    }

    @Override
    public final void a(xa xaVar) {
        l5.a aVar;
        this.f60240b.getClass();
        o5.s sVar = (o5.s) this.f60239a.get();
        if (xaVar.f713b != 0) {
            aVar = l5.a.a(xaVar.D());
        } else {
            aVar = new l5.a(null, xaVar.D(), l5.d.f19309b, null);
        }
        sVar.a(aVar, new n2.a0(7));
    }
}
