package x7;

import android.content.Context;
public final class ga implements ea {
    public final q9.n f44780a;
    public final ba f44781b;

    public ga(Context context, ba baVar) {
        this.f44781b = baVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 4));
        }
        this.f44780a = new q9.n(new v7.a9(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f44781b.getClass();
        l5.r rVar = (l5.r) this.f44780a.get();
        if (aVar.f275b != 0) {
            aVar2 = new i5.a(null, aVar.A(), i5.d.f10477a, null);
        } else {
            aVar2 = new i5.a(null, aVar.A(), i5.d.f10478b, null);
        }
        rVar.a(aVar2, new j2.h(10));
    }
}
