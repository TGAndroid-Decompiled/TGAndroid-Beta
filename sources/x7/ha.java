package x7;

import android.content.Context;
public final class ha implements fa {
    public final r9.n f53184a;
    public final ca f53185b;

    public ha(Context context, ca caVar) {
        this.f53185b = caVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.z8(c10, 4));
        }
        this.f53184a = new r9.n(new v7.z8(c10, 5));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f53185b.getClass();
        l5.r rVar = (l5.r) this.f53184a.get();
        if (aVar.f281b != 0) {
            aVar2 = new i5.a(null, aVar.E(), i5.d.f8206a, null);
        } else {
            aVar2 = new i5.a(null, aVar.E(), i5.d.f8207b, null);
        }
        rVar.a(aVar2, new k2.k0(5));
    }
}
