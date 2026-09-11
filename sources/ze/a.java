package ze;

import bf.g;
import bf.p;
import bf.s;
import ye.b;
public final class a implements ef.a {
    public final char f51621a;

    public a(int i10) {
        this('*');
        switch (i10) {
            case 1:
                this('_');
                return;
            default:
                return;
        }
    }

    @Override
    public final char a() {
        return this.f51621a;
    }

    @Override
    public final int b(b bVar, b bVar2) {
        if (bVar.d || bVar2.f49977c) {
            int i10 = bVar2.h;
            if (i10 % 3 != 0 && (bVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        if (bVar.f49980g >= 2 && bVar2.f49980g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final void d(s sVar, s sVar2, int i10) {
        g gVar;
        String.valueOf(this.f51621a);
        if (i10 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f2641f; pVar != null && pVar != sVar2; pVar = (p) pVar.f2641f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f2641f;
        gVar.f2641f = pVar2;
        if (pVar2 != null) {
            pVar2.f2640e = gVar;
        }
        gVar.f2640e = sVar;
        sVar.f2641f = gVar;
        p pVar3 = (p) sVar.f2638b;
        gVar.f2638b = pVar3;
        if (((p) gVar.f2641f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final char e() {
        return this.f51621a;
    }

    public a(char c10) {
        this.f51621a = c10;
    }
}
