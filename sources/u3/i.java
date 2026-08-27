package u3;

import android.util.Pair;
import android.util.SparseArray;
import d5.f0;
import d5.g0;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import m3.t;
import m3.w;

public final class i implements m3.k {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final t0 I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;

    public final int f48297a;

    public final List f48298b;

    public final byte[] f48302g;
    public final z h;

    public final f0 f48303i;

    public final w f48308n;

    public int f48309o;

    public int f48310p;

    public long f48311q;

    public int f48312r;

    public z f48313s;

    public long f48314t;

    public int f48315u;

    public h f48318y;

    public int f48319z;

    public final xe.b f48304j = new xe.b(7, (byte) 0);

    public final z f48305k = new z(16);
    public final z d = new z(d5.a.d);

    public final z f48300e = new z(5);

    public final z f48301f = new z();

    public final ArrayDeque f48306l = new ArrayDeque();

    public final ArrayDeque f48307m = new ArrayDeque();

    public final SparseArray f48299c = new SparseArray();

    public long f48316w = -9223372036854775807L;
    public long v = -9223372036854775807L;

    public long f48317x = -9223372036854775807L;
    public m3.m D = m3.m.f17619t;
    public w[] E = new w[0];
    public w[] F = new w[0];

    static {
        s0 s0Var = new s0();
        s0Var.f8135o = "application/x-emsg";
        I = new t0(s0Var);
    }

    public i(int i10, f0 f0Var, List list, m4.n nVar) {
        this.f48297a = i10;
        this.f48303i = f0Var;
        this.f48298b = DesugarCollections.unmodifiableList(list);
        this.f48308n = nVar;
        byte[] bArr = new byte[16];
        this.f48302g = bArr;
        this.h = new z(bArr);
    }

