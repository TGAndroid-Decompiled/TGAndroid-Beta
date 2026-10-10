package x3;

import b2.s0;
import c3.o;
import c3.p;
import c3.q;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
public final class d implements o {
    public q f50604a;
    public i f50605b;
    public boolean f50606c;

    @Override
    public final boolean a(p pVar) {
        try {
            return b(pVar);
        } catch (s0 unused) {
            return false;
        }
    }

    public final boolean b(p pVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(pVar, true) && (fVar.f50611a & 2) == 2) {
            int min = Math.min(fVar.f50614e, 8);
            v vVar = new v(min);
            pVar.a(0, min, vVar.f8584a);
            vVar.J(0);
            if (vVar.a() >= 5 && vVar.x() == 127 && vVar.z() == 1179402563) {
                this.f50605b = new i();
                return true;
            }
            vVar.J(0);
            try {
                z10 = c3.b.x(1, vVar, true);
            } catch (s0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f50605b = new i();
            } else {
                vVar.J(0);
                if (h.e(vVar, h.f50617o)) {
                    this.f50605b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f50604a = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        i iVar = this.f50605b;
        if (iVar != null) {
            e eVar = iVar.f50620a;
            f fVar = eVar.f50607a;
            fVar.f50611a = 0;
            fVar.f50612b = 0L;
            fVar.f50613c = 0;
            fVar.d = 0;
            fVar.f50614e = 0;
            eVar.f50608b.G(0);
            eVar.f50609c = -1;
            eVar.f50610e = false;
            if (j3 == 0) {
                iVar.d(!iVar.f50629l);
            } else if (iVar.h != 0) {
                long j11 = (iVar.f50626i * j10) / 1000000;
                iVar.f50623e = j11;
                g gVar = iVar.d;
                String str = d0.f8532a;
                gVar.l(j11);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8752b;
        return a1.f8715e;
    }

    @Override
    public final int m(c3.p r21, c3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: x3.d.m(c3.p, c3.s):int");
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
