package z7;

import android.content.Context;
public final class yf implements uf {
    public final q9.n f54256a;
    public final tf f54257b;

    public yf(Context context, tf tfVar) {
        this.f54257b = tfVar;
        j5.a aVar = j5.a.f14021e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 6));
        }
        this.f54256a = new q9.n(new v7.a9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f54257b.getClass();
        l5.r rVar = (l5.r) this.f54256a.get();
        if (aVar.f299b != 0) {
            aVar2 = new i5.a(null, aVar.D(), i5.d.f12013a, null);
        } else {
            aVar2 = new i5.a(null, aVar.D(), i5.d.f12014b, null);
        }
        rVar.a(aVar2, new j2.e(16));
    }
}
