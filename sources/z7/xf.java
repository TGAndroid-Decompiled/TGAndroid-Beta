package z7;

import android.content.Context;
public final class xf implements tf {
    public final q9.n f48956a;
    public final sf f48957b;

    public xf(Context context, sf sfVar) {
        this.f48957b = sfVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.b9(c10, 6));
        }
        this.f48956a = new q9.n(new v7.b9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f48957b.getClass();
        l5.r rVar = (l5.r) this.f48956a.get();
        if (aVar.f277b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10983a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10984b, null);
        }
        rVar.a(aVar2, new j2.e(19));
    }
}
