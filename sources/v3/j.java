package v3;

import d5.z;
import e0.i0;
import h3.s0;
import h3.t0;
import h3.t1;
import h7.t;
import j3.o0;
import java.util.ArrayList;
import java.util.Arrays;
import m3.y;
import org.telegram.ui.i6;

public final class j extends i {

    public i0 f48778n;

    public int f48779o;

    public boolean f48780p;

    public o0 f48781q;

    public y f48782r;

    @Override
    public final void a(long j10) {
        this.f48772g = j10;
        this.f48780p = j10 != 0;
        o0 o0Var = this.f48781q;
        this.f48779o = o0Var != null ? o0Var.f12396e : 0;
    }

    @Override
    public final long b(z zVar) {
        byte b10 = zVar.f4858a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        i0 i0Var = this.f48778n;
        d5.a.j(i0Var);
        int i10 = i0Var.f5064a;
        o0 o0Var = (o0) i0Var.f5065b;
        int i11 = !((d5.c[]) i0Var.f5067e)[(b10 >> 1) & (255 >>> (8 - i10))].f4779a ? o0Var.f12396e : o0Var.f12397f;
        long j10 = this.f48780p ? (this.f48779o + i11) / 4 : 0;
        byte[] bArr = zVar.f4858a;
        int length = bArr.length;
        int i12 = zVar.f4860c + 4;
        if (length < i12) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
            zVar.A(bArrCopyOf.length, bArrCopyOf);
        } else {
            zVar.B(i12);
        }
        byte[] bArr2 = zVar.f4858a;
        int i13 = zVar.f4860c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f48780p = true;
        this.f48779o = i11;
        return j10;
    }

    @Override
    public final boolean c(z zVar, long j10, i6 i6Var) throws t1 {
        i0 i0Var;
        int i10;
        if (this.f48778n != null) {
            ((t0) i6Var.f38984b).getClass();
            return false;
        }
        o0 o0Var = this.f48781q;
        if (o0Var != null) {
            y yVar = this.f48782r;
            if (yVar == null) {
                this.f48782r = t.b(zVar, true, true);
            } else {
                int i11 = zVar.f4860c;
                byte[] bArr = new byte[i11];
                System.arraycopy(zVar.f4858a, 0, bArr, 0, i11);
                int i12 = o0Var.f12393a;
                int i13 = 5;
                t.c(5, zVar, false);
                int iR = zVar.r() + 1;
                d5.y yVar2 = new d5.y(zVar.f4858a);
                yVar2.s(zVar.f4859b * 8);
                int i14 = 0;
                while (true) {
                    int i15 = 16;
                    if (i14 >= iR) {
                        o0 o0Var2 = o0Var;
                        int i16 = 6;
                        int i17 = yVar2.i(6) + 1;
                        for (int i18 = 0; i18 < i17; i18++) {
                            if (yVar2.i(16) != 0) {
                                throw t1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i19 = 1;
                        int i20 = yVar2.i(6) + 1;
                        int i21 = 0;
                        while (true) {
                            int i22 = 3;
                            if (i21 >= i20) {
                                int i23 = yVar2.i(i16) + 1;
                                int i24 = 0;
                                while (i24 < i23) {
                                    if (yVar2.i(16) > 2) {
                                        throw t1.a("residueType greater than 2 is not decodable", null);
                                    }
                                    yVar2.s(24);
                                    yVar2.s(24);
                                    yVar2.s(24);
                                    int i25 = yVar2.i(i16) + 1;
                                    int i26 = 8;
                                    yVar2.s(8);
                                    int[] iArr = new int[i25];
                                    for (int i27 = 0; i27 < i25; i27++) {
                                        iArr[i27] = ((yVar2.h() ? yVar2.i(5) : 0) * 8) + yVar2.i(3);
                                    }
                                    int i28 = 0;
                                    while (i28 < i25) {
                                        int i29 = 0;
                                        while (i29 < i26) {
                                            if ((iArr[i28] & (1 << i29)) != 0) {
                                                yVar2.s(i26);
                                            }
                                            i29++;
                                            i26 = 8;
                                        }
                                        i28++;
                                        i26 = 8;
                                    }
                                    i24++;
                                    i16 = 6;
                                }
                                int i30 = yVar2.i(i16) + 1;
                                for (int i31 = 0; i31 < i30; i31++) {
                                    int i32 = yVar2.i(16);
                                    if (i32 != 0) {
                                        d5.a.o("VorbisUtil", "mapping type other than 0 not supported: " + i32);
                                    } else {
                                        int i33 = yVar2.h() ? yVar2.i(4) + 1 : 1;
                                        if (yVar2.h()) {
                                            int i34 = yVar2.i(8) + 1;
                                            for (int i35 = 0; i35 < i34; i35++) {
                                                int i36 = i12 - 1;
                                                int i37 = 0;
                                                for (int i38 = i36; i38 > 0; i38 >>>= 1) {
                                                    i37++;
                                                }
                                                yVar2.s(i37);
                                                int i39 = 0;
                                                while (i36 > 0) {
                                                    i39++;
                                                    i36 >>>= 1;
                                                }
                                                yVar2.s(i39);
                                            }
                                        }
                                        if (yVar2.i(2) != 0) {
                                            throw t1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i33 > 1) {
                                            for (int i40 = 0; i40 < i12; i40++) {
                                                yVar2.s(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < i33; i41++) {
                                            yVar2.s(8);
                                            yVar2.s(8);
                                            yVar2.s(8);
                                        }
                                    }
                                }
                                int i42 = yVar2.i(6);
                                int i43 = i42 + 1;
                                d5.c[] cVarArr = new d5.c[i43];
                                for (int i44 = 0; i44 < i43; i44++) {
                                    boolean zH = yVar2.h();
                                    yVar2.i(16);
                                    yVar2.i(16);
                                    yVar2.i(8);
                                    d5.c cVar = new d5.c();
                                    cVar.f4779a = zH;
                                    cVarArr[i44] = cVar;
                                }
                                if (!yVar2.h()) {
                                    throw t1.a("framing bit after modes not set as expected", null);
                                }
                                int i45 = 0;
                                while (i42 > 0) {
                                    i45++;
                                    i42 >>>= 1;
                                }
                                i0Var = new i0(o0Var2, yVar, bArr, cVarArr, i45);
                                break;
                            }
                            int i46 = yVar2.i(i15);
                            if (i46 == 0) {
                                int i47 = 8;
                                yVar2.s(8);
                                yVar2.s(16);
                                yVar2.s(16);
                                yVar2.s(6);
                                yVar2.s(8);
                                int i48 = yVar2.i(4) + 1;
                                int i49 = 0;
                                while (i49 < i48) {
                                    yVar2.s(i47);
                                    i49++;
                                    i47 = 8;
                                }
                            } else {
                                if (i46 != i19) {
                                    throw t1.a("floor type greater than 1 not decodable: " + i46, null);
                                }
                                int i50 = yVar2.i(5);
                                int[] iArr2 = new int[i50];
                                int i51 = -1;
                                for (int i52 = 0; i52 < i50; i52++) {
                                    int i53 = yVar2.i(4);
                                    iArr2[i52] = i53;
                                    if (i53 > i51) {
                                        i51 = i53;
                                    }
                                }
                                int i54 = i51 + 1;
                                int[] iArr3 = new int[i54];
                                int i55 = 0;
                                while (i55 < i54) {
                                    iArr3[i55] = yVar2.i(i22) + 1;
                                    int i56 = yVar2.i(2);
                                    int i57 = 8;
                                    if (i56 > 0) {
                                        yVar2.s(8);
                                    }
                                    int i58 = 0;
                                    for (int i59 = 1; i58 < (i59 << i56); i59 = 1) {
                                        yVar2.s(i57);
                                        i58++;
                                        i57 = 8;
                                    }
                                    i55++;
                                    i22 = 3;
                                }
                                yVar2.s(2);
                                int i60 = yVar2.i(4);
                                int i61 = 0;
                                int i62 = 0;
                                for (int i63 = 0; i63 < i50; i63++) {
                                    i61 += iArr3[iArr2[i63]];
                                    while (i62 < i61) {
                                        yVar2.s(i60);
                                        i62++;
                                    }
                                }
                            }
                            i21++;
                            i16 = 6;
                            i15 = 16;
                            i19 = 1;
                        }
                    } else {
                        if (yVar2.i(24) != 5653314) {
                            throw t1.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((yVar2.d * 8) + yVar2.f4855e), null);
                        }
                        int i64 = yVar2.i(16);
                        int i65 = yVar2.i(24);
                        long[] jArr = new long[i65];
                        long jFloor = 0;
                        if (yVar2.h()) {
                            i10 = iR;
                            int i66 = yVar2.i(5) + 1;
                            int i67 = 0;
                            while (i67 < i65) {
                                int i68 = 0;
                                for (int i69 = i65 - i67; i69 > 0; i69 >>>= 1) {
                                    i68++;
                                }
                                int i70 = yVar2.i(i68);
                                int i71 = 0;
                                while (i71 < i70 && i67 < i65) {
                                    int i72 = i67;
                                    jArr[i72] = i66;
                                    i67 = i72 + 1;
                                    i71++;
                                    o0Var = o0Var;
                                }
                                i66++;
                                i67 = i67;
                                o0Var = o0Var;
                            }
                        } else {
                            boolean zH2 = yVar2.h();
                            int i73 = 0;
                            while (i73 < i65) {
                                if (!zH2) {
                                    iR = iR;
                                    jArr[i73] = yVar2.i(5) + 1;
                                } else if (yVar2.h()) {
                                    jArr[i73] = yVar2.i(i13) + 1;
                                } else {
                                    jArr[i73] = 0;
                                }
                                i73++;
                                iR = iR;
                                i13 = 5;
                            }
                            i10 = iR;
                        }
                        o0 o0Var3 = o0Var;
                        int i74 = yVar2.i(4);
                        if (i74 > 2) {
                            throw t1.a("lookup type greater than 2 not decodable: " + i74, null);
                        }
                        if (i74 == 1 || i74 == 2) {
                            yVar2.s(32);
                            yVar2.s(32);
                            int i75 = yVar2.i(4) + 1;
                            yVar2.s(1);
                            if (i74 != 1) {
                                jFloor = ((long) i65) * ((long) i64);
                            } else if (i64 != 0) {
                                jFloor = (long) Math.floor(Math.pow(i65, 1.0d / ((double) i64)));
                            }
                            yVar2.s((int) (((long) i75) * jFloor));
                        }
                        i14++;
                        iR = i10;
                        o0Var = o0Var3;
                        i13 = 5;
                    }
                }
            }
            this.f48778n = i0Var;
            if (i0Var == null) {
                return true;
            }
            o0 o0Var4 = (o0) i0Var.f5065b;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) o0Var4.f12398g);
            arrayList.add((byte[]) i0Var.d);
            z3.c cVarA = t.a(p8.z.v(((y) i0Var.f5066c).f17646a));
            s0 s0Var = new s0();
            s0Var.f8135o = "audio/vorbis";
            s0Var.f8127f = o0Var4.d;
            s0Var.f8128g = o0Var4.f12395c;
            s0Var.B = o0Var4.f12393a;
            s0Var.C = o0Var4.f12394b;
            s0Var.f8137q = arrayList;
            s0Var.f8129i = cVarA;
            i6Var.f38984b = new t0(s0Var);
            return true;
        }
        t.c(1, zVar, false);
        zVar.j();
        int iR2 = zVar.r();
        int iJ = zVar.j();
        int iG = zVar.g();
        if (iG <= 0) {
            iG = -1;
        }
        int iG2 = zVar.g();
        int i76 = iG2 > 0 ? iG2 : -1;
        zVar.g();
        int iR3 = zVar.r();
        int iPow = (int) Math.pow(2.0d, iR3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iR3 & 240) >> 4);
        zVar.r();
        ?? CopyOf = Arrays.copyOf(zVar.f4858a, zVar.f4860c);
        o0 o0Var5 = new o0();
        o0Var5.f12393a = iR2;
        o0Var5.f12394b = iJ;
        o0Var5.f12395c = iG;
        o0Var5.d = i76;
        o0Var5.f12396e = iPow;
        o0Var5.f12397f = iPow2;
        o0Var5.f12398g = CopyOf;
        this.f48781q = o0Var5;
        i0Var = null;
        this.f48778n = i0Var;
        if (i0Var == null) {
            return true;
        }
        o0 o0Var6 = (o0) i0Var.f5065b;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) o0Var6.f12398g);
        arrayList2.add((byte[]) i0Var.d);
        z3.c cVarA2 = t.a(p8.z.v(((y) i0Var.f5066c).f17646a));
        s0 s0Var2 = new s0();
        s0Var2.f8135o = "audio/vorbis";
        s0Var2.f8127f = o0Var6.d;
        s0Var2.f8128g = o0Var6.f12395c;
        s0Var2.B = o0Var6.f12393a;
        s0Var2.C = o0Var6.f12394b;
        s0Var2.f8137q = arrayList2;
        s0Var2.f8129i = cVarA2;
        i6Var.f38984b = new t0(s0Var2);
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f48778n = null;
            this.f48781q = null;
            this.f48782r = null;
        }
        this.f48779o = 0;
        this.f48780p = false;
    }
}
