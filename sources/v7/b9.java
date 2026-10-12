package v7;

import android.content.Context;
public final class b9 implements x8 {
    public final r9.n f46590a;
    public final v8 f46591b;

    public b9(Context context, v8 v8Var) {
        this.f46591b = v8Var;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new a9(c10, 0));
        }
        this.f46590a = new r9.n(new a9(c10, 1));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f46591b.getClass();
        l5.r rVar = (l5.r) this.f46590a.get();
        if (aVar.f279b != 0) {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f11319a, null);
        } else {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f11320b, null);
        }
        rVar.a(aVar2, new k2.y0(2));
    }
}
