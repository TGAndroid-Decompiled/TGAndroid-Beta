package w3;

import f2.i0;
public final class j implements h {
    public static final double[] f48567q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f48568a;
    public m3.w f48569b;
    public final a0 f48570c;
    public final d5.y d;
    public final i0 f48571e;
    public final boolean[] f48572f = new boolean[4];
    public final i f48573g;
    public long h;
    public boolean f48574i;
    public boolean f48575j;
    public long f48576k;
    public long f48577l;
    public long f48578m;
    public long f48579n;
    public boolean f48580o;
    public boolean f48581p;

    public j(a0 a0Var) {
        this.f48570c = a0Var;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.f48573g = obj;
        if (a0Var != null) {
            this.f48571e = new i0(178);
            this.d = new d5.y();
        } else {
            this.f48571e = null;
            this.d = null;
        }
        this.f48577l = -9223372036854775807L;
        this.f48579n = -9223372036854775807L;
    }

    @Override
    public final void g(d5.y r23) {
        throw new UnsupportedOperationException("Method not decompiled: w3.j.g(d5.y):void");
    }

    @Override
    public final void h() {
        d5.a.m(this.f48572f);
        i iVar = this.f48573g;
        iVar.f48564a = false;
        iVar.f48565b = 0;
        iVar.f48566c = 0;
        i0 i0Var = this.f48571e;
        if (i0Var != null) {
            i0Var.f();
        }
        this.h = 0L;
        this.f48574i = false;
        this.f48577l = -9223372036854775807L;
        this.f48579n = -9223372036854775807L;
    }

    @Override
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f48568a = d0Var.f48528e;
        d0Var.b();
        this.f48569b = mVar.I(d0Var.d, 2);
        a0 a0Var = this.f48570c;
        if (a0Var != null) {
            a0Var.b(mVar, d0Var);
        }
    }

    @Override
    public final void k(int i9, long j10) {
        this.f48577l = j10;
    }

    @Override
    public final void i() {
    }
}
