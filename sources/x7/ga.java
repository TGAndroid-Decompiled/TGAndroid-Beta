package x7;

import android.content.Context;
public final class ga implements ea {
    public final r9.n f48010a;
    public final ba f48011b;

    public ga(Context context, ba baVar) {
        this.f48011b = baVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 4));
        }
        this.f48010a = new r9.n(new v7.a9(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f48011b.getClass();
        l5.r rVar = (l5.r) this.f48010a.get();
        if (aVar.f279b != 0) {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f11319a, null);
        } else {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f11320b, null);
        }
        rVar.a(aVar2, new k2.y0(2));
    }
}
