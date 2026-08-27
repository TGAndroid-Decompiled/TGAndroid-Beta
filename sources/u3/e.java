package u3;

import android.util.Pair;
import c2.a1;
import com.google.android.exoplayer2.upstream.w;
import d5.g0;
import d5.y;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import h7.u6;
import j4.u0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p8.l0;

public abstract class e {

    public static final byte[] f48280a;

    static {
        int i10 = g0.f4795a;
        f48280a = "OpusHead".getBytes(o8.d.f19363c);
    }

    public static u0 a(int i10, z zVar) {
        zVar.C(i10 + 12);
        zVar.D(1);
        b(zVar);
        zVar.D(2);
        int iR = zVar.r();
        if ((iR & 128) != 0) {
            zVar.D(2);
        }
        if ((iR & 64) != 0) {
            zVar.D(zVar.r());
        }
        if ((iR & 32) != 0) {
            zVar.D(2);
        }
        zVar.D(1);
        b(zVar);
        String strD = d5.q.d(zVar.r());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new u0(strD, null, -1L, -1L);
        }
        zVar.D(4);
        long jS = zVar.s();
        long jS2 = zVar.s();
        zVar.D(1);
        int iB = b(zVar);
        long j10 = jS2;
        byte[] bArr = new byte[iB];
        zVar.c(0, iB, bArr);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new u0(strD, bArr, j10, jS > 0 ? jS : -1L);
    }

    public static int b(z zVar) {
        int iR = zVar.r();
        int i10 = iR & 127;
        while ((iR & 128) == 128) {
            iR = zVar.r();
            i10 = (i10 << 7) | (iR & 127);
        }
        return i10;
    }

    public static Pair c(z zVar, int i10, int i11) throws t1 {
        q qVar;
        Pair pairCreate;
        int i12;
        int i13;
        int i14 = zVar.f4859b;
        while (i14 - i10 < i11) {
            zVar.C(i14);
            int iE = zVar.e();
            h7.q.a("childAtomSize must be positive", iE > 0);
            if (zVar.e() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = -1;
                Integer numValueOf = null;
                String strP = null;
                int i17 = 0;
                while (i15 - i14 < iE) {
                    zVar.C(i15);
                    int iE2 = zVar.e();
                    int iE3 = zVar.e();
                    if (iE3 == 1718775137) {
                        numValueOf = Integer.valueOf(zVar.e());
                    } else if (iE3 == 1935894637) {
                        zVar.D(4);
                        strP = zVar.p(4, o8.d.f19363c);
                    } else if (iE3 == 1935894633) {
                        i16 = i15;
                        i17 = iE2;
                    }
                    i15 += iE2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strP) || "cbc1".equals(strP) || "cens".equals(strP) || "cbcs".equals(strP)) {
                    h7.q.a("frma atom is mandatory", numValueOf != null);
                    h7.q.a("schi atom is mandatory", i16 != -1);
                    int i18 = i16 + 8;
                    while (true) {
                        if (i18 - i16 >= i17) {
                            qVar = null;
                            break;
                        }
                        zVar.C(i18);
                        int iE4 = zVar.e();
                        if (zVar.e() == 1952804451) {
                            int iB = mc.k.b(zVar.e());
                            zVar.D(1);
                            if (iB == 0) {
                                zVar.D(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int iR = zVar.r();
                                i12 = iR & 15;
                                i13 = (iR & 240) >> 4;
                            }
                            boolean z10 = zVar.r() == 1;
                            int iR2 = zVar.r();
                            byte[] bArr2 = new byte[16];
                            zVar.c(0, 16, bArr2);
                            if (z10 && iR2 == 0) {
                                int iR3 = zVar.r();
                                byte[] bArr3 = new byte[iR3];
                                zVar.c(0, iR3, bArr3);
                                bArr = bArr3;
                            }
                            qVar = new q(z10, strP, iR2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i18 += iE4;
                    }
                    h7.q.a("tenc atom is mandatory", qVar != null);
                    int i19 = g0.f4795a;
                    pairCreate = Pair.create(numValueOf, qVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iE;
        }
        return null;
    }

    public static s d(p pVar, a aVar, m3.q qVar) throws t1 {
        d wVar;
        boolean z10;
        int iU;
        int iU2;
        int iU3;
        int iA;
        int i10;
        d dVar;
        long j10;
        z zVar;
        long[] jArr;
        long[] jArr2;
        int i11;
        long j11;
        long[] jArr3;
        int[] iArr;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        z zVar2;
        int i12;
        int i13;
        int i14;
        long j12;
        long j13;
        int i15;
        int i16;
        int i17;
        int iU4;
        int iE;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int[] iArrCopyOf2;
        int i23;
        boolean z11;
        boolean z12;
        String str;
        long[] jArr4;
        long[] jArr5;
        int[] iArr2;
        int iMax;
        long j14;
        long j15;
        int i24;
        boolean zA;
        int i25;
        int iC;
        int i26;
        int iU5;
        int[] iArr3;
        long jO;
        int i27;
        int i28;
        long j16;
        int[] iArr4;
        long[] jArr6;
        long[] jArr7;
        int i29;
        int i30;
        boolean z13;
        int[] iArr5;
        int[] iArr6;
        int i31;
        boolean z14;
        int i32;
        int i33;
        int i34;
        int[] iArr7;
        int[] iArr8;
        boolean z15;
        boolean z16;
        long[] jArr8;
        int[] iArr9;
        int i35;
        int[] iArr10;
        long[] jArr9;
        int i36;
        long j17;
        int i37;
        int i38;
        long j18;
        int i39;
        int i40;
        int[] iArr11;
        int[] iArr12;
        long j19;
        int i41;
        int i42;
        int i43;
        boolean z17;
        long j20;
        int i44;
        boolean z18;
        t0 t0Var = pVar.f48356f;
        b bVarF = aVar.f(1937011578);
        if (bVarF != null) {
            wVar = new w(bVarF, t0Var);
        } else {
            b bVarF2 = aVar.f(1937013298);
            if (bVarF2 == null) {
                throw t1.a("Track has no sample table size information", null);
            }
            a1 a1Var = new a1();
            z zVar3 = bVarF2.f48272c;
            a1Var.f2232e = zVar3;
            zVar3.C(12);
            a1Var.f2230b = zVar3.u() & 255;
            a1Var.f2229a = zVar3.u();
            wVar = a1Var;
        }
        int iB = wVar.b();
        if (iB == 0) {
            return new s(pVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        b bVarF3 = aVar.f(1937007471);
        if (bVarF3 == null) {
            bVarF3 = aVar.f(1668232756);
            bVarF3.getClass();
            z10 = true;
        } else {
            z10 = false;
        }
        z zVar4 = bVarF3.f48272c;
        b bVarF4 = aVar.f(1937011555);
        bVarF4.getClass();
        z zVar5 = bVarF4.f48272c;
        b bVarF5 = aVar.f(1937011827);
        bVarF5.getClass();
        z zVar6 = bVarF5.f48272c;
        b bVarF6 = aVar.f(1937011571);
        z zVar7 = bVarF6 != null ? bVarF6.f48272c : null;
        b bVarF7 = aVar.f(1668576371);
        z zVar8 = bVarF7 != null ? bVarF7.f48272c : null;
        c cVar = new c(zVar5, zVar4, z10);
        zVar6.C(12);
        int iU6 = zVar6.u() - 1;
        int iU7 = zVar6.u();
        int iU8 = zVar6.u();
        if (zVar8 != null) {
            zVar8.C(12);
            iU = zVar8.u();
        } else {
            iU = 0;
        }
        if (zVar7 != null) {
            zVar7.C(12);
            iU2 = zVar7.u();
            if (iU2 > 0) {
                iU3 = zVar7.u() - 1;
            } else {
                zVar7 = null;
            }
            iA = wVar.a();
            i10 = pVar.f48353b;
            dVar = wVar;
            j10 = pVar.f48354c;
            zVar = zVar8;
            jArr = pVar.f48358i;
            jArr2 = pVar.h;
            i11 = iU2;
            String str2 = t0Var.B;
            j11 = 0;
            if (iA == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iU6 == 0 && iU == 0 && i11 == 0)) {
                int i45 = cVar.f48273a;
                long[] jArr10 = new long[i45];
                int[] iArr13 = new int[i45];
                while (cVar.a()) {
                    int i46 = cVar.f48274b;
                    long[] jArr11 = jArr10;
                    int[] iArr14 = iArr13;
                    jArr11[i46] = cVar.d;
                    iArr14[i46] = cVar.f48275c;
                    jArr10 = jArr11;
                    iArr13 = iArr14;
                }
                long[] jArr12 = jArr10;
                int[] iArr15 = iArr13;
                long j21 = iU8;
                int i47 = 8192 / iA;
                int i48 = 0;
                int iF = 0;
                while (i48 < i45) {
                    iF += g0.f(iArr15[i48], i47);
                    i48++;
                    iA = iA;
                }
                int i49 = iA;
                long[] jArr13 = new long[iF];
                iArrCopyOf2 = new int[iF];
                long[] jArr14 = new long[iF];
                iArr2 = new int[iF];
                int i50 = 0;
                int i51 = 0;
                iMax = 0;
                int i52 = 0;
                while (i50 < i45) {
                    int i53 = iArr15[i50];
                    long j22 = jArr12[i50];
                    int i54 = i50;
                    int i55 = i53;
                    while (i55 > 0) {
                        int iMin = Math.min(i47, i55);
                        jArr13[i52] = j22;
                        int i56 = i55;
                        int i57 = i49 * iMin;
                        iArrCopyOf2[i52] = i57;
                        iMax = Math.max(iMax, i57);
                        jArr14[i52] = ((long) i51) * j21;
                        iArr2[i52] = 1;
                        j22 += (long) iArrCopyOf2[i52];
                        i51 += iMin;
                        i55 = i56 - iMin;
                        i52++;
                        i45 = i45;
                    }
                    i50 = i54 + 1;
                }
                j14 = ((long) i51) * j21;
                jArr4 = jArr13;
                jArr5 = jArr14;
            } else {
                jArr3 = new long[iB];
                iArr = new int[iB];
                jArrCopyOf = new long[iB];
                iArrCopyOf = new int[iB];
                zVar2 = zVar7;
                i12 = iU8;
                i13 = i11;
                i14 = iU7;
                j12 = 0;
                j13 = 0;
                i15 = 0;
                i16 = 0;
                i17 = 0;
                iU4 = iU3;
                iE = 0;
                i18 = iU;
                i19 = iU6;
                i20 = 0;
                while (true) {
                    if (i20 >= iB) {
                        i21 = i19;
                        i22 = i14;
                        iArrCopyOf2 = iArr;
                        i23 = i16;
                        break;
                    }
                    j15 = j13;
                    i24 = i16;
                    zA = true;
                    while (i24 == 0) {
                        zA = cVar.a();
                        if (!zA) {
                            break;
                        }
                        int i58 = i19;
                        long j23 = cVar.d;
                        i24 = cVar.f48275c;
                        j15 = j23;
                        i19 = i58;
                        i14 = i14;
                        iB = iB;
                    }
                    i25 = iB;
                    i21 = i19;
                    i22 = i14;
                    if (!zA) {
                        d5.a.K("AtomParsers", "Unexpected end of chunk data");
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr3, i20);
                        iArrCopyOf2 = Arrays.copyOf(iArr, i20);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i20);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i20);
                        iB = i20;
                        jArr3 = jArrCopyOf2;
                        i23 = i24;
                        break;
                    }
                    if (zVar != null) {
                        iU5 = i17;
                        while (iU5 == 0 && i18 > 0) {
                            iU5 = zVar.u();
                            iE = zVar.e();
                            i18--;
                        }
                        i17 = iU5 - 1;
                    }
                    jArr3[i20] = j15;
                    iC = dVar.c();
                    iArr[i20] = iC;
                    if (iC > i15) {
                        i15 = iC;
                    }
                    jArrCopyOf[i20] = j12 + ((long) iE);
                    if (zVar2 == null) {
                        i26 = 1;
                    } else {
                        i26 = 0;
                    }
                    iArrCopyOf[i20] = i26;
                    if (i20 == iU4) {
                        iArrCopyOf[i20] = 1;
                        i13--;
                        if (i13 > 0) {
                            zVar2.getClass();
                            iU4 = zVar2.u() - 1;
                        }
                    }
                    j12 += (long) i12;
                    i14 = i22 - 1;
                    if (i14 == 0 || i21 <= 0) {
                        i19 = i21;
                    } else {
                        int iU9 = zVar6.u();
                        int iE2 = zVar6.e();
                        i19 = i21 - 1;
                        i14 = iU9;
                        i12 = iE2;
                    }
                    long j24 = j15 + ((long) iArr[i20]);
                    i16 = i24 - 1;
                    i20++;
                    j13 = j24;
                    iB = i25;
                }
                long j25 = j12 + ((long) iE);
                if (zVar == null) {
                    z11 = true;
                    break;
                }
                while (true) {
                    if (i18 <= 0) {
                        z11 = true;
                        break;
                    }
                    if (zVar.u() != 0) {
                        z11 = false;
                        break;
                    }
                    zVar.e();
                    i18--;
                }
                if (i13 == 0 || i22 != 0 || i23 != 0 || i21 != 0 || i17 != 0 || !z11) {
                    StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                    z12 = z11;
                    i0.a.x(sb2, pVar.f48352a, ": remainingSynchronizationSamples ", i13, ", remainingSamplesAtTimestampDelta ");
                    i0.a.x(sb2, i22, ", remainingSamplesInChunk ", i23, ", remainingTimestampDeltaChanges ");
                    sb2.append(i21);
                    sb2.append(", remainingSamplesAtTimestampOffset ");
                    sb2.append(i17);
                    if (z12) {
                        str = "";
                    } else {
                        str = ", ctts invalid";
                    }
                    sb2.append(str);
                    d5.a.K("AtomParsers", sb2.toString());
                }
                jArr4 = jArr3;
                jArr5 = jArrCopyOf;
                iArr2 = iArrCopyOf;
                iMax = i15;
                j14 = j25;
            }
            iArr3 = iArrCopyOf2;
            jO = g0.O(j14, 1000000L, pVar.f48354c);
            if (jArr2 == 0) {
                g0.P(jArr5, j10);
                return new s(pVar, jArr4, iArr3, iMax, jArr5, iArr2, jO);
            }
            int i59 = iMax;
            i27 = iB;
            i28 = i59;
            j16 = j14;
            iArr4 = iArr2;
            jArr6 = jArr5;
            if (jArr7.length == 1) {
                i29 = i10;
                if (i29 == 1 || jArr6.length < 2) {
                    jArr7 = jArr2;
                    jArr7 = jArr2;
                } else {
                    jArr.getClass();
                    long j26 = jArr[0];
                    long[] jArr15 = jArr4;
                    long jO2 = g0.O(jArr7[0], pVar.f48354c, pVar.d) + j26;
                    int length = jArr6.length - 1;
                    int iH = g0.h(4, 0, length);
                    int iH2 = g0.h(jArr6.length - 4, 0, length);
                    long j27 = jArr6[0];
                    if (j27 > j26 || j26 >= jArr6[iH] || jArr6[iH2] >= jO2 || jO2 > j16) {
                        jArr7 = jArr2;
                        jArr7 = jArr2;
                        jArr7 = jArr2;
                        jArr7 = jArr2;
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    if (z18) {
                        long jO3 = g0.O(j26 - j27, t0Var.P, pVar.f48354c);
                        long jO4 = g0.O(j16 - jO2, t0Var.P, pVar.f48354c);
                        if (jO3 != 0 || jO4 != 0) {
                            jArr7 = jArr2;
                            jArr7 = jArr2;
                            if (jO3 <= 2147483647L && jO4 <= 2147483647L) {
                                qVar.f17627a = (int) jO3;
                                qVar.f17628b = (int) jO4;
                                g0.P(jArr6, j10);
                                return new s(pVar, jArr15, iArr3, i28, jArr6, iArr4, g0.O(jArr7[0], 1000000L, pVar.d));
                            }
                        }
                        jArr7 = jArr2;
                        iArr4 = iArr4;
                        iArr3 = iArr3;
                        i28 = i28;
                        jArr4 = jArr15;
                    } else {
                        jArr7 = jArr2;
                        jArr4 = jArr15;
                        iArr3 = iArr3;
                        i28 = i28;
                    }
                }
            } else {
                jArr7 = jArr2;
                i29 = i10;
            }
            i30 = 1;
            if (jArr7.length == 1) {
                if (jArr7[0] == 0) {
                    jArr.getClass();
                    j20 = jArr[0];
                    for (i44 = 0; i44 < jArr6.length; i44++) {
                        jArr6[i44] = g0.O(jArr6[i44] - j20, 1000000L, pVar.f48354c);
                    }
                    return new s(pVar, jArr4, iArr3, i28, jArr6, iArr4, g0.O(j16 - j20, 1000000L, pVar.f48354c));
                }
                i30 = 1;
            }
            if (i29 == i30) {
                z13 = true;
            } else {
                z13 = false;
            }
            iArr5 = new int[jArr7.length];
            iArr6 = new int[jArr7.length];
            jArr.getClass();
            i31 = 0;
            z14 = false;
            i32 = 0;
            i33 = 0;
            while (i31 < jArr7.length) {
                iArr11 = iArr5;
                iArr12 = iArr6;
                j19 = jArr[i31];
                if (j19 != -1) {
                    i41 = i31;
                    boolean z19 = z14;
                    long jO5 = g0.O(jArr7[i31], pVar.f48354c, pVar.d);
                    iArr11[i41] = g0.e(jArr6, j19, true);
                    iArr12[i41] = g0.b(jArr6, j19 + jO5, z13);
                    while (true) {
                        i42 = iArr11[i41];
                        i43 = iArr12[i41];
                        if (i42 >= i43 || (iArr4[i42] & 1) != 0) {
                            break;
                        }
                        iArr11[i41] = i42 + 1;
                    }
                    int i60 = (i43 - i42) + i32;
                    if (i33 != i42) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z14 = z19 | z17;
                    i33 = i43;
                    i32 = i60;
                } else {
                    i41 = i31;
                }
                i31 = i41 + 1;
                iArr5 = iArr11;
                iArr6 = iArr12;
                i28 = i28;
            }
            i34 = i28;
            iArr7 = iArr5;
            iArr8 = iArr6;
            boolean z20 = z14;
            if (i32 != i27) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z20 | z15;
            if (z16) {
                jArr8 = new long[i32];
            } else {
                jArr8 = jArr4;
            }
            if (z16) {
                iArr9 = new int[i32];
            } else {
                iArr9 = iArr3;
            }
            if (z16) {
                i35 = 0;
            } else {
                i35 = i34;
            }
            if (z16) {
                iArr10 = new int[i32];
            } else {
                iArr10 = iArr4;
            }
            jArr9 = new long[i32];
            i36 = i35;
            j17 = 0;
            i37 = 0;
            i38 = 0;
            while (i37 < jArr7.length) {
                j18 = jArr[i37];
                i39 = iArr7[i37];
                long[] jArr16 = jArr7;
                i40 = iArr8[i37];
                int i61 = i36;
                if (z16) {
                    int i62 = i40 - i39;
                    System.arraycopy(jArr4, i39, jArr8, i38, i62);
                    System.arraycopy(iArr3, i39, iArr9, i38, i62);
                    System.arraycopy(iArr4, i39, iArr10, i38, i62);
                }
                i36 = i61;
                while (i39 < i40) {
                    long[] jArr17 = jArr4;
                    int[] iArr16 = iArr3;
                    long jO6 = g0.O(j17, 1000000L, pVar.d);
                    long j28 = jArr6[i39] - j18;
                    long[] jArr18 = jArr6;
                    int[] iArr17 = iArr4;
                    long j29 = j11;
                    jArr9[i38] = jO6 + g0.O(Math.max(j29, j28), 1000000L, pVar.f48354c);
                    if (!z16 && iArr9[i38] > i36) {
                        i36 = iArr16[i39];
                    }
                    i38++;
                    i39++;
                    j11 = j29;
                    jArr4 = jArr17;
                    iArr3 = iArr16;
                    iArr4 = iArr17;
                    jArr6 = jArr18;
                }
                j17 += jArr16[i37];
                i37++;
                jArr4 = jArr4;
                iArr3 = iArr3;
                iArr4 = iArr4;
                jArr6 = jArr6;
                jArr7 = jArr16;
            }
            return new s(pVar, jArr8, iArr9, i36, jArr9, iArr10, g0.O(j17, 1000000L, pVar.d));
        }
        iU2 = 0;
        iU3 = -1;
        iA = wVar.a();
        i10 = pVar.f48353b;
        dVar = wVar;
        j10 = pVar.f48354c;
        zVar = zVar8;
        jArr = pVar.f48358i;
        jArr2 = pVar.h;
        i11 = iU2;
        String str3 = t0Var.B;
        j11 = 0;
        if (iA == -1) {
            jArr3 = new long[iB];
            iArr = new int[iB];
            jArrCopyOf = new long[iB];
            iArrCopyOf = new int[iB];
            zVar2 = zVar7;
            i12 = iU8;
            i13 = i11;
            i14 = iU7;
            j12 = 0;
            j13 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            iU4 = iU3;
            iE = 0;
            i18 = iU;
            i19 = iU6;
            i20 = 0;
            while (true) {
                if (i20 >= iB) {
                    i21 = i19;
                    i22 = i14;
                    iArrCopyOf2 = iArr;
                    i23 = i16;
                    break;
                }
                j15 = j13;
                i24 = i16;
                zA = true;
                while (i24 == 0) {
                    zA = cVar.a();
                    if (!zA) {
                        break;
                        break;
                    }
                    int i510 = i19;
                    long j210 = cVar.d;
                    i24 = cVar.f48275c;
                    j15 = j210;
                    i19 = i510;
                    i14 = i14;
                    iB = iB;
                }
                i25 = iB;
                i21 = i19;
                i22 = i14;
                if (!zA) {
                    d5.a.K("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i20);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i20);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i20);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i20);
                    iB = i20;
                    jArr3 = jArrCopyOf3;
                    i23 = i24;
                    break;
                }
                if (zVar != null) {
                    iU5 = i17;
                    while (iU5 == 0) {
                        iU5 = zVar.u();
                        iE = zVar.e();
                        i18--;
                    }
                    i17 = iU5 - 1;
                }
                jArr3[i20] = j15;
                iC = dVar.c();
                iArr[i20] = iC;
                if (iC > i15) {
                    i15 = iC;
                }
                jArrCopyOf[i20] = j12 + ((long) iE);
                if (zVar2 == null) {
                    i26 = 1;
                } else {
                    i26 = 0;
                }
                iArrCopyOf[i20] = i26;
                if (i20 == iU4) {
                    iArrCopyOf[i20] = 1;
                    i13--;
                    if (i13 > 0) {
                        zVar2.getClass();
                        iU4 = zVar2.u() - 1;
                    }
                }
                j12 += (long) i12;
                i14 = i22 - 1;
                if (i14 == 0) {
                    i19 = i21;
                } else {
                    i19 = i21;
                }
                long j211 = j15 + ((long) iArr[i20]);
                i16 = i24 - 1;
                i20++;
                j13 = j211;
                iB = i25;
            }
            long j212 = j12 + ((long) iE);
            if (zVar == null) {
                z11 = true;
                break;
            }
            while (true) {
                if (i18 <= 0) {
                    z11 = true;
                    break;
                }
                if (zVar.u() != 0) {
                    z11 = false;
                    break;
                }
                zVar.e();
                i18--;
            }
            if (i13 == 0) {
                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                z12 = z11;
                i0.a.x(sb3, pVar.f48352a, ": remainingSynchronizationSamples ", i13, ", remainingSamplesAtTimestampDelta ");
                i0.a.x(sb3, i22, ", remainingSamplesInChunk ", i23, ", remainingTimestampDeltaChanges ");
                sb3.append(i21);
                sb3.append(", remainingSamplesAtTimestampOffset ");
                sb3.append(i17);
                if (z12) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb3.append(str);
                d5.a.K("AtomParsers", sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                z12 = z11;
                i0.a.x(sb4, pVar.f48352a, ": remainingSynchronizationSamples ", i13, ", remainingSamplesAtTimestampDelta ");
                i0.a.x(sb4, i22, ", remainingSamplesInChunk ", i23, ", remainingTimestampDeltaChanges ");
                sb4.append(i21);
                sb4.append(", remainingSamplesAtTimestampOffset ");
                sb4.append(i17);
                if (z12) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb4.append(str);
                d5.a.K("AtomParsers", sb4.toString());
            }
            jArr4 = jArr3;
            jArr5 = jArrCopyOf;
            iArr2 = iArrCopyOf;
            iMax = i15;
            j14 = j212;
        } else {
            jArr3 = new long[iB];
            iArr = new int[iB];
            jArrCopyOf = new long[iB];
            iArrCopyOf = new int[iB];
            zVar2 = zVar7;
            i12 = iU8;
            i13 = i11;
            i14 = iU7;
            j12 = 0;
            j13 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            iU4 = iU3;
            iE = 0;
            i18 = iU;
            i19 = iU6;
            i20 = 0;
            while (true) {
                if (i20 >= iB) {
                    i21 = i19;
                    i22 = i14;
                    iArrCopyOf2 = iArr;
                    i23 = i16;
                    break;
                }
                j15 = j13;
                i24 = i16;
                zA = true;
                while (i24 == 0) {
                    zA = cVar.a();
                    if (!zA) {
                        break;
                        break;
                    }
                    int i511 = i19;
                    long j213 = cVar.d;
                    i24 = cVar.f48275c;
                    j15 = j213;
                    i19 = i511;
                    i14 = i14;
                    iB = iB;
                }
                i25 = iB;
                i21 = i19;
                i22 = i14;
                if (!zA) {
                    d5.a.K("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf4 = Arrays.copyOf(jArr3, i20);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i20);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i20);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i20);
                    iB = i20;
                    jArr3 = jArrCopyOf4;
                    i23 = i24;
                    break;
                }
                if (zVar != null) {
                    iU5 = i17;
                    while (iU5 == 0) {
                        iU5 = zVar.u();
                        iE = zVar.e();
                        i18--;
                    }
                    i17 = iU5 - 1;
                }
                jArr3[i20] = j15;
                iC = dVar.c();
                iArr[i20] = iC;
                if (iC > i15) {
                    i15 = iC;
                }
                jArrCopyOf[i20] = j12 + ((long) iE);
                if (zVar2 == null) {
                    i26 = 1;
                } else {
                    i26 = 0;
                }
                iArrCopyOf[i20] = i26;
                if (i20 == iU4) {
                    iArrCopyOf[i20] = 1;
                    i13--;
                    if (i13 > 0) {
                        zVar2.getClass();
                        iU4 = zVar2.u() - 1;
                    }
                }
                j12 += (long) i12;
                i14 = i22 - 1;
                if (i14 == 0) {
                    i19 = i21;
                } else {
                    i19 = i21;
                }
                long j214 = j15 + ((long) iArr[i20]);
                i16 = i24 - 1;
                i20++;
                j13 = j214;
                iB = i25;
            }
            long j215 = j12 + ((long) iE);
            if (zVar == null) {
                z11 = true;
                break;
            }
            while (true) {
                if (i18 <= 0) {
                    z11 = true;
                    break;
                }
                if (zVar.u() != 0) {
                    z11 = false;
                    break;
                }
                zVar.e();
                i18--;
            }
            if (i13 == 0) {
                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                z12 = z11;
                i0.a.x(sb5, pVar.f48352a, ": remainingSynchronizationSamples ", i13, ", remainingSamplesAtTimestampDelta ");
                i0.a.x(sb5, i22, ", remainingSamplesInChunk ", i23, ", remainingTimestampDeltaChanges ");
                sb5.append(i21);
                sb5.append(", remainingSamplesAtTimestampOffset ");
                sb5.append(i17);
                if (z12) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb5.append(str);
                d5.a.K("AtomParsers", sb5.toString());
            } else {
                StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                z12 = z11;
                i0.a.x(sb6, pVar.f48352a, ": remainingSynchronizationSamples ", i13, ", remainingSamplesAtTimestampDelta ");
                i0.a.x(sb6, i22, ", remainingSamplesInChunk ", i23, ", remainingTimestampDeltaChanges ");
                sb6.append(i21);
                sb6.append(", remainingSamplesAtTimestampOffset ");
                sb6.append(i17);
                if (z12) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb6.append(str);
                d5.a.K("AtomParsers", sb6.toString());
            }
            jArr4 = jArr3;
            jArr5 = jArrCopyOf;
            iArr2 = iArrCopyOf;
            iMax = i15;
            j14 = j215;
        }
        iArr3 = iArrCopyOf2;
        jO = g0.O(j14, 1000000L, pVar.f48354c);
        if (jArr2 == 0) {
            g0.P(jArr5, j10);
            return new s(pVar, jArr4, iArr3, iMax, jArr5, iArr2, jO);
        }
        int i512 = iMax;
        i27 = iB;
        i28 = i512;
        j16 = j14;
        iArr4 = iArr2;
        jArr6 = jArr5;
        if (jArr7.length == 1) {
            i29 = i10;
            if (i29 == 1) {
                jArr7 = jArr2;
                jArr7 = jArr2;
            } else {
                jArr7 = jArr2;
                jArr7 = jArr2;
            }
        } else {
            jArr7 = jArr2;
            i29 = i10;
        }
        i30 = 1;
        if (jArr7.length == 1) {
            if (jArr7[0] == 0) {
                jArr.getClass();
                j20 = jArr[0];
                while (i44 < jArr6.length) {
                    jArr6[i44] = g0.O(jArr6[i44] - j20, 1000000L, pVar.f48354c);
                }
                return new s(pVar, jArr4, iArr3, i28, jArr6, iArr4, g0.O(j16 - j20, 1000000L, pVar.f48354c));
            }
            i30 = 1;
        }
        if (i29 == i30) {
            z13 = true;
        } else {
            z13 = false;
        }
        iArr5 = new int[jArr7.length];
        iArr6 = new int[jArr7.length];
        jArr.getClass();
        i31 = 0;
        z14 = false;
        i32 = 0;
        i33 = 0;
        while (i31 < jArr7.length) {
            iArr11 = iArr5;
            iArr12 = iArr6;
            j19 = jArr[i31];
            if (j19 != -1) {
                i41 = i31;
                boolean z110 = z14;
                long jO7 = g0.O(jArr7[i31], pVar.f48354c, pVar.d);
                iArr11[i41] = g0.e(jArr6, j19, true);
                iArr12[i41] = g0.b(jArr6, j19 + jO7, z13);
                while (true) {
                    i42 = iArr11[i41];
                    i43 = iArr12[i41];
                    if (i42 >= i43) {
                        break;
                    }
                    break;
                    break;
                    iArr11[i41] = i42 + 1;
                }
                int i63 = (i43 - i42) + i32;
                if (i33 != i42) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z14 = z110 | z17;
                i33 = i43;
                i32 = i63;
            } else {
                i41 = i31;
            }
            i31 = i41 + 1;
            iArr5 = iArr11;
            iArr6 = iArr12;
            i28 = i28;
        }
        i34 = i28;
        iArr7 = iArr5;
        iArr8 = iArr6;
        boolean z21 = z14;
        if (i32 != i27) {
            z15 = true;
        } else {
            z15 = false;
        }
        z16 = z21 | z15;
        if (z16) {
            jArr8 = new long[i32];
        } else {
            jArr8 = jArr4;
        }
        if (z16) {
            iArr9 = new int[i32];
        } else {
            iArr9 = iArr3;
        }
        if (z16) {
            i35 = 0;
        } else {
            i35 = i34;
        }
        if (z16) {
            iArr10 = new int[i32];
        } else {
            iArr10 = iArr4;
        }
        jArr9 = new long[i32];
        i36 = i35;
        j17 = 0;
        i37 = 0;
        i38 = 0;
        while (i37 < jArr7.length) {
            j18 = jArr[i37];
            i39 = iArr7[i37];
            long[] jArr19 = jArr7;
            i40 = iArr8[i37];
            int i64 = i36;
            if (z16) {
                int i65 = i40 - i39;
                System.arraycopy(jArr4, i39, jArr8, i38, i65);
                System.arraycopy(iArr3, i39, iArr9, i38, i65);
                System.arraycopy(iArr4, i39, iArr10, i38, i65);
            }
            i36 = i64;
            while (i39 < i40) {
                long[] jArr110 = jArr4;
                int[] iArr18 = iArr3;
                long jO8 = g0.O(j17, 1000000L, pVar.d);
                long j216 = jArr6[i39] - j18;
                long[] jArr111 = jArr6;
                int[] iArr19 = iArr4;
                long j217 = j11;
                jArr9[i38] = jO8 + g0.O(Math.max(j217, j216), 1000000L, pVar.f48354c);
                if (!z16) {
                }
                i38++;
                i39++;
                j11 = j217;
                jArr4 = jArr110;
                iArr3 = iArr18;
                iArr4 = iArr19;
                jArr6 = jArr111;
            }
            j17 += jArr19[i37];
            i37++;
            jArr4 = jArr4;
            iArr3 = iArr3;
            iArr4 = iArr4;
            jArr6 = jArr6;
            jArr7 = jArr19;
        }
        return new s(pVar, jArr8, iArr9, i36, jArr9, iArr10, g0.O(j17, 1000000L, pVar.d));
    }

    public static ArrayList e(a aVar, m3.q qVar, long j10, l3.d dVar, boolean z10, boolean z11, o8.e eVar) throws t1 {
        int i10;
        long jS;
        int i11;
        int i12;
        long j11;
        z zVar;
        int i13;
        long jS2;
        long jO;
        int iB;
        int i14;
        int i15;
        Pair pairCreate;
        b bVarF;
        z zVar2;
        String str;
        int iE;
        q[] qVarArr;
        long j12;
        int i16;
        t0 t0Var;
        int i17;
        int i18;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i19;
        int i20;
        a aVar2;
        Pair pair;
        int i21;
        q[] qVarArr2;
        long[] jArr;
        long[] jArr2;
        p pVar;
        a aVarE;
        b bVarF2;
        z zVar3;
        int iB2;
        int iU;
        long[] jArr3;
        long[] jArr4;
        int i22;
        Pair pairCreate2;
        long jS3;
        long jE;
        int i23;
        int iE2;
        boolean z12;
        int i24;
        int iE3;
        int i25;
        String str2;
        int i26;
        int i27;
        int iW;
        int iW2;
        int i28;
        int i29;
        int i30;
        l3.d dVarA;
        String str3;
        int i31;
        int i32;
        String str4;
        int i33;
        List list;
        int i34;
        int i35;
        float f10;
        String str5;
        byte[] bArr;
        ByteBuffer byteBuffer;
        boolean z13;
        u0 u0Var;
        int i36;
        int i37;
        int i38;
        List list2;
        int i39;
        int i40;
        l3.d dVar2;
        float f11;
        byte[] bArr2;
        s0 s0Var;
        int i41;
        int i42;
        int i43;
        byte[] bArrArray;
        int i44;
        int iE4;
        boolean z14;
        int iE5;
        List listY;
        int i45;
        l3.d dVar3;
        float fU;
        byte[] bArr3;
        com.google.android.gms.internal.clearcut.e eVarA;
        int i46;
        byte[] bArrCopyOfRange;
        boolean z15;
        e5.e eVarA2;
        int i47;
        String str6;
        String str7;
        boolean z16;
        e5.a aVarA;
        Pair pairC;
        int iW3;
        int[] iArr;
        int iRound;
        int iE6;
        int iU2;
        int i48;
        int i49;
        l3.d dVar4;
        String str8;
        String str9;
        int i50;
        String str10;
        int i51;
        int iIntValue;
        int i52;
        List list3;
        String str11;
        u0 u0Var2;
        List list4;
        int i53;
        String str12;
        s0 s0Var2;
        int iE7;
        boolean z17;
        int iE8;
        List listY2;
        int i54;
        int i55;
        int i56;
        boolean z18;
        String str13;
        int iE9;
        boolean z19;
        u0 u0VarA;
        byte[] bArr4;
        List listY3;
        int i57;
        y yVar;
        int i58;
        int i59;
        int i60;
        String str14;
        y yVar2;
        int i61;
        int i62;
        long j13;
        l0 l0VarY;
        p pVar2;
        ArrayList arrayList3;
        a aVar3 = aVar;
        ArrayList arrayList4 = aVar3.f48271e;
        ArrayList arrayList5 = new ArrayList();
        int i63 = 0;
        while (i63 < arrayList4.size()) {
            a aVar4 = (a) arrayList4.get(i63);
            if (aVar4.f18002b != 1953653099) {
                arrayList = arrayList4;
                arrayList3 = arrayList5;
                i20 = i63;
            } else {
                b bVarF3 = aVar3.f(1836476516);
                bVarF3.getClass();
                a aVarE2 = aVar4.e(1835297121);
                aVarE2.getClass();
                b bVarF4 = aVarE2.f(1751411826);
                bVarF4.getClass();
                z zVar4 = bVarF4.f48272c;
                zVar4.C(16);
                int iE10 = zVar4.e();
                if (iE10 == 1936684398) {
                    i10 = 1;
                } else if (iE10 == 1986618469) {
                    i10 = 2;
                } else if (iE10 == 1952807028 || iE10 == 1935832172 || iE10 == 1937072756 || iE10 == 1668047728) {
                    i10 = 3;
                } else {
                    i10 = iE10 == 1835365473 ? 5 : -1;
                }
                if (i10 == -1) {
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    i20 = i63;
                } else {
                    b bVarF5 = aVar4.f(1953196132);
                    bVarF5.getClass();
                    z zVar5 = bVarF5.f48272c;
                    zVar5.C(8);
                    int iB3 = mc.k.b(zVar5.e());
                    zVar5.D(iB3 == 0 ? 8 : 16);
                    int iE11 = zVar5.e();
                    zVar5.D(4);
                    int i64 = zVar5.f4859b;
                    int i65 = iB3 == 0 ? 4 : 8;
                    int i66 = 0;
                    while (true) {
                        if (i66 >= i65) {
                            zVar5.D(i65);
                        } else {
                            if (zVar5.f4858a[i64 + i66] != -1) {
                                jS = iB3 == 0 ? zVar5.s() : zVar5.v();
                                if (jS != 0) {
                                    break;
                                }
                                break;
                            }
                            i66++;
                        }
                        jS = -9223372036854775807L;
                        break;
                    }
                    zVar5.D(16);
                    int iE12 = zVar5.e();
                    int iE13 = zVar5.e();
                    zVar5.D(4);
                    int iE14 = zVar5.e();
                    int iE15 = zVar5.e();
                    if (iE12 == 0 && iE13 == 65536) {
                        i11 = -65536;
                        if (iE14 == -65536 && iE15 == 0) {
                            i12 = 90;
                        }
                        if (j10 == -9223372036854775807L) {
                            j11 = jS;
                        } else {
                            j11 = j10;
                        }
                        zVar = bVarF3.f48272c;
                        zVar.C(8);
                        if (mc.k.b(zVar.e()) == 0) {
                            i13 = 8;
                        } else {
                            i13 = 16;
                        }
                        zVar.D(i13);
                        jS2 = zVar.s();
                        jO = j11 != -9223372036854775807L ? g0.O(j11, 1000000L, jS2) : -9223372036854775807L;
                        a aVarE3 = aVarE2.e(1835626086);
                        aVarE3.getClass();
                        a aVarE4 = aVarE3.e(1937007212);
                        aVarE4.getClass();
                        b bVarF6 = aVarE2.f(1835296868);
                        bVarF6.getClass();
                        z zVar6 = bVarF6.f48272c;
                        zVar6.C(8);
                        iB = mc.k.b(zVar6.e());
                        if (iB == 0) {
                            i14 = 8;
                        } else {
                            i14 = 16;
                        }
                        zVar6.D(i14);
                        long jS4 = zVar6.s();
                        if (iB == 0) {
                            i15 = 4;
                        } else {
                            i15 = 8;
                        }
                        zVar6.D(i15);
                        int iW4 = zVar6.w();
                        pairCreate = Pair.create(Long.valueOf(jS4), "" + ((char) (((iW4 >> 10) & 31) + 96)) + ((char) (((iW4 >> 5) & 31) + 96)) + ((char) ((iW4 & 31) + 96)));
                        bVarF = aVarE4.f(1937011556);
                        if (bVarF != null) {
                            throw t1.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                        }
                        zVar2 = bVarF.f48272c;
                        str = (String) pairCreate.second;
                        zVar2.C(12);
                        iE = zVar2.e();
                        qVarArr = new q[iE];
                        j12 = jO;
                        i16 = 0;
                        t0Var = null;
                        i17 = 0;
                        i18 = 0;
                        while (i16 < iE) {
                            i23 = zVar2.f4859b;
                            iE2 = zVar2.e();
                            ArrayList arrayList6 = arrayList4;
                            if (iE2 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            i24 = iE11;
                            String str15 = "childAtomSize must be positive";
                            h7.q.a("childAtomSize must be positive", z12);
                            iE3 = zVar2.e();
                            int i67 = i63;
                            if (iE3 != 1635148593 || iE3 == 1635148595 || iE3 == 1701733238 || iE3 == 1831958048 || iE3 == 1836070006 || iE3 == 1752589105 || iE3 == 1751479857 || iE3 == 1932670515 || iE3 == 1211250227 || iE3 == 1987063864 || iE3 == 1987063865 || iE3 == 1635135537 || iE3 == 1685479798 || iE3 == 1685479729 || iE3 == 1685481573 || iE3 == 1685481521) {
                                i25 = i12;
                                arrayList5 = arrayList5;
                                str2 = "childAtomSize must be positive";
                                aVar4 = aVar4;
                                pairCreate = pairCreate;
                                i26 = i10;
                                iE = iE;
                                qVarArr = qVarArr;
                                i27 = i16;
                                zVar2.C(i23 + 16);
                                zVar2.D(16);
                                iW = zVar2.w();
                                iW2 = zVar2.w();
                                zVar2.D(50);
                                i28 = zVar2.f4859b;
                                if (iE3 == 1701733238) {
                                    i29 = i23;
                                    i30 = iE2;
                                    pairC = c(zVar2, i29, i30);
                                    if (pairC != null) {
                                        iE3 = ((Integer) pairC.first).intValue();
                                        if (dVar == null) {
                                            dVarA = null;
                                        } else {
                                            dVarA = dVar.a(((q) pairC.second).f48362b);
                                        }
                                        qVarArr[i27] = (q) pairC.second;
                                    } else {
                                        dVarA = dVar;
                                    }
                                    zVar2.C(i28);
                                } else {
                                    i29 = i23;
                                    i30 = iE2;
                                    dVarA = dVar;
                                }
                                if (iE3 == 1831958048) {
                                    str3 = "video/mpeg";
                                } else if (iE3 == 1211250227) {
                                    str3 = "video/3gpp";
                                } else {
                                    str3 = null;
                                }
                                i31 = i28;
                                i32 = i29;
                                str = str;
                                str4 = str3;
                                i33 = i18;
                                list = null;
                                i34 = -1;
                                i35 = -1;
                                f10 = 1.0f;
                                str5 = null;
                                bArr = null;
                                byteBuffer = null;
                                z13 = false;
                                u0Var = null;
                                i36 = -1;
                                i37 = -1;
                                while (true) {
                                    if (i31 - i32 >= i30) {
                                        i38 = i35;
                                        break;
                                    }
                                    zVar2.C(i31);
                                    i44 = zVar2.f4859b;
                                    int i68 = i31;
                                    iE4 = zVar2.e();
                                    i38 = i35;
                                    if (iE4 != 0 && zVar2.f4859b - i32 == i30) {
                                        break;
                                    }
                                    if (iE4 > 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    h7.q.a(str2, z14);
                                    iE5 = zVar2.e();
                                    String str16 = str2;
                                    if (iE5 == 1635148611) {
                                        if (str4 == null) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        h7.q.a(null, z16);
                                        zVar2.C(i44 + 8);
                                        aVarA = e5.a.a(zVar2);
                                        list = aVarA.f5222a;
                                        i47 = aVarA.f5223b;
                                        if (!z13) {
                                            f10 = aVarA.f5225e;
                                        }
                                        str6 = aVarA.f5226f;
                                        str7 = "video/avc";
                                    } else {
                                        if (iE5 == 1752589123) {
                                            if (str4 == null) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            h7.q.a(null, z15);
                                            zVar2.C(i44 + 8);
                                            eVarA2 = e5.e.a(zVar2);
                                            list = eVarA2.f5245a;
                                            i47 = eVarA2.f5246b;
                                            if (!z13) {
                                                f10 = eVarA2.f5247c;
                                            }
                                            str6 = eVarA2.d;
                                            str7 = "video/hevc";
                                        } else {
                                            if (iE5 != 1685480259 || iE5 == 1685485123) {
                                                iE3 = iE3;
                                                listY = list;
                                                i45 = i34;
                                                i30 = i30;
                                                dVar3 = dVarA;
                                                fU = f10;
                                                bArr3 = bArr;
                                                eVarA = com.google.android.gms.internal.clearcut.e.a(zVar2);
                                                if (eVarA != null) {
                                                    str5 = eVarA.f3807a;
                                                    str4 = "video/dolby-vision";
                                                }
                                            } else {
                                                if (iE5 == 1987076931) {
                                                    h7.q.a(null, str4 == null);
                                                    str4 = iE3 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                } else if (iE5 == 1635135811) {
                                                    h7.q.a(null, str4 == null);
                                                    str4 = "video/av01";
                                                } else if (iE5 == 1668050025) {
                                                    ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    byteBufferOrder.position(21);
                                                    byteBufferOrder.putShort(zVar2.o());
                                                    byteBufferOrder.putShort(zVar2.o());
                                                    byteBuffer = byteBufferOrder;
                                                } else {
                                                    if (iE5 == 1835295606) {
                                                        ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                        short sO = zVar2.o();
                                                        short sO2 = zVar2.o();
                                                        iE3 = iE3;
                                                        short sO3 = zVar2.o();
                                                        i30 = i30;
                                                        short sO4 = zVar2.o();
                                                        dVar3 = dVarA;
                                                        short sO5 = zVar2.o();
                                                        listY = list;
                                                        short sO6 = zVar2.o();
                                                        i45 = i34;
                                                        short sO7 = zVar2.o();
                                                        bArr3 = bArr;
                                                        short sO8 = zVar2.o();
                                                        long jS5 = zVar2.s();
                                                        long jS6 = zVar2.s();
                                                        fU = f10;
                                                        byteBufferOrder2.position(1);
                                                        byteBufferOrder2.putShort(sO5);
                                                        byteBufferOrder2.putShort(sO6);
                                                        byteBufferOrder2.putShort(sO);
                                                        byteBufferOrder2.putShort(sO2);
                                                        byteBufferOrder2.putShort(sO3);
                                                        byteBufferOrder2.putShort(sO4);
                                                        byteBufferOrder2.putShort(sO7);
                                                        byteBufferOrder2.putShort(sO8);
                                                        byteBufferOrder2.putShort((short) (jS5 / 10000));
                                                        byteBufferOrder2.putShort((short) (jS6 / 10000));
                                                        byteBuffer = byteBufferOrder2;
                                                    } else {
                                                        iE3 = iE3;
                                                        listY = list;
                                                        i45 = i34;
                                                        i30 = i30;
                                                        dVar3 = dVarA;
                                                        fU = f10;
                                                        bArr3 = bArr;
                                                        if (iE5 == 1681012275) {
                                                            h7.q.a(null, str4 == null);
                                                            str4 = "video/3gpp";
                                                        } else if (iE5 == 1702061171) {
                                                            h7.q.a(null, str4 == null);
                                                            u0 u0VarA2 = a(i44, zVar2);
                                                            String str17 = (String) u0VarA2.f12687c;
                                                            byte[] bArr5 = (byte[]) u0VarA2.d;
                                                            if (bArr5 != null) {
                                                                listY = p8.z.y(bArr5);
                                                            }
                                                            u0Var = u0VarA2;
                                                            str4 = str17;
                                                            list = listY;
                                                            i34 = i45;
                                                            bArr = bArr3;
                                                        } else if (iE5 == 1885434736) {
                                                            zVar2.C(i44 + 8);
                                                            fU = zVar2.u() / zVar2.u();
                                                            list = listY;
                                                            i34 = i45;
                                                            bArr = bArr3;
                                                            z13 = true;
                                                        } else if (iE5 == 1937126244) {
                                                            int i69 = i44 + 8;
                                                            while (true) {
                                                                if (i69 - i44 >= iE4) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                zVar2.C(i69);
                                                                int iE16 = zVar2.e();
                                                                if (zVar2.e() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(zVar2.f4858a, i69, iE16 + i69);
                                                                    break;
                                                                }
                                                                i69 += iE16;
                                                            }
                                                            bArr = bArrCopyOfRange;
                                                            list = listY;
                                                            i34 = i45;
                                                        } else if (iE5 == 1936995172) {
                                                            int iR = zVar2.r();
                                                            zVar2.D(3);
                                                            if (iR == 0) {
                                                                int iR2 = zVar2.r();
                                                                if (iR2 == 0) {
                                                                    i45 = 0;
                                                                } else if (iR2 == 1) {
                                                                    i45 = 1;
                                                                } else if (iR2 == 2) {
                                                                    i45 = 2;
                                                                } else if (iR2 == 3) {
                                                                    i45 = 3;
                                                                }
                                                            }
                                                            list = listY;
                                                            i34 = i45;
                                                            bArr = bArr3;
                                                        } else if (iE5 == 1668246642) {
                                                            int iE17 = zVar2.e();
                                                            if (iE17 == 1852009592 || iE17 == 1852009571) {
                                                                int iW5 = zVar2.w();
                                                                int iW6 = zVar2.w();
                                                                zVar2.D(2);
                                                                boolean z20 = iE4 == 19 && (zVar2.r() & 128) != 0;
                                                                int iA = e5.b.a(iW5);
                                                                int i70 = z20 ? 1 : 2;
                                                                if (iW6 != 1) {
                                                                    if (iW6 == 16) {
                                                                        i46 = 6;
                                                                    } else if (iW6 == 18) {
                                                                        i46 = 7;
                                                                    } else if (iW6 != 6 && iW6 != 7) {
                                                                        i46 = -1;
                                                                    }
                                                                    i38 = iA;
                                                                    i36 = i46;
                                                                    i37 = i70;
                                                                }
                                                                i46 = 3;
                                                                i38 = iA;
                                                                i36 = i46;
                                                                i37 = i70;
                                                            } else {
                                                                d5.a.K("AtomParsers", "Unsupported color type: " + mc.k.a(iE17));
                                                            }
                                                        }
                                                    }
                                                    list = listY;
                                                    i34 = i45;
                                                    bArr = bArr3;
                                                }
                                                dVar3 = dVarA;
                                                fU = f10;
                                            }
                                            list = listY;
                                            i34 = i45;
                                            bArr = bArr3;
                                        }
                                        i31 = i68 + iE4;
                                        i35 = i38;
                                        str2 = str16;
                                        iE3 = iE3;
                                        i30 = i30;
                                        dVarA = dVar3;
                                        f10 = fU;
                                    }
                                    str5 = str6;
                                    i33 = i47;
                                    str4 = str7;
                                    dVar3 = dVarA;
                                    fU = f10;
                                    i31 = i68 + iE4;
                                    i35 = i38;
                                    str2 = str16;
                                    iE3 = iE3;
                                    i30 = i30;
                                    dVarA = dVar3;
                                    f10 = fU;
                                }
                                list2 = list;
                                i39 = i34;
                                i40 = i30;
                                dVar2 = dVarA;
                                f11 = f10;
                                bArr2 = bArr;
                                if (str4 == null) {
                                    i12 = i25;
                                } else {
                                    s0Var = new s0();
                                    s0Var.f8123a = Integer.toString(i24);
                                    s0Var.f8135o = str4;
                                    s0Var.h = str5;
                                    s0Var.f8140t = iW;
                                    s0Var.f8141u = iW2;
                                    s0Var.f8143x = f11;
                                    i12 = i25;
                                    s0Var.f8142w = i12;
                                    s0Var.f8144y = bArr2;
                                    s0Var.f8145z = i39;
                                    s0Var.f8137q = list2;
                                    s0Var.f8138r = dVar2;
                                    i41 = i38;
                                    if (i41 == -1) {
                                        i43 = i37;
                                        i42 = i36;
                                        if (i43 == -1 || i42 != -1 || byteBuffer != null) {
                                        }
                                        if (u0Var != null) {
                                            u0 u0Var3 = u0Var;
                                            s0Var.f8127f = u6.d(u0Var3.f12685a);
                                            s0Var.f8128g = u6.d(u0Var3.f12686b);
                                        }
                                        t0Var = new t0(s0Var);
                                    } else {
                                        i42 = i36;
                                        i43 = i37;
                                    }
                                    if (byteBuffer != null) {
                                        bArrArray = byteBuffer.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    s0Var.A = new e5.b(i41, i43, i42, bArrArray);
                                    if (u0Var != null) {
                                        u0 u0Var4 = u0Var;
                                        s0Var.f8127f = u6.d(u0Var4.f12685a);
                                        s0Var.f8128g = u6.d(u0Var4.f12686b);
                                    }
                                    t0Var = new t0(s0Var);
                                }
                                i18 = i33;
                            } else {
                                i26 = i10;
                                if (iE3 == 1836069985 || iE3 == 1701733217 || iE3 == 1633889587 || iE3 == 1700998451 || iE3 == 1633889588 || iE3 == 1835823201 || iE3 == 1685353315 || iE3 == 1685353317 || iE3 == 1685353320 || iE3 == 1685353324 || iE3 == 1685353336 || iE3 == 1935764850 || iE3 == 1935767394 || iE3 == 1819304813 || iE3 == 1936684916 || iE3 == 1953984371 || iE3 == 778924082 || iE3 == 778924083 || iE3 == 1835557169 || iE3 == 1835560241 || iE3 == 1634492771 || iE3 == 1634492791 || iE3 == 1970037111 || iE3 == 1332770163 || iE3 == 1716281667) {
                                    iE = iE;
                                    qVarArr = qVarArr;
                                    int[] iArr2 = j3.b.f12308f;
                                    int[] iArr3 = j3.b.d;
                                    zVar2.C(i23 + 16);
                                    if (z11) {
                                        iW3 = zVar2.w();
                                        zVar2.D(6);
                                    } else {
                                        zVar2.D(8);
                                        iW3 = 0;
                                    }
                                    if (iW3 == 0 || iW3 == 1) {
                                        int iW7 = zVar2.w();
                                        zVar2.D(6);
                                        byte[] bArr6 = zVar2.f4858a;
                                        iArr = iArr2;
                                        int i71 = zVar2.f4859b;
                                        int i72 = i71 + 1;
                                        zVar2.f4859b = i72;
                                        int i73 = (bArr6[i71] & 255) << 8;
                                        zVar2.f4859b = i71 + 2;
                                        iRound = i73 | (bArr6[i72] & 255);
                                        zVar2.f4859b = i71 + 4;
                                        zVar2.C(i71);
                                        iE6 = zVar2.e();
                                        if (iW3 == 1) {
                                            zVar2.D(16);
                                        }
                                        iU2 = iW7;
                                    } else {
                                        if (iW3 == 2) {
                                            zVar2.D(16);
                                            iRound = (int) Math.round(Double.longBitsToDouble(zVar2.l()));
                                            iU2 = zVar2.u();
                                            zVar2.D(20);
                                            iArr = iArr2;
                                            iE6 = 0;
                                        } else {
                                            i49 = i12;
                                            arrayList5 = arrayList5;
                                            aVar4 = aVar4;
                                            pairCreate = pairCreate;
                                            i27 = i16;
                                            i32 = i23;
                                            i48 = iE2;
                                        }
                                        str = str;
                                        i12 = i49;
                                        i40 = i48;
                                    }
                                    int i74 = zVar2.f4859b;
                                    int i75 = iU2;
                                    if (iE3 == 1701733217) {
                                        Pair pairC2 = c(zVar2, i23, iE2);
                                        if (pairC2 != null) {
                                            int iIntValue2 = ((Integer) pairC2.first).intValue();
                                            l3.d dVarA2 = dVar == null ? null : dVar.a(((q) pairC2.second).f48362b);
                                            qVarArr[i16] = (q) pairC2.second;
                                            dVar4 = dVarA2;
                                            iE3 = iIntValue2;
                                        } else {
                                            dVar4 = dVar;
                                        }
                                        zVar2.C(i74);
                                    } else {
                                        dVar4 = dVar;
                                    }
                                    int i76 = iRound;
                                    String str18 = "audio/ac3";
                                    i27 = i16;
                                    if (iE3 == 1633889587) {
                                        str9 = "audio/ac3";
                                    } else if (iE3 == 1700998451) {
                                        str9 = "audio/eac3";
                                    } else if (iE3 == 1633889588) {
                                        str9 = "audio/ac4";
                                    } else {
                                        if (iE3 == 1685353315) {
                                            str8 = "audio/vnd.dts";
                                        } else if (iE3 == 1685353320 || iE3 == 1685353324) {
                                            str8 = "audio/vnd.dts.hd";
                                        } else if (iE3 == 1685353317) {
                                            str8 = "audio/vnd.dts.hd;profile=lbr";
                                        } else if (iE3 == 1685353336) {
                                            str8 = "audio/vnd.dts.uhd;profile=p2";
                                        } else if (iE3 == 1935764850) {
                                            str8 = "audio/3gpp";
                                        } else if (iE3 == 1935767394) {
                                            str8 = "audio/amr-wb";
                                        } else {
                                            str9 = "audio/raw";
                                            if (iE3 == 1819304813 || iE3 == 1936684916) {
                                                i50 = 2;
                                            } else if (iE3 == 1953984371) {
                                                i50 = 268435456;
                                            } else if (iE3 == 778924082 || iE3 == 778924083) {
                                                str8 = "audio/mpeg";
                                            } else if (iE3 == 1835557169) {
                                                str8 = "audio/mha1";
                                            } else if (iE3 == 1835560241) {
                                                str8 = "audio/mhm1";
                                            } else if (iE3 == 1634492771) {
                                                str8 = "audio/alac";
                                            } else if (iE3 == 1634492791) {
                                                str8 = "audio/g711-alaw";
                                            } else if (iE3 == 1970037111) {
                                                str8 = "audio/g711-mlaw";
                                            } else if (iE3 == 1332770163) {
                                                str8 = "audio/opus";
                                            } else if (iE3 == 1716281667) {
                                                str8 = "audio/flac";
                                            } else if (iE3 == 1835823201) {
                                                str8 = "audio/true-hd";
                                            } else {
                                                i50 = -1;
                                                str9 = null;
                                            }
                                            i49 = i12;
                                            arrayList5 = arrayList5;
                                            aVar4 = aVar4;
                                            pairCreate = pairCreate;
                                            i32 = i23;
                                            str10 = str9;
                                            i51 = i76;
                                            iIntValue = i75;
                                            i52 = i74;
                                            list3 = null;
                                            str11 = null;
                                            u0Var2 = null;
                                            while (i52 - i32 < iE2) {
                                                zVar2.C(i52);
                                                iE7 = zVar2.e();
                                                int i77 = iE2;
                                                if (iE7 > 0) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                h7.q.a(str15, z17);
                                                iE8 = zVar2.e();
                                                listY2 = list3;
                                                if (iE8 == 1835557187) {
                                                    int i78 = iE7 - 13;
                                                    byte[] bArr7 = new byte[i78];
                                                    i54 = i50;
                                                    zVar2.C(i52 + 13);
                                                    zVar2.c(0, i78, bArr7);
                                                    listY2 = p8.z.y(bArr7);
                                                    str13 = str15;
                                                    str18 = str18;
                                                    iE7 = iE7;
                                                } else {
                                                    i54 = i50;
                                                    if (iE8 == 1702061171) {
                                                        i55 = 1702061171;
                                                    } else if (z11 || iE8 != 2002876005) {
                                                        if (iE8 == 1684103987) {
                                                            zVar2.C(i52 + 8);
                                                            String string = Integer.toString(i24);
                                                            yVar2 = new y();
                                                            yVar2.o(zVar2);
                                                            int i79 = iArr3[yVar2.i(2)];
                                                            str11 = str11;
                                                            yVar2.s(8);
                                                            i61 = iArr[yVar2.i(3)];
                                                            if (yVar2.i(1) != 0) {
                                                                i62 = i61 + 1;
                                                            } else {
                                                                i62 = i61;
                                                            }
                                                            str13 = str15;
                                                            int i80 = j3.b.f12309g[yVar2.i(5)] * 1000;
                                                            yVar2.c();
                                                            zVar2.C(yVar2.f());
                                                            s0 s0Var3 = new s0();
                                                            s0Var3.f8123a = string;
                                                            s0Var3.f8135o = str18;
                                                            s0Var3.B = i62;
                                                            s0Var3.C = i79;
                                                            s0Var3.f8138r = dVar4;
                                                            s0Var3.f8125c = str;
                                                            s0Var3.f8127f = i80;
                                                            s0Var3.f8128g = i80;
                                                            t0Var = new t0(s0Var3);
                                                        } else {
                                                            str13 = str15;
                                                            str11 = str11;
                                                            if (iE8 == 1684366131) {
                                                                zVar2.C(i52 + 8);
                                                                String string2 = Integer.toString(i24);
                                                                yVar = new y();
                                                                yVar.o(zVar2);
                                                                int i81 = yVar.i(13) * 1000;
                                                                yVar.s(3);
                                                                int i82 = iArr3[yVar.i(2)];
                                                                yVar.s(10);
                                                                i58 = iArr[yVar.i(3)];
                                                                if (yVar.i(1) != 0) {
                                                                    i58++;
                                                                }
                                                                yVar.s(3);
                                                                i59 = yVar.i(4);
                                                                yVar.s(1);
                                                                i60 = i58;
                                                                if (i59 > 0) {
                                                                    yVar.t(6);
                                                                    if (yVar.i(1) != 0) {
                                                                        i58 = i60 + 2;
                                                                    } else {
                                                                        i58 = i60;
                                                                    }
                                                                    yVar.s(1);
                                                                }
                                                                if (yVar.b() > 7) {
                                                                    yVar.s(7);
                                                                    if (yVar.i(1) != 0) {
                                                                        str14 = "audio/eac3-joc";
                                                                    } else {
                                                                        str14 = "audio/eac3";
                                                                    }
                                                                } else {
                                                                    str14 = "audio/eac3";
                                                                }
                                                                yVar.c();
                                                                zVar2.C(yVar.f());
                                                                s0 s0Var4 = new s0();
                                                                s0Var4.f8123a = string2;
                                                                s0Var4.f8135o = str14;
                                                                s0Var4.B = i58;
                                                                s0Var4.C = i82;
                                                                s0Var4.f8138r = dVar4;
                                                                s0Var4.f8125c = str;
                                                                s0Var4.f8128g = i81;
                                                                t0Var = new t0(s0Var4);
                                                            } else {
                                                                iE7 = iE7;
                                                                str18 = str18;
                                                                if (iE8 == 1684103988) {
                                                                    zVar2.C(i52 + 8);
                                                                    String string3 = Integer.toString(i24);
                                                                    zVar2.D(1);
                                                                    if (((zVar2.r() & 32) >> 5) == 1) {
                                                                        i57 = 48000;
                                                                    } else {
                                                                        i57 = 44100;
                                                                    }
                                                                    s0 s0Var5 = new s0();
                                                                    s0Var5.f8123a = string3;
                                                                    s0Var5.f8135o = "audio/ac4";
                                                                    s0Var5.B = 2;
                                                                    s0Var5.C = i57;
                                                                    s0Var5.f8138r = dVar4;
                                                                    s0Var5.f8125c = str;
                                                                    t0Var = new t0(s0Var5);
                                                                } else if (iE8 == 1684892784) {
                                                                    if (iE8 == 1684305011) {
                                                                        s0 s0Var6 = new s0();
                                                                        s0Var6.f8123a = Integer.toString(i24);
                                                                        s0Var6.f8135o = str10;
                                                                        s0Var6.B = iIntValue;
                                                                        s0Var6.C = i51;
                                                                        s0Var6.f8138r = dVar4;
                                                                        s0Var6.f8125c = str;
                                                                        t0Var = new t0(s0Var6);
                                                                    } else {
                                                                        if (iE8 == 1682927731) {
                                                                            int i83 = iE7 - 8;
                                                                            byte[] bArr8 = f48280a;
                                                                            byte[] bArrCopyOf = Arrays.copyOf(bArr8, bArr8.length + i83);
                                                                            zVar2.C(i52 + 8);
                                                                            zVar2.c(bArr8.length, i83, bArrCopyOf);
                                                                            listY3 = j3.b.a(bArrCopyOf);
                                                                        } else if (iE8 == 1684425825) {
                                                                            byte[] bArr9 = new byte[iE7 - 8];
                                                                            bArr9[0] = 102;
                                                                            bArr9[1] = 76;
                                                                            bArr9[2] = 97;
                                                                            bArr9[3] = 67;
                                                                            zVar2.C(i52 + 12);
                                                                            zVar2.c(4, iE7 - 12, bArr9);
                                                                            listY3 = p8.z.y(bArr9);
                                                                        } else if (iE8 == 1634492771) {
                                                                            int i84 = iE7 - 12;
                                                                            byte[] bArr10 = new byte[i84];
                                                                            zVar2.C(i52 + 12);
                                                                            zVar2.c(0, i84, bArr10);
                                                                            z zVar7 = new z(bArr10);
                                                                            zVar7.C(9);
                                                                            int iR3 = zVar7.r();
                                                                            zVar7.C(20);
                                                                            Pair pairCreate3 = Pair.create(Integer.valueOf(zVar7.u()), Integer.valueOf(iR3));
                                                                            int iIntValue3 = ((Integer) pairCreate3.first).intValue();
                                                                            iIntValue = ((Integer) pairCreate3.second).intValue();
                                                                            listY2 = p8.z.y(bArr10);
                                                                            i51 = iIntValue3;
                                                                        }
                                                                        listY2 = listY3;
                                                                    }
                                                                    str11 = str11;
                                                                    str13 = str13;
                                                                    iE7 = iE7;
                                                                } else {
                                                                    if (iE6 > 0) {
                                                                        throw t1.a("Invalid sample rate for Dolby TrueHD MLP stream: " + iE6, null);
                                                                    }
                                                                    i51 = iE6;
                                                                    iIntValue = 2;
                                                                }
                                                                str11 = str11;
                                                                str13 = str13;
                                                                iE7 = iE7;
                                                            }
                                                        }
                                                        str11 = str11;
                                                        str13 = str13;
                                                        iE7 = iE7;
                                                    } else {
                                                        i55 = 1702061171;
                                                    }
                                                    if (iE8 == i55) {
                                                        i56 = zVar2.f4859b;
                                                        if (i56 >= i52) {
                                                            z18 = true;
                                                        } else {
                                                            z18 = false;
                                                        }
                                                        h7.q.a(null, z18);
                                                        while (true) {
                                                            iE7 = iE7;
                                                            if (i56 - i52 < iE7) {
                                                                str13 = str15;
                                                                i56 = -1;
                                                                break;
                                                            }
                                                            zVar2.C(i56);
                                                            iE9 = zVar2.e();
                                                            if (iE9 > 0) {
                                                                z19 = true;
                                                            } else {
                                                                z19 = false;
                                                            }
                                                            str13 = str15;
                                                            h7.q.a(str13, z19);
                                                            if (zVar2.e() == 1702061171) {
                                                                break;
                                                            }
                                                            i56 += iE9;
                                                            str15 = str13;
                                                            iE7 = iE7;
                                                        }
                                                    } else {
                                                        i56 = i52;
                                                        str13 = str15;
                                                        iE7 = iE7;
                                                    }
                                                    if (i56 != -1) {
                                                        u0VarA = a(i56, zVar2);
                                                        str10 = (String) u0VarA.f12687c;
                                                        bArr4 = (byte[]) u0VarA.d;
                                                        if (bArr4 != null) {
                                                            if ("audio/mp4a-latm".equals(str10)) {
                                                                j3.a aVarH = j3.b.h(new y(bArr4, bArr4.length), false);
                                                                i51 = aVarH.f12301a;
                                                                iIntValue = aVarH.f12302b;
                                                                str11 = aVarH.f12303c;
                                                            } else {
                                                                str11 = str11;
                                                            }
                                                            listY2 = p8.z.y(bArr4);
                                                        }
                                                        u0Var2 = u0VarA;
                                                    } else {
                                                        u0VarA = u0Var2;
                                                    }
                                                    str11 = str11;
                                                    u0Var2 = u0VarA;
                                                }
                                                i52 += iE7;
                                                str15 = str13;
                                                list3 = listY2;
                                                i50 = i54;
                                                iE2 = i77;
                                                str18 = str18;
                                            }
                                            list4 = list3;
                                            i53 = i50;
                                            str12 = str11;
                                            i48 = iE2;
                                            if (t0Var == null && str10 != null) {
                                                s0Var2 = new s0();
                                                s0Var2.f8123a = Integer.toString(i24);
                                                s0Var2.f8135o = str10;
                                                s0Var2.h = str12;
                                                s0Var2.B = iIntValue;
                                                s0Var2.C = i51;
                                                s0Var2.D = i53;
                                                s0Var2.f8137q = list4;
                                                s0Var2.f8138r = dVar4;
                                                s0Var2.f8125c = str;
                                                if (u0Var2 != null) {
                                                    u0 u0Var5 = u0Var2;
                                                    s0Var2.f8127f = u6.d(u0Var5.f12685a);
                                                    s0Var2.f8128g = u6.d(u0Var5.f12686b);
                                                }
                                                t0Var = new t0(s0Var2);
                                            }
                                            str = str;
                                            i12 = i49;
                                            i40 = i48;
                                        }
                                        str9 = str8;
                                    }
                                    i50 = -1;
                                    i49 = i12;
                                    arrayList5 = arrayList5;
                                    aVar4 = aVar4;
                                    pairCreate = pairCreate;
                                    i32 = i23;
                                    str10 = str9;
                                    i51 = i76;
                                    iIntValue = i75;
                                    i52 = i74;
                                    list3 = null;
                                    str11 = null;
                                    u0Var2 = null;
                                    while (i52 - i32 < iE2) {
                                        zVar2.C(i52);
                                        iE7 = zVar2.e();
                                        int i710 = iE2;
                                        if (iE7 > 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        h7.q.a(str15, z17);
                                        iE8 = zVar2.e();
                                        listY2 = list3;
                                        if (iE8 == 1835557187) {
                                            int i711 = iE7 - 13;
                                            byte[] bArr11 = new byte[i711];
                                            i54 = i50;
                                            zVar2.C(i52 + 13);
                                            zVar2.c(0, i711, bArr11);
                                            listY2 = p8.z.y(bArr11);
                                            str13 = str15;
                                            str18 = str18;
                                            iE7 = iE7;
                                        } else {
                                            i54 = i50;
                                            if (iE8 == 1702061171) {
                                                if (z11) {
                                                }
                                                if (iE8 == 1684103987) {
                                                    zVar2.C(i52 + 8);
                                                    String string4 = Integer.toString(i24);
                                                    yVar2 = new y();
                                                    yVar2.o(zVar2);
                                                    int i712 = iArr3[yVar2.i(2)];
                                                    str11 = str11;
                                                    yVar2.s(8);
                                                    i61 = iArr[yVar2.i(3)];
                                                    if (yVar2.i(1) != 0) {
                                                        i62 = i61 + 1;
                                                    } else {
                                                        i62 = i61;
                                                    }
                                                    str13 = str15;
                                                    int i85 = j3.b.f12309g[yVar2.i(5)] * 1000;
                                                    yVar2.c();
                                                    zVar2.C(yVar2.f());
                                                    s0 s0Var7 = new s0();
                                                    s0Var7.f8123a = string4;
                                                    s0Var7.f8135o = str18;
                                                    s0Var7.B = i62;
                                                    s0Var7.C = i712;
                                                    s0Var7.f8138r = dVar4;
                                                    s0Var7.f8125c = str;
                                                    s0Var7.f8127f = i85;
                                                    s0Var7.f8128g = i85;
                                                    t0Var = new t0(s0Var7);
                                                } else {
                                                    str13 = str15;
                                                    str11 = str11;
                                                    if (iE8 == 1684366131) {
                                                        zVar2.C(i52 + 8);
                                                        String string5 = Integer.toString(i24);
                                                        yVar = new y();
                                                        yVar.o(zVar2);
                                                        int i86 = yVar.i(13) * 1000;
                                                        yVar.s(3);
                                                        int i87 = iArr3[yVar.i(2)];
                                                        yVar.s(10);
                                                        i58 = iArr[yVar.i(3)];
                                                        if (yVar.i(1) != 0) {
                                                            i58++;
                                                        }
                                                        yVar.s(3);
                                                        i59 = yVar.i(4);
                                                        yVar.s(1);
                                                        i60 = i58;
                                                        if (i59 > 0) {
                                                            yVar.t(6);
                                                            if (yVar.i(1) != 0) {
                                                                i58 = i60 + 2;
                                                            } else {
                                                                i58 = i60;
                                                            }
                                                            yVar.s(1);
                                                        }
                                                        if (yVar.b() > 7) {
                                                            yVar.s(7);
                                                            if (yVar.i(1) != 0) {
                                                                str14 = "audio/eac3-joc";
                                                            } else {
                                                                str14 = "audio/eac3";
                                                            }
                                                        } else {
                                                            str14 = "audio/eac3";
                                                        }
                                                        yVar.c();
                                                        zVar2.C(yVar.f());
                                                        s0 s0Var8 = new s0();
                                                        s0Var8.f8123a = string5;
                                                        s0Var8.f8135o = str14;
                                                        s0Var8.B = i58;
                                                        s0Var8.C = i87;
                                                        s0Var8.f8138r = dVar4;
                                                        s0Var8.f8125c = str;
                                                        s0Var8.f8128g = i86;
                                                        t0Var = new t0(s0Var8);
                                                    } else {
                                                        iE7 = iE7;
                                                        str18 = str18;
                                                        if (iE8 == 1684103988) {
                                                            zVar2.C(i52 + 8);
                                                            String string6 = Integer.toString(i24);
                                                            zVar2.D(1);
                                                            if (((zVar2.r() & 32) >> 5) == 1) {
                                                                i57 = 48000;
                                                            } else {
                                                                i57 = 44100;
                                                            }
                                                            s0 s0Var9 = new s0();
                                                            s0Var9.f8123a = string6;
                                                            s0Var9.f8135o = "audio/ac4";
                                                            s0Var9.B = 2;
                                                            s0Var9.C = i57;
                                                            s0Var9.f8138r = dVar4;
                                                            s0Var9.f8125c = str;
                                                            t0Var = new t0(s0Var9);
                                                        } else if (iE8 == 1684892784) {
                                                            if (iE8 == 1684305011) {
                                                                s0 s0Var10 = new s0();
                                                                s0Var10.f8123a = Integer.toString(i24);
                                                                s0Var10.f8135o = str10;
                                                                s0Var10.B = iIntValue;
                                                                s0Var10.C = i51;
                                                                s0Var10.f8138r = dVar4;
                                                                s0Var10.f8125c = str;
                                                                t0Var = new t0(s0Var10);
                                                            } else {
                                                                if (iE8 == 1682927731) {
                                                                    int i88 = iE7 - 8;
                                                                    byte[] bArr12 = f48280a;
                                                                    byte[] bArrCopyOf2 = Arrays.copyOf(bArr12, bArr12.length + i88);
                                                                    zVar2.C(i52 + 8);
                                                                    zVar2.c(bArr12.length, i88, bArrCopyOf2);
                                                                    listY3 = j3.b.a(bArrCopyOf2);
                                                                } else if (iE8 == 1684425825) {
                                                                    byte[] bArr13 = new byte[iE7 - 8];
                                                                    bArr13[0] = 102;
                                                                    bArr13[1] = 76;
                                                                    bArr13[2] = 97;
                                                                    bArr13[3] = 67;
                                                                    zVar2.C(i52 + 12);
                                                                    zVar2.c(4, iE7 - 12, bArr13);
                                                                    listY3 = p8.z.y(bArr13);
                                                                } else if (iE8 == 1634492771) {
                                                                    int i89 = iE7 - 12;
                                                                    byte[] bArr14 = new byte[i89];
                                                                    zVar2.C(i52 + 12);
                                                                    zVar2.c(0, i89, bArr14);
                                                                    z zVar8 = new z(bArr14);
                                                                    zVar8.C(9);
                                                                    int iR4 = zVar8.r();
                                                                    zVar8.C(20);
                                                                    Pair pairCreate4 = Pair.create(Integer.valueOf(zVar8.u()), Integer.valueOf(iR4));
                                                                    int iIntValue4 = ((Integer) pairCreate4.first).intValue();
                                                                    iIntValue = ((Integer) pairCreate4.second).intValue();
                                                                    listY2 = p8.z.y(bArr14);
                                                                    i51 = iIntValue4;
                                                                }
                                                                listY2 = listY3;
                                                            }
                                                            str11 = str11;
                                                            str13 = str13;
                                                            iE7 = iE7;
                                                        } else {
                                                            if (iE6 > 0) {
                                                                throw t1.a("Invalid sample rate for Dolby TrueHD MLP stream: " + iE6, null);
                                                            }
                                                            i51 = iE6;
                                                            iIntValue = 2;
                                                        }
                                                        str11 = str11;
                                                        str13 = str13;
                                                        iE7 = iE7;
                                                    }
                                                }
                                                str11 = str11;
                                                str13 = str13;
                                                iE7 = iE7;
                                            } else {
                                                i55 = 1702061171;
                                            }
                                            if (iE8 == i55) {
                                                i56 = zVar2.f4859b;
                                                if (i56 >= i52) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                h7.q.a(null, z18);
                                                while (true) {
                                                    iE7 = iE7;
                                                    if (i56 - i52 < iE7) {
                                                        str13 = str15;
                                                        i56 = -1;
                                                        break;
                                                    }
                                                    zVar2.C(i56);
                                                    iE9 = zVar2.e();
                                                    if (iE9 > 0) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    str13 = str15;
                                                    h7.q.a(str13, z19);
                                                    if (zVar2.e() == 1702061171) {
                                                        break;
                                                        break;
                                                    }
                                                    i56 += iE9;
                                                    str15 = str13;
                                                    iE7 = iE7;
                                                }
                                            } else {
                                                i56 = i52;
                                                str13 = str15;
                                                iE7 = iE7;
                                            }
                                            if (i56 != -1) {
                                                u0VarA = a(i56, zVar2);
                                                str10 = (String) u0VarA.f12687c;
                                                bArr4 = (byte[]) u0VarA.d;
                                                if (bArr4 != null) {
                                                    if ("audio/mp4a-latm".equals(str10)) {
                                                        j3.a aVarH2 = j3.b.h(new y(bArr4, bArr4.length), false);
                                                        i51 = aVarH2.f12301a;
                                                        iIntValue = aVarH2.f12302b;
                                                        str11 = aVarH2.f12303c;
                                                    } else {
                                                        str11 = str11;
                                                    }
                                                    listY2 = p8.z.y(bArr4);
                                                }
                                                u0Var2 = u0VarA;
                                            } else {
                                                u0VarA = u0Var2;
                                            }
                                            str11 = str11;
                                            u0Var2 = u0VarA;
                                        }
                                        i52 += iE7;
                                        str15 = str13;
                                        list3 = listY2;
                                        i50 = i54;
                                        iE2 = i710;
                                        str18 = str18;
                                    }
                                    list4 = list3;
                                    i53 = i50;
                                    str12 = str11;
                                    i48 = iE2;
                                    if (t0Var == null) {
                                        s0Var2 = new s0();
                                        s0Var2.f8123a = Integer.toString(i24);
                                        s0Var2.f8135o = str10;
                                        s0Var2.h = str12;
                                        s0Var2.B = iIntValue;
                                        s0Var2.C = i51;
                                        s0Var2.D = i53;
                                        s0Var2.f8137q = list4;
                                        s0Var2.f8138r = dVar4;
                                        s0Var2.f8125c = str;
                                        if (u0Var2 != null) {
                                            u0 u0Var6 = u0Var2;
                                            s0Var2.f8127f = u6.d(u0Var6.f12685a);
                                            s0Var2.f8128g = u6.d(u0Var6.f12686b);
                                        }
                                        t0Var = new t0(s0Var2);
                                    }
                                    str = str;
                                    i12 = i49;
                                    i40 = i48;
                                } else {
                                    if (iE3 == 1414810956 || iE3 == 1954034535 || iE3 == 2004251764 || iE3 == 1937010800 || iE3 == 1664495672) {
                                        zVar2.C(i23 + 16);
                                        String str19 = "application/ttml+xml";
                                        if (iE3 == 1414810956) {
                                            j13 = Long.MAX_VALUE;
                                            l0VarY = null;
                                        } else if (iE3 == 1954034535) {
                                            int i90 = iE2 - 16;
                                            byte[] bArr15 = new byte[i90];
                                            zVar2.c(0, i90, bArr15);
                                            l0VarY = p8.z.y(bArr15);
                                            str19 = "application/x-quicktime-tx3g";
                                            j13 = Long.MAX_VALUE;
                                        } else if (iE3 == 2004251764) {
                                            str19 = "application/x-mp4-vtt";
                                            j13 = Long.MAX_VALUE;
                                            l0VarY = null;
                                        } else if (iE3 == 1937010800) {
                                            l0VarY = null;
                                            j13 = 0;
                                        } else {
                                            if (iE3 != 1664495672) {
                                                throw new IllegalStateException();
                                            }
                                            str19 = "application/x-mp4-cea-608";
                                            j13 = Long.MAX_VALUE;
                                            l0VarY = null;
                                            i17 = 1;
                                        }
                                        s0 s0Var11 = new s0();
                                        s0Var11.f8123a = Integer.toString(i24);
                                        s0Var11.f8135o = str19;
                                        s0Var11.f8125c = str;
                                        s0Var11.f8139s = j13;
                                        s0Var11.f8137q = l0VarY;
                                        i12 = i12;
                                        t0Var = new t0(s0Var11);
                                        arrayList5 = arrayList5;
                                    } else {
                                        if (iE3 == 1835365492) {
                                            zVar2.C(i23 + 16);
                                            if (iE3 == 1835365492) {
                                                zVar2.m();
                                                String strM = zVar2.m();
                                                if (strM != null) {
                                                    s0 s0Var12 = new s0();
                                                    s0Var12.f8123a = Integer.toString(i24);
                                                    s0Var12.f8135o = strM;
                                                    t0Var = new t0(s0Var12);
                                                }
                                            }
                                        } else {
                                            if (iE3 == 1667329389) {
                                                s0 s0Var13 = new s0();
                                                s0Var13.f8123a = Integer.toString(i24);
                                                s0Var13.f8135o = "application/x-camera-motion";
                                                t0Var = new t0(s0Var13);
                                            }
                                            iE = iE;
                                        }
                                        iE = iE;
                                    }
                                    i27 = i16;
                                    i32 = i23;
                                    i40 = iE2;
                                }
                            }
                            zVar2.C(i32 + i40);
                            i16 = i27 + 1;
                            i12 = i12;
                            arrayList4 = arrayList6;
                            iE11 = i24;
                            i63 = i67;
                            iE = iE;
                            str = str;
                            arrayList5 = arrayList5;
                            pairCreate = pairCreate;
                            aVar4 = aVar4;
                            i10 = i26;
                            qVarArr = qVarArr;
                            dVar = dVar;
                        }
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                        i19 = iE11;
                        i20 = i63;
                        aVar2 = aVar4;
                        pair = pairCreate;
                        i21 = i10;
                        qVarArr2 = qVarArr;
                        if (z10) {
                            aVar4 = aVar2;
                        } else {
                            aVar4 = aVar2;
                            aVarE = aVar4.e(1701082227);
                            if (aVarE == null) {
                                bVarF2 = aVarE.f(1701606260);
                                if (bVarF2 == null) {
                                    pairCreate2 = null;
                                } else {
                                    zVar3 = bVarF2.f48272c;
                                    zVar3.C(8);
                                    iB2 = mc.k.b(zVar3.e());
                                    iU = zVar3.u();
                                    jArr3 = new long[iU];
                                    jArr4 = new long[iU];
                                    for (i22 = 0; i22 < iU; i22++) {
                                        if (iB2 == 1) {
                                            jS3 = zVar3.v();
                                        } else {
                                            jS3 = zVar3.s();
                                        }
                                        jArr3[i22] = jS3;
                                        if (iB2 == 1) {
                                            jE = zVar3.l();
                                        } else {
                                            jE = zVar3.e();
                                        }
                                        jArr4[i22] = jE;
                                        if (zVar3.o() == 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        zVar3.D(2);
                                    }
                                    pairCreate2 = Pair.create(jArr3, jArr4);
                                }
                                if (pairCreate2 != null) {
                                    jArr = (long[]) pairCreate2.first;
                                    jArr2 = (long[]) pairCreate2.second;
                                }
                            }
                            if (t0Var == null) {
                                eVar = eVar;
                                pVar = new p(i19, i21, ((Long) pair.first).longValue(), jS2, j12, t0Var, i17, qVarArr2, i18, jArr, jArr2);
                            }
                            pVar2 = (p) eVar.apply(pVar);
                            if (pVar2 == null) {
                                arrayList3 = arrayList2;
                            } else {
                                a aVarE5 = aVar4.e(1835297121);
                                aVarE5.getClass();
                                a aVarE6 = aVarE5.e(1835626086);
                                aVarE6.getClass();
                                a aVarE7 = aVarE6.e(1937007212);
                                aVarE7.getClass();
                                s sVarD = d(pVar2, aVarE7, qVar);
                                arrayList3 = arrayList2;
                                arrayList3.add(sVarD);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (t0Var == null) {
                            eVar = eVar;
                            pVar = new p(i19, i21, ((Long) pair.first).longValue(), jS2, j12, t0Var, i17, qVarArr2, i18, jArr, jArr2);
                        }
                        pVar2 = (p) eVar.apply(pVar);
                        if (pVar2 == null) {
                            arrayList3 = arrayList2;
                        } else {
                            a aVarE8 = aVar4.e(1835297121);
                            aVarE8.getClass();
                            a aVarE9 = aVarE8.e(1835626086);
                            aVarE9.getClass();
                            a aVarE10 = aVarE9.e(1937007212);
                            aVarE10.getClass();
                            s sVarD2 = d(pVar2, aVarE10, qVar);
                            arrayList3 = arrayList2;
                            arrayList3.add(sVarD2);
                        }
                    } else {
                        i11 = -65536;
                    }
                    if (iE12 == 0 && iE13 == i11) {
                        if (iE14 == 65536 && iE15 == 0) {
                            i12 = 270;
                        } else {
                            i11 = -65536;
                            if (iE12 != i11) {
                                i12 = 0;
                            } else {
                                i12 = 0;
                            }
                        }
                    } else if (iE12 != i11 && iE13 == 0 && iE14 == 0 && iE15 == i11) {
                        i12 = 180;
                    } else {
                        i12 = 0;
                    }
                    if (j10 == -9223372036854775807L) {
                        j11 = jS;
                    } else {
                        j11 = j10;
                    }
                    zVar = bVarF3.f48272c;
                    zVar.C(8);
                    if (mc.k.b(zVar.e()) == 0) {
                        i13 = 8;
                    } else {
                        i13 = 16;
                    }
                    zVar.D(i13);
                    jS2 = zVar.s();
                    if (j11 != -9223372036854775807L) {
                    }
                    a aVarE11 = aVarE2.e(1835626086);
                    aVarE11.getClass();
                    a aVarE12 = aVarE11.e(1937007212);
                    aVarE12.getClass();
                    b bVarF7 = aVarE2.f(1835296868);
                    bVarF7.getClass();
                    z zVar9 = bVarF7.f48272c;
                    zVar9.C(8);
                    iB = mc.k.b(zVar9.e());
                    if (iB == 0) {
                        i14 = 8;
                    } else {
                        i14 = 16;
                    }
                    zVar9.D(i14);
                    long jS7 = zVar9.s();
                    if (iB == 0) {
                        i15 = 4;
                    } else {
                        i15 = 8;
                    }
                    zVar9.D(i15);
                    int iW8 = zVar9.w();
                    pairCreate = Pair.create(Long.valueOf(jS7), "" + ((char) (((iW8 >> 10) & 31) + 96)) + ((char) (((iW8 >> 5) & 31) + 96)) + ((char) ((iW8 & 31) + 96)));
                    bVarF = aVarE12.f(1937011556);
                    if (bVarF != null) {
                        throw t1.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    zVar2 = bVarF.f48272c;
                    str = (String) pairCreate.second;
                    zVar2.C(12);
                    iE = zVar2.e();
                    qVarArr = new q[iE];
                    j12 = jO;
                    i16 = 0;
                    t0Var = null;
                    i17 = 0;
                    i18 = 0;
                    while (i16 < iE) {
                        i23 = zVar2.f4859b;
                        iE2 = zVar2.e();
                        ArrayList arrayList7 = arrayList4;
                        if (iE2 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i24 = iE11;
                        String str110 = "childAtomSize must be positive";
                        h7.q.a("childAtomSize must be positive", z12);
                        iE3 = zVar2.e();
                        int i610 = i63;
                        if (iE3 != 1635148593) {
                            i25 = i12;
                            arrayList5 = arrayList5;
                            str2 = "childAtomSize must be positive";
                            aVar4 = aVar4;
                            pairCreate = pairCreate;
                            i26 = i10;
                            iE = iE;
                            qVarArr = qVarArr;
                            i27 = i16;
                            zVar2.C(i23 + 16);
                            zVar2.D(16);
                            iW = zVar2.w();
                            iW2 = zVar2.w();
                            zVar2.D(50);
                            i28 = zVar2.f4859b;
                            if (iE3 == 1701733238) {
                                i29 = i23;
                                i30 = iE2;
                                pairC = c(zVar2, i29, i30);
                                if (pairC != null) {
                                    iE3 = ((Integer) pairC.first).intValue();
                                    if (dVar == null) {
                                        dVarA = null;
                                    } else {
                                        dVarA = dVar.a(((q) pairC.second).f48362b);
                                    }
                                    qVarArr[i27] = (q) pairC.second;
                                } else {
                                    dVarA = dVar;
                                }
                                zVar2.C(i28);
                            } else {
                                i29 = i23;
                                i30 = iE2;
                                dVarA = dVar;
                            }
                            if (iE3 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iE3 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            i31 = i28;
                            i32 = i29;
                            str = str;
                            str4 = str3;
                            i33 = i18;
                            list = null;
                            i34 = -1;
                            i35 = -1;
                            f10 = 1.0f;
                            str5 = null;
                            bArr = null;
                            byteBuffer = null;
                            z13 = false;
                            u0Var = null;
                            i36 = -1;
                            i37 = -1;
                            while (true) {
                                if (i31 - i32 >= i30) {
                                    i38 = i35;
                                    break;
                                }
                                zVar2.C(i31);
                                i44 = zVar2.f4859b;
                                int i611 = i31;
                                iE4 = zVar2.e();
                                i38 = i35;
                                if (iE4 != 0) {
                                }
                                if (iE4 > 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                h7.q.a(str2, z14);
                                iE5 = zVar2.e();
                                String str111 = str2;
                                if (iE5 == 1635148611) {
                                    if (str4 == null) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    h7.q.a(null, z16);
                                    zVar2.C(i44 + 8);
                                    aVarA = e5.a.a(zVar2);
                                    list = aVarA.f5222a;
                                    i47 = aVarA.f5223b;
                                    if (!z13) {
                                        f10 = aVarA.f5225e;
                                    }
                                    str6 = aVarA.f5226f;
                                    str7 = "video/avc";
                                } else {
                                    if (iE5 == 1752589123) {
                                        if (str4 == null) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        h7.q.a(null, z15);
                                        zVar2.C(i44 + 8);
                                        eVarA2 = e5.e.a(zVar2);
                                        list = eVarA2.f5245a;
                                        i47 = eVarA2.f5246b;
                                        if (!z13) {
                                            f10 = eVarA2.f5247c;
                                        }
                                        str6 = eVarA2.d;
                                        str7 = "video/hevc";
                                    } else if (iE5 != 1685480259) {
                                        iE3 = iE3;
                                        listY = list;
                                        i45 = i34;
                                        i30 = i30;
                                        dVar3 = dVarA;
                                        fU = f10;
                                        bArr3 = bArr;
                                        eVarA = com.google.android.gms.internal.clearcut.e.a(zVar2);
                                        if (eVarA != null) {
                                            str5 = eVarA.f3807a;
                                            str4 = "video/dolby-vision";
                                        }
                                        list = listY;
                                        i34 = i45;
                                        bArr = bArr3;
                                    } else {
                                        iE3 = iE3;
                                        listY = list;
                                        i45 = i34;
                                        i30 = i30;
                                        dVar3 = dVarA;
                                        fU = f10;
                                        bArr3 = bArr;
                                        eVarA = com.google.android.gms.internal.clearcut.e.a(zVar2);
                                        if (eVarA != null) {
                                            str5 = eVarA.f3807a;
                                            str4 = "video/dolby-vision";
                                        }
                                        list = listY;
                                        i34 = i45;
                                        bArr = bArr3;
                                    }
                                    i31 = i611 + iE4;
                                    i35 = i38;
                                    str2 = str111;
                                    iE3 = iE3;
                                    i30 = i30;
                                    dVarA = dVar3;
                                    f10 = fU;
                                }
                                str5 = str6;
                                i33 = i47;
                                str4 = str7;
                                dVar3 = dVarA;
                                fU = f10;
                                i31 = i611 + iE4;
                                i35 = i38;
                                str2 = str111;
                                iE3 = iE3;
                                i30 = i30;
                                dVarA = dVar3;
                                f10 = fU;
                            }
                            list2 = list;
                            i39 = i34;
                            i40 = i30;
                            dVar2 = dVarA;
                            f11 = f10;
                            bArr2 = bArr;
                            if (str4 == null) {
                                i12 = i25;
                            } else {
                                s0Var = new s0();
                                s0Var.f8123a = Integer.toString(i24);
                                s0Var.f8135o = str4;
                                s0Var.h = str5;
                                s0Var.f8140t = iW;
                                s0Var.f8141u = iW2;
                                s0Var.f8143x = f11;
                                i12 = i25;
                                s0Var.f8142w = i12;
                                s0Var.f8144y = bArr2;
                                s0Var.f8145z = i39;
                                s0Var.f8137q = list2;
                                s0Var.f8138r = dVar2;
                                i41 = i38;
                                if (i41 == -1) {
                                    i43 = i37;
                                    i42 = i36;
                                    if (i43 == -1) {
                                    }
                                    if (u0Var != null) {
                                        u0 u0Var7 = u0Var;
                                        s0Var.f8127f = u6.d(u0Var7.f12685a);
                                        s0Var.f8128g = u6.d(u0Var7.f12686b);
                                    }
                                    t0Var = new t0(s0Var);
                                } else {
                                    i42 = i36;
                                    i43 = i37;
                                }
                                if (byteBuffer != null) {
                                    bArrArray = byteBuffer.array();
                                } else {
                                    bArrArray = null;
                                }
                                s0Var.A = new e5.b(i41, i43, i42, bArrArray);
                                if (u0Var != null) {
                                    u0 u0Var8 = u0Var;
                                    s0Var.f8127f = u6.d(u0Var8.f12685a);
                                    s0Var.f8128g = u6.d(u0Var8.f12686b);
                                }
                                t0Var = new t0(s0Var);
                            }
                            i18 = i33;
                        } else {
                            i25 = i12;
                            arrayList5 = arrayList5;
                            str2 = "childAtomSize must be positive";
                            aVar4 = aVar4;
                            pairCreate = pairCreate;
                            i26 = i10;
                            iE = iE;
                            qVarArr = qVarArr;
                            i27 = i16;
                            zVar2.C(i23 + 16);
                            zVar2.D(16);
                            iW = zVar2.w();
                            iW2 = zVar2.w();
                            zVar2.D(50);
                            i28 = zVar2.f4859b;
                            if (iE3 == 1701733238) {
                                i29 = i23;
                                i30 = iE2;
                                pairC = c(zVar2, i29, i30);
                                if (pairC != null) {
                                    iE3 = ((Integer) pairC.first).intValue();
                                    if (dVar == null) {
                                        dVarA = null;
                                    } else {
                                        dVarA = dVar.a(((q) pairC.second).f48362b);
                                    }
                                    qVarArr[i27] = (q) pairC.second;
                                } else {
                                    dVarA = dVar;
                                }
                                zVar2.C(i28);
                            } else {
                                i29 = i23;
                                i30 = iE2;
                                dVarA = dVar;
                            }
                            if (iE3 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iE3 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            i31 = i28;
                            i32 = i29;
                            str = str;
                            str4 = str3;
                            i33 = i18;
                            list = null;
                            i34 = -1;
                            i35 = -1;
                            f10 = 1.0f;
                            str5 = null;
                            bArr = null;
                            byteBuffer = null;
                            z13 = false;
                            u0Var = null;
                            i36 = -1;
                            i37 = -1;
                            while (true) {
                                if (i31 - i32 >= i30) {
                                    i38 = i35;
                                    break;
                                }
                                zVar2.C(i31);
                                i44 = zVar2.f4859b;
                                int i612 = i31;
                                iE4 = zVar2.e();
                                i38 = i35;
                                if (iE4 != 0) {
                                }
                                if (iE4 > 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                h7.q.a(str2, z14);
                                iE5 = zVar2.e();
                                String str112 = str2;
                                if (iE5 == 1635148611) {
                                    if (str4 == null) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    h7.q.a(null, z16);
                                    zVar2.C(i44 + 8);
                                    aVarA = e5.a.a(zVar2);
                                    list = aVarA.f5222a;
                                    i47 = aVarA.f5223b;
                                    if (!z13) {
                                        f10 = aVarA.f5225e;
                                    }
                                    str6 = aVarA.f5226f;
                                    str7 = "video/avc";
                                } else {
                                    if (iE5 == 1752589123) {
                                        if (str4 == null) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        h7.q.a(null, z15);
                                        zVar2.C(i44 + 8);
                                        eVarA2 = e5.e.a(zVar2);
                                        list = eVarA2.f5245a;
                                        i47 = eVarA2.f5246b;
                                        if (!z13) {
                                            f10 = eVarA2.f5247c;
                                        }
                                        str6 = eVarA2.d;
                                        str7 = "video/hevc";
                                    } else if (iE5 != 1685480259) {
                                        iE3 = iE3;
                                        listY = list;
                                        i45 = i34;
                                        i30 = i30;
                                        dVar3 = dVarA;
                                        fU = f10;
                                        bArr3 = bArr;
                                        eVarA = com.google.android.gms.internal.clearcut.e.a(zVar2);
                                        if (eVarA != null) {
                                            str5 = eVarA.f3807a;
                                            str4 = "video/dolby-vision";
                                        }
                                        list = listY;
                                        i34 = i45;
                                        bArr = bArr3;
                                    } else {
                                        iE3 = iE3;
                                        listY = list;
                                        i45 = i34;
                                        i30 = i30;
                                        dVar3 = dVarA;
                                        fU = f10;
                                        bArr3 = bArr;
                                        eVarA = com.google.android.gms.internal.clearcut.e.a(zVar2);
                                        if (eVarA != null) {
                                            str5 = eVarA.f3807a;
                                            str4 = "video/dolby-vision";
                                        }
                                        list = listY;
                                        i34 = i45;
                                        bArr = bArr3;
                                    }
                                    i31 = i612 + iE4;
                                    i35 = i38;
                                    str2 = str112;
                                    iE3 = iE3;
                                    i30 = i30;
                                    dVarA = dVar3;
                                    f10 = fU;
                                }
                                str5 = str6;
                                i33 = i47;
                                str4 = str7;
                                dVar3 = dVarA;
                                fU = f10;
                                i31 = i612 + iE4;
                                i35 = i38;
                                str2 = str112;
                                iE3 = iE3;
                                i30 = i30;
                                dVarA = dVar3;
                                f10 = fU;
                            }
                            list2 = list;
                            i39 = i34;
                            i40 = i30;
                            dVar2 = dVarA;
                            f11 = f10;
                            bArr2 = bArr;
                            if (str4 == null) {
                                i12 = i25;
                            } else {
                                s0Var = new s0();
                                s0Var.f8123a = Integer.toString(i24);
                                s0Var.f8135o = str4;
                                s0Var.h = str5;
                                s0Var.f8140t = iW;
                                s0Var.f8141u = iW2;
                                s0Var.f8143x = f11;
                                i12 = i25;
                                s0Var.f8142w = i12;
                                s0Var.f8144y = bArr2;
                                s0Var.f8145z = i39;
                                s0Var.f8137q = list2;
                                s0Var.f8138r = dVar2;
                                i41 = i38;
                                if (i41 == -1) {
                                    i43 = i37;
                                    i42 = i36;
                                    if (i43 == -1) {
                                    }
                                    if (u0Var != null) {
                                        u0 u0Var9 = u0Var;
                                        s0Var.f8127f = u6.d(u0Var9.f12685a);
                                        s0Var.f8128g = u6.d(u0Var9.f12686b);
                                    }
                                    t0Var = new t0(s0Var);
                                } else {
                                    i42 = i36;
                                    i43 = i37;
                                }
                                if (byteBuffer != null) {
                                    bArrArray = byteBuffer.array();
                                } else {
                                    bArrArray = null;
                                }
                                s0Var.A = new e5.b(i41, i43, i42, bArrArray);
                                if (u0Var != null) {
                                    u0 u0Var10 = u0Var;
                                    s0Var.f8127f = u6.d(u0Var10.f12685a);
                                    s0Var.f8128g = u6.d(u0Var10.f12686b);
                                }
                                t0Var = new t0(s0Var);
                            }
                            i18 = i33;
                        }
                        zVar2.C(i32 + i40);
                        i16 = i27 + 1;
                        i12 = i12;
                        arrayList4 = arrayList7;
                        iE11 = i24;
                        i63 = i610;
                        iE = iE;
                        str = str;
                        arrayList5 = arrayList5;
                        pairCreate = pairCreate;
                        aVar4 = aVar4;
                        i10 = i26;
                        qVarArr = qVarArr;
                        dVar = dVar;
                    }
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    i19 = iE11;
                    i20 = i63;
                    aVar2 = aVar4;
                    pair = pairCreate;
                    i21 = i10;
                    qVarArr2 = qVarArr;
                    if (z10) {
                        aVar4 = aVar2;
                        aVarE = aVar4.e(1701082227);
                        if (aVarE == null) {
                            bVarF2 = aVarE.f(1701606260);
                            if (bVarF2 == null) {
                                pairCreate2 = null;
                            } else {
                                zVar3 = bVarF2.f48272c;
                                zVar3.C(8);
                                iB2 = mc.k.b(zVar3.e());
                                iU = zVar3.u();
                                jArr3 = new long[iU];
                                jArr4 = new long[iU];
                                while (i22 < iU) {
                                    if (iB2 == 1) {
                                        jS3 = zVar3.v();
                                    } else {
                                        jS3 = zVar3.s();
                                    }
                                    jArr3[i22] = jS3;
                                    if (iB2 == 1) {
                                        jE = zVar3.l();
                                    } else {
                                        jE = zVar3.e();
                                    }
                                    jArr4[i22] = jE;
                                    if (zVar3.o() == 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    zVar3.D(2);
                                }
                                pairCreate2 = Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate2 != null) {
                                jArr = (long[]) pairCreate2.first;
                                jArr2 = (long[]) pairCreate2.second;
                            }
                        }
                        if (t0Var == null) {
                            eVar = eVar;
                            pVar = new p(i19, i21, ((Long) pair.first).longValue(), jS2, j12, t0Var, i17, qVarArr2, i18, jArr, jArr2);
                        }
                        pVar2 = (p) eVar.apply(pVar);
                        if (pVar2 == null) {
                            arrayList3 = arrayList2;
                        } else {
                            a aVarE13 = aVar4.e(1835297121);
                            aVarE13.getClass();
                            a aVarE14 = aVarE13.e(1835626086);
                            aVarE14.getClass();
                            a aVarE15 = aVarE14.e(1937007212);
                            aVarE15.getClass();
                            s sVarD3 = d(pVar2, aVarE15, qVar);
                            arrayList3 = arrayList2;
                            arrayList3.add(sVarD3);
                        }
                    } else {
                        aVar4 = aVar2;
                    }
                    jArr = null;
                    jArr2 = null;
                    if (t0Var == null) {
                        eVar = eVar;
                        pVar = new p(i19, i21, ((Long) pair.first).longValue(), jS2, j12, t0Var, i17, qVarArr2, i18, jArr, jArr2);
                    }
                    pVar2 = (p) eVar.apply(pVar);
                    if (pVar2 == null) {
                        arrayList3 = arrayList2;
                    } else {
                        a aVarE16 = aVar4.e(1835297121);
                        aVarE16.getClass();
                        a aVarE17 = aVarE16.e(1835626086);
                        aVarE17.getClass();
                        a aVarE18 = aVarE17.e(1937007212);
                        aVarE18.getClass();
                        s sVarD4 = d(pVar2, aVarE18, qVar);
                        arrayList3 = arrayList2;
                        arrayList3.add(sVarD4);
                    }
                }
                pVar = null;
                pVar2 = (p) eVar.apply(pVar);
                if (pVar2 == null) {
                    arrayList3 = arrayList2;
                } else {
                    a aVarE19 = aVar4.e(1835297121);
                    aVarE19.getClass();
                    a aVarE110 = aVarE19.e(1835626086);
                    aVarE110.getClass();
                    a aVarE111 = aVarE110.e(1937007212);
                    aVarE111.getClass();
                    s sVarD5 = d(pVar2, aVarE111, qVar);
                    arrayList3 = arrayList2;
                    arrayList3.add(sVarD5);
                }
            }
            i63 = i20 + 1;
            aVar3 = aVar;
            arrayList5 = arrayList3;
            arrayList4 = arrayList;
        }
        return arrayList5;
    }
}
