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
    public q f45549a;
    public i f45550b;
    public boolean f45551c;

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
        if (fVar.a(pVar, true) && (fVar.f45555a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            v vVar = new v(min);
            pVar.a(0, min, vVar.f7933a);
            vVar.J(0);
            if (vVar.a() >= 5 && vVar.x() == 127 && vVar.z() == 1179402563) {
                this.f45550b = new i();
                return true;
            }
            vVar.J(0);
            try {
                z10 = c3.b.x(1, vVar, true);
            } catch (s0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f45550b = new i();
            } else {
                vVar.J(0);
                if (h.e(vVar, h.f45560o)) {
                    this.f45550b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f45549a = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        i iVar = this.f45550b;
        if (iVar != null) {
            e eVar = iVar.f45563a;
            f fVar = eVar.f45552a;
            fVar.f45555a = 0;
            fVar.f45556b = 0L;
            fVar.f45557c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.f45553b.G(0);
            eVar.f45554c = -1;
            eVar.e = false;
            if (j3 == 0) {
                iVar.d(!iVar.f45571l);
            } else if (iVar.h != 0) {
                long j11 = (iVar.f45568i * j10) / 1000000;
                iVar.e = j11;
                g gVar = iVar.d;
                String str = d0.f7887a;
                gVar.B(j11);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8083b;
        return a1.e;
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
