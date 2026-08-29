package y3;
public final class u implements e0 {
    public final h f50431a;
    public final f5.v f50432b = new f5.v(new byte[10], 10);
    public int f50433c = 0;
    public int d;
    public f5.c0 f50434e;
    public boolean f50435f;
    public boolean f50436g;
    public boolean h;
    public int f50437i;
    public int f50438j;
    public boolean f50439k;
    public long f50440l;

    public u(h hVar) {
        this.f50431a = hVar;
    }

    @Override
    public final void a() {
        this.f50433c = 0;
        this.d = 0;
        this.h = false;
        this.f50431a.a();
    }

    @Override
    public final void b(f5.c0 c0Var, o3.m mVar, d0 d0Var) {
        this.f50434e = c0Var;
        this.f50431a.e(mVar, d0Var);
    }

    @Override
    public final void c(int i10, f5.w wVar) {
        int i11;
        int i12;
        int i13;
        f5.a.j(this.f50434e);
        int i14 = i10 & 1;
        h hVar = this.f50431a;
        int i15 = 2;
        int i16 = 0;
        if (i14 != 0) {
            int i17 = this.f50433c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (this.f50438j != -1) {
                            f5.a.K("PesReader", "Unexpected start indicator: expected " + this.f50438j + " more bytes");
                        }
                        hVar.d();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    f5.a.K("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f50433c = 1;
            this.d = 0;
        }
        int i18 = i10;
        while (wVar.a() > 0) {
            int i19 = this.f50433c;
            if (i19 != 0) {
                f5.v vVar = this.f50432b;
                if (i19 != 1) {
                    if (i19 != i15) {
                        if (i19 == 3) {
                            int a2 = wVar.a();
                            int i20 = this.f50438j;
                            if (i20 == -1) {
                                i13 = 0;
                            } else {
                                i13 = a2 - i20;
                            }
                            if (i13 > 0) {
                                a2 -= i13;
                                wVar.B(wVar.f6641b + a2);
                            }
                            hVar.c(wVar);
                            int i21 = this.f50438j;
                            if (i21 != -1) {
                                int i22 = i21 - a2;
                                this.f50438j = i22;
                                if (i22 == 0) {
                                    hVar.d();
                                    this.f50433c = 1;
                                    this.d = i16;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(wVar, vVar.f6635b, Math.min(10, this.f50437i)) && d(wVar, null, this.f50437i)) {
                            vVar.p(i16);
                            this.f50440l = -9223372036854775807L;
                            if (this.f50435f) {
                                vVar.s(4);
                                vVar.s(1);
                                long i23 = vVar.i(15) << 15;
                                vVar.s(1);
                                long i24 = i23 | (vVar.i(3) << 30) | vVar.i(15);
                                vVar.s(1);
                                if (!this.h && this.f50436g) {
                                    vVar.s(4);
                                    vVar.s(1);
                                    vVar.s(1);
                                    vVar.s(1);
                                    this.f50434e.b((vVar.i(3) << 30) | (vVar.i(15) << 15) | vVar.i(15));
                                    this.h = true;
                                }
                                this.f50440l = this.f50434e.b(i24);
                            }
                            if (this.f50439k) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            i18 |= i12;
                            hVar.f(i18, this.f50440l);
                            this.f50433c = 3;
                            this.d = 0;
                        }
                    }
                } else if (d(wVar, vVar.f6635b, 9)) {
                    vVar.p(0);
                    int i25 = vVar.i(24);
                    if (i25 != 1) {
                        com.google.android.recaptcha.internal.a.s(i25, "Unexpected start code prefix: ", "PesReader");
                        this.f50438j = -1;
                        i11 = 0;
                    } else {
                        vVar.s(8);
                        int i26 = vVar.i(16);
                        vVar.s(5);
                        this.f50439k = vVar.h();
                        vVar.s(2);
                        this.f50435f = vVar.h();
                        this.f50436g = vVar.h();
                        vVar.s(6);
                        int i27 = vVar.i(8);
                        this.f50437i = i27;
                        if (i26 == 0) {
                            this.f50438j = -1;
                        } else {
                            int i28 = (i26 - 3) - i27;
                            this.f50438j = i28;
                            if (i28 < 0) {
                                f5.a.K("PesReader", "Found negative packet payload size: " + this.f50438j);
                                this.f50438j = -1;
                            }
                        }
                        i11 = 2;
                    }
                    this.f50433c = i11;
                    this.d = 0;
                }
            } else {
                wVar.D(wVar.a());
            }
            i15 = 2;
            i16 = 0;
        }
    }

    public final boolean d(f5.w wVar, byte[] bArr, int i10) {
        int min = Math.min(wVar.a(), i10 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            wVar.D(min);
        } else {
            wVar.c(this.d, min, bArr);
        }
        int i11 = this.d + min;
        this.d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }
}
