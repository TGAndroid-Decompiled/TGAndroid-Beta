package v7;

import android.content.Context;
public final class b9 implements x8 {
    public final q9.n f47883a;
    public final v8 f47884b;

    public b9(Context context, v8 v8Var) {
        this.f47884b = v8Var;
        j5.a aVar = j5.a.f13985e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new a9(c10, 0));
        }
        this.f47883a = new q9.n(new a9(c10, 1));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f47884b.getClass();
        l5.s sVar = (l5.s) this.f47883a.get();
        if (aVar.f299b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11964a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11965b, null);
        }
        sVar.a(aVar2, new j2.e(20));
    }
}
