package v2;

import b2.s;
import g2.b0;
import v7.m7;
public final class j extends e {
    public final d f43884s;
    public o0.a v;
    public long f43885w;
    public volatile boolean f43886x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f43884s = dVar;
    }

    @Override
    public final void H() {
        this.f43886x = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f43885w == 0) {
            this.f43884s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f43866b.b(this.f43885w);
            b0 b0Var = this.f43870r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.f43886x) {
                int m10 = this.f43884s.f43859a.m(lVar, d.f43858s);
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
            this.f43885w = lVar.d - this.f43866b.e;
            c3.b0 b0Var2 = this.f43884s.f43863n;
        } finally {
            m7.a(this.f43870r);
        }
    }
}
