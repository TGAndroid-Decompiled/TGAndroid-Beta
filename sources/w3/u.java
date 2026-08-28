package w3;
public final class u implements e0 {
    public final h f48698a;
    public final d5.x f48699b = new d5.x(new byte[10], 10);
    public int f48700c = 0;
    public int d;
    public d5.e0 f48701e;
    public boolean f48702f;
    public boolean f48703g;
    public boolean h;
    public int f48704i;
    public int f48705j;
    public boolean f48706k;
    public long f48707l;

    public u(h hVar) {
        this.f48698a = hVar;
    }

    @Override
    public final void a(int i9, d5.y yVar) {
        int i10;
        int i11;
        int i12;
        d5.a.j(this.f48701e);
        int i13 = i9 & 1;
        h hVar = this.f48698a;
        int i14 = 2;
        int i15 = 0;
        if (i13 != 0) {
            int i16 = this.f48700c;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        if (this.f48705j != -1) {
                            d5.a.K("PesReader", "Unexpected start indicator: expected " + this.f48705j + " more bytes");
                        }
                        hVar.i();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    d5.a.K("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f48700c = 1;
            this.d = 0;
        }
        int i17 = i9;
        while (yVar.a() > 0) {
            int i18 = this.f48700c;
            if (i18 != 0) {
                d5.x xVar = this.f48699b;
                if (i18 != 1) {
                    if (i18 != i14) {
                        if (i18 == 3) {
                            int a2 = yVar.a();
                            int i19 = this.f48705j;
                            if (i19 == -1) {
                                i12 = 0;
                            } else {
                                i12 = a2 - i19;
                            }
                            if (i12 > 0) {
                                a2 -= i12;
                                yVar.B(yVar.f4411b + a2);
                            }
                            hVar.g(yVar);
                            int i20 = this.f48705j;
                            if (i20 != -1) {
                                int i21 = i20 - a2;
                                this.f48705j = i21;
                                if (i21 == 0) {
                                    hVar.i();
                                    this.f48700c = 1;
                                    this.d = i15;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (b(yVar, xVar.f4405b, Math.min(10, this.f48704i)) && b(yVar, null, this.f48704i)) {
                            xVar.p(i15);
                            this.f48707l = -9223372036854775807L;
                            if (this.f48702f) {
                                xVar.s(4);
                                xVar.s(1);
                                long i22 = xVar.i(15) << 15;
                                xVar.s(1);
                                long i23 = i22 | (xVar.i(3) << 30) | xVar.i(15);
                                xVar.s(1);
                                if (!this.h && this.f48703g) {
                                    xVar.s(4);
                                    xVar.s(1);
                                    xVar.s(1);
                                    xVar.s(1);
                                    this.f48701e.b((xVar.i(3) << 30) | (xVar.i(15) << 15) | xVar.i(15));
                                    this.h = true;
                                }
                                this.f48707l = this.f48701e.b(i23);
                            }
                            if (this.f48706k) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            i17 |= i11;
                            hVar.k(i17, this.f48707l);
                            this.f48700c = 3;
                            this.d = 0;
                        }
                    }
                } else if (b(yVar, xVar.f4405b, 9)) {
                    xVar.p(0);
                    int i24 = xVar.i(24);
                    if (i24 != 1) {
                        e2.c.t(i24, "Unexpected start code prefix: ", "PesReader");
                        this.f48705j = -1;
                        i10 = 0;
                    } else {
                        xVar.s(8);
                        int i25 = xVar.i(16);
                        xVar.s(5);
                        this.f48706k = xVar.h();
                        xVar.s(2);
                        this.f48702f = xVar.h();
                        this.f48703g = xVar.h();
                        xVar.s(6);
                        int i26 = xVar.i(8);
                        this.f48704i = i26;
                        if (i25 == 0) {
                            this.f48705j = -1;
                        } else {
                            int i27 = (i25 - 3) - i26;
                            this.f48705j = i27;
                            if (i27 < 0) {
                                d5.a.K("PesReader", "Found negative packet payload size: " + this.f48705j);
                                this.f48705j = -1;
                            }
                        }
                        i10 = 2;
                    }
                    this.f48700c = i10;
                    this.d = 0;
                }
            } else {
                yVar.D(yVar.a());
            }
            i14 = 2;
            i15 = 0;
        }
    }

    public final boolean b(d5.y yVar, byte[] bArr, int i9) {
        int min = Math.min(yVar.a(), i9 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.D(min);
        } else {
            yVar.c(this.d, min, bArr);
        }
        int i10 = this.d + min;
        this.d = i10;
        if (i10 == i9) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(d5.e0 e0Var, m3.m mVar, d0 d0Var) {
        this.f48701e = e0Var;
        this.f48698a.j(mVar, d0Var);
    }

    @Override
    public final void h() {
        this.f48700c = 0;
        this.d = 0;
        this.h = false;
        this.f48698a.h();
    }
}
