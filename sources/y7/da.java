package y7;

import a8.ng;
import a8.og;
import android.content.Context;
public final class da implements ba {
    public final s9.o f52180a;
    public final z9 f52181b;

    public da(Context context, z9 z9Var) {
        this.f52181b = z9Var;
        k5.a aVar = k5.a.e;
        m5.t.b(context);
        m5.r c10 = m5.t.a().c(aVar);
        if (k5.a.d.contains(new j5.c("json"))) {
            new s9.o(new og(c10, 6));
        }
        this.f52180a = new s9.o(new og(c10, 7));
    }

    @Override
    public final void a(ng ngVar) {
        j5.a aVar;
        this.f52181b.getClass();
        m5.s sVar = (m5.s) this.f52180a.get();
        if (ngVar.f639b != 0) {
            aVar = new j5.a(null, ngVar.F(), j5.d.f15512a, null);
        } else {
            aVar = new j5.a(null, ngVar.F(), j5.d.f15513b, null);
        }
        sVar.a(aVar, new m4.x0(11));
    }
}
