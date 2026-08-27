package w3;

import h3.s0;
import h3.t0;
import java.util.Arrays;

public final class f implements h {

    public final String f49055b;

    public String f49056c;
    public m3.w d;

    public int f49058f;

    public int f49059g;
    public long h;

    public t0 f49060i;

    public int f49061j;

    public final d5.z f49054a = new d5.z(new byte[18]);

    public int f49057e = 0;

    public long f49062k = -9223372036854775807L;

    public f(String str) {
        this.f49055b = str;
    }

    @Override
    public final void b(d5.z zVar) {
        char c10;
        char c11;
        int i10;
        byte b10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        byte b11;
        int i14;
        byte b12;
        d5.y yVar;
        d5.a.j(this.d);
        while (zVar.a() > 0) {
            int i15 = this.f49057e;
            int i16 = 8;
            int i17 = 2;
            d5.z zVar2 = this.f49054a;
            if (i15 == 0) {
                while (zVar.a() > 0) {
                    int i18 = this.f49059g << 8;
                    this.f49059g = i18;
                    int iR = i18 | zVar.r();
                    this.f49059g = iR;
                    if (iR == 2147385345 || iR == -25230976 || iR == 536864768 || iR == -14745368) {
                        byte[] bArr = zVar2.f4858a;
                        bArr[0] = (byte) ((iR >> 24) & 255);
                        bArr[1] = (byte) ((iR >> 16) & 255);
                        bArr[2] = (byte) ((iR >> 8) & 255);
                        bArr[3] = (byte) (iR & 255);
                        this.f49058f = 4;
                        this.f49059g = 0;
                        this.f49057e = 1;
                        break;
                    }
                }
            } else if (i15 == 1) {
                byte[] bArr2 = zVar2.f4858a;
                int iMin = Math.min(zVar.a(), 18 - this.f49058f);
                zVar.c(this.f49058f, iMin, bArr2);
                int i19 = this.f49058f + iMin;
                this.f49058f = i19;
                if (i19 == 18) {
                    byte[] bArr3 = zVar2.f4858a;
                    if (this.f49060i == null) {
                        String str = this.f49056c;
                        c10 = 0;
                        if (bArr3[0] == 127) {
                            yVar = new d5.y(bArr3, bArr3.length);
                            c11 = '\b';
                        } else {
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b13 = bArrCopyOf[0];
                            if (b13 == -2 || b13 == -1) {
                                for (int i20 = 0; i20 < bArrCopyOf.length - 1; i20 += 2) {
                                    byte b14 = bArrCopyOf[i20];
                                    int i21 = i20 + 1;
                                    bArrCopyOf[i20] = bArrCopyOf[i21];
                                    bArrCopyOf[i21] = b14;
                                }
                            }
                            d5.y yVar2 = new d5.y(bArrCopyOf, bArrCopyOf.length);
                            if (bArrCopyOf[0] == 31) {
                                d5.y yVar3 = new d5.y(bArrCopyOf, bArrCopyOf.length);
                                while (yVar3.b() >= 16) {
                                    yVar3.s(i17);
                                    int i22 = yVar3.i(14) & 16383;
                                    int iMin2 = Math.min(8 - yVar2.d, 14);
                                    int i23 = yVar2.d;
                                    int i24 = (8 - i23) - iMin2;
                                    byte[] bArr4 = yVar2.f4853b;
                                    int i25 = yVar2.f4854c;
                                    byte b15 = (byte) (bArr4[i25] & ((65280 >> i23) | ((1 << i24) - 1)));
                                    bArr4[i25] = b15;
                                    int i26 = 14 - iMin2;
                                    bArr4[i25] = (byte) (b15 | ((i22 >>> i26) << i24));
                                    int i27 = i25 + 1;
                                    while (i26 > i16) {
                                        yVar2.f4853b[i27] = (byte) (i22 >>> (i26 - 8));
                                        i26 -= 8;
                                        i27++;
                                        i16 = 8;
                                    }
                                    int i28 = 8 - i26;
                                    byte[] bArr5 = yVar2.f4853b;
                                    byte b16 = (byte) (bArr5[i27] & ((1 << i28) - 1));
                                    bArr5[i27] = b16;
                                    bArr5[i27] = (byte) (((i22 & ((1 << i26) - 1)) << i28) | b16);
                                    yVar2.s(14);
                                    yVar2.a();
                                    i16 = 8;
                                    i17 = 2;
                                }
                            }
                            c11 = '\b';
                            yVar2.n(bArrCopyOf.length, bArrCopyOf);
                            yVar = yVar2;
                        }
                        yVar.s(60);
                        int i29 = j3.b.f12311j[yVar.i(6)];
                        int i30 = j3.b.f12312k[yVar.i(4)];
                        int i31 = yVar.i(5);
                        int i32 = i31 >= 29 ? -1 : (j3.b.f12313l[i31] * 1000) / 2;
                        yVar.s(10);
                        int i33 = i29 + (yVar.i(2) > 0 ? 1 : 0);
                        s0 s0Var = new s0();
                        s0Var.f8123a = str;
                        s0Var.f8135o = "audio/vnd.dts";
                        s0Var.f8127f = i32;
                        s0Var.B = i33;
                        s0Var.C = i30;
                        s0Var.f8138r = null;
                        s0Var.f8125c = this.f49055b;
                        t0 t0Var = new t0(s0Var);
                        this.f49060i = t0Var;
                        this.d.c(t0Var);
                    } else {
                        c10 = 0;
                        c11 = '\b';
                    }
                    byte b17 = bArr3[c10];
                    if (b17 != -2) {
                        if (b17 == -1) {
                            i14 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b12 = bArr3[9];
                        } else if (b17 != 31) {
                            i10 = ((bArr3[5] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b10 = bArr3[7];
                        } else {
                            i14 = ((bArr3[6] & 3) << 12) | ((bArr3[7] & 255) << 4);
                            b12 = bArr3[c11];
                        }
                        i11 = (i14 | ((b12 & 60) >> 2)) + 1;
                        z10 = true;
                        if (z10) {
                            i11 = (i11 * 16) / 14;
                        }
                        this.f49061j = i11;
                        if (b17 != -2) {
                            if (b17 != -1) {
                                i12 = (bArr3[4] & 7) << 4;
                                b11 = bArr3[7];
                            } else if (b17 != 31) {
                                i12 = (bArr3[4] & 1) << 6;
                                i13 = bArr3[5] & 252;
                            } else {
                                i12 = (bArr3[5] & 7) << 4;
                                b11 = bArr3[6];
                            }
                            i13 = b11 & 60;
                        } else {
                            i12 = (bArr3[5] & 1) << 6;
                            i13 = bArr3[4] & 252;
                        }
                        this.h = (int) ((((long) ((((i13 >> 2) | i12) + 1) * 32)) * 1000000) / ((long) this.f49060i.P));
                        zVar2.C(0);
                        this.d.a(18, zVar2);
                        this.f49057e = 2;
                    } else {
                        i10 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        b10 = bArr3[6];
                    }
                    i11 = (i10 | ((b10 & 240) >> 4)) + 1;
                    z10 = false;
                    if (z10) {
                        i11 = (i11 * 16) / 14;
                    }
                    this.f49061j = i11;
                    if (b17 != -2) {
                        if (b17 != -1) {
                            i12 = (bArr3[4] & 7) << 4;
                            b11 = bArr3[7];
                        } else if (b17 != 31) {
                            i12 = (bArr3[4] & 1) << 6;
                            i13 = bArr3[5] & 252;
                        } else {
                            i12 = (bArr3[5] & 7) << 4;
                            b11 = bArr3[6];
                        }
                        i13 = b11 & 60;
                    } else {
                        i12 = (bArr3[5] & 1) << 6;
                        i13 = bArr3[4] & 252;
                    }
                    this.h = (int) ((((long) ((((i13 >> 2) | i12) + 1) * 32)) * 1000000) / ((long) this.f49060i.P));
                    zVar2.C(0);
                    this.d.a(18, zVar2);
                    this.f49057e = 2;
                }
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException();
                }
                int iMin3 = Math.min(zVar.a(), this.f49061j - this.f49058f);
                this.d.a(iMin3, zVar);
                int i34 = this.f49058f + iMin3;
                this.f49058f = i34;
                int i35 = this.f49061j;
                if (i34 == i35) {
                    long j10 = this.f49062k;
                    if (j10 != -9223372036854775807L) {
                        this.d.e(j10, 1, i35, 0, null);
                        this.f49062k += this.h;
                    }
                    this.f49057e = 0;
                }
            }
        }
    }

    @Override
    public final void c() {
        this.f49057e = 0;
        this.f49058f = 0;
        this.f49059g = 0;
        this.f49062k = -9223372036854775807L;
    }

    @Override
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f49056c = e0Var.f49053e;
        e0Var.b();
        this.d = mVar.C(e0Var.d, 1);
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f49062k = j10;
        }
    }

    @Override
    public final void d() {
    }
}
