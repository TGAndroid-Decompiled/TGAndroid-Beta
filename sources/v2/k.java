package v2;

import a8.hc;
import a8.yb;
import b2.x;
import g2.b0;
public final class k extends f {
    public final e f50022s;
    public m4.c v;
    public long f50023w;
    public volatile boolean f50024x;

    public k(g2.h hVar, g2.m mVar, x xVar, int i10, Object obj, e eVar) {
        super(hVar, mVar, 2, xVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f50022s = eVar;
    }

    @Override
    public final void b() {
        boolean z10;
        if (this.f50023w == 0) {
            this.f50022s.b(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f50004b.b(this.f50023w);
            b0 b0Var = this.f50008r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.f50024x) {
                int f7 = this.f50022s.f49996a.f(lVar, e.v);
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
            this.f50023w = lVar.d - this.f50004b.e;
            this.f50022s.a();
        } finally {
            hc.a(this.f50008r);
        }
    }

    @Override
    public final void f0() {
        this.f50024x = true;
    }
}
