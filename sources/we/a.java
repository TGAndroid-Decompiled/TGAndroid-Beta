package we;

import cf.p;
import cf.s;
import ze.b;
public final class a implements ff.a {
    @Override
    public final int a(b bVar, b bVar2) {
        if (bVar.f54462g >= 2 && bVar2.f54462g >= 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void b(s sVar, s sVar2, int i10) {
        p pVar = new p();
        for (p pVar2 = (p) sVar.f4654f; pVar2 != null && pVar2 != sVar2; pVar2 = (p) pVar2.f4654f) {
            pVar.b(pVar2);
        }
        pVar.g();
        p pVar3 = (p) sVar.f4654f;
        pVar.f4654f = pVar3;
        if (pVar3 != null) {
            pVar3.f4653e = pVar;
        }
        pVar.f4653e = sVar;
        sVar.f4654f = pVar;
        p pVar4 = (p) sVar.f4651b;
        pVar.f4651b = pVar4;
        if (((p) pVar.f4654f) == null) {
            pVar4.d = pVar;
        }
    }

    @Override
    public final char c() {
        return '~';
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
