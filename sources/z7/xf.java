package z7;

import android.content.Context;
public final class xf implements tf {
    public final q9.n f51360a;
    public final sf f51361b;

    public xf(Context context, sf sfVar) {
        this.f51361b = sfVar;
        j5.a aVar = j5.a.f13534e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 6));
        }
        this.f51360a = new q9.n(new v7.a9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f51361b.getClass();
        l5.r rVar = (l5.r) this.f51360a.get();
        if (aVar.f297b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11885a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f11886b, null);
        }
        rVar.a(aVar2, new j2.e(17));
    }
}
