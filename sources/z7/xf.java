package z7;

import android.content.Context;
public final class xf implements tf {
    public final q9.n f48696a;
    public final sf f48697b;

    public xf(Context context, sf sfVar) {
        this.f48697b = sfVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 6));
        }
        this.f48696a = new q9.n(new v7.a9(c10, 7));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f48697b.getClass();
        l5.s sVar = (l5.s) this.f48696a.get();
        if (aVar.f275b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10993a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10994b, null);
        }
        sVar.a(aVar2, new j2.e(18));
    }
}
