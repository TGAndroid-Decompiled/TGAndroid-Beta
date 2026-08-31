package q4;

import g5.p;
import g5.u0;
import j3.n0;
import j7.q7;
import n7.qa;
public final class j extends e {
    public final d f44495s;
    public qa v;
    public long f44496w;
    public volatile boolean f44497x;

    public j(g5.m mVar, p pVar, n0 n0Var, int i10, Object obj, d dVar) {
        super(mVar, pVar, 2, n0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f44495s = dVar;
    }

    @Override
    public final void a() {
        boolean z4;
        if (this.f44496w == 0) {
            this.f44495s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            p b10 = this.f44474b.b(this.f44496w);
            u0 u0Var = this.f44479r;
            r3.h hVar = new r3.h(u0Var, b10.f6888e, u0Var.open(b10));
            while (!this.f44497x) {
                int h = this.f44495s.f44466a.h(hVar, d.f44465s);
                boolean z10 = false;
                if (h != 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                if (h == 0) {
                    z10 = true;
                    continue;
                }
                if (!z10) {
                    break;
                }
            }
            this.f44496w = hVar.d - this.f44474b.f6888e;
        } finally {
            q7.a(this.f44479r);
        }
    }

    @Override
    public final void l() {
        this.f44497x = true;
    }
}
