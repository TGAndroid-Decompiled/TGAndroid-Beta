package ye;

import bf.e;
import ef.p;
import ef.s;
public final class a implements hf.a {
    @Override
    public final int a(e eVar, e eVar2) {
        if (eVar.f3916g >= 2 && eVar2.f3916g >= 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final char b() {
        return '~';
    }

    @Override
    public final int c() {
        return 2;
    }

    @Override
    public final void d(s sVar, s sVar2, int i10) {
        p pVar = new p();
        for (p pVar2 = (p) sVar.f9938f; pVar2 != null && pVar2 != sVar2; pVar2 = (p) pVar2.f9938f) {
            pVar.b(pVar2);
        }
        pVar.g();
        p pVar3 = (p) sVar.f9938f;
        pVar.f9938f = pVar3;
        if (pVar3 != null) {
            pVar3.e = pVar;
        }
        pVar.e = sVar;
        sVar.f9938f = pVar;
        p pVar4 = (p) sVar.f9936b;
        pVar.f9936b = pVar4;
        if (((p) pVar.f9938f) == null) {
            pVar4.d = pVar;
        }
    }

    @Override
    public final char e() {
        return '~';
    }
}
