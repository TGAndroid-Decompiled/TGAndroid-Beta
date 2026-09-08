package v2;

import b2.s;
import g2.b0;
import v7.m7;
public final class j extends e {
    public final d f47348s;
    public o0.a v;
    public long f47349w;
    public volatile boolean f47350x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f47348s = dVar;
    }

    @Override
    public final void W() {
        this.f47350x = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f47349w == 0) {
            this.f47348s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f47327b.b(this.f47349w);
            b0 b0Var = this.f47332r;
            c3.l lVar = new c3.l(b0Var, b10.f10361e, b0Var.open(b10));
            while (!this.f47350x) {
                int m10 = this.f47348s.f47319a.m(lVar, d.f47318s);
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
            this.f47349w = lVar.d - this.f47327b.f10361e;
            c3.b0 b0Var2 = this.f47348s.f47324n;
        } finally {
            m7.a(this.f47332r);
        }
    }
}
