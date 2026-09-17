package v2;

import b2.s;
import g2.b0;
import v7.m7;
public final class j extends e {
    public final d f47349s;
    public o0.a v;
    public long f47350w;
    public volatile boolean f47351x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f47349s = dVar;
    }

    @Override
    public final void W() {
        this.f47351x = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f47350w == 0) {
            this.f47349s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f47328b.b(this.f47350w);
            b0 b0Var = this.f47333r;
            c3.l lVar = new c3.l(b0Var, b10.f10361e, b0Var.open(b10));
            while (!this.f47351x) {
                int m10 = this.f47349s.f47320a.m(lVar, d.f47319s);
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
            this.f47350w = lVar.d - this.f47328b.f10361e;
            c3.b0 b0Var2 = this.f47349s.f47325n;
        } finally {
            m7.a(this.f47333r);
        }
    }
}
