package v2;

import b2.s;
import g2.b0;
import v7.n7;
public final class j extends e {
    public final d f44181s;
    public m5.e v;
    public long f44182w;
    public volatile boolean f44183x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f44181s = dVar;
    }

    @Override
    public final void D() {
        this.f44183x = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f44182w == 0) {
            this.f44181s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f44163b.b(this.f44182w);
            b0 b0Var = this.f44167r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.f44183x) {
                int m10 = this.f44181s.f44156a.m(lVar, d.f44155s);
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
            this.f44182w = lVar.d - this.f44163b.e;
            c3.b0 b0Var2 = this.f44181s.f44160n;
        } finally {
            n7.a(this.f44167r);
        }
    }
}
