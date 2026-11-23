package y2;

import a8.ma;
import c8.t0;
import e2.u;
import j2.b0;
public final class k extends f {
    public final e f60831s;
    public s2.e f60832w;
    public long f60833x;
    public volatile boolean f60834y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f60831s = eVar;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f60833x == 0) {
            this.f60831s.b(this.f60832w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            j2.m b10 = this.f60810b.b(this.f60833x);
            b0 b0Var = this.f60815r;
            f3.l lVar = new f3.l(b0Var, b10.f17279e, b0Var.open(b10));
            while (!this.f60834y) {
                int f10 = this.f60831s.f60801a.f(lVar, e.f60800w);
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
            this.f60833x = lVar.d - this.f60810b.f17279e;
            this.f60831s.a();
        } finally {
            t0.a(this.f60815r);
        }
    }

    @Override
    public final void y() {
        this.f60834y = true;
    }
}
