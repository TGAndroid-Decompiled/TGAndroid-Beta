package z7;

import android.content.Context;
public final class yf implements uf {
    public final r9.n f55217a;
    public final tf f55218b;

    public yf(Context context, tf tfVar) {
        this.f55218b = tfVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.z8(c10, 6));
        }
        this.f55217a = new r9.n(new v7.z8(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f55218b.getClass();
        l5.r rVar = (l5.r) this.f55217a.get();
        if (aVar.f281b != 0) {
            aVar2 = new i5.a(null, aVar.E(), i5.d.f8207a, null);
        } else {
            aVar2 = new i5.a(null, aVar.E(), i5.d.f8208b, null);
        }
        rVar.a(aVar2, new k2.k0(5));
    }
}
