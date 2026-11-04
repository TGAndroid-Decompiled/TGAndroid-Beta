package z3;

import d2.v0;
import e3.o;
import e3.p;
import e3.q;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.List;
public final class d implements o {
    public q f59663a;
    public i f59664b;
    public boolean f59665c;

    @Override
    public final boolean b(p pVar) {
        try {
            return g(pVar);
        } catch (v0 unused) {
            return false;
        }
    }

    @Override
    public final void c(q qVar) {
        this.f59663a = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        i iVar = this.f59664b;
        if (iVar != null) {
            e eVar = iVar.f59679a;
            f fVar = eVar.f59666a;
            fVar.f59670a = 0;
            fVar.f59671b = 0L;
            fVar.f59672c = 0;
            fVar.d = 0;
            fVar.f59673e = 0;
            eVar.f59667b.K(0);
            eVar.f59668c = -1;
            eVar.f59669e = false;
            if (j10 == 0) {
                iVar.d(!iVar.f59688l);
            } else if (iVar.h != 0) {
                long j12 = (iVar.f59685i * j11) / 1000000;
                iVar.f59682e = j12;
                g gVar = iVar.d;
                String str = n0.f11873a;
                gVar.u0(j12);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p r25, e3.s r26) {
        throw new UnsupportedOperationException("Method not decompiled: z3.d.f(e3.p, e3.s):int");
    }

    public final boolean g(p pVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(pVar, true) && (fVar.f59670a & 2) == 2) {
            int min = Math.min(fVar.f59673e, 8);
            y yVar = new y(min);
            pVar.c(0, min, yVar.f11923a);
            yVar.N(0);
            if (yVar.a() >= 5 && yVar.A() == 127 && yVar.C() == 1179402563) {
                this.f59664b = new i();
                return true;
            }
            yVar.N(0);
            try {
                z10 = e3.b.w(1, yVar, true);
            } catch (v0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f59664b = new i();
            } else {
                yVar.N(0);
                if (h.e(yVar, h.f59676o)) {
                    this.f59664b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
