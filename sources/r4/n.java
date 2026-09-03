package r4;

import android.os.Handler;
import g5.q;
import h5.d0;
import h5.w;
import j3.n0;
import j3.r1;
import o4.g0;
import o4.k0;
import org.telegram.ui.yh;
import r3.u;
import r3.v;
public final class n implements v {
    public final k0 f46697a;
    public final f7.b f46698b = new f7.b((char) 0, 16);
    public final e4.e f46699c = new e4.e();
    public long d = -9223372036854775807L;
    public final o f46700e;

    public n(o oVar, q qVar) {
        this.f46700e = oVar;
        this.f46697a = new k0(qVar, null, null);
    }

    @Override
    public final void a(int i10, w wVar) {
        k0 k0Var = this.f46697a;
        k0Var.getClass();
        k0Var.a(i10, wVar);
    }

    @Override
    public final void b(n0 n0Var) {
        this.f46697a.b(n0Var);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, u uVar) {
        long g10;
        long j11;
        this.f46697a.c(j10, i10, i11, i12, uVar);
        while (this.f46697a.u(false)) {
            e4.e eVar = this.f46699c;
            eVar.b();
            if (this.f46697a.z(this.f46698b, eVar, 0, false) == -4) {
                eVar.k();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long j12 = eVar.f15218f;
                e4.c a2 = this.f46700e.f46703c.a(eVar);
                if (a2 != null) {
                    g4.a aVar = (g4.a) a2.f4938a[0];
                    String str = aVar.f6829a;
                    String str2 = aVar.f6830b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = d0.J(d0.m(aVar.f6832e));
                        } catch (r1 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            m mVar = new m(j12, j11);
                            Handler handler = this.f46700e.d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        k0 k0Var = this.f46697a;
        g0 g0Var = k0Var.f16506a;
        synchronized (k0Var) {
            int i13 = k0Var.f16522s;
            if (i13 == 0) {
                g10 = -1;
            } else {
                g10 = k0Var.g(i13);
            }
        }
        g0Var.b(g10);
    }

    @Override
    public final void d(int i10, w wVar) {
        yh.a(this, wVar, i10);
    }

    @Override
    public final int e(g5.j jVar, int i10, boolean z4) {
        k0 k0Var = this.f46697a;
        k0Var.getClass();
        return k0Var.C(jVar, i10, z4);
    }
}
