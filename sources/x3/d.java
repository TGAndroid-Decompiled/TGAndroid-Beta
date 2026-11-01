package x3;

import b2.w0;
import c3.o;
import c3.p;
import c3.q;
import e2.l0;
import e2.x;
import e9.n0;
import e9.x1;
import java.util.List;
public final class d implements o {
    public q f52989a;
    public i f52990b;
    public boolean f52991c;

    @Override
    public final boolean a(p pVar) {
        try {
            return g(pVar);
        } catch (w0 unused) {
            return false;
        }
    }

    @Override
    public final void c(q qVar) {
        this.f52989a = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        i iVar = this.f52990b;
        if (iVar != null) {
            e eVar = iVar.f53003a;
            f fVar = eVar.f52992a;
            fVar.f52995a = 0;
            fVar.f52996b = 0L;
            fVar.f52997c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.f52993b.K(0);
            eVar.f52994c = -1;
            eVar.e = false;
            if (j10 == 0) {
                iVar.d(!iVar.f53011l);
            } else if (iVar.h != 0) {
                long j12 = (iVar.f53008i * j11) / 1000000;
                iVar.e = j12;
                g gVar = iVar.d;
                String str = l0.f6165a;
                gVar.b0(j12);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final List e() {
        e9.l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r25, c3.s r26) {
        throw new UnsupportedOperationException("Method not decompiled: x3.d.f(c3.p, c3.s):int");
    }

    public final boolean g(p pVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(pVar, true) && (fVar.f52995a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            x xVar = new x(min);
            pVar.b(0, min, xVar.f6207a);
            xVar.N(0);
            if (xVar.a() >= 5 && xVar.A() == 127 && xVar.C() == 1179402563) {
                this.f52990b = new i();
                return true;
            }
            xVar.N(0);
            try {
                z10 = c3.b.w(1, xVar, true);
            } catch (w0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f52990b = new i();
            } else {
                xVar.N(0);
                if (h.e(xVar, h.f53000o)) {
                    this.f52990b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
