package w3;

import d5.g0;

public final class z implements f0 {

    public final y f49236a;

    public final d5.z f49237b = new d5.z(32);

    public int f49238c;
    public int d;

    public boolean f49239e;

    public boolean f49240f;

    public z(y yVar) {
        this.f49236a = yVar;
    }

    @Override
    public final void a(d5.f0 f0Var, m3.m mVar, e0 e0Var) {
        this.f49236a.a(f0Var, mVar, e0Var);
        this.f49240f = true;
    }

    @Override
    public final void b(int i10, d5.z zVar) {
        boolean z10 = (i10 & 1) != 0;
        int iR = z10 ? zVar.f4859b + zVar.r() : -1;
        if (this.f49240f) {
            if (!z10) {
                return;
            }
            this.f49240f = false;
            zVar.C(iR);
            this.d = 0;
        }
        while (zVar.a() > 0) {
            int i11 = this.d;
            d5.z zVar2 = this.f49237b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iR2 = zVar.r();
                    zVar.C(zVar.f4859b - 1);
                    if (iR2 == 255) {
                        this.f49240f = true;
                        return;
                    }
                }
                int iMin = Math.min(zVar.a(), 3 - this.d);
                zVar.c(this.d, iMin, zVar2.f4858a);
                int i12 = this.d + iMin;
                this.d = i12;
                if (i12 == 3) {
                    zVar2.C(0);
                    zVar2.B(3);
                    zVar2.D(1);
                    int iR3 = zVar2.r();
                    int iR4 = zVar2.r();
                    this.f49239e = (iR3 & 128) != 0;
                    int i13 = (((iR3 & 15) << 8) | iR4) + 3;
                    this.f49238c = i13;
                    byte[] bArr = zVar2.f4858a;
                    if (bArr.length < i13) {
                        zVar2.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zVar.a(), this.f49238c - this.d);
                zVar.c(this.d, iMin2, zVar2.f4858a);
                int i14 = this.d + iMin2;
                this.d = i14;
                int i15 = this.f49238c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f49239e) {
                        byte[] bArr2 = zVar2.f4858a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = g0.f4805m[((i16 >>> 24) ^ (bArr2[i17] & 255)) & 255] ^ (i16 << 8);
                        }
                        int i18 = g0.f4795a;
                        if (i16 != 0) {
                            this.f49240f = true;
                            return;
                        }
                        zVar2.B(this.f49238c - 4);
                    } else {
                        zVar2.B(i15);
                    }
                    zVar2.C(0);
                    this.f49236a.b(zVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void c() {
        this.f49240f = true;
    }
}
