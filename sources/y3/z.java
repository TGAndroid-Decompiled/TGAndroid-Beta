package y3;
public final class z implements e0 {
    public final y f50463a;
    public final f5.w f50464b = new f5.w(32);
    public int f50465c;
    public int d;
    public boolean f50466e;
    public boolean f50467f;

    public z(y yVar) {
        this.f50463a = yVar;
    }

    @Override
    public final void a() {
        this.f50467f = true;
    }

    @Override
    public final void b(f5.c0 c0Var, o3.m mVar, d0 d0Var) {
        this.f50463a.b(c0Var, mVar, d0Var);
        this.f50467f = true;
    }

    @Override
    public final void c(int i10, f5.w wVar) {
        boolean z10;
        int i11;
        boolean z11;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = wVar.f6641b + wVar.r();
        } else {
            i11 = -1;
        }
        if (this.f50467f) {
            if (z10) {
                this.f50467f = false;
                wVar.C(i11);
                this.d = 0;
            } else {
                return;
            }
        }
        while (wVar.a() > 0) {
            int i12 = this.d;
            f5.w wVar2 = this.f50464b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int r6 = wVar.r();
                    wVar.C(wVar.f6641b - 1);
                    if (r6 == 255) {
                        this.f50467f = true;
                        return;
                    }
                }
                int min = Math.min(wVar.a(), 3 - this.d);
                wVar.c(this.d, min, wVar2.f6640a);
                int i13 = this.d + min;
                this.d = i13;
                if (i13 == 3) {
                    wVar2.C(0);
                    wVar2.B(3);
                    wVar2.D(1);
                    int r9 = wVar2.r();
                    int r10 = wVar2.r();
                    if ((r9 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f50466e = z11;
                    int i14 = (((r9 & 15) << 8) | r10) + 3;
                    this.f50465c = i14;
                    byte[] bArr = wVar2.f6640a;
                    if (bArr.length < i14) {
                        wVar2.b(Math.min(4098, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(wVar.a(), this.f50465c - this.d);
                wVar.c(this.d, min2, wVar2.f6640a);
                int i15 = this.d + min2;
                this.d = i15;
                int i16 = this.f50465c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f50466e) {
                        byte[] bArr2 = wVar2.f6640a;
                        int i17 = -1;
                        for (int i18 = 0; i18 < i16; i18++) {
                            i17 = f5.d0.f6589m[((i17 >>> 24) ^ (bArr2[i18] & 255)) & 255] ^ (i17 << 8);
                        }
                        int i19 = f5.d0.f6579a;
                        if (i17 != 0) {
                            this.f50467f = true;
                            return;
                        }
                        wVar2.B(this.f50465c - 4);
                    } else {
                        wVar2.B(i16);
                    }
                    wVar2.C(0);
                    this.f50463a.c(wVar2);
                    this.d = 0;
                }
            }
        }
    }
}
