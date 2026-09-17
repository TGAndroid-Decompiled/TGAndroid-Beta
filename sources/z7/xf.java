package z7;

import android.content.Context;
public final class xf implements tf {
    public final q9.n f51330a;
    public final sf f51331b;

    public xf(Context context, sf sfVar) {
        this.f51331b = sfVar;
        j5.a aVar = j5.a.f13508e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 6));
        }
        this.f51330a = new q9.n(new v7.a9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f51331b.getClass();
        l5.r rVar = (l5.r) this.f51330a.get();
        if (aVar.f285b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11859a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11860b, null);
        }
        rVar.a(aVar2, new j2.e(17));
    }
}
