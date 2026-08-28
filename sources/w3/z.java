package w3;

import d5.f0;
public final class z implements e0 {
    public final y f48730a;
    public final d5.y f48731b = new d5.y(32);
    public int f48732c;
    public int d;
    public boolean f48733e;
    public boolean f48734f;

    public z(y yVar) {
        this.f48730a = yVar;
    }

    @Override
    public final void a(int i9, d5.y yVar) {
        boolean z10;
        int i10;
        boolean z11;
        if ((i9 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = yVar.f4411b + yVar.r();
        } else {
            i10 = -1;
        }
        if (this.f48734f) {
            if (z10) {
                this.f48734f = false;
                yVar.C(i10);
                this.d = 0;
            } else {
                return;
            }
        }
        while (yVar.a() > 0) {
            int i11 = this.d;
            d5.y yVar2 = this.f48731b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int r10 = yVar.r();
                    yVar.C(yVar.f4411b - 1);
                    if (r10 == 255) {
                        this.f48734f = true;
                        return;
                    }
                }
                int min = Math.min(yVar.a(), 3 - this.d);
                yVar.c(this.d, min, yVar2.f4410a);
                int i12 = this.d + min;
                this.d = i12;
                if (i12 == 3) {
                    yVar2.C(0);
                    yVar2.B(3);
                    yVar2.D(1);
                    int r11 = yVar2.r();
                    int r12 = yVar2.r();
                    if ((r11 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f48733e = z11;
                    int i13 = (((r11 & 15) << 8) | r12) + 3;
                    this.f48732c = i13;
                    byte[] bArr = yVar2.f4410a;
                    if (bArr.length < i13) {
                        yVar2.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(yVar.a(), this.f48732c - this.d);
                yVar.c(this.d, min2, yVar2.f4410a);
                int i14 = this.d + min2;
                this.d = i14;
                int i15 = this.f48732c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f48733e) {
                        byte[] bArr2 = yVar2.f4410a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = f0.f4359m[((i16 >>> 24) ^ (bArr2[i17] & 255)) & 255] ^ (i16 << 8);
                        }
                        int i18 = f0.f4349a;
                        if (i16 != 0) {
                            this.f48734f = true;
                            return;
                        }
                        yVar2.B(this.f48732c - 4);
                    } else {
                        yVar2.B(i15);
                    }
                    yVar2.C(0);
                    this.f48730a.g(yVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void e(d5.e0 e0Var, m3.m mVar, d0 d0Var) {
        this.f48730a.e(e0Var, mVar, d0Var);
        this.f48734f = true;
    }

    @Override
    public final void h() {
        this.f48734f = true;
    }
}
