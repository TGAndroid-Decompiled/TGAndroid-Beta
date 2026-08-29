package y3;

import f2.f0;
public final class p implements h {
    public final a0 f50366a;
    public final boolean f50367b;
    public final boolean f50368c;
    public long f50371g;
    public String f50372i;
    public o3.w f50373j;
    public o f50374k;
    public boolean f50375l;
    public boolean f50377n;
    public final boolean[] h = new boolean[3];
    public final f0 d = new f0(7);
    public final f0 f50369e = new f0(8);
    public final f0 f50370f = new f0(6);
    public long f50376m = -9223372036854775807L;
    public final f5.w f50378o = new f5.w();

    public p(a0 a0Var, boolean z10, boolean z11) {
        this.f50366a = a0Var;
        this.f50367b = z10;
        this.f50368c = z11;
    }

    @Override
    public final void a() {
        this.f50371g = 0L;
        this.f50377n = false;
        this.f50376m = -9223372036854775807L;
        f5.a.m(this.h);
        this.d.f();
        this.f50369e.f();
        this.f50370f.f();
        o oVar = this.f50374k;
        if (oVar != null) {
            oVar.f50358k = false;
            oVar.f50362o = false;
            n nVar = oVar.f50361n;
            nVar.f50337b = false;
            nVar.f50336a = false;
        }
    }

    public final void b(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: y3.p.b(int, int, byte[]):void");
    }

    @Override
    public final void c(f5.w r32) {
        throw new UnsupportedOperationException("Method not decompiled: y3.p.c(f5.w):void");
    }

    @Override
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f50372i = d0Var.f50261e;
        d0Var.b();
        o3.w Z1 = mVar.Z1(d0Var.d, 2);
        this.f50373j = Z1;
        this.f50374k = new o(Z1, this.f50367b, this.f50368c);
        this.f50366a.b(mVar, d0Var);
    }

    @Override
    public final void f(int i10, long j10) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            this.f50376m = j10;
        }
        boolean z11 = this.f50377n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50377n = z10 | z11;
    }

    @Override
    public final void d() {
    }
}
