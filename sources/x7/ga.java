package x7;

import android.content.Context;
public final class ga implements ea {
    public final q9.n f49494a;
    public final ba f49495b;

    public ga(Context context, ba baVar) {
        this.f49495b = baVar;
        j5.a aVar = j5.a.f13984e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 4));
        }
        this.f49494a = new q9.n(new v7.a9(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f49495b.getClass();
        l5.s sVar = (l5.s) this.f49494a.get();
        if (aVar.f299b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11963a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11964b, null);
        }
        sVar.a(aVar2, new j2.e(20));
    }
}
