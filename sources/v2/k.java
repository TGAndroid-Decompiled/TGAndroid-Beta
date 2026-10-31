package v2;

import b2.x;
import g2.c0;
import v7.l7;
import v7.t6;
public final class k extends f {
    public final e f50324s;
    public u9.b f50325w;
    public long f50326x;
    public volatile boolean f50327y;

    public k(g2.h hVar, g2.n nVar, x xVar, int i10, Object obj, e eVar) {
        super(hVar, nVar, 2, xVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f50324s = eVar;
    }

    @Override
    public final void R1() {
        this.f50327y = true;
    }

    @Override
    public final void b() {
        boolean z10;
        if (this.f50326x == 0) {
            this.f50324s.b(this.f50325w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.n b10 = this.f50306b.b(this.f50326x);
            c0 c0Var = this.f50310r;
            c3.l lVar = new c3.l(c0Var, b10.e, c0Var.open(b10));
            while (!this.f50327y) {
                int f7 = this.f50324s.f50298a.f(lVar, e.f50297w);
                boolean z11 = false;
                if (f7 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.p(z10);
                if (f7 == 0) {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.f50326x = lVar.d - this.f50306b.e;
            this.f50324s.a();
        } finally {
            l7.a(this.f50310r);
        }
    }
}
