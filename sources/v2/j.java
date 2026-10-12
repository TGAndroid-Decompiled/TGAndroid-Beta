package v2;

import b2.s;
import g2.b0;
import n7.z0;
import v7.k7;
public final class j extends e {
    public final d f49300s;
    public z0 v;
    public long f49301w;
    public volatile boolean f49302x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f49300s = dVar;
    }

    @Override
    public final void C() {
        this.f49302x = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f49301w == 0) {
            this.f49300s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f49279b.b(this.f49301w);
            b0 b0Var = this.f49284r;
            c3.l lVar = new c3.l(b0Var, b10.f10268e, b0Var.open(b10));
            while (!this.f49302x) {
                int m10 = this.f49300s.f49271a.m(lVar, d.f49270s);
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
            this.f49301w = lVar.d - this.f49279b.f10268e;
            c3.b0 b0Var2 = this.f49300s.f49276n;
        } finally {
            k7.a(this.f49284r);
        }
    }
}
