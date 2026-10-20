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
    public q f49198a;
    public i f49199b;
    public boolean f49200c;

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
        this.f49198a = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        i iVar = this.f49199b;
        if (iVar != null) {
            e eVar = iVar.f49212a;
            f fVar = eVar.f49201a;
            fVar.f49204a = 0;
            fVar.f49205b = 0L;
            fVar.f49206c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.f49202b.K(0);
            eVar.f49203c = -1;
            eVar.e = false;
            if (j10 == 0) {
                iVar.d(!iVar.f49220l);
            } else if (iVar.h != 0) {
                long j12 = (iVar.f49217i * j11) / 1000000;
                iVar.e = j12;
                g gVar = iVar.d;
                String str = m0.f8252a;
                gVar.X(j12);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8474b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r25, c3.s r26) {
        throw new UnsupportedOperationException("Method not decompiled: x3.d.f(c3.p, c3.s):int");
    }

    public final boolean g(p pVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(pVar, true) && (fVar.f49204a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            x xVar = new x(min);
            pVar.b(0, min, xVar.f8291a);
            xVar.N(0);
            if (xVar.a() >= 5 && xVar.A() == 127 && xVar.C() == 1179402563) {
                this.f49199b = new i();
                return true;
            }
            xVar.N(0);
            try {
                z10 = c3.b.w(1, xVar, true);
            } catch (w0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f49199b = new i();
            } else {
                xVar.N(0);
                if (h.e(xVar, h.f49209o)) {
                    this.f49199b = new i();
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
