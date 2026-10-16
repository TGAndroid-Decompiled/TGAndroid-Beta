package z7;

import android.content.Context;
public final class yf implements tf {
    public final r9.n f49897a;
    public final sf f49898b;

    public yf(Context context, sf sfVar) {
        this.f49898b = sfVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 6));
        }
        this.f49897a = new r9.n(new v7.a9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f49898b.getClass();
        l5.r rVar = (l5.r) this.f49897a.get();
        if (aVar.f281b != 0) {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f11323a, null);
        } else {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f11324b, null);
        }
        rVar.a(aVar2, new k2.y0(2));
    }
}
