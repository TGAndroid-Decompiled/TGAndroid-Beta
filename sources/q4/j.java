package q4;

import g5.p;
import g5.u0;
import j3.n0;
import j7.p7;
import n7.qa;
public final class j extends e {
    public final d f42748s;
    public qa v;
    public long f42749w;
    public volatile boolean f42750x;

    public j(g5.m mVar, p pVar, n0 n0Var, int i10, Object obj, d dVar) {
        super(mVar, pVar, 2, n0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f42748s = dVar;
    }

    @Override
    public final void a() {
        boolean z4;
        if (this.f42749w == 0) {
            this.f42748s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            p b10 = this.f42730b.b(this.f42749w);
            u0 u0Var = this.f42734r;
            r3.h hVar = new r3.h(u0Var, b10.e, u0Var.open(b10));
            while (!this.f42750x) {
                int h = this.f42748s.f42723a.h(hVar, d.f42722s);
                boolean z10 = false;
                if (h != 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                if (h == 0) {
                    z10 = true;
                    continue;
                }
                if (!z10) {
                    break;
                }
            }
            this.f42749w = hVar.d - this.f42730b.e;
        } finally {
            p7.a(this.f42734r);
        }
    }

    @Override
    public final void r() {
        this.f42750x = true;
    }
}
