package y3;

import j3.t0;
public final class b implements h {
    public final int f50216a;
    public final f5.v f50217b;
    public final f5.w f50218c;
    public final String d;
    public String f50219e;
    public o3.w f50220f;
    public int f50221g;
    public int h;
    public boolean f50222i;
    public long f50223j;
    public t0 f50224k;
    public int f50225l;
    public long f50226m;

    public b(String str, int i10) {
        this.f50216a = i10;
        switch (i10) {
            case 1:
                f5.v vVar = new f5.v(new byte[16], 16);
                this.f50217b = vVar;
                this.f50218c = new f5.w(vVar.f6635b);
                this.f50221g = 0;
                this.h = 0;
                this.f50222i = false;
                this.f50226m = -9223372036854775807L;
                this.d = str;
                return;
            default:
                f5.v vVar2 = new f5.v(new byte[128], 128);
                this.f50217b = vVar2;
                this.f50218c = new f5.w(vVar2.f6635b);
                this.f50221g = 0;
                this.f50226m = -9223372036854775807L;
                this.d = str;
                return;
        }
    }

    @Override
    public final void a() {
        switch (this.f50216a) {
            case 0:
                this.f50221g = 0;
                this.h = 0;
                this.f50222i = false;
                this.f50226m = -9223372036854775807L;
                return;
            default:
                this.f50221g = 0;
                this.h = 0;
                this.f50222i = false;
                this.f50226m = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void c(f5.w r23) {
        throw new UnsupportedOperationException("Method not decompiled: y3.b.c(f5.w):void");
    }

    @Override
    public final void d() {
        int i10 = this.f50216a;
    }

    @Override
    public final void e(o3.m mVar, d0 d0Var) {
        switch (this.f50216a) {
            case 0:
                d0Var.a();
                d0Var.b();
                this.f50219e = d0Var.f50261e;
                d0Var.b();
                this.f50220f = mVar.Z1(d0Var.d, 1);
                return;
            default:
                d0Var.a();
                d0Var.b();
                this.f50219e = d0Var.f50261e;
                d0Var.b();
                this.f50220f = mVar.Z1(d0Var.d, 1);
                return;
        }
    }

    @Override
    public final void f(int i10, long j10) {
        switch (this.f50216a) {
            case 0:
                if (j10 != -9223372036854775807L) {
                    this.f50226m = j10;
                    return;
                }
                return;
            default:
                if (j10 != -9223372036854775807L) {
                    this.f50226m = j10;
                    return;
                }
                return;
        }
    }

    private final void b() {
    }

    private final void g() {
    }
}
