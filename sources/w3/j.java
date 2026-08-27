package w3;

import f2.g0;

public final class j implements h {

    public static final double[] f49073q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    public String f49074a;

    public m3.w f49075b;

    public final a0 f49076c;
    public final d5.z d;

    public final g0 f49077e;

    public final boolean[] f49078f = new boolean[4];

    public final i f49079g;
    public long h;

    public boolean f49080i;

    public boolean f49081j;

    public long f49082k;

    public long f49083l;

    public long f49084m;

    public long f49085n;

    public boolean f49086o;

    public boolean f49087p;

    public j(a0 a0Var) {
        this.f49076c = a0Var;
        i iVar = new i();
        iVar.d = new byte[128];
        this.f49079g = iVar;
        if (a0Var != null) {
            this.f49077e = new g0(178);
            this.d = new d5.z();
        } else {
            this.f49077e = null;
            this.d = null;
        }
        this.f49083l = -9223372036854775807L;
        this.f49085n = -9223372036854775807L;
    }

    @Override
    public final void b(d5.z r23) {
        throw new UnsupportedOperationException("Method not decompiled: w3.j.b(d5.z):void");
    }

    @Override
    public final void c() {
        d5.a.m(this.f49078f);
        i iVar = this.f49079g;
        iVar.f49070a = false;
        iVar.f49071b = 0;
        iVar.f49072c = 0;
        g0 g0Var = this.f49077e;
        if (g0Var != null) {
            g0Var.f();
        }
        this.h = 0L;
        this.f49080i = false;
        this.f49083l = -9223372036854775807L;
        this.f49085n = -9223372036854775807L;
    }

    @Override
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f49074a = e0Var.f49053e;
        e0Var.b();
        this.f49075b = mVar.C(e0Var.d, 2);
        a0 a0Var = this.f49076c;
        if (a0Var != null) {
            a0Var.b(mVar, e0Var);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f49083l = j10;
    }

    @Override
    public final void d() {
    }
}
