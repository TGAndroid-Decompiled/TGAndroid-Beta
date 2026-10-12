package x7;

import android.content.Context;
public final class ha implements ea {
    public final q9.n f51032a;
    public final ba f51033b;

    public ha(Context context, ba baVar) {
        this.f51033b = baVar;
        j5.a aVar = j5.a.f14019e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 4));
        }
        this.f51032a = new q9.n(new v7.a9(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f51033b.getClass();
        l5.s sVar = (l5.s) this.f51032a.get();
        if (aVar.f299b != 0) {
            aVar2 = new i5.a(null, aVar.D(), i5.d.f12012a, null);
        } else {
            aVar2 = new i5.a(null, aVar.D(), i5.d.f12013b, null);
        }
        sVar.a(aVar2, new j2.e(16));
    }
}
