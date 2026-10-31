package pe;

import df.c;
import se.b;
import ve.r;
public final class a implements ye.a {
    @Override
    public final int a(b bVar, b bVar2) {
        if (bVar.f48192g >= 2 && bVar2.f48192g >= 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final char b() {
        return '~';
    }

    @Override
    public final void c(r rVar, r rVar2, int i10) {
        c cVar = new c();
        for (c cVar2 = (c) rVar.f5879f; cVar2 != null && cVar2 != rVar2; cVar2 = (c) cVar2.f5879f) {
            cVar.b(cVar2);
        }
        cVar.g();
        c cVar3 = (c) rVar.f5879f;
        cVar.f5879f = cVar3;
        if (cVar3 != null) {
            cVar3.e = cVar;
        }
        cVar.e = rVar;
        rVar.f5879f = cVar;
        c cVar4 = (c) rVar.f5877b;
        cVar.f5877b = cVar4;
        if (((c) cVar.f5879f) == null) {
            cVar4.d = cVar;
        }
    }

    @Override
    public final int d() {
        return 2;
    }

    @Override
    public final char e() {
        return '~';
    }
}
