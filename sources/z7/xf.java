package z7;

import android.content.Context;
public final class xf implements tf {
    public final q9.n f47812a;
    public final sf f47813b;

    public xf(Context context, sf sfVar) {
        this.f47813b = sfVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 6));
        }
        this.f47812a = new q9.n(new v7.a9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f47813b.getClass();
        l5.r rVar = (l5.r) this.f47812a.get();
        if (aVar.f275b != 0) {
            aVar2 = new i5.a(null, aVar.A(), i5.d.f10477a, null);
        } else {
            aVar2 = new i5.a(null, aVar.A(), i5.d.f10478b, null);
        }
        rVar.a(aVar2, new j2.h(10));
    }
}
