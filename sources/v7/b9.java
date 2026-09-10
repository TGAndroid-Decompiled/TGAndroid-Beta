package v7;

import android.content.Context;
public final class b9 implements x8 {
    public final q9.n f42952a;
    public final v8 f42953b;

    public b9(Context context, v8 v8Var) {
        this.f42953b = v8Var;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new a9(c10, 0));
        }
        this.f42952a = new q9.n(new a9(c10, 1));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f42953b.getClass();
        l5.r rVar = (l5.r) this.f42952a.get();
        if (aVar.f275b != 0) {
            aVar2 = new i5.a(null, aVar.A(), i5.d.f10477a, null);
        } else {
            aVar2 = new i5.a(null, aVar.A(), i5.d.f10478b, null);
        }
        rVar.a(aVar2, new j2.h(10));
    }
}
