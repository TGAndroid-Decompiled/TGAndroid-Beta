package v2;

import b2.s;
import g2.b0;
import org.telegram.ui.ActionBar.b5;
import v7.k7;
public final class j extends e {
    public final d f49116s;
    public b5 v;
    public long f49117w;
    public volatile boolean f49118x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f49116s = dVar;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f49117w == 0) {
            this.f49116s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f49095b.b(this.f49117w);
            b0 b0Var = this.f49100r;
            c3.l lVar = new c3.l(b0Var, b10.f10270e, b0Var.open(b10));
            while (!this.f49118x) {
                int m10 = this.f49116s.f49087a.m(lVar, d.f49086s);
                boolean z11 = false;
                if (m10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (m10 == 0) {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.f49117w = lVar.d - this.f49095b.f10270e;
            c3.b0 b0Var2 = this.f49116s.f49092n;
        } finally {
            k7.a(this.f49100r);
        }
    }

    @Override
    public final void v() {
        this.f49118x = true;
    }
}
