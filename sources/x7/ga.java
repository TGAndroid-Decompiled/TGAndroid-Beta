package x7;

import android.content.Context;
public final class ga implements ea {
    public final q9.n f45764a;
    public final ba f45765b;

    public ga(Context context, ba baVar) {
        this.f45765b = baVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.b9(c10, 4));
        }
        this.f45764a = new q9.n(new v7.b9(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f45765b.getClass();
        l5.r rVar = (l5.r) this.f45764a.get();
        if (aVar.f277b != 0) {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10986a, null);
        } else {
            aVar2 = new i5.a(null, aVar.B(), i5.d.f10987b, null);
        }
        rVar.a(aVar2, new j2.e(20));
    }
}
