package z7;

import android.content.Context;
public final class zf implements vf {
    public final r9.n f51313a;
    public final uf f51314b;

    public zf(Context context, uf ufVar) {
        this.f51314b = ufVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 6));
        }
        this.f51313a = new r9.n(new v7.a9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f51314b.getClass();
        l5.s sVar = (l5.s) this.f51313a.get();
        if (aVar.f280b != 0) {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12712a, null);
        } else {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f12713b, null);
        }
        sVar.a(aVar2, new k2.f0(4));
    }
}
