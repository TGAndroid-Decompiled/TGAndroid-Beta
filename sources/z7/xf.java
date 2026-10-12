package z7;

import android.content.Context;
public final class xf implements tf {
    public final r9.n f49866a;
    public final sf f49867b;

    public xf(Context context, sf sfVar) {
        this.f49867b = sfVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 6));
        }
        this.f49866a = new r9.n(new v7.a9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f49867b.getClass();
        l5.r rVar = (l5.r) this.f49866a.get();
        if (aVar.f279b != 0) {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f11319a, null);
        } else {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f11320b, null);
        }
        rVar.a(aVar2, new k2.y0(2));
    }
}
