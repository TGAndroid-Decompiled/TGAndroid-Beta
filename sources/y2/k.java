package y2;

import a8.ia;
import c8.p0;
import e2.u;
import j2.c0;
import sg.i0;
public final class k extends f {
    public final e f58821s;
    public i0 f58822w;
    public long f58823x;
    public volatile boolean f58824y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f58821s = eVar;
    }

    @Override
    public final void a() {
        boolean z9;
        if (this.f58823x == 0) {
            this.f58821s.b(this.f58822w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            j2.m b10 = this.f58800b.b(this.f58823x);
            c0 c0Var = this.f58805r;
            f3.l lVar = new f3.l(c0Var, b10.f16449e, c0Var.open(b10));
            while (!this.f58824y) {
                int f10 = this.f58821s.f58791a.f(lVar, e.f58790w);
                boolean z10 = false;
                if (f10 != 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ia.p(z9);
                if (f10 == 0) {
                    z10 = true;
                    continue;
                }
                if (!z10) {
                    break;
                }
            }
            this.f58823x = lVar.d - this.f58800b.f16449e;
            this.f58821s.a();
        } finally {
            p0.a(this.f58805r);
        }
    }

    @Override
    public final void q0() {
        this.f58824y = true;
    }
}
