package v2;

import b2.x;
import g2.b0;
import n6.o;
import v7.k7;
import v7.u6;
public final class k extends f {
    public final e f46517s;
    public o v;
    public long f46518w;
    public volatile boolean f46519x;

    public k(g2.h hVar, g2.m mVar, x xVar, int i10, Object obj, e eVar) {
        super(hVar, mVar, 2, xVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f46517s = eVar;
    }

    @Override
    public final void J() {
        this.f46519x = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f46518w == 0) {
            this.f46517s.b(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g2.m b10 = this.f46499b.b(this.f46518w);
            b0 b0Var = this.f46503r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.f46519x) {
                int f7 = this.f46517s.f46491a.f(lVar, e.v);
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
            this.f46518w = lVar.d - this.f46499b.e;
            this.f46517s.a();
        } finally {
            k7.a(this.f46503r);
        }
    }
}
