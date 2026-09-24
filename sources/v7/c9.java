package v7;

import android.content.Context;
public final class c9 implements y8 {
    public final q9.n f44200a;
    public final w8 f44201b;

    public c9(Context context, w8 w8Var) {
        this.f44201b = w8Var;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new b9(c10, 0));
        }
        this.f44200a = new q9.n(new b9(c10, 1));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f44201b.getClass();
        l5.r rVar = (l5.r) this.f44200a.get();
        if (aVar.f277b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10983a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10984b, null);
        }
        rVar.a(aVar2, new j2.e(19));
    }
}
