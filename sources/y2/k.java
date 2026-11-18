package y2;

import a8.la;
import c8.s0;
import e2.u;
import j2.b0;
import sg.h0;
public final class k extends f {
    public final e f60703s;
    public h0 f60704w;
    public long f60705x;
    public volatile boolean f60706y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f60703s = eVar;
    }

    @Override
    public final void A() {
        this.f60706y = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f60705x == 0) {
            this.f60703s.b(this.f60704w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            j2.m b10 = this.f60682b.b(this.f60705x);
            b0 b0Var = this.f60687r;
            f3.l lVar = new f3.l(b0Var, b10.f17188e, b0Var.open(b10));
            while (!this.f60706y) {
                int f10 = this.f60703s.f60673a.f(lVar, e.f60672w);
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
            this.f60705x = lVar.d - this.f60682b.f17188e;
            this.f60703s.a();
        } finally {
            s0.a(this.f60687r);
        }
    }
}
