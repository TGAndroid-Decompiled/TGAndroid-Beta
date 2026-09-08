package v7;

import android.content.Context;
public final class b9 implements x8 {
    public final q9.n f47425a;
    public final v8 f47426b;

    public b9(Context context, v8 v8Var) {
        this.f47426b = v8Var;
        j5.a aVar = j5.a.f13534e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new a9(c10, 0));
        }
        this.f47425a = new q9.n(new a9(c10, 1));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f47426b.getClass();
        l5.r rVar = (l5.r) this.f47425a.get();
        if (aVar.f297b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11885a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11886b, null);
        }
        rVar.a(aVar2, new j2.e(17));
    }
}
