package q4;

import g5.p;
import g5.u0;
import j3.n0;
import j7.q7;
import n7.qa;
public final class j extends e {
    public final d f44526s;
    public qa v;
    public long f44527w;
    public volatile boolean f44528x;

    public j(g5.m mVar, p pVar, n0 n0Var, int i10, Object obj, d dVar) {
        super(mVar, pVar, 2, n0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f44526s = dVar;
    }

    @Override
    public final void a() {
        boolean z4;
        if (this.f44527w == 0) {
            this.f44526s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            p b10 = this.f44505b.b(this.f44527w);
            u0 u0Var = this.f44510r;
            r3.h hVar = new r3.h(u0Var, b10.f6888e, u0Var.open(b10));
            while (!this.f44528x) {
                int h = this.f44526s.f44497a.h(hVar, d.f44496s);
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
            this.f44527w = hVar.d - this.f44505b.f6888e;
        } finally {
            q7.a(this.f44510r);
        }
    }

    @Override
    public final void l() {
        this.f44528x = true;
    }
}
