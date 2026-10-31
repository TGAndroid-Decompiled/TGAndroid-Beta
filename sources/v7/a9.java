package v7;

import android.content.Context;
public final class a9 implements w8 {
    public final r9.n f50392a;
    public final u8 f50393b;

    public a9(Context context, u8 u8Var) {
        this.f50393b = u8Var;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new z8(c10, 0));
        }
        this.f50392a = new r9.n(new z8(c10, 1));
    }

    @Override
    public final void a(a5.a aVar) {
        i5.a aVar2;
        this.f50393b.getClass();
        l5.r rVar = (l5.r) this.f50392a.get();
        if (aVar.f281b != 0) {
            aVar2 = new i5.a(null, aVar.E(), i5.d.f8206a, null);
        } else {
            aVar2 = new i5.a(null, aVar.E(), i5.d.f8207b, null);
        }
        rVar.a(aVar2, new k2.k0(5));
    }
}
