package x7;

import android.content.Context;
public final class ga implements ea {
    public final r9.n f49443a;
    public final ba f49444b;

    public ga(Context context, ba baVar) {
        this.f49444b = baVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 4));
        }
        this.f49443a = new r9.n(new v7.a9(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f49444b.getClass();
        l5.s sVar = (l5.s) this.f49443a.get();
        if (aVar.f280b != 0) {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12710a, null);
        } else {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12711b, null);
        }
        sVar.a(aVar2, new k2.f0(4));
    }
}
