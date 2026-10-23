package x3;

import b2.w0;
import c3.q;
import c3.r;
import c3.s;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class d implements q {
    public s f49644a;
    public i f49645b;
    public boolean f49646c;

    @Override
    public final boolean a(r rVar) {
        try {
            return g(rVar);
        } catch (w0 unused) {
            return false;
        }
    }

    @Override
    public final void c(s sVar) {
        this.f49644a = sVar;
    }

    @Override
    public final void d(long j10, long j11) {
        i iVar = this.f49645b;
        if (iVar != null) {
            e eVar = iVar.f49658a;
            f fVar = eVar.f49647a;
            fVar.f49650a = 0;
            fVar.f49651b = 0L;
            fVar.f49652c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.f49648b.K(0);
            eVar.f49649c = -1;
            eVar.e = false;
            if (j10 == 0) {
                iVar.d(!iVar.f49666l);
            } else if (iVar.h != 0) {
                long j12 = (iVar.f49663i * j11) / 1000000;
                iVar.e = j12;
                g gVar = iVar.d;
                String str = m0.f8259a;
                gVar.X(j12);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r r25, c3.u r26) {
        throw new UnsupportedOperationException("Method not decompiled: x3.d.f(c3.r, c3.u):int");
    }

    public final boolean g(r rVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(rVar, true) && (fVar.f49650a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            x xVar = new x(min);
            rVar.a(0, min, xVar.f8298a);
            xVar.N(0);
            if (xVar.a() >= 5 && xVar.A() == 127 && xVar.C() == 1179402563) {
                this.f49645b = new i();
                return true;
            }
            xVar.N(0);
            try {
                z10 = c3.b.w(1, xVar, true);
            } catch (w0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f49645b = new i();
            } else {
                xVar.N(0);
                if (h.e(xVar, h.f49655o)) {
                    this.f49645b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
