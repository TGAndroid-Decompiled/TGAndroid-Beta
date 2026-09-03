package q4;

import g5.p;
import g5.u0;
import j3.n0;
import j7.p7;
import n7.qa;
public final class j extends e {
    public final d f42778s;
    public qa v;
    public long f42779w;
    public volatile boolean f42780x;

    public j(g5.m mVar, p pVar, n0 n0Var, int i10, Object obj, d dVar) {
        super(mVar, pVar, 2, n0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f42778s = dVar;
    }

    @Override
    public final void a() {
        boolean z4;
        if (this.f42779w == 0) {
            this.f42778s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            p b10 = this.f42760b.b(this.f42779w);
            u0 u0Var = this.f42764r;
            r3.h hVar = new r3.h(u0Var, b10.e, u0Var.open(b10));
            while (!this.f42780x) {
                int h = this.f42778s.f42753a.h(hVar, d.f42752s);
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
            this.f42779w = hVar.d - this.f42760b.e;
        } finally {
            p7.a(this.f42764r);
        }
    }

    @Override
    public final void b() {
        this.f42780x = true;
    }
}
