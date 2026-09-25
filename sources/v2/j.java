package v2;

import b2.s;
import g2.b0;
import v7.n7;
public final class j extends e {
    public final d f44144s;
    public o0.a v;
    public long f44145w;
    public volatile boolean f44146x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f44144s = dVar;
    }

    @Override
    public final void D() {
        this.f44146x = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f44145w == 0) {
            this.f44144s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f44126b.b(this.f44145w);
            b0 b0Var = this.f44130r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.f44146x) {
                int m10 = this.f44144s.f44119a.m(lVar, d.f44118s);
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
            this.f44145w = lVar.d - this.f44126b.e;
            c3.b0 b0Var2 = this.f44144s.f44123n;
        } finally {
            n7.a(this.f44130r);
        }
    }
}
