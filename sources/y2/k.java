package y2;

import a8.ma;
import c8.t0;
import e2.u;
import j2.b0;
import sg.h0;
public final class k extends f {
    public final e f60713s;
    public h0 f60714w;
    public long f60715x;
    public volatile boolean f60716y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f60713s = eVar;
    }

    @Override
    public final void A() {
        this.f60716y = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f60715x == 0) {
            this.f60713s.b(this.f60714w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            j2.m b10 = this.f60692b.b(this.f60715x);
            b0 b0Var = this.f60697r;
            f3.l lVar = new f3.l(b0Var, b10.f17182e, b0Var.open(b10));
            while (!this.f60716y) {
                int f10 = this.f60713s.f60683a.f(lVar, e.f60682w);
                boolean z11 = false;
                if (f10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ma.p(z10);
                if (f10 == 0) {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.f60715x = lVar.d - this.f60692b.f17182e;
            this.f60713s.a();
        } finally {
            t0.a(this.f60697r);
        }
    }
}
