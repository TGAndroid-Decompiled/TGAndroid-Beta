package x7;

import android.content.Context;
public final class ha implements fa {
    public final q9.n f45766a;
    public final ca f45767b;

    public ha(Context context, ca caVar) {
        this.f45767b = caVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.b9(c10, 4));
        }
        this.f45766a = new q9.n(new v7.b9(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f45767b.getClass();
        l5.s sVar = (l5.s) this.f45766a.get();
        if (aVar.f276b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10997a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10998b, null);
        }
        sVar.a(aVar2, new j2.e(22));
    }
}
