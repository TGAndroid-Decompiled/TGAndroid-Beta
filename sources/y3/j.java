package y3;

import f2.f0;
public final class j implements h {
    public static final double[] f50300q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f50301a;
    public o3.w f50302b;
    public final a0 f50303c;
    public final f5.w d;
    public final f0 f50304e;
    public final boolean[] f50305f = new boolean[4];
    public final i f50306g;
    public long h;
    public boolean f50307i;
    public boolean f50308j;
    public long f50309k;
    public long f50310l;
    public long f50311m;
    public long f50312n;
    public boolean f50313o;
    public boolean f50314p;

    public j(a0 a0Var) {
        this.f50303c = a0Var;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.f50306g = obj;
        if (a0Var != null) {
            this.f50304e = new f0(178);
            this.d = new f5.w();
        } else {
            this.f50304e = null;
            this.d = null;
        }
        this.f50310l = -9223372036854775807L;
        this.f50312n = -9223372036854775807L;
    }

    @Override
    public final void a() {
        f5.a.m(this.f50305f);
        i iVar = this.f50306g;
        iVar.f50297a = false;
        iVar.f50298b = 0;
        iVar.f50299c = 0;
        f0 f0Var = this.f50304e;
        if (f0Var != null) {
            f0Var.f();
        }
        this.h = 0L;
        this.f50307i = false;
        this.f50310l = -9223372036854775807L;
        this.f50312n = -9223372036854775807L;
    }

    @Override
    public final void c(f5.w r23) {
        throw new UnsupportedOperationException("Method not decompiled: y3.j.c(f5.w):void");
    }

    @Override
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f50301a = d0Var.f50261e;
        d0Var.b();
        this.f50302b = mVar.Z1(d0Var.d, 2);
        a0 a0Var = this.f50303c;
        if (a0Var != null) {
            a0Var.b(mVar, d0Var);
        }
    }

    @Override
    public final void f(int i10, long j10) {
        this.f50310l = j10;
    }

    @Override
    public final void d() {
    }
}
