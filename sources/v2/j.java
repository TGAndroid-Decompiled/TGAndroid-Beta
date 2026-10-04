package v2;

import b2.s;
import g2.b0;
import v7.m7;
public final class j extends e {
    public final d f47808s;
    public o0.a v;
    public long f47809w;
    public volatile boolean f47810x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f47808s = dVar;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f47809w == 0) {
            this.f47808s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f47787b.b(this.f47809w);
            b0 b0Var = this.f47792r;
            c3.l lVar = new c3.l(b0Var, b10.f10197e, b0Var.open(b10));
            while (!this.f47810x) {
                int m10 = this.f47808s.f47779a.m(lVar, d.f47778s);
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
            this.f47809w = lVar.d - this.f47787b.f10197e;
            c3.b0 b0Var2 = this.f47808s.f47784n;
        } finally {
            m7.a(this.f47792r);
        }
    }

    @Override
    public final void q() {
        this.f47810x = true;
    }
}
