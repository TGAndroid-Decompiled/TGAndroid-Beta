package x7;

import android.content.Context;
public final class ha implements fa {
    public final q9.n f45745a;
    public final ca f45746b;

    public ha(Context context, ca caVar) {
        this.f45746b = caVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.b9(c10, 4));
        }
        this.f45745a = new q9.n(new v7.b9(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f45746b.getClass();
        l5.r rVar = (l5.r) this.f45745a.get();
        if (aVar.f277b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10997a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10998b, null);
        }
        rVar.a(aVar2, new j2.e(22));
    }
}
