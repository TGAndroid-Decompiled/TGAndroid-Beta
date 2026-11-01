package te;

import df.c;
import se.b;
import ve.g;
import ve.r;
public final class a implements ye.a {
    public final char f48698a;

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
    public final int a(b bVar, b bVar2) {
        if (bVar.d || bVar2.f48201c) {
            int i10 = bVar2.h;
            if (i10 % 3 != 0 && (bVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        if (bVar.f48203g >= 2 && bVar2.f48203g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final char b() {
        return this.f48698a;
    }

    @Override
    public final void c(r rVar, r rVar2, int i10) {
        g gVar;
        String.valueOf(this.f48698a);
        if (i10 == 1) {
            gVar = new g(0);
        } else {
            gVar = new g(3);
        }
        for (c cVar = (c) rVar.f5879f; cVar != null && cVar != rVar2; cVar = (c) cVar.f5879f) {
            gVar.b(cVar);
        }
        gVar.g();
        c cVar2 = (c) rVar.f5879f;
        gVar.f5879f = cVar2;
        if (cVar2 != null) {
            cVar2.e = gVar;
        }
        gVar.e = rVar;
        rVar.f5879f = gVar;
        c cVar3 = (c) rVar.f5877b;
        gVar.f5877b = cVar3;
        if (((c) gVar.f5879f) == null) {
            cVar3.d = gVar;
        }
    }

    @Override
    public final int d() {
        return 1;
    }

    @Override
    public final char e() {
        return this.f48698a;
    }

    public a(char c10) {
        this.f48698a = c10;
    }
}
