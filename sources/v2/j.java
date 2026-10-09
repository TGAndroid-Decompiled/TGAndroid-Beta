package v2;

import b2.s;
import g2.b0;
import org.telegram.ui.ActionBar.b5;
import v7.k7;
public final class j extends e {
    public final d f49072s;
    public b5 v;
    public long f49073w;
    public volatile boolean f49074x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f49072s = dVar;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f49073w == 0) {
            this.f49072s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f49051b.b(this.f49073w);
            b0 b0Var = this.f49056r;
            c3.l lVar = new c3.l(b0Var, b10.f10270e, b0Var.open(b10));
            while (!this.f49074x) {
                int m10 = this.f49072s.f49043a.m(lVar, d.f49042s);
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
            this.f49073w = lVar.d - this.f49051b.f10270e;
            c3.b0 b0Var2 = this.f49072s.f49048n;
        } finally {
            k7.a(this.f49056r);
        }
    }

    @Override
    public final void v() {
        this.f49074x = true;
    }
}
