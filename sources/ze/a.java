package ze;

import bf.g;
import bf.p;
import bf.s;
import ye.b;
public final class a implements ef.a {
    public final char f49267a;

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
        return this.f49267a;
    }

    @Override
    public final int b(b bVar, b bVar2) {
        if (bVar.d || bVar2.f47036c) {
            int i10 = bVar2.h;
            if (i10 % 3 != 0 && (bVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        if (bVar.f47038g >= 2 && bVar2.f47038g >= 2) {
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
        String.valueOf(this.f49267a);
        if (i10 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (p pVar = (p) sVar.f3548f; pVar != null && pVar != sVar2; pVar = (p) pVar.f3548f) {
            gVar.b(pVar);
        }
        gVar.g();
        p pVar2 = (p) sVar.f3548f;
        gVar.f3548f = pVar2;
        if (pVar2 != null) {
            pVar2.e = gVar;
        }
        gVar.e = sVar;
        sVar.f3548f = gVar;
        p pVar3 = (p) sVar.f3546b;
        gVar.f3546b = pVar3;
        if (((p) gVar.f3548f) == null) {
            pVar3.d = gVar;
        }
    }

    @Override
    public final char e() {
        return this.f49267a;
    }

    public a(char c10) {
        this.f49267a = c10;
    }
}
