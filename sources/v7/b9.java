package v7;

import android.content.Context;
public final class b9 implements x8 {
    public final r9.n f48425a;
    public final v8 f48426b;

    public b9(Context context, v8 v8Var) {
        this.f48426b = v8Var;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new a9(c10, 0));
        }
        this.f48425a = new r9.n(new a9(c10, 1));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f48426b.getClass();
        l5.s sVar = (l5.s) this.f48425a.get();
        if (aVar.f281b != 0) {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12740a, null);
        } else {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12741b, null);
        }
        sVar.a(aVar2, new k2.f(8));
    }
}
