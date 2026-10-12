package xe;

import af.f;
import df.p;
import df.s;
public final class a implements gf.a {
    @Override
    public final char a() {
        return '~';
    }

    @Override
    public final void b(s sVar, s sVar2, int i10) {
        p pVar = new p();
        for (p pVar2 = (p) sVar.f6530f; pVar2 != null && pVar2 != sVar2; pVar2 = (p) pVar2.f6530f) {
            pVar.b(pVar2);
        }
        pVar.g();
        p pVar3 = (p) sVar.f6530f;
        pVar.f6530f = pVar3;
        if (pVar3 != null) {
            pVar3.e = pVar;
        }
        pVar.e = sVar;
        sVar.f6530f = pVar;
        p pVar4 = (p) sVar.f6528b;
        pVar.f6528b = pVar4;
        if (((p) pVar.f6530f) == null) {
            pVar4.d = pVar;
        }
    }

    @Override
    public final int c() {
        return 2;
    }

    @Override
    public final int d(f fVar, f fVar2) {
        if (fVar.f562g >= 2 && fVar2.f562g >= 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final char e() {
        return '~';
    }
}
