package v2;

import b2.s;
import g2.b0;
import v7.m7;
public final class j extends e {
    public final d f44115s;
    public o0.a v;
    public long f44116w;
    public volatile boolean f44117x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f44115s = dVar;
    }

    @Override
    public final void D() {
        this.f44117x = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f44116w == 0) {
            this.f44115s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f44097b.b(this.f44116w);
            b0 b0Var = this.f44101r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.f44117x) {
                int m10 = this.f44115s.f44090a.m(lVar, d.f44089s);
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
            this.f44116w = lVar.d - this.f44097b.e;
            c3.b0 b0Var2 = this.f44115s.f44094n;
        } finally {
            m7.a(this.f44101r);
        }
    }
}
