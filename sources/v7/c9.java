package v7;

import android.content.Context;
public final class c9 implements y8 {
    public final q9.n f44235a;
    public final w8 f44236b;

    public c9(Context context, w8 w8Var) {
        this.f44236b = w8Var;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new b9(c10, 0));
        }
        this.f44235a = new q9.n(new b9(c10, 1));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f44236b.getClass();
        l5.r rVar = (l5.r) this.f44235a.get();
        if (aVar.f277b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10997a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10998b, null);
        }
        rVar.a(aVar2, new j2.e(22));
    }
}
