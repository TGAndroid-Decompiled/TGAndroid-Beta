package v2;

import b2.s;
import g2.b0;
import n7.a1;
import v7.n7;
public final class j extends e {
    public final d f42881s;
    public a1 v;
    public long f42882w;
    public volatile boolean f42883x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f42881s = dVar;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f42882w == 0) {
            this.f42881s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f42863b.b(this.f42882w);
            b0 b0Var = this.f42867r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.f42883x) {
                int m10 = this.f42881s.f42856a.m(lVar, d.f42855s);
                boolean z11 = false;
                if (m10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (m10 == 0) {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.f42882w = lVar.d - this.f42863b.e;
            c3.b0 b0Var2 = this.f42881s.f42860n;
        } finally {
            n7.a(this.f42867r);
        }
    }

    @Override
    public final void k() {
        this.f42883x = true;
    }
}
