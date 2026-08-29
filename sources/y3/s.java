package y3;

import j3.t0;
public final class s implements h {
    public final String f50402a;
    public final f5.w f50403b;
    public final f5.v f50404c;
    public o3.w d;
    public String f50405e;
    public t0 f50406f;
    public int f50407g;
    public int h;
    public int f50408i;
    public int f50409j;
    public long f50410k;
    public boolean f50411l;
    public int f50412m;
    public int f50413n;
    public int f50414o;
    public boolean f50415p;
    public long f50416q;
    public int f50417r;
    public long f50418s;
    public int f50419t;
    public String f50420u;

    public s(String str) {
        this.f50402a = str;
        f5.w wVar = new f5.w(1024);
        this.f50403b = wVar;
        byte[] bArr = wVar.f6640a;
        this.f50404c = new f5.v(bArr, bArr.length);
        this.f50410k = -9223372036854775807L;
    }

    @Override
    public final void a() {
        this.f50407g = 0;
        this.f50410k = -9223372036854775807L;
        this.f50411l = false;
    }

    @Override
    public final void c(f5.w r24) {
        throw new UnsupportedOperationException("Method not decompiled: y3.s.c(f5.w):void");
    }

    @Override
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.d = mVar.Z1(d0Var.d, 1);
        d0Var.b();
        this.f50405e = d0Var.f50261e;
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50410k = j10;
        }
    }

    @Override
    public final void d() {
    }
}
