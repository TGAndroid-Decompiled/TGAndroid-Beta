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
    public q f45228a;
    public i f45229b;
    public boolean f45230c;

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
        if (fVar.a(pVar, true) && (fVar.f45234a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            v vVar = new v(min);
            pVar.a(0, min, vVar.f7931a);
            vVar.J(0);
            if (vVar.a() >= 5 && vVar.x() == 127 && vVar.z() == 1179402563) {
                this.f45229b = new i();
                return true;
            }
            vVar.J(0);
            try {
                z10 = c3.b.x(1, vVar, true);
            } catch (s0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f45229b = new i();
            } else {
                vVar.J(0);
                if (h.e(vVar, h.f45239o)) {
                    this.f45229b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f45228a = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        i iVar = this.f45229b;
        if (iVar != null) {
            e eVar = iVar.f45242a;
            f fVar = eVar.f45231a;
            fVar.f45234a = 0;
            fVar.f45235b = 0L;
            fVar.f45236c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.f45232b.G(0);
            eVar.f45233c = -1;
            eVar.e = false;
            if (j3 == 0) {
                iVar.d(!iVar.f45250l);
            } else if (iVar.h != 0) {
                long j11 = (iVar.f45247i * j10) / 1000000;
                iVar.e = j11;
                g gVar = iVar.d;
                String str = d0.f7885a;
                gVar.B(j11);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8081b;
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
