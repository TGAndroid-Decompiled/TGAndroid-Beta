package w3;

import h3.s0;
import h3.t0;
import j3.n0;
public final class t implements h {
    public final d5.y f48688a;
    public final n0 f48689b;
    public final String f48690c;
    public m3.w d;
    public String f48691e;
    public int f48692f = 0;
    public int f48693g;
    public boolean h;
    public boolean f48694i;
    public long f48695j;
    public int f48696k;
    public long f48697l;

    public t(String str) {
        d5.y yVar = new d5.y(4);
        this.f48688a = yVar;
        yVar.f4410a[0] = -1;
        this.f48689b = new Object();
        this.f48697l = -9223372036854775807L;
        this.f48690c = str;
    }

    @Override
    public final void g(d5.y yVar) {
        boolean z10;
        boolean z11;
        d5.a.j(this.d);
        while (yVar.a() > 0) {
            int i9 = this.f48692f;
            d5.y yVar2 = this.f48688a;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        int min = Math.min(yVar.a(), this.f48696k - this.f48693g);
                        this.d.a(min, yVar);
                        int i10 = this.f48693g + min;
                        this.f48693g = i10;
                        int i11 = this.f48696k;
                        if (i10 >= i11) {
                            long j10 = this.f48697l;
                            if (j10 != -9223372036854775807L) {
                                this.d.e(j10, 1, i11, 0, null);
                                this.f48697l += this.f48695j;
                            }
                            this.f48693g = 0;
                            this.f48692f = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(yVar.a(), 4 - this.f48693g);
                    yVar.c(this.f48693g, min2, yVar2.f4410a);
                    int i12 = this.f48693g + min2;
                    this.f48693g = i12;
                    if (i12 >= 4) {
                        yVar2.C(0);
                        int e10 = yVar2.e();
                        n0 n0Var = this.f48689b;
                        if (!n0Var.a(e10)) {
                            this.f48693g = 0;
                            this.f48692f = 1;
                        } else {
                            this.f48696k = n0Var.f13294b;
                            if (!this.h) {
                                int i13 = n0Var.f13295c;
                                this.f48695j = (n0Var.f13297f * 1000000) / i13;
                                s0 s0Var = new s0();
                                s0Var.f9693a = this.f48691e;
                                s0Var.f9705o = (String) n0Var.f13298g;
                                s0Var.f9706p = 4096;
                                s0Var.B = n0Var.d;
                                s0Var.C = i13;
                                s0Var.f9695c = this.f48690c;
                                this.d.c(new t0(s0Var));
                                this.h = true;
                            }
                            yVar2.C(0);
                            this.d.a(4, yVar2);
                            this.f48692f = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = yVar.f4410a;
                int i14 = yVar.f4411b;
                int i15 = yVar.f4412c;
                while (true) {
                    if (i14 < i15) {
                        byte b10 = bArr[i14];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f48694i && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f48694i = z10;
                        if (z11) {
                            yVar.C(i14 + 1);
                            this.f48694i = false;
                            yVar2.f4410a[1] = bArr[i14];
                            this.f48693g = 2;
                            this.f48692f = 1;
                            break;
                        }
                        i14++;
                    } else {
                        yVar.C(i15);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public final void h() {
        this.f48692f = 0;
        this.f48693g = 0;
        this.f48694i = false;
        this.f48697l = -9223372036854775807L;
    }

    @Override
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f48691e = d0Var.f48528e;
        d0Var.b();
        this.d = mVar.I(d0Var.d, 1);
    }

    @Override
    public final void k(int i9, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f48697l = j10;
        }
    }

    @Override
    public final void i() {
    }
}
