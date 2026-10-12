package z7;

import android.content.Context;
public final class yf implements uf {
    public final q9.n f54393a;
    public final tf f54394b;

    public yf(Context context, tf tfVar) {
        this.f54394b = tfVar;
        j5.a aVar = j5.a.f14019e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 6));
        }
        this.f54393a = new q9.n(new v7.a9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f54394b.getClass();
        l5.s sVar = (l5.s) this.f54393a.get();
        if (aVar.f299b != 0) {
            aVar2 = new i5.a(null, aVar.D(), i5.d.f12012a, null);
        } else {
            aVar2 = new i5.a(null, aVar.D(), i5.d.f12013b, null);
        }
        sVar.a(aVar2, new j2.e(16));
    }
}
