package v2;

import b2.s;
import g2.b0;
import n7.z0;
import v7.k7;
public final class j extends e {
    public final d f49193s;
    public z0 v;
    public long f49194w;
    public volatile boolean f49195x;

    public j(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, d dVar) {
        super(hVar, mVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f49193s = dVar;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f49194w == 0) {
            this.f49193s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f49172b.b(this.f49194w);
            b0 b0Var = this.f49177r;
            c3.l lVar = new c3.l(b0Var, b10.f10269e, b0Var.open(b10));
            while (!this.f49195x) {
                int m10 = this.f49193s.f49164a.m(lVar, d.f49163s);
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
            this.f49194w = lVar.d - this.f49172b.f10269e;
            c3.b0 b0Var2 = this.f49193s.f49169n;
        } finally {
            k7.a(this.f49177r);
        }
    }

    @Override
    public final void v() {
        this.f49195x = true;
    }
}
