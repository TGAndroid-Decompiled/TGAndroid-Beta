package v7;

import android.content.Context;
public final class b9 implements y8 {
    public final q9.n f49224a;
    public final w8 f49225b;

    public b9(Context context, w8 w8Var) {
        this.f49225b = w8Var;
        j5.a aVar = j5.a.f14021e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new a9(c10, 0));
        }
        this.f49224a = new q9.n(new a9(c10, 1));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f49225b.getClass();
        l5.r rVar = (l5.r) this.f49224a.get();
        if (aVar.f299b != 0) {
            aVar2 = new i5.a(null, aVar.D(), i5.d.f12013a, null);
        } else {
            aVar2 = new i5.a(null, aVar.D(), i5.d.f12014b, null);
        }
        rVar.a(aVar2, new j2.e(16));
    }
}
