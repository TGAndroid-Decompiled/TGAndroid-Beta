package x7;

import android.content.Context;
public final class ga implements ea {
    public final r9.n f48009a;
    public final ba f48010b;

    public ga(Context context, ba baVar) {
        this.f48010b = baVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 4));
        }
        this.f48009a = new r9.n(new v7.a9(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f48010b.getClass();
        l5.r rVar = (l5.r) this.f48009a.get();
        if (aVar.f281b != 0) {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f11323a, null);
        } else {
            aVar2 = new i5.a(null, aVar.F(), i5.d.f11324b, null);
        }
        rVar.a(aVar2, new k2.y0(2));
    }
}
