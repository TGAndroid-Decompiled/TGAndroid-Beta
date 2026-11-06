package y2;

import a8.ia;
import c8.p0;
import e2.u;
import j2.c0;
import sg.i0;
public final class k extends f {
    public final e f58822s;
    public i0 f58823w;
    public long f58824x;
    public volatile boolean f58825y;

    public k(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, e eVar) {
        super(hVar, mVar, 2, uVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f58822s = eVar;
    }

    @Override
    public final void a() {
        boolean z9;
        if (this.f58824x == 0) {
            this.f58822s.b(this.f58823w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            j2.m b10 = this.f58801b.b(this.f58824x);
            c0 c0Var = this.f58806r;
            f3.l lVar = new f3.l(c0Var, b10.f16449e, c0Var.open(b10));
            while (!this.f58825y) {
                int f10 = this.f58822s.f58792a.f(lVar, e.f58791w);
                boolean z10 = false;
                if (f10 != 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ia.p(z9);
                if (f10 == 0) {
                    z10 = true;
                    continue;
                }
                if (!z10) {
                    break;
                }
            }
            this.f58824x = lVar.d - this.f58801b.f16449e;
            this.f58822s.a();
        } finally {
            p0.a(this.f58806r);
        }
    }

    @Override
    public final void q0() {
        this.f58825y = true;
    }
}
