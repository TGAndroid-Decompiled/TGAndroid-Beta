package x7;

import android.content.Context;
public final class ga implements ea {
    public final r9.n f49418a;
    public final ba f49419b;

    public ga(Context context, ba baVar) {
        this.f49419b = baVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 4));
        }
        this.f49418a = new r9.n(new v7.a9(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f49419b.getClass();
        l5.s sVar = (l5.s) this.f49418a.get();
        if (aVar.f280b != 0) {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12712a, null);
        } else {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12713b, null);
        }
        sVar.a(aVar2, new k2.f0(4));
    }
}
