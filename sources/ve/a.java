package ve;

import bf.p;
import bf.s;
import ye.b;
public final class a implements ef.a {
    @Override
    public final char a() {
        return '~';
    }

    @Override
    public final int b(b bVar, b bVar2) {
        if (bVar.f50009g >= 2 && bVar2.f50009g >= 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int c() {
        return 2;
    }

    @Override
    public final void d(s sVar, s sVar2, int i10) {
        p pVar = new p();
        for (p pVar2 = (p) sVar.f2668f; pVar2 != null && pVar2 != sVar2; pVar2 = (p) pVar2.f2668f) {
            pVar.b(pVar2);
        }
        pVar.g();
        p pVar3 = (p) sVar.f2668f;
        pVar.f2668f = pVar3;
        if (pVar3 != null) {
            pVar3.f2667e = pVar;
        }
        pVar.f2667e = sVar;
        sVar.f2668f = pVar;
        p pVar4 = (p) sVar.f2665b;
        pVar.f2665b = pVar4;
        if (((p) pVar.f2668f) == null) {
            pVar4.d = pVar;
        }
    }

    @Override
    public final char e() {
        return '~';
    }
}