    public static l3.d a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) list.get(i10);
            if (bVar.f18002b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f48272c.f4858a;
                n1.d dVarE = j.e(bArr);
                UUID uuid = dVarE == null ? null : (UUID) dVarE.f18088b;
                if (uuid == null) {
                    d5.a.K("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new l3.c(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new l3.d(null, false, (l3.c[]) arrayList.toArray(new l3.c[0]));
    }

    public static void d(z zVar, int i10, r rVar) throws t1 {
        zVar.C(i10 + 8);
        int iE = zVar.e();
        if ((iE & 1) != 0) {
            throw t1.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iE & 2) != 0;
        int iU = zVar.u();
        if (iU == 0) {
            Arrays.fill(rVar.f48374l, 0, rVar.f48368e, false);
            return;
        }
        int i11 = rVar.f48368e;
        z zVar2 = rVar.f48376n;
        if (iU != i11) {
            StringBuilder sbO = i0.a.o(iU, "Senc sample count ", " is different from fragment sample count");
            sbO.append(rVar.f48368e);
            throw t1.a(sbO.toString(), null);
        }
        Arrays.fill(rVar.f48374l, 0, iU, z10);
        zVar2.z(zVar.a());
        rVar.f48373k = true;
        rVar.f48377o = true;
        zVar.c(0, zVar2.f4860c, zVar2.f4858a);
        zVar2.C(0);
        rVar.f48377o = false;
    }

    @Override
    public final int b(m3.l lVar, m3.n nVar) throws t1, EOFException, InterruptedIOException {
        ArrayDeque arrayDeque;
        f0 f0Var;
        String strM;
        String strM2;
        long j10;
        long jA;
        long jO;
        long jS;
        long jV;
        long jV2;
        h hVar;
        char c10;
        ArrayDeque arrayDeque2;
        int iB;
        int i10;
        boolean z10;
        loop0: while (true) {
            while (true) {
                int i11 = this.f48309o;
                ArrayDeque arrayDeque3 = this.f48306l;
                SparseArray sparseArray = this.f48299c;
                if (i11 == 0) {
                    int i12 = this.f48312r;
                    z zVar = this.f48305k;
                    if (i12 == 0) {
                        if (!((m3.h) lVar).d(zVar.f4858a, 0, 8, true)) {
                            return -1;
                        }
                        this.f48312r = 8;
                        zVar.C(0);
                        this.f48311q = zVar.s();
                        this.f48310p = zVar.e();
                    }
                    long j11 = this.f48311q;
                    if (j11 == 1) {
                        ((m3.h) lVar).d(zVar.f4858a, 8, 8, false);
                        this.f48312r += 8;
                        this.f48311q = zVar.v();
                    } else if (j11 == 0) {
                        long j12 = ((m3.h) lVar).f17612c;
                        if (j12 == -1 && !arrayDeque3.isEmpty()) {
                            j12 = ((a) arrayDeque3.peek()).f48270c;
                        }
                        if (j12 != -1) {
                            this.f48311q = (j12 - ((m3.h) lVar).d) + ((long) this.f48312r);
                        }
                    }
                    long j13 = this.f48311q;
                    int i13 = this.f48312r;
                    if (j13 < i13) {
                        throw t1.c("Atom size less than header length (unsupported).");
                    }
                    long j14 = ((m3.h) lVar).d - ((long) i13);
                    int i14 = this.f48310p;
                    if ((i14 == 1836019558 || i14 == 1835295092) && !this.G) {
                        this.D.n(new m3.o(this.f48316w, j14));
                        this.G = true;
                    }
                    if (this.f48310p == 1836019558) {
                        int size = sparseArray.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            r rVar = ((h) sparseArray.valueAt(i15)).f48288b;
                            rVar.getClass();
                            rVar.f48367c = j14;
                            rVar.f48366b = j14;
                        }
                    }
                    int i16 = this.f48310p;
                    if (i16 == 1835295092) {
                        this.f48318y = null;
                        this.f48314t = j14 + this.f48311q;
                        this.f48309o = 2;
                        break;
                    }
                    if (i16 == 1836019574 || i16 == 1953653099 || i16 == 1835297121 || i16 == 1835626086 || i16 == 1937007212 || i16 == 1836019558 || i16 == 1953653094 || i16 == 1836475768 || i16 == 1701082227) {
                        long j15 = (((m3.h) lVar).d + this.f48311q) - 8;
                        arrayDeque3.push(new a(i16, j15));
                        if (this.f48311q != this.f48312r) {
                            this.f48309o = 0;
                            this.f48312r = 0;
                            break;
                        }
                        e(j15);
                        break;
                    }
                    if (i16 != 1751411826 && i16 != 1835296868 && i16 != 1836476516 && i16 != 1936286840 && i16 != 1937011556 && i16 != 1937011827 && i16 != 1668576371 && i16 != 1937011555 && i16 != 1937011578 && i16 != 1937013298 && i16 != 1937007471 && i16 != 1668232756 && i16 != 1937011571 && i16 != 1952867444 && i16 != 1952868452 && i16 != 1953196132 && i16 != 1953654136 && i16 != 1953658222 && i16 != 1886614376 && i16 != 1935763834 && i16 != 1935763823 && i16 != 1936027235 && i16 != 1970628964 && i16 != 1935828848 && i16 != 1936158820 && i16 != 1701606260 && i16 != 1835362404 && i16 != 1701671783) {
                        if (this.f48311q > 2147483647L) {
                            throw t1.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f48313s = null;
                        this.f48309o = 1;
                        break;
                    }
                    if (this.f48312r != 8) {
                        throw t1.c("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f48311q > 2147483647L) {
                        throw t1.c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    z zVar2 = new z((int) this.f48311q);
                    System.arraycopy(zVar.f4858a, 0, zVar2.f4858a, 0, 8);
                    this.f48313s = zVar2;
                    this.f48309o = 1;
                    break;
                }
                arrayDeque = this.f48307m;
                f0Var = this.f48303i;
                if (i11 == 1) {
                    int i17 = ((int) this.f48311q) - this.f48312r;
                    z zVar3 = this.f48313s;
                    if (zVar3 != null) {
                        ((m3.h) lVar).d(zVar3.f4858a, 8, i17, false);
                        int i18 = this.f48310p;
                        b bVar = new b(i18, zVar3);
                        long j16 = ((m3.h) lVar).d;
                        if (!arrayDeque3.isEmpty()) {
                            ((a) arrayDeque3.peek()).d.add(bVar);
                        } else if (i18 == 1936286840) {
                            zVar3.C(8);
                            int iB2 = mc.k.b(zVar3.e());
                            zVar3.D(4);
                            long jS2 = zVar3.s();
                            if (iB2 == 0) {
                                jV = zVar3.s();
                                jV2 = zVar3.s();
                            } else {
                                jV = zVar3.v();
                                jV2 = zVar3.v();
                            }
                            long j17 = jV2 + j16;
                            long j18 = jV;
                            long jO2 = g0.O(j18, 1000000L, jS2);
                            zVar3.D(2);
                            int iW = zVar3.w();
                            int[] iArr = new int[iW];
                            long[] jArr = new long[iW];
                            long[] jArr2 = new long[iW];
                            long[] jArr3 = new long[iW];
                            long jO3 = jO2;
                            long j19 = j18;
                            int i19 = 0;
                            while (i19 < iW) {
                                int iE = zVar3.e();
                                if ((iE & Integer.MIN_VALUE) != 0) {
                                    throw t1.a("Unhandled indirect reference", null);
                                }
                                long jS3 = zVar3.s();
                                iArr[i19] = iE & Integer.MAX_VALUE;
                                jArr[i19] = j17;
                                jArr3[i19] = jO3;
                                long j20 = j19 + jS3;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                int i20 = i19;
                                jO3 = g0.O(j20, 1000000L, jS2);
                                jArr4[i20] = jO3 - jArr5[i20];
                                zVar3.D(4);
                                j17 += (long) iArr[i20];
                                jArr2 = jArr4;
                                jArr3 = jArr5;
                                i19 = i20 + 1;
                                jO2 = jO2;
                                j19 = j20;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jO2), new m3.f(iArr, jArr, jArr2, jArr3));
                            this.f48317x = ((Long) pairCreate.first).longValue();
                            this.D.n((t) pairCreate.second);
                            this.G = true;
                        } else if (i18 == 1701671783 && this.E.length != 0) {
                            zVar3.C(8);
                            int iB3 = mc.k.b(zVar3.e());
                            if (iB3 == 0) {
                                strM = zVar3.m();
                                strM.getClass();
                                strM2 = zVar3.m();
                                strM2.getClass();
                                long jS4 = zVar3.s();
                                long jO4 = g0.O(zVar3.s(), 1000000L, jS4);
                                long j21 = this.f48317x;
                                long j22 = j21 != -9223372036854775807L ? j21 + jO4 : -9223372036854775807L;
                                j10 = jO4;
                                jA = j22;
                                jO = g0.O(zVar3.s(), 1000L, jS4);
                                jS = zVar3.s();
                            } else if (iB3 != 1) {
                                com.google.android.recaptcha.internal.a.s(iB3, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jS5 = zVar3.s();
                                jA = g0.O(zVar3.v(), 1000000L, jS5);
                                long jO5 = g0.O(zVar3.s(), 1000L, jS5);
                                long jS6 = zVar3.s();
                                strM = zVar3.m();
                                strM.getClass();
                                strM2 = zVar3.m();
                                strM2.getClass();
                                jO = jO5;
                                jS = jS6;
                                j10 = -9223372036854775807L;
                            }
                            String str = strM;
                            String str2 = strM2;
                            byte[] bArr = new byte[zVar3.a()];
                            zVar3.c(0, zVar3.a(), bArr);
                            z zVar4 = new z(this.f48304j.A(new b4.a(str, str2, jO, jS, bArr)));
                            int iA = zVar4.a();
                            for (w wVar : this.E) {
                                zVar4.C(0);
                                wVar.a(iA, zVar4);
                            }
                            if (jA == -9223372036854775807L) {
                                arrayDeque.addLast(new g(iA, j10, true));
                                this.f48315u += iA;
                            } else if (arrayDeque.isEmpty()) {
                                if (f0Var != null) {
                                    jA = f0Var.a(jA);
                                }
                                long j23 = jA;
                                for (w wVar2 : this.E) {
                                    wVar2.e(j23, 1, iA, 0, null);
                                }
                            } else {
                                arrayDeque.addLast(new g(iA, jA, false));
                                this.f48315u += iA;
                            }
                        }
                    } else {
                        ((m3.h) lVar).t(i17);
                    }
                    e(((m3.h) lVar).d);
                    break;
                }
                long j24 = Long.MAX_VALUE;
                if (i11 != 2) {
                    hVar = this.f48318y;
                    if (hVar != null) {
                        c10 = 2;
                        break loop0;
                    }
                    int size2 = sparseArray.size();
                    long j25 = Long.MAX_VALUE;
                    h hVar2 = null;
                    for (int i21 = 0; i21 < size2; i21++) {
                        h hVar3 = (h) sparseArray.valueAt(i21);
                        boolean z11 = hVar3.f48296l;
                        r rVar2 = hVar3.f48288b;
                        if ((z11 || hVar3.f48291f != hVar3.d.f48381b) && (!z11 || hVar3.h != rVar2.d)) {
                            long j26 = !z11 ? hVar3.d.f48382c[hVar3.f48291f] : rVar2.f48369f[hVar3.h];
                            if (j26 < j25) {
                                hVar2 = hVar3;
                                j25 = j26;
                            }
                        }
                    }
                    c10 = 2;
                    if (hVar2 != null) {
                        int i22 = (int) ((!hVar2.f48296l ? hVar2.d.f48382c[hVar2.f48291f] : hVar2.f48288b.f48369f[hVar2.h]) - ((m3.h) lVar).d);
                        if (i22 < 0) {
                            d5.a.K("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            i22 = 0;
                        }
                        ((m3.h) lVar).t(i22);
                        this.f48318y = hVar2;
                        hVar = hVar2;
                        break loop0;
                    }
                    int i23 = (int) (this.f48314t - ((m3.h) lVar).d);
                    if (i23 < 0) {
                        throw t1.a("Offset to end of mdat was negative.", null);
                    }
                    ((m3.h) lVar).t(i23);
                    this.f48309o = 0;
                    this.f48312r = 0;
                } else {
                    int size3 = sparseArray.size();
                    h hVar4 = null;
                    for (int i24 = 0; i24 < size3; i24++) {
                        r rVar3 = ((h) sparseArray.valueAt(i24)).f48288b;
                        if (rVar3.f48377o) {
                            long j27 = rVar3.f48367c;
                            if (j27 < j24) {
                                hVar4 = (h) sparseArray.valueAt(i24);
                                j24 = j27;
                            }
                        }
                    }
                    if (hVar4 == null) {
                        this.f48309o = 3;
                    } else {
                        int i25 = (int) (j24 - ((m3.h) lVar).d);
                        if (i25 < 0) {
                            throw t1.a("Offset to encryption data was negative.", null);
                        }
                        m3.h hVar5 = (m3.h) lVar;
                        hVar5.t(i25);
                        r rVar4 = hVar4.f48288b;
                        z zVar5 = rVar4.f48376n;
                        hVar5.d(zVar5.f4858a, 0, zVar5.f4860c, false);
                        zVar5.C(0);
                        rVar4.f48377o = false;
                    }
                }
            }
        }
        r rVar5 = hVar.f48288b;
        if (this.f48309o == 3) {
            int i26 = !hVar.f48296l ? hVar.d.d[hVar.f48291f] : rVar5.h[hVar.f48291f];
            this.f48319z = i26;
            if (hVar.f48291f < hVar.f48293i) {
                ((m3.h) lVar).t(i26);
                q qVarA = hVar.a();
                if (qVarA != null) {
                    z zVar6 = rVar5.f48376n;
                    int i27 = qVarA.d;
                    if (i27 != 0) {
                        zVar6.D(i27);
                    }
                    int i28 = hVar.f48291f;
                    if (rVar5.f48373k && rVar5.f48374l[i28]) {
                        zVar6.D(zVar6.w() * 6);
                    }
                }
                if (!hVar.b()) {
                    this.f48318y = null;
                }
                this.f48309o = 3;
                return 0;
            }
            if (hVar.d.f48380a.f48357g == 1) {
                this.f48319z = i26 - 8;
                ((m3.h) lVar).t(8);
            }
            if ("audio/ac4".equals(hVar.d.f48380a.f48356f.B)) {
                this.A = hVar.c(this.f48319z, 7);
                int i29 = this.f48319z;
                z zVar7 = this.h;
                j3.b.c(i29, zVar7);
                hVar.f48287a.a(7, zVar7);
                this.A += 7;
            } else {
                this.A = hVar.c(this.f48319z, 0);
            }
            this.f48319z += this.A;
            this.f48309o = 4;
            this.B = 0;
        }
        s sVar = hVar.d;
        p pVar = sVar.f48380a;
        w wVar3 = hVar.f48287a;
        long jA2 = hVar.f48296l ? rVar5.f48371i[hVar.f48291f] : sVar.f48384f[hVar.f48291f];
        if (f0Var != null) {
            jA2 = f0Var.a(jA2);
        }
        int i30 = pVar.f48359j;
        t0 t0Var = pVar.f48356f;
        if (i30 == 0) {
            arrayDeque2 = arrayDeque;
            while (true) {
                int i31 = this.A;
                int i32 = this.f48319z;
                if (i31 >= i32) {
                    break;
                }
                this.A += wVar3.b(lVar, i32 - i31, false);
            }
        } else {
            z zVar8 = this.f48300e;
            byte[] bArr2 = zVar8.f4858a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[c10] = 0;
            int i33 = i30 + 1;
            int i34 = 4 - i30;
            while (this.A < this.f48319z) {
                int i35 = this.B;
                if (i35 == 0) {
                    ((m3.h) lVar).d(bArr2, i34, i33, false);
                    zVar8.C(0);
                    int iE2 = zVar8.e();
                    if (iE2 < 1) {
                        throw t1.a("Invalid NAL length", null);
                    }
                    this.B = iE2 - 1;
                    z zVar9 = this.d;
                    zVar9.C(0);
                    wVar3.a(4, zVar9);
                    wVar3.a(1, zVar8);
                    if (this.F.length > 0) {
                        String str3 = t0Var.B;
                        byte b10 = bArr2[4];
                        if ("video/avc".equals(str3)) {
                            i10 = i34;
                            if ((b10 & 31) != 6) {
                            }
                            z10 = true;
                            this.C = z10;
                            this.A += 5;
                            this.f48319z += i10;
                            i34 = i10;
                        } else {
                            i10 = i34;
                        }
                        if ("video/hevc".equals(str3) && ((b10 & 126) >> 1) == 39) {
                            z10 = true;
                        }
                        this.C = z10;
                        this.A += 5;
                        this.f48319z += i10;
                        i34 = i10;
                    } else {
                        i10 = i34;
                    }
                    z10 = false;
                    this.C = z10;
                    this.A += 5;
                    this.f48319z += i10;
                    i34 = i10;
                } else {
                    int i36 = i34;
                    if (this.C) {
                        z zVar10 = this.f48301f;
                        zVar10.z(i35);
                        ((m3.h) lVar).d(zVar10.f4858a, 0, this.B, false);
                        wVar3.a(this.B, zVar10);
                        iB = this.B;
                        int iJ = d5.a.J(zVar10.f4860c, zVar10.f4858a);
                        zVar10.C("video/hevc".equals(t0Var.B) ? 1 : 0);
                        zVar10.B(iJ);
                        h7.p.a(jA2, zVar10, this.F);
                    } else {
                        iB = wVar3.b(lVar, i35, false);
                    }
                    this.A += iB;
                    this.B -= iB;
                    i34 = i36;
                    i33 = i33;
                    zVar8 = zVar8;
                }
                arrayDeque = arrayDeque;
            }
            arrayDeque2 = arrayDeque;
        }
        int i37 = hVar.f48296l ? rVar5.f48372j[hVar.f48291f] ? 1 : 0 : hVar.d.f48385g[hVar.f48291f];
        if (hVar.a() != null) {
            i37 |= 1073741824;
        }
        int i38 = i37;
        q qVarA2 = hVar.a();
        long j28 = jA2;
        wVar3.e(j28, i38, this.f48319z, 0, qVarA2 != null ? qVarA2.f48363c : null);
        while (!arrayDeque2.isEmpty()) {
            g gVar = (g) arrayDeque2.removeFirst();
            this.f48315u -= gVar.f48286c;
            long jA3 = gVar.f48284a;
            if (gVar.f48285b) {
                jA3 += j28;
            }
            if (f0Var != null) {
                jA3 = f0Var.a(jA3);
            }
            long j29 = jA3;
            for (w wVar4 : this.E) {
                wVar4.e(j29, 1, gVar.f48286c, this.f48315u, null);
            }
        }
        if (!hVar.b()) {
            this.f48318y = null;
        }
        this.f48309o = 3;
        return 0;
    }

    @Override
    public final void c(m3.m mVar) {
        int i10;
        this.D = mVar;
        int i11 = 0;
        this.f48309o = 0;
        this.f48312r = 0;
        w[] wVarArr = new w[2];
        this.E = wVarArr;
        w wVar = this.f48308n;
        if (wVar != null) {
            wVarArr[0] = wVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f48297a & 4) != 0) {
            wVarArr[i10] = mVar.C(100, 5);
            i12 = 101;
            i10++;
        }
        w[] wVarArr2 = (w[]) g0.J(i10, this.E);
        this.E = wVarArr2;
        for (w wVar2 : wVarArr2) {
            wVar2.c(I);
        }
        List list = this.f48298b;
        this.F = new w[list.size()];
        while (i11 < this.F.length) {
            w wVarC = this.D.C(i12, 3);
            wVarC.c((t0) list.get(i11));
            this.F[i11] = wVarC;
            i11++;
            i12++;
        }
    }

    public final void e(long j10) throws t1 {
        f fVar;
        f fVar2;
        l3.d dVar;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        int i12;
        int size;
        int i13;
        b bVar;
        z zVar;
        byte[] bArr;
        int i14;
        boolean z10;
        while (true) {
            ArrayDeque arrayDeque = this.f48306l;
            if (arrayDeque.isEmpty() || ((a) arrayDeque.peek()).f48270c != j10) {
                break;
            }
            a aVar = (a) arrayDeque.pop();
            int i15 = aVar.f18002b;
            ArrayList arrayList3 = aVar.f48271e;
            ArrayList arrayList4 = aVar.d;
            int i16 = this.f48297a;
            int i17 = 12;
            SparseArray sparseArray = this.f48299c;
            if (i15 == 1836019574) {
                l3.d dVarA = a(arrayList4);
                a aVarE = aVar.e(1836475768);
                aVarE.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList5 = aVarE.d;
                int size2 = arrayList5.size();
                int i18 = 0;
                long jS = -9223372036854775807L;
                while (i18 < size2) {
                    b bVar2 = (b) arrayList5.get(i18);
                    int i19 = bVar2.f18002b;
                    z zVar2 = bVar2.f48272c;
                    if (i19 == 1953654136) {
                        zVar2.C(i17);
                        dVar = dVarA;
                        Pair pairCreate = Pair.create(Integer.valueOf(zVar2.e()), new f(zVar2.e() - 1, zVar2.e(), zVar2.e(), zVar2.e()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (f) pairCreate.second);
                    } else {
                        dVar = dVarA;
                        if (i19 == 1835362404) {
                            zVar2.C(8);
                            jS = mc.k.b(zVar2.e()) == 0 ? zVar2.s() : zVar2.v();
                        }
                    }
                    i18++;
                    dVarA = dVar;
                    i17 = 12;
                }
                ArrayList arrayListE = e.e(aVar, new m3.q(), jS, dVarA, (i16 & 16) != 0, false, new t0.c(this, 2));
                int size3 = arrayListE.size();
                if (sparseArray.size() == 0) {
                    for (int i20 = 0; i20 < size3; i20++) {
                        s sVar = (s) arrayListE.get(i20);
                        p pVar = sVar.f48380a;
                        m3.m mVar = this.D;
                        int i21 = pVar.f48353b;
                        int i22 = pVar.f48352a;
                        w wVarC = mVar.C(i20, i21);
                        if (sparseArray2.size() == 1) {
                            fVar = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar = (f) sparseArray2.get(i22);
                            fVar.getClass();
                        }
                        sparseArray.put(i22, new h(wVarC, sVar, fVar));
                        this.f48316w = Math.max(this.f48316w, pVar.f48355e);
                    }
                    this.D.A();
                } else {
                    d5.a.i(sparseArray.size() == size3);
                    for (int i23 = 0; i23 < size3; i23++) {
                        s sVar2 = (s) arrayListE.get(i23);
                        p pVar2 = sVar2.f48380a;
                        h hVar = (h) sparseArray.get(pVar2.f48352a);
                        int i24 = pVar2.f48352a;
                        if (sparseArray2.size() == 1) {
                            fVar2 = (f) sparseArray2.valueAt(0);
                        } else {
                            fVar2 = (f) sparseArray2.get(i24);
                            fVar2.getClass();
                        }
                        hVar.d = sVar2;
                        hVar.f48290e = fVar2;
                        hVar.f48287a.c(sVar2.f48380a.f48356f);
                        hVar.d();
                    }
                }
            } else if (i15 == 1836019558) {
                int size4 = arrayList3.size();
                int i25 = 0;
                while (i25 < size4) {
                    a aVar2 = (a) arrayList3.get(i25);
                    if (aVar2.f18002b == 1953653094) {
                        b bVarF = aVar2.f(1952868452);
                        ArrayList arrayList6 = aVar2.d;
                        bVarF.getClass();
                        z zVar3 = bVarF.f48272c;
                        zVar3.C(8);
                        int iE = zVar3.e();
                        h hVar2 = (h) sparseArray.get(zVar3.e());
                        if (hVar2 == null) {
                            size4 = size4;
                            hVar2 = null;
                        } else {
                            r rVar = hVar2.f48288b;
                            if ((iE & 1) != 0) {
                                long jV = zVar3.v();
                                rVar.f48366b = jV;
                                rVar.f48367c = jV;
                            }
                            f fVar3 = hVar2.f48290e;
                            rVar.f48365a = new f((iE & 2) != 0 ? zVar3.e() - 1 : fVar3.f48281a, (iE & 8) != 0 ? zVar3.e() : fVar3.f48282b, (iE & 16) != 0 ? zVar3.e() : fVar3.f48283c, (iE & 32) != 0 ? zVar3.e() : fVar3.d);
                        }
                        if (hVar2 != null) {
                            r rVar2 = hVar2.f48288b;
                            long j11 = rVar2.f48378p;
                            boolean z11 = rVar2.f48379q;
                            hVar2.d();
                            hVar2.f48296l = true;
                            b bVarF2 = aVar2.f(1952867444);
                            if (bVarF2 == null || (i16 & 2) != 0) {
                                rVar2.f48378p = j11;
                                rVar2.f48379q = z11;
                            } else {
                                z zVar4 = bVarF2.f48272c;
                                zVar4.C(8);
                                rVar2.f48378p = mc.k.b(zVar4.e()) == 1 ? zVar4.v() : zVar4.s();
                                rVar2.f48379q = true;
                            }
                            int size5 = arrayList6.size();
                            int i26 = 0;
                            int i27 = 0;
                            int i28 = 0;
                            while (true) {
                                i12 = 1953658222;
                                if (i26 >= size5) {
                                    break;
                                }
                                b bVar3 = (b) arrayList6.get(i26);
                                int i29 = i25;
                                if (bVar3.f18002b == 1953658222) {
                                    z zVar5 = bVar3.f48272c;
                                    zVar5.C(12);
                                    int iU = zVar5.u();
                                    if (iU > 0) {
                                        i28 += iU;
                                        i27++;
                                    }
                                }
                                i26++;
                                i25 = i29;
                            }
                            i10 = i25;
                            hVar2.h = 0;
                            hVar2.f48292g = 0;
                            hVar2.f48291f = 0;
                            rVar2.d = i27;
                            rVar2.f48368e = i28;
                            if (rVar2.f48370g.length < i27) {
                                rVar2.f48369f = new long[i27];
                                rVar2.f48370g = new int[i27];
                            }
                            if (rVar2.h.length < i28) {
                                int i30 = (i28 * 125) / 100;
                                rVar2.h = new int[i30];
                                rVar2.f48371i = new long[i30];
                                rVar2.f48372j = new boolean[i30];
                                rVar2.f48374l = new boolean[i30];
                            }
                            int i31 = 0;
                            int i32 = 0;
                            int i33 = 0;
                            while (true) {
                                long j12 = 0;
                                if (i31 >= size5) {
                                    arrayList = arrayList3;
                                    arrayList2 = arrayList4;
                                    i11 = i16;
                                    p pVar3 = hVar2.d.f48380a;
                                    f fVar4 = rVar2.f48365a;
                                    fVar4.getClass();
                                    q qVar = pVar3.f48360k[fVar4.f48281a];
                                    b bVarF3 = aVar2.f(1935763834);
                                    if (bVarF3 != null) {
                                        qVar.getClass();
                                        z zVar6 = bVarF3.f48272c;
                                        int i34 = qVar.d;
                                        zVar6.C(8);
                                        if ((zVar6.e() & 1) == 1) {
                                            zVar6.D(8);
                                        }
                                        int iR = zVar6.r();
                                        int iU2 = zVar6.u();
                                        if (iU2 > rVar2.f48368e) {
                                            StringBuilder sbO = i0.a.o(iU2, "Saiz sample count ", " is greater than fragment sample count");
                                            sbO.append(rVar2.f48368e);
                                            throw t1.a(sbO.toString(), null);
                                        }
                                        if (iR == 0) {
                                            boolean[] zArr = rVar2.f48374l;
                                            i14 = 0;
                                            for (int i35 = 0; i35 < iU2; i35++) {
                                                int iR2 = zVar6.r();
                                                i14 += iR2;
                                                zArr[i35] = iR2 > i34;
                                            }
                                            z10 = false;
                                        } else {
                                            i14 = iR * iU2;
                                            z10 = false;
                                            Arrays.fill(rVar2.f48374l, 0, iU2, iR > i34);
                                        }
                                        Arrays.fill(rVar2.f48374l, iU2, rVar2.f48368e, z10);
                                        if (i14 > 0) {
                                            rVar2.f48376n.z(i14);
                                            rVar2.f48373k = true;
                                            rVar2.f48377o = true;
                                        }
                                    }
                                    b bVarF4 = aVar2.f(1935763823);
                                    if (bVarF4 != null) {
                                        z zVar7 = bVarF4.f48272c;
                                        zVar7.C(8);
                                        int iE2 = zVar7.e();
                                        if ((iE2 & 1) == 1) {
                                            zVar7.D(8);
                                        }
                                        int iU3 = zVar7.u();
                                        if (iU3 != 1) {
                                            throw t1.a("Unexpected saio entry count: " + iU3, null);
                                        }
                                        rVar2.f48367c += mc.k.b(iE2) == 0 ? zVar7.s() : zVar7.v();
                                    }
                                    byte[] bArr2 = null;
                                    b bVarF5 = aVar2.f(1936027235);
                                    if (bVarF5 != null) {
                                        d(bVarF5.f48272c, 0, rVar2);
                                    }
                                    String str = qVar != null ? qVar.f48362b : null;
                                    z zVar8 = null;
                                    z zVar9 = null;
                                    for (int i36 = 0; i36 < arrayList6.size(); i36++) {
                                        b bVar4 = (b) arrayList6.get(i36);
                                        z zVar10 = bVar4.f48272c;
                                        int i37 = bVar4.f18002b;
                                        if (i37 == 1935828848) {
                                            zVar10.C(12);
                                            if (zVar10.e() == 1936025959) {
                                                zVar8 = zVar10;
                                            }
                                        } else if (i37 == 1936158820) {
                                            zVar10.C(12);
                                            if (zVar10.e() == 1936025959) {
                                                zVar9 = zVar10;
                                            }
                                        }
                                    }
                                    if (zVar8 != null && zVar9 != null) {
                                        zVar8.C(8);
                                        int iB = mc.k.b(zVar8.e());
                                        zVar8.D(4);
                                        if (iB == 1) {
                                            zVar8.D(4);
                                        }
                                        if (zVar8.e() != 1) {
                                            throw t1.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        zVar9.C(8);
                                        int iB2 = mc.k.b(zVar9.e());
                                        zVar9.D(4);
                                        if (iB2 == 1) {
                                            if (zVar9.s() == 0) {
                                                throw t1.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iB2 >= 2) {
                                            zVar9.D(4);
                                        }
                                        if (zVar9.s() != 1) {
                                            throw t1.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        zVar9.D(1);
                                        int iR3 = zVar9.r();
                                        int i38 = (iR3 & 240) >> 4;
                                        int i39 = iR3 & 15;
                                        boolean z12 = zVar9.r() == 1;
                                        if (z12) {
                                            int iR4 = zVar9.r();
                                            byte[] bArr3 = new byte[16];
                                            zVar9.c(0, 16, bArr3);
                                            if (iR4 == 0) {
                                                int iR5 = zVar9.r();
                                                bArr2 = new byte[iR5];
                                                zVar9.c(0, iR5, bArr2);
                                            }
                                            rVar2.f48373k = true;
                                            rVar2.f48375m = new q(z12, str, iR4, bArr3, i38, i39, bArr2);
                                        }
                                        size = arrayList6.size();
                                        for (i13 = 0; i13 < size; i13++) {
                                            bVar = (b) arrayList6.get(i13);
                                            if (bVar.f18002b == 1970628964) {
                                                zVar = bVar.f48272c;
                                                zVar.C(8);
                                                bArr = this.f48302g;
                                                zVar.c(0, 16, bArr);
                                                if (!Arrays.equals(bArr, H)) {
                                                    d(zVar, 16, rVar2);
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    size = arrayList6.size();
                                    while (i13 < size) {
                                        bVar = (b) arrayList6.get(i13);
                                        if (bVar.f18002b == 1970628964) {
                                            zVar = bVar.f48272c;
                                            zVar.C(8);
                                            bArr = this.f48302g;
                                            zVar.c(0, 16, bArr);
                                            if (!Arrays.equals(bArr, H)) {
                                                d(zVar, 16, rVar2);
                                            }
                                        }
                                    }
                                    break;
                                    break;
                                }
                                b bVar5 = (b) arrayList6.get(i31);
                                if (bVar5.f18002b == i12) {
                                    int i40 = i32 + 1;
                                    z zVar11 = bVar5.f48272c;
                                    zVar11.C(8);
                                    int iE3 = zVar11.e();
                                    p pVar4 = hVar2.d.f48380a;
                                    f fVar5 = rVar2.f48365a;
                                    int i41 = g0.f4795a;
                                    rVar2.f48370g[i32] = zVar11.u();
                                    long[] jArr = rVar2.f48369f;
                                    long j13 = rVar2.f48366b;
                                    jArr[i32] = j13;
                                    if ((iE3 & 1) != 0) {
                                        jArr[i32] = j13 + ((long) zVar11.e());
                                    }
                                    boolean z13 = (iE3 & 4) != 0;
                                    int iE4 = fVar5.d;
                                    if (z13) {
                                        iE4 = zVar11.e();
                                    }
                                    boolean z14 = z13;
                                    boolean z15 = (iE3 & 256) != 0;
                                    boolean z16 = (iE3 & 512) != 0;
                                    boolean z17 = (iE3 & 1024) != 0;
                                    boolean z18 = (iE3 & 2048) != 0;
                                    boolean z19 = z17;
                                    long[] jArr2 = pVar4.h;
                                    int i42 = iE4;
                                    if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                        j12 = pVar4.f48358i[0];
                                    }
                                    int[] iArr = rVar2.h;
                                    long[] jArr3 = rVar2.f48371i;
                                    boolean[] zArr2 = rVar2.f48372j;
                                    boolean z20 = pVar4.f48353b == 2 && (i16 & 1) != 0;
                                    int i43 = rVar2.f48370g[i32] + i33;
                                    long j14 = pVar4.f48354c;
                                    long j15 = rVar2.f48378p;
                                    int i44 = i33;
                                    while (i44 < i43) {
                                        int iE5 = z15 ? zVar11.e() : fVar5.f48282b;
                                        int i45 = i44;
                                        if (iE5 < 0) {
                                            throw t1.a("Unexpected negative value: " + iE5, null);
                                        }
                                        int iE6 = z16 ? zVar11.e() : fVar5.f48283c;
                                        if (iE6 < 0) {
                                            throw t1.a("Unexpected negative value: " + iE6, null);
                                        }
                                        int iE7 = z19 ? zVar11.e() : (i45 == 0 && z14) ? i42 : fVar5.d;
                                        f fVar6 = fVar5;
                                        long jO = g0.O((((long) (z18 ? zVar11.e() : 0)) + j15) - j12, 1000000L, j14);
                                        jArr3[i45] = jO;
                                        if (!rVar2.f48379q) {
                                            jArr3[i45] = jO + hVar2.d.h;
                                        }
                                        iArr[i45] = iE6;
                                        zArr2[i45] = ((iE7 >> 16) & 1) == 0 && (!z20 || i45 == 0);
                                        j15 += (long) iE5;
                                        i44 = i45 + 1;
                                        z20 = z20;
                                        fVar5 = fVar6;
                                    }
                                    rVar2.f48378p = j15;
                                    i33 = i43;
                                    i32 = i40;
                                }
                                i31++;
                                size5 = size5;
                                arrayList3 = arrayList3;
                                arrayList4 = arrayList4;
                                i16 = i16;
                                i12 = 1953658222;
                            }
                        } else {
                            i10 = i25;
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                            i11 = i16;
                        }
                    } else {
                        size4 = size4;
                        i10 = i25;
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                        i11 = i16;
                    }
                    i25 = i10 + 1;
                    size4 = size4;
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    i16 = i11;
                }
                l3.d dVarA2 = a(arrayList4);
                if (dVarA2 != null) {
                    int size6 = sparseArray.size();
                    for (int i46 = 0; i46 < size6; i46++) {
                        h hVar3 = (h) sparseArray.valueAt(i46);
                        p pVar5 = hVar3.d.f48380a;
                        f fVar7 = hVar3.f48288b.f48365a;
                        int i47 = g0.f4795a;
                        q qVar2 = pVar5.f48360k[fVar7.f48281a];
                        l3.d dVarA3 = dVarA2.a(qVar2 != null ? qVar2.f48362b : null);
                        s0 s0VarA = hVar3.d.f48380a.f48356f.a();
                        s0VarA.f8138r = dVarA3;
                        hVar3.f48287a.c(new t0(s0VarA));
                    }
                }
                if (this.v != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i48 = 0; i48 < size7; i48++) {
                        h hVar4 = (h) sparseArray.valueAt(i48);
                        long j16 = this.v;
                        int i49 = hVar4.f48291f;
                        while (true) {
                            r rVar3 = hVar4.f48288b;
                            if (i49 >= rVar3.f48368e || rVar3.f48371i[i49] > j16) {
                                break;
                            }
                            if (rVar3.f48372j[i49]) {
                                hVar4.f48293i = i49;
                            }
                            i49++;
                        }
                    }
                    this.v = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((a) arrayDeque.peek()).f48271e.add(aVar);
            }
        }
        this.f48309o = 0;
        this.f48312r = 0;
    }

    @Override
    public final boolean f(m3.l lVar) {
        return j.i(lVar, true, false);
    }

    @Override
    public final void g(long j10, long j11) {
        SparseArray sparseArray = this.f48299c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h) sparseArray.valueAt(i10)).d();
        }
        this.f48307m.clear();
        this.f48315u = 0;
        this.v = j11;
        this.f48306l.clear();
        this.f48309o = 0;
        this.f48312r = 0;
    }

    @Override
    public final void release() {
    }
}
