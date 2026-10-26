package v2;

import a8.hc;
import a8.yb;
import b2.x;
import g2.b0;
public final class k extends f {
    public final e f50025s;
    public m4.c v;
    public long f50026w;
    public volatile boolean f50027x;

    public k(g2.h hVar, g2.m mVar, x xVar, int i10, Object obj, e eVar) {
        super(hVar, mVar, 2, xVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f50025s = eVar;
    }

    @Override
    public final void b() {
        boolean z10;
        if (this.f50026w == 0) {
            this.f50025s.b(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f50007b.b(this.f50026w);
            b0 b0Var = this.f50011r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.f50027x) {
                int f7 = this.f50025s.f49999a.f(lVar, e.v);
                boolean z11 = false;
                if (f7 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yb.p(z10);
                if (f7 == 0) {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.f50026w = lVar.d - this.f50007b.e;
            this.f50025s.a();
        } finally {
            hc.a(this.f50011r);
        }
    }

    @Override
    public final void f0() {
        this.f50027x = true;
    }
}
