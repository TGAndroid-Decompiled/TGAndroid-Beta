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
    public q f48786a;
    public i f48787b;
    public boolean f48788c;

    public final boolean a(p pVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(pVar, true) && (fVar.f48793a & 2) == 2) {
            int min = Math.min(fVar.f48796e, 8);
            v vVar = new v(min);
            pVar.b(0, min, vVar.f8789a);
            vVar.J(0);
            if (vVar.a() >= 5 && vVar.x() == 127 && vVar.z() == 1179402563) {
                this.f48787b = new i();
                return true;
            }
            vVar.J(0);
            try {
                z10 = c3.b.x(1, vVar, true);
            } catch (s0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f48787b = new i();
            } else {
                vVar.J(0);
                if (h.e(vVar, h.f48799o)) {
                    this.f48787b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(p pVar) {
        try {
            return a(pVar);
        } catch (s0 unused) {
            return false;
        }
    }

    @Override
    public final void g(q qVar) {
        this.f48786a = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        i iVar = this.f48787b;
        if (iVar != null) {
            e eVar = iVar.f48802a;
            f fVar = eVar.f48789a;
            fVar.f48793a = 0;
            fVar.f48794b = 0L;
            fVar.f48795c = 0;
            fVar.d = 0;
            fVar.f48796e = 0;
            eVar.f48790b.G(0);
            eVar.f48791c = -1;
            eVar.f48792e = false;
            if (j3 == 0) {
                iVar.d(!iVar.f48811l);
            } else if (iVar.h != 0) {
                long j11 = (iVar.f48808i * j10) / 1000000;
                iVar.f48805e = j11;
                g gVar = iVar.d;
                String str = d0.f8737a;
                gVar.h(j11);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8957b;
        return a1.f8920e;
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
