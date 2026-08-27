package w3;

import h3.s0;
import h3.t0;
import j3.o0;

public final class t implements h {

    public final d5.z f49194a;

    public final o0 f49195b;

    public final String f49196c;
    public m3.w d;

    public String f49197e;

    public int f49198f = 0;

    public int f49199g;
    public boolean h;

    public boolean f49200i;

    public long f49201j;

    public int f49202k;

    public long f49203l;

    public t(String str) {
        d5.z zVar = new d5.z(4);
        this.f49194a = zVar;
        zVar.f4858a[0] = -1;
        this.f49195b = new o0();
        this.f49203l = -9223372036854775807L;
        this.f49196c = str;
    }

    @Override
    public final void b(d5.z zVar) {
        d5.a.j(this.d);
        while (zVar.a() > 0) {
            int i10 = this.f49198f;
            d5.z zVar2 = this.f49194a;
            if (i10 == 0) {
                byte[] bArr = zVar.f4858a;
                int i11 = zVar.f4859b;
                int i12 = zVar.f4860c;
                while (true) {
                    if (i11 >= i12) {
                        zVar.C(i12);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f49200i && (b10 & 224) == 224;
                    this.f49200i = z10;
                    if (z11) {
                        zVar.C(i11 + 1);
                        this.f49200i = false;
                        zVar2.f4858a[1] = bArr[i11];
                        this.f49199g = 2;
                        this.f49198f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int iMin = Math.min(zVar.a(), 4 - this.f49199g);
                zVar.c(this.f49199g, iMin, zVar2.f4858a);
                int i13 = this.f49199g + iMin;
                this.f49199g = i13;
                if (i13 >= 4) {
                    zVar2.C(0);
                    int iE = zVar2.e();
                    o0 o0Var = this.f49195b;
                    if (o0Var.a(iE)) {
                        this.f49202k = o0Var.f12394b;
                        if (!this.h) {
                            long j10 = ((long) o0Var.f12397f) * 1000000;
                            int i14 = o0Var.f12395c;
                            this.f49201j = j10 / ((long) i14);
                            s0 s0Var = new s0();
                            s0Var.f8123a = this.f49197e;
                            s0Var.f8135o = (String) o0Var.f12398g;
                            s0Var.f8136p = 4096;
                            s0Var.B = o0Var.d;
                            s0Var.C = i14;
                            s0Var.f8125c = this.f49196c;
                            this.d.c(new t0(s0Var));
                            this.h = true;
                        }
                        zVar2.C(0);
                        this.d.a(4, zVar2);
                        this.f49198f = 2;
                    } else {
                        this.f49199g = 0;
                        this.f49198f = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(zVar.a(), this.f49202k - this.f49199g);
                this.d.a(iMin2, zVar);
                int i15 = this.f49199g + iMin2;
                this.f49199g = i15;
                int i16 = this.f49202k;
                if (i15 >= i16) {
                    long j11 = this.f49203l;
                    if (j11 != -9223372036854775807L) {
                        this.d.e(j11, 1, i16, 0, null);
                        this.f49203l += this.f49201j;
                    }
                    this.f49199g = 0;
                    this.f49198f = 0;
                }
            }
        }
    }

    @Override
    public final void c() {
        this.f49198f = 0;
        this.f49199g = 0;
        this.f49200i = false;
        this.f49203l = -9223372036854775807L;
    }

    @Override
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f49197e = e0Var.f49053e;
        e0Var.b();
        this.d = mVar.C(e0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f49203l = j10;
        }
    }

    @Override
    public final void d() {
    }
}
