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
    public q f45260a;
    public i f45261b;
    public boolean f45262c;

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
        if (fVar.a(pVar, true) && (fVar.f45266a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            v vVar = new v(min);
            pVar.a(0, min, vVar.f7934a);
            vVar.J(0);
            if (vVar.a() >= 5 && vVar.x() == 127 && vVar.z() == 1179402563) {
                this.f45261b = new i();
                return true;
            }
            vVar.J(0);
            try {
                z10 = c3.b.x(1, vVar, true);
            } catch (s0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f45261b = new i();
            } else {
                vVar.J(0);
                if (h.e(vVar, h.f45271o)) {
                    this.f45261b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f45260a = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        i iVar = this.f45261b;
        if (iVar != null) {
            e eVar = iVar.f45274a;
            f fVar = eVar.f45263a;
            fVar.f45266a = 0;
            fVar.f45267b = 0L;
            fVar.f45268c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.f45264b.G(0);
            eVar.f45265c = -1;
            eVar.e = false;
            if (j3 == 0) {
                iVar.d(!iVar.f45282l);
            } else if (iVar.h != 0) {
                long j11 = (iVar.f45279i * j10) / 1000000;
                iVar.e = j11;
                g gVar = iVar.d;
                String str = d0.f7888a;
                gVar.B(j11);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8084b;
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
