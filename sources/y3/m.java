package y3;

import f2.f0;
public final class m implements h {
    public static final float[] f50326l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final a0 f50327a;
    public final f5.w f50328b;
    public final boolean[] f50329c = new boolean[4];
    public final k d;
    public final f0 f50330e;
    public l f50331f;
    public long f50332g;
    public String h;
    public o3.w f50333i;
    public boolean f50334j;
    public long f50335k;

    public m(a0 a0Var) {
        this.f50327a = a0Var;
        ?? obj = new Object();
        obj.f50319e = new byte[128];
        this.d = obj;
        this.f50335k = -9223372036854775807L;
        this.f50330e = new f0(178);
        this.f50328b = new f5.w();
    }

    @Override
    public final void a() {
        f5.a.m(this.f50329c);
        k kVar = this.d;
        kVar.f50316a = false;
        kVar.f50318c = 0;
        kVar.f50317b = 0;
        l lVar = this.f50331f;
        if (lVar != null) {
            lVar.f50321b = false;
            lVar.f50322c = false;
            lVar.d = false;
            lVar.f50323e = -1;
        }
        f0 f0Var = this.f50330e;
        if (f0Var != null) {
            f0Var.f();
        }
        this.f50332g = 0L;
        this.f50335k = -9223372036854775807L;
    }

    @Override
    public final void c(f5.w r26) {
        throw new UnsupportedOperationException("Method not decompiled: y3.m.c(f5.w):void");
    }

    @Override
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.h = d0Var.f50261e;
        d0Var.b();
        o3.w Z1 = mVar.Z1(d0Var.d, 2);
        this.f50333i = Z1;
        this.f50331f = new l(Z1);
        this.f50327a.b(mVar, d0Var);
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50335k = j10;
        }
    }

    @Override
    public final void d() {
    }
}
