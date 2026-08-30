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
    public final k0 f43322a;
    public final f7.b f43323b = new f7.b((char) 0, 17);
    public final e4.e f43324c = new e4.e();
    public long d = -9223372036854775807L;
    public final o e;

    public n(o oVar, q qVar) {
        this.e = oVar;
        this.f43322a = new k0(qVar, null, null);
    }

    @Override
    public final void a(int i10, w wVar) {
        k0 k0Var = this.f43322a;
        k0Var.getClass();
        k0Var.a(i10, wVar);
    }

    @Override
    public final void b(n0 n0Var) {
        this.f43322a.b(n0Var);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, u uVar) {
        long g10;
        long j11;
        this.f43322a.c(j10, i10, i11, i12, uVar);
        while (this.f43322a.u(false)) {
            e4.e eVar = this.f43324c;
            eVar.c();
            if (this.f43322a.z(this.f43323b, eVar, 0, false) == -4) {
                eVar.l();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long j12 = eVar.f14242f;
                e4.c a2 = this.e.f43327c.a(eVar);
                if (a2 != null) {
                    g4.a aVar = (g4.a) a2.f5101a[0];
                    String str = aVar.f6353a;
                    String str2 = aVar.f6354b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = d0.J(d0.m(aVar.e));
                        } catch (r1 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            m mVar = new m(j12, j11);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        k0 k0Var = this.f43322a;
        g0 g0Var = k0Var.f16357a;
        synchronized (k0Var) {
            int i13 = k0Var.f16372s;
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
        k0 k0Var = this.f43322a;
        k0Var.getClass();
        return k0Var.C(jVar, i10, z4);
    }
}
