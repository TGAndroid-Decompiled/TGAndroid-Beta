package w3;

import h3.t0;
public final class b implements h {
    public final int f48483a;
    public final d5.x f48484b;
    public final d5.y f48485c;
    public final String d;
    public String f48486e;
    public m3.w f48487f;
    public int f48488g;
    public int h;
    public boolean f48489i;
    public long f48490j;
    public t0 f48491k;
    public int f48492l;
    public long f48493m;

    public b(String str, int i9) {
        this.f48483a = i9;
        switch (i9) {
            case 1:
                d5.x xVar = new d5.x(new byte[16], 16);
                this.f48484b = xVar;
                this.f48485c = new d5.y(xVar.f4405b);
                this.f48488g = 0;
                this.h = 0;
                this.f48489i = false;
                this.f48493m = -9223372036854775807L;
                this.d = str;
                return;
            default:
                d5.x xVar2 = new d5.x(new byte[128], 128);
                this.f48484b = xVar2;
                this.f48485c = new d5.y(xVar2.f4405b);
                this.f48488g = 0;
                this.f48493m = -9223372036854775807L;
                this.d = str;
                return;
        }
    }

    @Override
    public final void g(d5.y r23) {
        throw new UnsupportedOperationException("Method not decompiled: w3.b.g(d5.y):void");
    }

    @Override
    public final void h() {
        switch (this.f48483a) {
            case 0:
                this.f48488g = 0;
                this.h = 0;
                this.f48489i = false;
                this.f48493m = -9223372036854775807L;
                return;
            default:
                this.f48488g = 0;
                this.h = 0;
                this.f48489i = false;
                this.f48493m = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void i() {
        int i9 = this.f48483a;
    }

    @Override
    public final void j(m3.m mVar, d0 d0Var) {
        switch (this.f48483a) {
            case 0:
                d0Var.a();
                d0Var.b();
                this.f48486e = d0Var.f48528e;
                d0Var.b();
                this.f48487f = mVar.I(d0Var.d, 1);
                return;
            default:
                d0Var.a();
                d0Var.b();
                this.f48486e = d0Var.f48528e;
                d0Var.b();
                this.f48487f = mVar.I(d0Var.d, 1);
                return;
        }
    }

    @Override
    public final void k(int i9, long j10) {
        switch (this.f48483a) {
            case 0:
                if (j10 != -9223372036854775807L) {
                    this.f48493m = j10;
                    return;
                }
                return;
            default:
                if (j10 != -9223372036854775807L) {
                    this.f48493m = j10;
                    return;
                }
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
