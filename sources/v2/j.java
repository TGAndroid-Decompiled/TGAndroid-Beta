package v2;

import b2.s;
import g2.b0;
import v7.m7;
public final class j extends e {
    public final d f43810s;
    public o0.a v;
    public long f43811w;
    public volatile boolean f43812x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f43810s = dVar;
    }

    @Override
    public final void H() {
        this.f43812x = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f43811w == 0) {
            this.f43810s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f43792b.b(this.f43811w);
            b0 b0Var = this.f43796r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.f43812x) {
                int m10 = this.f43810s.f43785a.m(lVar, d.f43784s);
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
            this.f43811w = lVar.d - this.f43792b.e;
            c3.b0 b0Var2 = this.f43810s.f43789n;
        } finally {
            m7.a(this.f43796r);
        }
    }
}
