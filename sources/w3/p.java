package w3;

import f2.i0;
public final class p implements h {
    public final a0 f48633a;
    public final boolean f48634b;
    public final boolean f48635c;
    public long f48638g;
    public String f48639i;
    public m3.w f48640j;
    public o f48641k;
    public boolean f48642l;
    public boolean f48644n;
    public final boolean[] h = new boolean[3];
    public final i0 d = new i0(7);
    public final i0 f48636e = new i0(8);
    public final i0 f48637f = new i0(6);
    public long f48643m = -9223372036854775807L;
    public final d5.y f48645o = new d5.y();

    public p(a0 a0Var, boolean z10, boolean z11) {
        this.f48633a = a0Var;
        this.f48634b = z10;
        this.f48635c = z11;
    }

    public final void a(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: w3.p.a(int, int, byte[]):void");
    }

    @Override
    public final void g(d5.y r32) {
        throw new UnsupportedOperationException("Method not decompiled: w3.p.g(d5.y):void");
    }

    @Override
    public final void h() {
        this.f48638g = 0L;
        this.f48644n = false;
        this.f48643m = -9223372036854775807L;
        d5.a.m(this.h);
        this.d.f();
        this.f48636e.f();
        this.f48637f.f();
        o oVar = this.f48641k;
        if (oVar != null) {
            oVar.f48625k = false;
            oVar.f48629o = false;
            n nVar = oVar.f48628n;
            nVar.f48604b = false;
            nVar.f48603a = false;
        }
    }

    @Override
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f48639i = d0Var.f48528e;
        d0Var.b();
        m3.w I = mVar.I(d0Var.d, 2);
        this.f48640j = I;
        this.f48641k = new o(I, this.f48634b, this.f48635c);
        this.f48633a.b(mVar, d0Var);
    }

    @Override
    public final void k(int i9, long j10) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            this.f48643m = j10;
        }
        boolean z11 = this.f48644n;
        if ((i9 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48644n = z10 | z11;
    }

    @Override
    public final void i() {
    }
}
