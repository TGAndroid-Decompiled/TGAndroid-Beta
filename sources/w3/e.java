package w3;

import d5.f0;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import java.util.Collections;
public final class e implements h {
    public static final byte[] v = {73, 68, 51};
    public final boolean f48529a;
    public final String d;
    public String f48532e;
    public m3.w f48533f;
    public m3.w f48534g;
    public boolean f48537k;
    public boolean f48538l;
    public int f48541o;
    public boolean f48542p;
    public int f48544r;
    public m3.w f48546t;
    public long f48547u;
    public final d5.x f48530b = new d5.x(new byte[7], 7);
    public final d5.y f48531c = new d5.y(Arrays.copyOf(v, 10));
    public int h = 0;
    public int f48535i = 0;
    public int f48536j = 256;
    public int f48539m = -1;
    public int f48540n = -1;
    public long f48543q = -9223372036854775807L;
    public long f48545s = -9223372036854775807L;

    public e(String str, boolean z10) {
        this.f48529a = z10;
        this.d = str;
    }

    @Override
    public final void g(d5.y yVar) {
        int i9;
        int i10;
        byte b10;
        boolean z10;
        int i11;
        this.f48533f.getClass();
        int i12 = f0.f4349a;
        while (yVar.a() > 0) {
            int i13 = this.h;
            d5.y yVar2 = this.f48531c;
            int i14 = 0;
            d5.x xVar = this.f48530b;
            int i15 = 4;
            int i16 = 1;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                int min = Math.min(yVar.a(), this.f48544r - this.f48535i);
                                this.f48546t.a(min, yVar);
                                int i17 = this.f48535i + min;
                                this.f48535i = i17;
                                int i18 = this.f48544r;
                                if (i17 == i18) {
                                    long j10 = this.f48545s;
                                    if (j10 != -9223372036854775807L) {
                                        this.f48546t.e(j10, 1, i18, 0, null);
                                        this.f48545s += this.f48547u;
                                    }
                                    this.h = 0;
                                    this.f48535i = 0;
                                    this.f48536j = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f48537k) {
                                i9 = 7;
                            } else {
                                i9 = 5;
                            }
                            byte[] bArr = xVar.f4405b;
                            int min2 = Math.min(yVar.a(), i9 - this.f48535i);
                            yVar.c(this.f48535i, min2, bArr);
                            int i19 = this.f48535i + min2;
                            this.f48535i = i19;
                            if (i19 == i9) {
                                xVar.p(0);
                                if (!this.f48542p) {
                                    int i20 = xVar.i(2) + 1;
                                    if (i20 != 2) {
                                        d5.a.K("AdtsReader", "Detected audio object type: " + i20 + ", but assuming AAC LC.");
                                        i20 = 2;
                                    }
                                    xVar.s(5);
                                    int i21 = xVar.i(3);
                                    int i22 = this.f48540n;
                                    byte[] bArr2 = {(byte) (((i20 << 3) & 248) | ((i22 >> 1) & 7)), (byte) (((i21 << 3) & 120) | ((i22 << 7) & 128))};
                                    j3.a h = j3.b.h(new d5.x(bArr2, 2), false);
                                    s0 s0Var = new s0();
                                    s0Var.f9693a = this.f48532e;
                                    s0Var.f9705o = "audio/mp4a-latm";
                                    s0Var.h = h.f13206c;
                                    s0Var.B = h.f13205b;
                                    s0Var.C = h.f13204a;
                                    s0Var.f9707q = Collections.singletonList(bArr2);
                                    s0Var.f9695c = this.d;
                                    t0 t0Var = new t0(s0Var);
                                    this.f48543q = 1024000000 / t0Var.P;
                                    this.f48533f.c(t0Var);
                                    this.f48542p = true;
                                } else {
                                    xVar.s(10);
                                }
                                xVar.s(4);
                                int i23 = xVar.i(13);
                                int i24 = i23 - 7;
                                if (this.f48537k) {
                                    i24 = i23 - 9;
                                }
                                m3.w wVar = this.f48533f;
                                long j11 = this.f48543q;
                                this.h = 4;
                                this.f48535i = 0;
                                this.f48546t = wVar;
                                this.f48547u = j11;
                                this.f48544r = i24;
                            }
                        }
                    } else {
                        byte[] bArr3 = yVar2.f4410a;
                        int min3 = Math.min(yVar.a(), 10 - this.f48535i);
                        yVar.c(this.f48535i, min3, bArr3);
                        int i25 = this.f48535i + min3;
                        this.f48535i = i25;
                        if (i25 == 10) {
                            this.f48534g.a(10, yVar2);
                            yVar2.C(6);
                            m3.w wVar2 = this.f48534g;
                            this.h = 4;
                            this.f48535i = 10;
                            this.f48546t = wVar2;
                            this.f48547u = 0L;
                            this.f48544r = yVar2.q() + 10;
                        }
                    }
                } else if (yVar.a() != 0) {
                    xVar.f4405b[0] = yVar.f4410a[yVar.f4411b];
                    xVar.p(2);
                    int i26 = xVar.i(4);
                    int i27 = this.f48540n;
                    if (i27 != -1 && i26 != i27) {
                        this.f48538l = false;
                        this.h = 0;
                        this.f48535i = 0;
                        this.f48536j = 256;
                    } else {
                        if (!this.f48538l) {
                            this.f48538l = true;
                            this.f48539m = this.f48541o;
                            this.f48540n = i26;
                        }
                        this.h = 3;
                        this.f48535i = 0;
                    }
                }
            } else {
                byte[] bArr4 = yVar.f4410a;
                int i28 = yVar.f4411b;
                int i29 = yVar.f4412c;
                while (true) {
                    if (i28 < i29) {
                        i10 = i28 + 1;
                        b10 = bArr4[i28];
                        int i30 = b10 & 255;
                        if (this.f48536j == 512 && ((65280 | (((byte) i30) & 255)) & 65526) == 65520) {
                            if (!this.f48538l) {
                                int i31 = i28 - 1;
                                yVar.C(i28);
                                byte[] bArr5 = xVar.f4405b;
                                if (yVar.a() >= i16) {
                                    yVar.c(i14, i16, bArr5);
                                    xVar.p(i15);
                                    int i32 = xVar.i(i16);
                                    int i33 = this.f48539m;
                                    if (i33 == -1 || i32 == i33) {
                                        if (this.f48540n != -1) {
                                            byte[] bArr6 = xVar.f4405b;
                                            if (yVar.a() < i16) {
                                                break;
                                            }
                                            yVar.c(i14, i16, bArr6);
                                            xVar.p(2);
                                            i11 = 4;
                                            if (xVar.i(4) == this.f48540n) {
                                                yVar.C(i10);
                                            }
                                        } else {
                                            i11 = 4;
                                        }
                                        byte[] bArr7 = xVar.f4405b;
                                        if (yVar.a() >= i11) {
                                            yVar.c(i14, i11, bArr7);
                                            xVar.p(14);
                                            int i34 = xVar.i(13);
                                            if (i34 >= 7) {
                                                byte[] bArr8 = yVar.f4410a;
                                                int i35 = yVar.f4412c;
                                                int i36 = i31 + i34;
                                                if (i36 >= i35) {
                                                    break;
                                                }
                                                byte b11 = bArr8[i36];
                                                if (b11 == -1) {
                                                    int i37 = i36 + 1;
                                                    if (i37 != i35) {
                                                        byte b12 = bArr8[i37];
                                                        if (((65280 | (b12 & 255)) & 65526) == 65520 && ((b12 & 8) >> 3) == i32) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b11 == 73) {
                                                    int i38 = i36 + 1;
                                                    if (i38 != i35) {
                                                        if (bArr8[i38] == 68) {
                                                            int i39 = i36 + 2;
                                                            if (i39 != i35) {
                                                                if (bArr8[i39] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i40 = this.f48536j;
                        int i41 = i30 | i40;
                        if (i41 != 329) {
                            if (i41 != 511) {
                                if (i41 != 836) {
                                    if (i41 != 1075) {
                                        if (i40 != 256) {
                                            this.f48536j = 256;
                                            i14 = 0;
                                            i15 = 4;
                                            i16 = 1;
                                        }
                                    } else {
                                        this.h = 2;
                                        this.f48535i = 3;
                                        this.f48544r = 0;
                                        yVar2.C(0);
                                        yVar.C(i10);
                                        break;
                                    }
                                } else {
                                    this.f48536j = 1024;
                                }
                            } else {
                                this.f48536j = 512;
                            }
                        } else {
                            this.f48536j = 768;
                        }
                        i28 = i10;
                        i14 = 0;
                        i15 = 4;
                        i16 = 1;
                    } else {
                        yVar.C(i28);
                        break;
                    }
                }
                this.f48541o = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f48537k = z10;
                if (!this.f48538l) {
                    this.h = 1;
                    this.f48535i = 0;
                } else {
                    this.h = 3;
                    this.f48535i = 0;
                }
                yVar.C(i10);
            }
        }
    }

    @Override
    public final void h() {
        this.f48545s = -9223372036854775807L;
        this.f48538l = false;
        this.h = 0;
        this.f48535i = 0;
        this.f48536j = 256;
    }

    @Override
    public final void j(m3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f48532e = d0Var.f48528e;
        d0Var.b();
        m3.w I = mVar.I(d0Var.d, 1);
        this.f48533f = I;
        this.f48546t = I;
        if (this.f48529a) {
            d0Var.a();
            d0Var.b();
            m3.w I2 = mVar.I(d0Var.d, 5);
            this.f48534g = I2;
            s0 s0Var = new s0();
            d0Var.b();
            s0Var.f9693a = d0Var.f48528e;
            s0Var.f9705o = "application/id3";
            I2.c(new t0(s0Var));
            return;
        }
        this.f48534g = new m3.j();
    }

    @Override
    public final void k(int i9, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f48545s = j10;
        }
    }

    @Override
    public final void i() {
    }
}
