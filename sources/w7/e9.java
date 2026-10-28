package w7;

import a8.ng;
import a8.og;
import android.content.Context;
public final class e9 implements c9 {
    public final s9.o f50906a;
    public final a9 f50907b;

    public e9(Context context, a9 a9Var) {
        this.f50907b = a9Var;
        k5.a aVar = k5.a.e;
        m5.t.b(context);
        m5.r c10 = m5.t.a().c(aVar);
        if (k5.a.d.contains(new j5.c("json"))) {
            new s9.o(new og(c10, 2));
        }
        this.f50906a = new s9.o(new og(c10, 3));
    }

    @Override
    public final void a(ng ngVar) {
        j5.a aVar;
        this.f50907b.getClass();
        m5.s sVar = (m5.s) this.f50906a.get();
        if (ngVar.f639b != 0) {
            aVar = new j5.a(null, ngVar.F(), j5.d.f15512a, null);
        } else {
            aVar = new j5.a(null, ngVar.F(), j5.d.f15513b, null);
        }
        sVar.a(aVar, new m4.x0(11));
    }
}
