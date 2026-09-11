package x7;

import android.content.Context;
public final class ga implements ea {
    public final q9.n f49012a;
    public final ba f49013b;

    public ga(Context context, ba baVar) {
        this.f49013b = baVar;
        j5.a aVar = j5.a.f13508e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 4));
        }
        this.f49012a = new q9.n(new v7.a9(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f49013b.getClass();
        l5.r rVar = (l5.r) this.f49012a.get();
        if (aVar.f285b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11859a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11860b, null);
        }
        rVar.a(aVar2, new j2.e(17));
    }
}
