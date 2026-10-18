package x3;

import b2.w0;
import c3.o;
import c3.p;
import c3.q;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class d implements o {
    public q f49239a;
    public i f49240b;
    public boolean f49241c;

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
        this.f49239a = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        i iVar = this.f49240b;
        if (iVar != null) {
            e eVar = iVar.f49253a;
            f fVar = eVar.f49242a;
            fVar.f49245a = 0;
            fVar.f49246b = 0L;
            fVar.f49247c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.f49243b.K(0);
            eVar.f49244c = -1;
            eVar.e = false;
            if (j10 == 0) {
                iVar.d(!iVar.f49261l);
            } else if (iVar.h != 0) {
                long j12 = (iVar.f49258i * j11) / 1000000;
                iVar.e = j12;
                g gVar = iVar.d;
                String str = m0.f8255a;
                gVar.X(j12);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8477b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r25, c3.s r26) {
        throw new UnsupportedOperationException("Method not decompiled: x3.d.f(c3.p, c3.s):int");
    }

    public final boolean g(p pVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(pVar, true) && (fVar.f49245a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            x xVar = new x(min);
            pVar.b(0, min, xVar.f8294a);
            xVar.N(0);
            if (xVar.a() >= 5 && xVar.A() == 127 && xVar.C() == 1179402563) {
                this.f49240b = new i();
                return true;
            }
            xVar.N(0);
            try {
                z10 = c3.b.w(1, xVar, true);
            } catch (w0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f49240b = new i();
            } else {
                xVar.N(0);
                if (h.e(xVar, h.f49250o)) {
                    this.f49240b = new i();
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
