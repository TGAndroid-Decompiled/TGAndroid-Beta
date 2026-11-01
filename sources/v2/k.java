package v2;

import b2.x;
import g2.c0;
import v7.l7;
import v7.t6;
public final class k extends f {
    public final e f50338s;
    public u9.b f50339w;
    public long f50340x;
    public volatile boolean f50341y;

    public k(g2.h hVar, g2.n nVar, x xVar, int i10, Object obj, e eVar) {
        super(hVar, nVar, 2, xVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f50338s = eVar;
    }

    @Override
    public final void R1() {
        this.f50341y = true;
    }

    @Override
    public final void b() {
        boolean z10;
        if (this.f50340x == 0) {
            this.f50338s.b(this.f50339w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.n b10 = this.f50320b.b(this.f50340x);
            c0 c0Var = this.f50324r;
            c3.l lVar = new c3.l(c0Var, b10.e, c0Var.open(b10));
            while (!this.f50341y) {
                int f7 = this.f50338s.f50312a.f(lVar, e.f50311w);
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
            this.f50340x = lVar.d - this.f50320b.e;
            this.f50338s.a();
        } finally {
            l7.a(this.f50324r);
        }
    }
}
