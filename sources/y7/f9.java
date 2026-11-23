package y7;

import a8.xa;
import a8.ya;
import android.content.Context;
public final class f9 implements d9 {
    public final u9.m f60938a;
    public final b9 f60939b;

    public f9(Context context, b9 b9Var) {
        this.f60939b = b9Var;
        m5.a aVar = m5.a.f20920e;
        o5.t.b(context);
        o5.r c10 = o5.t.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new ya(c10, 4));
        }
        this.f60938a = new u9.m(new ya(c10, 5));
    }

    @Override
    public final void a(xa xaVar) {
        l5.a aVar;
        this.f60939b.getClass();
        o5.s sVar = (o5.s) this.f60938a.get();
        if (xaVar.f713b != 0) {
            aVar = l5.a.a(xaVar.E());
        } else {
            aVar = new l5.a(null, xaVar.E(), l5.d.f19770b, null);
        }
        sVar.a(aVar, new n2.a0(8));
    }
}
