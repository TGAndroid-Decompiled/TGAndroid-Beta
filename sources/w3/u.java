package w3;

public final class u implements f0 {

    public final h f49204a;

    public final d5.y f49205b = new d5.y(new byte[10], 10);

    public int f49206c = 0;
    public int d;

    public d5.f0 f49207e;

    public boolean f49208f;

    public boolean f49209g;
    public boolean h;

    public int f49210i;

    public int f49211j;

    public boolean f49212k;

    public long f49213l;

    public u(h hVar) {
        this.f49204a = hVar;
    }

    @Override
    public final void a(d5.f0 f0Var, m3.m mVar, e0 e0Var) {
        this.f49207e = f0Var;
        this.f49204a.e(mVar, e0Var);
    }

    @Override
    public final void b(int i10, d5.z zVar) {
        int i11;
        d5.a.j(this.f49207e);
        int i12 = i10 & 1;
        h hVar = this.f49204a;
        int i13 = 2;
        int i14 = 0;
        if (i12 != 0) {
            int i15 = this.f49206c;
            if (i15 != 0 && i15 != 1) {
                if (i15 == 2) {
                    d5.a.K("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f49211j != -1) {
                        d5.a.K("PesReader", "Unexpected start indicator: expected " + this.f49211j + " more bytes");
                    }
                    hVar.d();
                }
            }
            this.f49206c = 1;
            this.d = 0;
        }
        int i16 = i10;
        while (zVar.a() > 0) {
            int i17 = this.f49206c;
            if (i17 != 0) {
                d5.y yVar = this.f49205b;
                if (i17 != 1) {
                    if (i17 == i13) {
                        if (d(zVar, yVar.f4853b, Math.min(10, this.f49210i)) && d(zVar, null, this.f49210i)) {
                            yVar.p(i14);
                            this.f49213l = -9223372036854775807L;
                            if (this.f49208f) {
                                yVar.s(4);
                                long jI = ((long) yVar.i(3)) << 30;
                                yVar.s(1);
                                long jI2 = ((long) (yVar.i(15) << 15)) | jI;
                                yVar.s(1);
                                long jI3 = jI2 | ((long) yVar.i(15));
                                yVar.s(1);
                                if (!this.h && this.f49209g) {
                                    yVar.s(4);
                                    long jI4 = ((long) yVar.i(3)) << 30;
                                    yVar.s(1);
                                    long jI5 = jI4 | ((long) (yVar.i(15) << 15));
                                    yVar.s(1);
                                    long jI6 = jI5 | ((long) yVar.i(15));
                                    yVar.s(1);
                                    this.f49207e.b(jI6);
                                    this.h = true;
                                }
                                this.f49213l = this.f49207e.b(jI3);
                            }
                            i16 |= this.f49212k ? 4 : 0;
                            hVar.f(i16, this.f49213l);
                            this.f49206c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i17 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = zVar.a();
                        int i18 = this.f49211j;
                        int i19 = i18 == -1 ? 0 : iA - i18;
                        if (i19 > 0) {
                            iA -= i19;
                            zVar.B(zVar.f4859b + iA);
                        }
                        hVar.b(zVar);
                        int i20 = this.f49211j;
                        if (i20 != -1) {
                            int i21 = i20 - iA;
                            this.f49211j = i21;
                            if (i21 == 0) {
                                hVar.d();
                                this.f49206c = 1;
                                this.d = i14;
                            }
                        }
                    }
                } else if (d(zVar, yVar.f4853b, 9)) {
                    yVar.p(0);
                    int i22 = yVar.i(24);
                    if (i22 != 1) {
                        com.google.android.recaptcha.internal.a.s(i22, "Unexpected start code prefix: ", "PesReader");
                        this.f49211j = -1;
                        i11 = 0;
                    } else {
                        yVar.s(8);
                        int i23 = yVar.i(16);
                        yVar.s(5);
                        this.f49212k = yVar.h();
                        yVar.s(2);
                        this.f49208f = yVar.h();
                        this.f49209g = yVar.h();
                        yVar.s(6);
                        int i24 = yVar.i(8);
                        this.f49210i = i24;
                        if (i23 == 0) {
                            this.f49211j = -1;
                        } else {
                            int i25 = (i23 - 3) - i24;
                            this.f49211j = i25;
                            if (i25 < 0) {
                                d5.a.K("PesReader", "Found negative packet payload size: " + this.f49211j);
                                this.f49211j = -1;
                            }
                        }
                        i11 = 2;
                    }
                    this.f49206c = i11;
                    this.d = 0;
                }
            } else {
                zVar.D(zVar.a());
            }
            i13 = 2;
            i14 = 0;
        }
    }

    @Override
    public final void c() {
        this.f49206c = 0;
        this.d = 0;
        this.h = false;
        this.f49204a.c();
    }

    public final boolean d(d5.z zVar, byte[] bArr, int i10) {
        int iMin = Math.min(zVar.a(), i10 - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zVar.D(iMin);
        } else {
            zVar.c(this.d, iMin, bArr);
        }
        int i11 = this.d + iMin;
        this.d = i11;
        return i11 == i10;
    }
}
