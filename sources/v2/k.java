package v2;

import b2.w;
import g2.b0;
import v7.k7;
import v7.u6;
public final class k extends f {
    public final e f48351s;
    public n2.e v;
    public long f48352w;
    public volatile boolean f48353x;

    public k(g2.h hVar, g2.m mVar, w wVar, int i10, Object obj, e eVar) {
        super(hVar, mVar, 2, wVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f48351s = eVar;
    }

    @Override
    public final void O() {
        this.f48353x = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f48352w == 0) {
            this.f48351s.b(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f48333b.b(this.f48352w);
            b0 b0Var = this.f48337r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.f48353x) {
                int f7 = this.f48351s.f48325a.f(lVar, e.v);
                boolean z11 = false;
                if (f7 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
                if (f7 == 0) {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.f48352w = lVar.d - this.f48333b.e;
            this.f48351s.a();
        } finally {
            k7.a(this.f48337r);
        }
    }
}
