package x2;

import b8.uc;
import b8.zb;
import d2.v;
import i2.c0;
public final class k extends f {
    public final e f58170s;
    public ua.b f58171w;
    public long f58172x;
    public volatile boolean f58173y;

    public k(i2.h hVar, i2.n nVar, v vVar, int i3, Object obj, e eVar) {
        super(hVar, nVar, 2, vVar, i3, obj, -9223372036854775807L, -9223372036854775807L);
        this.f58170s = eVar;
    }

    @Override
    public final void X1() {
        this.f58173y = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f58172x == 0) {
            this.f58170s.b(this.f58171w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            i2.n b10 = this.f58149b.b(this.f58172x);
            c0 c0Var = this.f58154r;
            e3.l lVar = new e3.l(c0Var, b10.f14567e, c0Var.open(b10));
            while (!this.f58173y) {
                int f10 = this.f58170s.f58140a.f(lVar, e.f58139w);
                boolean z11 = false;
                if (f10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zb.p(z10);
                if (f10 == 0) {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.f58172x = lVar.d - this.f58149b.f14567e;
            this.f58170s.a();
        } finally {
            uc.a(this.f58154r);
        }
    }
}
