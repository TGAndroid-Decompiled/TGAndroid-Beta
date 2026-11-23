package y2;

import a8.la;
import c8.s0;
import e2.u;
import j2.b0;
import sg.h0;
public final class k extends f {
    public final e f60748s;
    public h0 f60749w;
    public long f60750x;
    public volatile boolean f60751y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f60748s = eVar;
    }

    @Override
    public final void A() {
        this.f60751y = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f60750x == 0) {
            this.f60748s.b(this.f60749w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            j2.m b10 = this.f60727b.b(this.f60750x);
            b0 b0Var = this.f60732r;
            f3.l lVar = new f3.l(b0Var, b10.f17216e, b0Var.open(b10));
            while (!this.f60751y) {
                int f10 = this.f60748s.f60718a.f(lVar, e.f60717w);
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
            this.f60750x = lVar.d - this.f60727b.f17216e;
            this.f60748s.a();
        } finally {
            s0.a(this.f60732r);
        }
    }
}
