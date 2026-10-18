package v7;

import android.content.Context;
public final class b9 implements x8 {
    public final r9.n f48023a;
    public final v8 f48024b;

    public b9(Context context, v8 v8Var) {
        this.f48024b = v8Var;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new a9(c10, 0));
        }
        this.f48023a = new r9.n(new a9(c10, 1));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f48024b.getClass();
        l5.s sVar = (l5.s) this.f48023a.get();
        if (aVar.f280b != 0) {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12710a, null);
        } else {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12711b, null);
        }
        sVar.a(aVar2, new k2.f0(4));
    }
}
