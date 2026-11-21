package y2;

import a8.la;
import c8.s0;
import e2.u;
import j2.b0;
import sg.h0;
public final class k extends f {
    public final e f60744s;
    public h0 f60745w;
    public long f60746x;
    public volatile boolean f60747y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f60744s = eVar;
    }

    @Override
    public final void A() {
        this.f60747y = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f60746x == 0) {
            this.f60744s.b(this.f60745w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            j2.m b10 = this.f60723b.b(this.f60746x);
            b0 b0Var = this.f60728r;
            f3.l lVar = new f3.l(b0Var, b10.f17213e, b0Var.open(b10));
            while (!this.f60747y) {
                int f10 = this.f60744s.f60714a.f(lVar, e.f60713w);
                boolean z11 = false;
                if (f10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                la.p(z10);
                if (f10 == 0) {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.f60746x = lVar.d - this.f60723b.f17213e;
            this.f60744s.a();
        } finally {
            s0.a(this.f60728r);
        }
    }
}
