package w3;

import f2.i0;
public final class m implements h {
    public static final float[] f48593l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final a0 f48594a;
    public final d5.y f48595b;
    public final boolean[] f48596c = new boolean[4];
    public final k d;
    public final i0 f48597e;
    public l f48598f;
    public long f48599g;
    public String h;
    public m3.w f48600i;
    public boolean f48601j;
    public long f48602k;

    public m(a0 a0Var) {
        this.f48594a = a0Var;
        ?? obj = new Object();
        obj.f48586e = new byte[128];
        this.d = obj;
        this.f48602k = -9223372036854775807L;
        this.f48597e = new i0(178);
        this.f48595b = new d5.y();
    }

    @Override
    public final void g(d5.y r26) {
        throw new UnsupportedOperationException("Method not decompiled: w3.m.g(d5.y):void");
    }

    @Override
    public final void h() {
        d5.a.m(this.f48596c);
        k kVar = this.d;
        kVar.f48583a = false;
        kVar.f48585c = 0;
        kVar.f48584b = 0;
        l lVar = this.f48598f;
        if (lVar != null) {
            lVar.f48588b = false;
            lVar.f48589c = false;
            lVar.d = false;
            lVar.f48590e = -1;
        }
        i0 i0Var = this.f48597e;
        if (i0Var != null) {
            i0Var.f();
        }
        this.f48599g = 0L;
        this.f48602k = -9223372036854775807L;
    }

    @Override
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.h = d0Var.f48528e;
        d0Var.b();
        m3.w I = mVar.I(d0Var.d, 2);
        this.f48600i = I;
        this.f48598f = new l(I);
        this.f48594a.b(mVar, d0Var);
    }

    @Override
    public final void k(int i9, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f48602k = j10;
        }
    }

    @Override
    public final void i() {
    }
}
