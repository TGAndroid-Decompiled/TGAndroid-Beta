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
        for (p pVar2 = (p) sVar.f7988f; pVar2 != null && pVar2 != sVar2; pVar2 = (p) pVar2.f7988f) {
            pVar.b(pVar2);
        }
        pVar.g();
        p pVar3 = (p) sVar.f7988f;
        pVar.f7988f = pVar3;
        if (pVar3 != null) {
            pVar3.e = pVar;
        }
        pVar.e = sVar;
        sVar.f7988f = pVar;
        p pVar4 = (p) sVar.f7986b;
        pVar.f7986b = pVar4;
        if (((p) pVar.f7988f) == null) {
            pVar4.d = pVar;
        }
    }

    @Override
    public final int c() {
        return 2;
    }

    @Override
    public final int d(f fVar, f fVar2) {
        if (fVar.f566g >= 2 && fVar2.f566g >= 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final char e() {
        return '~';
    }
}
