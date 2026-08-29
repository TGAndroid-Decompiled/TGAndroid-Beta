package y3;

import j3.s0;
import j3.t0;
import java.util.Arrays;
import java.util.Collections;
public final class e implements h {
    public static final byte[] v = {73, 68, 51};
    public final boolean f50262a;
    public final String d;
    public String f50265e;
    public o3.w f50266f;
    public o3.w f50267g;
    public boolean f50270k;
    public boolean f50271l;
    public int f50274o;
    public boolean f50275p;
    public int f50277r;
    public o3.w f50279t;
    public long f50280u;
    public final f5.v f50263b = new f5.v(new byte[7], 7);
    public final f5.w f50264c = new f5.w(Arrays.copyOf(v, 10));
    public int h = 0;
    public int f50268i = 0;
    public int f50269j = 256;
    public int f50272m = -1;
    public int f50273n = -1;
    public long f50276q = -9223372036854775807L;
    public long f50278s = -9223372036854775807L;

    public e(String str, boolean z10) {
        this.f50262a = z10;
        this.d = str;
    }

    @Override
    public final void a() {
        this.f50278s = -9223372036854775807L;
        this.f50271l = false;
        this.h = 0;
        this.f50268i = 0;
        this.f50269j = 256;
    }

    @Override
    public final void c(f5.w wVar) {
        int i10;
        int i11;
        byte b10;
        boolean z10;
        int i12;
        this.f50266f.getClass();
        int i13 = f5.d0.f6579a;
        while (wVar.a() > 0) {
            int i14 = this.h;
            f5.w wVar2 = this.f50264c;
            int i15 = 0;
            f5.v vVar = this.f50263b;
            int i16 = 4;
            int i17 = 1;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                int min = Math.min(wVar.a(), this.f50277r - this.f50268i);
                                this.f50279t.e(min, wVar);
                                int i18 = this.f50268i + min;
                                this.f50268i = i18;
                                int i19 = this.f50277r;
                                if (i18 == i19) {
                                    long j10 = this.f50278s;
                                    if (j10 != -9223372036854775807L) {
                                        this.f50279t.c(j10, 1, i19, 0, null);
                                        this.f50278s += this.f50280u;
                                    }
                                    this.h = 0;
                                    this.f50268i = 0;
                                    this.f50269j = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f50270k) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr = vVar.f6635b;
                            int min2 = Math.min(wVar.a(), i10 - this.f50268i);
                            wVar.c(this.f50268i, min2, bArr);
                            int i20 = this.f50268i + min2;
                            this.f50268i = i20;
                            if (i20 == i10) {
                                vVar.p(0);
                                if (!this.f50275p) {
                                    int i21 = vVar.i(2) + 1;
                                    if (i21 != 2) {
                                        f5.a.K("AdtsReader", "Detected audio object type: " + i21 + ", but assuming AAC LC.");
                                        i21 = 2;
                                    }
                                    vVar.s(5);
                                    int i22 = vVar.i(3);
                                    int i23 = this.f50273n;
                                    byte[] bArr2 = {(byte) (((i21 << 3) & 248) | ((i23 >> 1) & 7)), (byte) (((i22 << 3) & 120) | ((i23 << 7) & 128))};
                                    l3.a h = l3.b.h(new f5.v(bArr2, 2), false);
                                    s0 s0Var = new s0();
                                    s0Var.f10730a = this.f50265e;
                                    s0Var.f10742o = "audio/mp4a-latm";
                                    s0Var.h = h.f14059c;
                                    s0Var.B = h.f14058b;
                                    s0Var.C = h.f14057a;
                                    s0Var.f10744q = Collections.singletonList(bArr2);
                                    s0Var.f10732c = this.d;
                                    t0 t0Var = new t0(s0Var);
                                    this.f50276q = 1024000000 / t0Var.P;
                                    this.f50266f.b(t0Var);
                                    this.f50275p = true;
                                } else {
                                    vVar.s(10);
                                }
                                vVar.s(4);
                                int i24 = vVar.i(13);
                                int i25 = i24 - 7;
                                if (this.f50270k) {
                                    i25 = i24 - 9;
                                }
                                o3.w wVar3 = this.f50266f;
                                long j11 = this.f50276q;
                                this.h = 4;
                                this.f50268i = 0;
                                this.f50279t = wVar3;
                                this.f50280u = j11;
                                this.f50277r = i25;
                            }
                        }
                    } else {
                        byte[] bArr3 = wVar2.f6640a;
                        int min3 = Math.min(wVar.a(), 10 - this.f50268i);
                        wVar.c(this.f50268i, min3, bArr3);
                        int i26 = this.f50268i + min3;
                        this.f50268i = i26;
                        if (i26 == 10) {
                            this.f50267g.e(10, wVar2);
                            wVar2.C(6);
                            o3.w wVar4 = this.f50267g;
                            this.h = 4;
                            this.f50268i = 10;
                            this.f50279t = wVar4;
                            this.f50280u = 0L;
                            this.f50277r = wVar2.q() + 10;
                        }
                    }
                } else if (wVar.a() != 0) {
                    vVar.f6635b[0] = wVar.f6640a[wVar.f6641b];
                    vVar.p(2);
                    int i27 = vVar.i(4);
                    int i28 = this.f50273n;
                    if (i28 != -1 && i27 != i28) {
                        this.f50271l = false;
                        this.h = 0;
                        this.f50268i = 0;
                        this.f50269j = 256;
                    } else {
                        if (!this.f50271l) {
                            this.f50271l = true;
                            this.f50272m = this.f50274o;
                            this.f50273n = i27;
                        }
                        this.h = 3;
                        this.f50268i = 0;
                    }
                }
            } else {
                byte[] bArr4 = wVar.f6640a;
                int i29 = wVar.f6641b;
                int i30 = wVar.f6642c;
                while (true) {
                    if (i29 < i30) {
                        i11 = i29 + 1;
                        b10 = bArr4[i29];
                        int i31 = b10 & 255;
                        if (this.f50269j == 512 && ((65280 | (((byte) i31) & 255)) & 65526) == 65520) {
                            if (!this.f50271l) {
                                int i32 = i29 - 1;
                                wVar.C(i29);
                                byte[] bArr5 = vVar.f6635b;
                                if (wVar.a() >= i17) {
                                    wVar.c(i15, i17, bArr5);
                                    vVar.p(i16);
                                    int i33 = vVar.i(i17);
                                    int i34 = this.f50272m;
                                    if (i34 == -1 || i33 == i34) {
                                        if (this.f50273n != -1) {
                                            byte[] bArr6 = vVar.f6635b;
                                            if (wVar.a() < i17) {
                                                break;
                                            }
                                            wVar.c(i15, i17, bArr6);
                                            vVar.p(2);
                                            i12 = 4;
                                            if (vVar.i(4) == this.f50273n) {
                                                wVar.C(i11);
                                            }
                                        } else {
                                            i12 = 4;
                                        }
                                        byte[] bArr7 = vVar.f6635b;
                                        if (wVar.a() >= i12) {
                                            wVar.c(i15, i12, bArr7);
                                            vVar.p(14);
                                            int i35 = vVar.i(13);
                                            if (i35 >= 7) {
                                                byte[] bArr8 = wVar.f6640a;
                                                int i36 = wVar.f6642c;
                                                int i37 = i32 + i35;
                                                if (i37 >= i36) {
                                                    break;
                                                }
                                                byte b11 = bArr8[i37];
                                                if (b11 == -1) {
                                                    int i38 = i37 + 1;
                                                    if (i38 != i36) {
                                                        byte b12 = bArr8[i38];
                                                        if (((65280 | (b12 & 255)) & 65526) == 65520 && ((b12 & 8) >> 3) == i33) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b11 == 73) {
                                                    int i39 = i37 + 1;
                                                    if (i39 != i36) {
                                                        if (bArr8[i39] == 68) {
                                                            int i40 = i37 + 2;
                                                            if (i40 != i36) {
                                                                if (bArr8[i40] == 51) {
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
                        int i41 = this.f50269j;
                        int i42 = i31 | i41;
                        if (i42 != 329) {
                            if (i42 != 511) {
                                if (i42 != 836) {
                                    if (i42 != 1075) {
                                        if (i41 != 256) {
                                            this.f50269j = 256;
                                            i15 = 0;
                                            i16 = 4;
                                            i17 = 1;
                                        }
                                    } else {
                                        this.h = 2;
                                        this.f50268i = 3;
                                        this.f50277r = 0;
                                        wVar2.C(0);
                                        wVar.C(i11);
                                        break;
                                    }
                                } else {
                                    this.f50269j = 1024;
                                }
                            } else {
                                this.f50269j = 512;
                            }
                        } else {
                            this.f50269j = 768;
                        }
                        i29 = i11;
                        i15 = 0;
                        i16 = 4;
                        i17 = 1;
                    } else {
                        wVar.C(i29);
                        break;
                    }
                }
                this.f50274o = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f50270k = z10;
                if (!this.f50271l) {
                    this.h = 1;
                    this.f50268i = 0;
                } else {
                    this.h = 3;
                    this.f50268i = 0;
                }
                wVar.C(i11);
            }
        }
    }

    @Override
    public final void e(o3.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f50265e = d0Var.f50261e;
        d0Var.b();
        o3.w Z1 = mVar.Z1(d0Var.d, 1);
        this.f50266f = Z1;
        this.f50279t = Z1;
        if (this.f50262a) {
            d0Var.a();
            d0Var.b();
            o3.w Z12 = mVar.Z1(d0Var.d, 5);
            this.f50267g = Z12;
            s0 s0Var = new s0();
            d0Var.b();
            s0Var.f10730a = d0Var.f50261e;
            s0Var.f10742o = "application/id3";
            Z12.b(new t0(s0Var));
            return;
        }
        this.f50267g = new o3.j();
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f50278s = j10;
        }
    }

    @Override
    public final void d() {
    }
}
