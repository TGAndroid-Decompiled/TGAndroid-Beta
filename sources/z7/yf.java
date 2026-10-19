package z7;

import android.content.Context;
public final class yf implements uf {
    public final r9.n f51282a;
    public final tf f51283b;

    public yf(Context context, tf tfVar) {
        this.f51283b = tfVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 6));
        }
        this.f51282a = new r9.n(new v7.a9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f51283b.getClass();
        l5.s sVar = (l5.s) this.f51282a.get();
        if (aVar.f281b != 0) {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12708a, null);
        } else {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12709b, null);
        }
        sVar.a(aVar2, new k2.f0(4));
    }
}
