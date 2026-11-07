package y2;

import a8.ia;
import c8.p0;
import e2.u;
import j2.c0;
import sg.i0;
public final class k extends f {
    public final e f58827s;
    public i0 f58828w;
    public long f58829x;
    public volatile boolean f58830y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f58827s = eVar;
    }

    @Override
    public final void a() {
        boolean z9;
        if (this.f58829x == 0) {
            this.f58827s.b(this.f58828w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            j2.m b10 = this.f58806b.b(this.f58829x);
            c0 c0Var = this.f58811r;
            f3.l lVar = new f3.l(c0Var, b10.f16449e, c0Var.open(b10));
            while (!this.f58830y) {
                int f10 = this.f58827s.f58797a.f(lVar, e.f58796w);
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
            this.f58829x = lVar.d - this.f58806b.f16449e;
            this.f58827s.a();
        } finally {
            p0.a(this.f58811r);
        }
    }

    @Override
    public final void q0() {
        this.f58830y = true;
    }
}
