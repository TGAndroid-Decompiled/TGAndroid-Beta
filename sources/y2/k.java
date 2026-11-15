package y2;

import a8.ja;
import c8.q0;
import e2.u;
import j2.b0;
import sg.h0;
public final class k extends f {
    public final e f60137s;
    public h0 f60138w;
    public long f60139x;
    public volatile boolean f60140y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f60137s = eVar;
    }

    @Override
    public final void D() {
        this.f60140y = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f60139x == 0) {
            this.f60137s.b(this.f60138w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            j2.m b10 = this.f60116b.b(this.f60139x);
            b0 b0Var = this.f60121r;
            f3.l lVar = new f3.l(b0Var, b10.f16806e, b0Var.open(b10));
            while (!this.f60140y) {
                int f10 = this.f60137s.f60107a.f(lVar, e.f60106w);
                boolean z11 = false;
                if (f10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ja.p(z10);
                if (f10 == 0) {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.f60139x = lVar.d - this.f60116b.f16806e;
            this.f60137s.a();
        } finally {
            q0.a(this.f60121r);
        }
    }
}
