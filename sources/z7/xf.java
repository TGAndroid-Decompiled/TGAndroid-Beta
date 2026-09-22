package z7;

import android.content.Context;
public final class xf implements tf {
    public final q9.n f49016a;
    public final sf f49017b;

    public xf(Context context, sf sfVar) {
        this.f49017b = sfVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.b9(c10, 6));
        }
        this.f49016a = new q9.n(new v7.b9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f49017b.getClass();
        l5.s sVar = (l5.s) this.f49016a.get();
        if (aVar.f276b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10997a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10998b, null);
        }
        sVar.a(aVar2, new j2.e(22));
    }
}
