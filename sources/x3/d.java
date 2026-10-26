package x3;

import b2.x0;
import c3.o;
import c3.p;
import c3.q;
import e2.n0;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;
public final class d implements o {
    public q f51375a;
    public i f51376b;
    public boolean f51377c;

    @Override
    public final boolean a(p pVar) {
        try {
            return g(pVar);
        } catch (x0 unused) {
            return false;
        }
    }

    @Override
    public final void c(q qVar) {
        this.f51375a = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        i iVar = this.f51376b;
        if (iVar != null) {
            e eVar = iVar.f51389a;
            f fVar = eVar.f51378a;
            fVar.f51381a = 0;
            fVar.f51382b = 0L;
            fVar.f51383c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.f51379b.K(0);
            eVar.f51380c = -1;
            eVar.e = false;
            if (j10 == 0) {
                iVar.d(!iVar.f51397l);
            } else if (iVar.h != 0) {
                long j12 = (iVar.f51394i * j11) / 1000000;
                iVar.e = j12;
                g gVar = iVar.d;
                String str = n0.f9692a;
                gVar.N0(j12);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10287b;
        return s1.e;
    }

    @Override
    public final int f(c3.p r25, c3.s r26) {
        throw new UnsupportedOperationException("Method not decompiled: x3.d.f(c3.p, c3.s):int");
    }

    public final boolean g(p pVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(pVar, true) && (fVar.f51381a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            x xVar = new x(min);
            pVar.b(0, min, xVar.f9732a);
            xVar.N(0);
            if (xVar.a() >= 5 && xVar.A() == 127 && xVar.C() == 1179402563) {
                this.f51376b = new i();
                return true;
            }
            xVar.N(0);
            try {
                z10 = c3.b.w(1, xVar, true);
            } catch (x0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f51376b = new i();
            } else {
                xVar.N(0);
                if (h.e(xVar, h.f51386o)) {
                    this.f51376b = new i();
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
