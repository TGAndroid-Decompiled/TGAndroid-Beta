package v7;

import android.content.Context;
public final class b9 implements x8 {
    public final q9.n f47397a;
    public final v8 f47398b;

    public b9(Context context, v8 v8Var) {
        this.f47398b = v8Var;
        j5.a aVar = j5.a.f13508e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new a9(c10, 0));
        }
        this.f47397a = new q9.n(new a9(c10, 1));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f47398b.getClass();
        l5.r rVar = (l5.r) this.f47397a.get();
        if (aVar.f285b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11859a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11860b, null);
        }
        rVar.a(aVar2, new j2.e(17));
    }
}
