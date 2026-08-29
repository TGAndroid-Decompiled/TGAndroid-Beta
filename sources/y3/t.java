package y3;

import j3.s0;
import j3.t0;
import l3.p0;
public final class t implements h {
    public final f5.w f50421a;
    public final p0 f50422b;
    public final String f50423c;
    public o3.w d;
    public String f50424e;
    public int f50425f = 0;
    public int f50426g;
    public boolean h;
    public boolean f50427i;
    public long f50428j;
    public int f50429k;
    public long f50430l;

    public t(String str) {
        f5.w wVar = new f5.w(4);
        this.f50421a = wVar;
        wVar.f6640a[0] = -1;
        this.f50422b = new Object();
        this.f50430l = -9223372036854775807L;
        this.f50423c = str;
    }

    @Override
    public final void a() {
        this.f50425f = 0;
        this.f50426g = 0;
        this.f50427i = false;
        this.f50430l = -9223372036854775807L;
    }

    @Override
    public final void c(f5.w wVar) {
        boolean z10;
        boolean z11;
        f5.a.j(this.d);
        while (wVar.a() > 0) {
            int i10 = this.f50425f;
            f5.w wVar2 = this.f50421a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(wVar.a(), this.f50429k - this.f50426g);
                        this.d.e(min, wVar);
                        int i11 = this.f50426g + min;
                        this.f50426g = i11;
                        int i12 = this.f50429k;
                        if (i11 >= i12) {
                            long j10 = this.f50430l;
                            if (j10 != -9223372036854775807L) {
                                this.d.c(j10, 1, i12, 0, null);
                                this.f50430l += this.f50428j;
                            }
                            this.f50426g = 0;
                            this.f50425f = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(wVar.a(), 4 - this.f50426g);
                    wVar.c(this.f50426g, min2, wVar2.f6640a);
                    int i13 = this.f50426g + min2;
                    this.f50426g = i13;
                    if (i13 >= 4) {
                        wVar2.C(0);
                        int e10 = wVar2.e();
                        p0 p0Var = this.f50422b;
                        if (!p0Var.a(e10)) {
                            this.f50426g = 0;
                            this.f50425f = 1;
                        } else {
                            this.f50429k = p0Var.f14154b;
                            if (!this.h) {
                                int i14 = p0Var.f14155c;
                                this.f50428j = (p0Var.f14157f * 1000000) / i14;
                                s0 s0Var = new s0();
                                s0Var.f10730a = this.f50424e;
                                s0Var.f10742o = (String) p0Var.f14158g;
                                s0Var.f10743p = 4096;
                                s0Var.B = p0Var.d;
                                s0Var.C = i14;
                                s0Var.f10732c = this.f50423c;
                                this.d.b(new t0(s0Var));
                                this.h = true;
                            }
                            wVar2.C(0);
                            this.d.e(4, wVar2);
                            this.f50425f = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = wVar.f6640a;
                int i15 = wVar.f6641b;
                int i16 = wVar.f6642c;
                while (true) {
                    if (i15 < i16) {
                        byte b10 = bArr[i15];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f50427i && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f50427i = z10;
                        if (z11) {
                            wVar.C(i15 + 1);
                            this.f50427i = false;
                            wVar2.f6640a[1] = bArr[i15];
                            this.f50426g = 2;
                            this.f50425f = 1;
                            break;
                        }
                        i15++;
                    } else {
                        wVar.C(i16);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f50424e = d0Var.f50261e;
        d0Var.b();
        this.d = mVar.Z1(d0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50430l = j10;
        }
    }

    @Override
    public final void d() {
    }
}
