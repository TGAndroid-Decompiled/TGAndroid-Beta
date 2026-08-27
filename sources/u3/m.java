package u3;

import android.util.Pair;
import d5.g0;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import m3.t;
import m3.u;
import m3.w;
import m3.x;

public final class m implements m3.k, t {

    public int f48333i;

    public long f48334j;

    public int f48335k;

    public z f48336l;

    public int f48338n;

    public int f48339o;

    public int f48340p;

    public long[][] f48343s;

    public int f48344t;

    public long f48345u;
    public int v;
    public int h = 0;

    public final o f48331f = new o();

    public final ArrayList f48332g = new ArrayList();
    public final z d = new z(16);

    public final ArrayDeque f48330e = new ArrayDeque();

    public final z f48327a = new z(d5.a.d);

    public final z f48328b = new z(4);

    public final z f48329c = new z();

    public int f48337m = -1;

    public m3.m f48341q = m3.m.f17619t;

    public l[] f48342r = new l[0];

    public m(int i10) {
    }

    @Override
    public final int b(m3.l lVar, m3.n nVar) throws t1 {
        int i10;
        byte b10;
        char c10;
        int i11;
        ArrayList arrayList;
        List listM;
        int i12;
        List listM2;
        boolean z10;
        a aVar;
        while (true) {
            int i13 = this.h;
            ArrayDeque arrayDeque = this.f48330e;
            z zVar = this.f48329c;
            int i14 = 4;
            if (i13 != 0) {
                int i15 = 2;
                if (i13 != 1) {
                    if (i13 == 2) {
                        long position = lVar.getPosition();
                        if (this.f48337m == -1) {
                            int i16 = -1;
                            int i17 = -1;
                            boolean z11 = true;
                            boolean z12 = true;
                            int i18 = 0;
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            long j12 = Long.MAX_VALUE;
                            while (true) {
                                l[] lVarArr = this.f48342r;
                                if (i18 >= lVarArr.length) {
                                    break;
                                }
                                l lVar2 = lVarArr[i18];
                                int i19 = lVar2.f48326e;
                                s sVar = lVar2.f48324b;
                                if (i19 != sVar.f48381b) {
                                    long j13 = sVar.f48382c[i19];
                                    long[][] jArr = this.f48343s;
                                    int i20 = g0.f4795a;
                                    long j14 = jArr[i18][i19];
                                    long j15 = j13 - position;
                                    boolean z13 = j15 < 0 || j15 >= 262144;
                                    if ((!z13 && z12) || (z13 == z12 && j15 < j12)) {
                                        z12 = z13;
                                        i17 = i18;
                                        j12 = j15;
                                        j11 = j14;
                                    }
                                    if (j14 < j10) {
                                        z11 = z13;
                                        i16 = i18;
                                        j10 = j14;
                                    }
                                }
                                i18++;
                            }
                            if (j10 == Long.MAX_VALUE || !z11 || j11 < j10 + 524288) {
                                i16 = i17;
                            }
                            this.f48337m = i16;
                            if (i16 == -1) {
                                return -1;
                            }
                        }
                        l lVar3 = this.f48342r[this.f48337m];
                        w wVar = lVar3.f48325c;
                        p pVar = lVar3.f48323a;
                        s sVar2 = lVar3.f48324b;
                        int i21 = lVar3.f48326e;
                        long j16 = sVar2.f48382c[i21];
                        int i22 = sVar2.d[i21];
                        x xVar = lVar3.d;
                        long j17 = (j16 - position) + ((long) this.f48338n);
                        if (j17 < 0 || j17 >= 262144) {
                            nVar.f17620a = j16;
                            return 1;
                        }
                        if (pVar.f48357g == 1) {
                            j17 += 8;
                            i22 -= 8;
                        }
                        lVar.t((int) j17);
                        int i23 = pVar.f48359j;
                        if (i23 == 0) {
                            if ("audio/ac4".equals(pVar.f48356f.B)) {
                                if (this.f48339o == 0) {
                                    j3.b.c(i22, zVar);
                                    wVar.a(7, zVar);
                                    this.f48339o += 7;
                                }
                                i22 += 7;
                            } else if (xVar != null) {
                                xVar.c(lVar);
                            }
                            while (true) {
                                int i24 = this.f48339o;
                                if (i24 >= i22) {
                                    break;
                                }
                                int iB = wVar.b(lVar, i22 - i24, false);
                                this.f48338n += iB;
                                this.f48339o += iB;
                                this.f48340p -= iB;
                            }
                        } else {
                            z zVar2 = this.f48328b;
                            byte[] bArr = zVar2.f4858a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i25 = 4 - i23;
                            while (this.f48339o < i22) {
                                int i26 = this.f48340p;
                                if (i26 == 0) {
                                    lVar.readFully(bArr, i25, i23);
                                    this.f48338n += i23;
                                    zVar2.C(0);
                                    int iE = zVar2.e();
                                    if (iE < 0) {
                                        throw t1.a("Invalid NAL length", null);
                                    }
                                    this.f48340p = iE;
                                    z zVar3 = this.f48327a;
                                    zVar3.C(0);
                                    wVar.a(4, zVar3);
                                    this.f48339o += 4;
                                    i22 += i25;
                                } else {
                                    int iB2 = wVar.b(lVar, i26, false);
                                    this.f48338n += iB2;
                                    this.f48339o += iB2;
                                    this.f48340p -= iB2;
                                }
                            }
                        }
                        int i27 = i22;
                        long j18 = sVar2.f48384f[i21];
                        int i28 = sVar2.f48385g[i21];
                        if (xVar != null) {
                            xVar.b(wVar, j18, i28, i27, 0, null);
                            if (i21 + 1 == sVar2.f48381b) {
                                xVar.a(wVar, null);
                            }
                        } else {
                            wVar.e(j18, i28, i27, 0, null);
                        }
                        lVar3.f48326e++;
                        this.f48337m = -1;
                        this.f48338n = 0;
                        this.f48339o = 0;
                        this.f48340p = 0;
                        return 0;
                    }
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    o oVar = this.f48331f;
                    ArrayList arrayList2 = oVar.f48349a;
                    int i29 = oVar.f48350b;
                    if (i29 != 0) {
                        if (i29 != 1) {
                            short s10 = 2816;
                            short s11 = 2192;
                            if (i29 == 2) {
                                long length = lVar.getLength();
                                int i30 = oVar.f48351c - 20;
                                z zVar4 = new z(i30);
                                lVar.readFully(zVar4.f4858a, 0, i30);
                                int i31 = 0;
                                while (i31 < i30 / 12) {
                                    zVar4.D(i15);
                                    byte[] bArr2 = zVar4.f4858a;
                                    int i32 = zVar4.f4859b;
                                    int i33 = i32 + 1;
                                    zVar4.f4859b = i33;
                                    int i34 = bArr2[i32] & 255;
                                    zVar4.f4859b = i32 + 2;
                                    short s12 = (short) (((bArr2[i33] & 255) << 8) | i34);
                                    if (s12 != s11 && s12 != s10) {
                                        if (s12 != 2817) {
                                            if (s12 != 2819 && s12 != 2820) {
                                                zVar4.D(8);
                                            }
                                            i31++;
                                            s11 = 2192;
                                            i15 = 2;
                                            s10 = 2816;
                                        }
                                        arrayList2.add(new n((length - ((long) oVar.f48351c)) - ((long) zVar4.g()), zVar4.g()));
                                        i31++;
                                        s11 = 2192;
                                        i15 = 2;
                                        s10 = 2816;
                                    }
                                    arrayList2.add(new n((length - ((long) oVar.f48351c)) - ((long) zVar4.g()), zVar4.g()));
                                    i31++;
                                    s11 = 2192;
                                    i15 = 2;
                                    s10 = 2816;
                                }
                                if (arrayList2.isEmpty()) {
                                    nVar.f17620a = 0L;
                                } else {
                                    oVar.f48350b = 3;
                                    nVar.f17620a = ((n) arrayList2.get(0)).f48346a;
                                }
                            } else {
                                if (i29 != 3) {
                                    throw new IllegalStateException();
                                }
                                long position2 = lVar.getPosition();
                                int length2 = (int) ((lVar.getLength() - lVar.getPosition()) - ((long) oVar.f48351c));
                                z zVar5 = new z(length2);
                                lVar.readFully(zVar5.f4858a, 0, length2);
                                int i35 = 0;
                                while (i35 < arrayList2.size()) {
                                    n nVar2 = (n) arrayList2.get(i35);
                                    zVar5.C((int) (nVar2.f48346a - position2));
                                    zVar5.D(i14);
                                    int iG = zVar5.g();
                                    Charset charset = o8.d.f19363c;
                                    String strP = zVar5.p(iG, charset);
                                    switch (strP.hashCode()) {
                                        case -1711564334:
                                            if (strP.equals("SlowMotion_Data")) {
                                                b10 = 0;
                                            }
                                            switch (b10) {
                                                case 0:
                                                    c10 = 2192;
                                                    break;
                                                case 1:
                                                    c10 = 2819;
                                                    break;
                                                case 2:
                                                    c10 = 2816;
                                                    break;
                                                case 3:
                                                    c10 = 2820;
                                                    break;
                                                case 4:
                                                    c10 = 2817;
                                                    break;
                                                default:
                                                    throw t1.a("Invalid SEF name", null);
                                            }
                                            i11 = nVar2.f48347b - (iG + 8);
                                            if (c10 != 2192) {
                                                arrayList = new ArrayList();
                                                listM = o.f48348e.m(zVar5.p(i11, charset));
                                                for (i12 = 0; i12 < listM.size(); i12++) {
                                                    listM2 = o.d.m((CharSequence) listM.get(i12));
                                                    if (listM2.size() == 3) {
                                                        throw t1.a(null, null);
                                                    }
                                                    try {
                                                        arrayList.add(new f4.c(Long.parseLong((String) listM2.get(0)), Long.parseLong((String) listM2.get(1)), 1 << (Integer.parseInt((String) listM2.get(2)) - 1)));
                                                    } catch (NumberFormatException e9) {
                                                        throw t1.a(null, e9);
                                                    }
                                                }
                                                this.f48332g.add(new f4.d(arrayList));
                                            } else if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            i35++;
                                            i14 = 4;
                                            break;
                                        case -1332107749:
                                            if (strP.equals("Super_SlowMotion_Edit_Data")) {
                                                b10 = 1;
                                            }
                                            switch (b10) {
                                                case 0:
                                                    c10 = 2192;
                                                    break;
                                                case 1:
                                                    c10 = 2819;
                                                    break;
                                                case 2:
                                                    c10 = 2816;
                                                    break;
                                                case 3:
                                                    c10 = 2820;
                                                    break;
                                                case 4:
                                                    c10 = 2817;
                                                    break;
                                                default:
                                                    throw t1.a("Invalid SEF name", null);
                                            }
                                            i11 = nVar2.f48347b - (iG + 8);
                                            if (c10 != 2192) {
                                                arrayList = new ArrayList();
                                                listM = o.f48348e.m(zVar5.p(i11, charset));
                                                while (i12 < listM.size()) {
                                                    listM2 = o.d.m((CharSequence) listM.get(i12));
                                                    if (listM2.size() == 3) {
                                                        throw t1.a(null, null);
                                                    }
                                                    arrayList.add(new f4.c(Long.parseLong((String) listM2.get(0)), Long.parseLong((String) listM2.get(1)), 1 << (Integer.parseInt((String) listM2.get(2)) - 1)));
                                                }
                                                this.f48332g.add(new f4.d(arrayList));
                                            } else if (c10 != 2816) {
                                                continue;
                                            }
                                            i35++;
                                            i14 = 4;
                                            break;
                                        case -1251387154:
                                            if (strP.equals("Super_SlowMotion_Data")) {
                                                b10 = 2;
                                            }
                                            switch (b10) {
                                                case 0:
                                                    c10 = 2192;
                                                    break;
                                                case 1:
                                                    c10 = 2819;
                                                    break;
                                                case 2:
                                                    c10 = 2816;
                                                    break;
                                                case 3:
                                                    c10 = 2820;
                                                    break;
                                                case 4:
                                                    c10 = 2817;
                                                    break;
                                                default:
                                                    throw t1.a("Invalid SEF name", null);
                                            }
                                            i11 = nVar2.f48347b - (iG + 8);
                                            if (c10 != 2192) {
                                                arrayList = new ArrayList();
                                                listM = o.f48348e.m(zVar5.p(i11, charset));
                                                while (i12 < listM.size()) {
                                                    listM2 = o.d.m((CharSequence) listM.get(i12));
                                                    if (listM2.size() == 3) {
                                                        throw t1.a(null, null);
                                                    }
                                                    arrayList.add(new f4.c(Long.parseLong((String) listM2.get(0)), Long.parseLong((String) listM2.get(1)), 1 << (Integer.parseInt((String) listM2.get(2)) - 1)));
                                                }
                                                this.f48332g.add(new f4.d(arrayList));
                                            } else if (c10 != 2816) {
                                                continue;
                                            }
                                            i35++;
                                            i14 = 4;
                                            break;
                                        case -830665521:
                                            if (strP.equals("Super_SlowMotion_Deflickering_On")) {
                                                b10 = 3;
                                            }
                                            switch (b10) {
                                                case 0:
                                                    c10 = 2192;
                                                    break;
                                                case 1:
                                                    c10 = 2819;
                                                    break;
                                                case 2:
                                                    c10 = 2816;
                                                    break;
                                                case 3:
                                                    c10 = 2820;
                                                    break;
                                                case 4:
                                                    c10 = 2817;
                                                    break;
                                                default:
                                                    throw t1.a("Invalid SEF name", null);
                                            }
                                            i11 = nVar2.f48347b - (iG + 8);
                                            if (c10 != 2192) {
                                                arrayList = new ArrayList();
                                                listM = o.f48348e.m(zVar5.p(i11, charset));
                                                while (i12 < listM.size()) {
                                                    listM2 = o.d.m((CharSequence) listM.get(i12));
                                                    if (listM2.size() == 3) {
                                                        throw t1.a(null, null);
                                                    }
                                                    arrayList.add(new f4.c(Long.parseLong((String) listM2.get(0)), Long.parseLong((String) listM2.get(1)), 1 << (Integer.parseInt((String) listM2.get(2)) - 1)));
                                                }
                                                this.f48332g.add(new f4.d(arrayList));
                                            } else if (c10 != 2816) {
                                                continue;
                                            }
                                            i35++;
                                            i14 = 4;
                                            break;
                                        case 1760745220:
                                            if (strP.equals("Super_SlowMotion_BGM")) {
                                                b10 = 4;
                                            }
                                            switch (b10) {
                                                case 0:
                                                    c10 = 2192;
                                                    break;
                                                case 1:
                                                    c10 = 2819;
                                                    break;
                                                case 2:
                                                    c10 = 2816;
                                                    break;
                                                case 3:
                                                    c10 = 2820;
                                                    break;
                                                case 4:
                                                    c10 = 2817;
                                                    break;
                                                default:
                                                    throw t1.a("Invalid SEF name", null);
                                            }
                                            i11 = nVar2.f48347b - (iG + 8);
                                            if (c10 != 2192) {
                                                arrayList = new ArrayList();
                                                listM = o.f48348e.m(zVar5.p(i11, charset));
                                                while (i12 < listM.size()) {
                                                    listM2 = o.d.m((CharSequence) listM.get(i12));
                                                    if (listM2.size() == 3) {
                                                        throw t1.a(null, null);
                                                    }
                                                    arrayList.add(new f4.c(Long.parseLong((String) listM2.get(0)), Long.parseLong((String) listM2.get(1)), 1 << (Integer.parseInt((String) listM2.get(2)) - 1)));
                                                }
                                                this.f48332g.add(new f4.d(arrayList));
                                            } else if (c10 != 2816) {
                                                continue;
                                            }
                                            i35++;
                                            i14 = 4;
                                            break;
                                    }
                                    b10 = -1;
                                    switch (b10) {
                                        case 0:
                                            c10 = 2192;
                                            break;
                                        case 1:
                                            c10 = 2819;
                                            break;
                                        case 2:
                                            c10 = 2816;
                                            break;
                                        case 3:
                                            c10 = 2820;
                                            break;
                                        case 4:
                                            c10 = 2817;
                                            break;
                                        default:
                                            throw t1.a("Invalid SEF name", null);
                                    }
                                    i11 = nVar2.f48347b - (iG + 8);
                                    if (c10 != 2192) {
                                        arrayList = new ArrayList();
                                        listM = o.f48348e.m(zVar5.p(i11, charset));
                                        while (i12 < listM.size()) {
                                            listM2 = o.d.m((CharSequence) listM.get(i12));
                                            if (listM2.size() == 3) {
                                                throw t1.a(null, null);
                                            }
                                            arrayList.add(new f4.c(Long.parseLong((String) listM2.get(0)), Long.parseLong((String) listM2.get(1)), 1 << (Integer.parseInt((String) listM2.get(2)) - 1)));
                                        }
                                        this.f48332g.add(new f4.d(arrayList));
                                    } else if (c10 != 2816) {
                                        continue;
                                    }
                                    i35++;
                                    i14 = 4;
                                }
                                nVar.f17620a = 0L;
                            }
                        } else {
                            z zVar6 = new z(8);
                            lVar.readFully(zVar6.f4858a, 0, 8);
                            oVar.f48351c = zVar6.g() + 8;
                            if (zVar6.e() != 1397048916) {
                                nVar.f17620a = 0L;
                            } else {
                                nVar.f17620a = lVar.getPosition() - ((long) (oVar.f48351c - 12));
                                oVar.f48350b = 2;
                            }
                        }
                        i10 = 1;
                    } else {
                        long length3 = lVar.getLength();
                        nVar.f17620a = (length3 == -1 || length3 < 8) ? 0L : length3 - 8;
                        i10 = 1;
                        oVar.f48350b = 1;
                    }
                    if (nVar.f17620a != 0) {
                        return i10;
                    }
                    this.h = 0;
                    this.f48335k = 0;
                    return i10;
                }
                long j19 = this.f48334j - ((long) this.f48335k);
                long position3 = lVar.getPosition() + j19;
                z zVar7 = this.f48336l;
                if (zVar7 != null) {
                    lVar.readFully(zVar7.f4858a, this.f48335k, (int) j19);
                    if (this.f48333i == 1718909296) {
                        zVar7.C(8);
                        int iE2 = zVar7.e();
                        int i36 = iE2 != 1751476579 ? iE2 != 1903435808 ? 0 : 1 : 2;
                        if (i36 == 0) {
                            zVar7.D(4);
                            do {
                                if (zVar7.a() <= 0) {
                                    i36 = 0;
                                    break;
                                }
                                int iE3 = zVar7.e();
                                i36 = iE3 != 1751476579 ? iE3 != 1903435808 ? 0 : 1 : 2;
                            } while (i36 == 0);
                        }
                        this.v = i36;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).d.add(new b(this.f48333i, zVar7));
                    }
                } else {
                    if (j19 < 262144) {
                        lVar.t((int) j19);
                    } else {
                        nVar.f17620a = lVar.getPosition() + j19;
                        z10 = true;
                    }
                    j(position3);
                    if (z10 && this.h != 2) {
                        return 1;
                    }
                }
                z10 = false;
                j(position3);
                if (z10) {
                    continue;
                }
            } else {
                int i37 = this.f48335k;
                z zVar8 = this.d;
                if (i37 == 0) {
                    if (!lVar.d(zVar8.f4858a, 0, 8, true)) {
                        return -1;
                    }
                    this.f48335k = 8;
                    zVar8.C(0);
                    this.f48334j = zVar8.s();
                    this.f48333i = zVar8.e();
                }
                long j20 = this.f48334j;
                if (j20 == 1) {
                    lVar.readFully(zVar8.f4858a, 8, 8);
                    this.f48335k += 8;
                    this.f48334j = zVar8.v();
                } else if (j20 == 0) {
                    long length4 = lVar.getLength();
                    if (length4 == -1 && (aVar = (a) arrayDeque.peek()) != null) {
                        length4 = aVar.f48270c;
                    }
                    if (length4 != -1) {
                        this.f48334j = (length4 - lVar.getPosition()) + ((long) this.f48335k);
                    }
                }
                long j21 = this.f48334j;
                int i38 = this.f48335k;
                if (j21 < i38) {
                    throw t1.c("Atom size less than header length (unsupported).");
                }
                int i39 = this.f48333i;
                if (i39 == 1836019574 || i39 == 1953653099 || i39 == 1835297121 || i39 == 1835626086 || i39 == 1937007212 || i39 == 1701082227 || i39 == 1835365473) {
                    long position4 = lVar.getPosition();
                    long j22 = this.f48334j;
                    long j23 = this.f48335k;
                    long j24 = (position4 + j22) - j23;
                    if (j22 != j23 && this.f48333i == 1835365473) {
                        zVar.z(8);
                        lVar.b(0, 8, zVar.f4858a);
                        byte[] bArr3 = e.f48280a;
                        int i40 = zVar.f4859b;
                        zVar.D(4);
                        if (zVar.e() != 1751411826) {
                            i40 += 4;
                        }
                        zVar.C(i40);
                        lVar.t(zVar.f4859b);
                        lVar.q();
                    }
                    arrayDeque.push(new a(this.f48333i, j24));
                    if (this.f48334j == this.f48335k) {
                        j(j24);
                    } else {
                        this.h = 0;
                        this.f48335k = 0;
                    }
                } else if (i39 == 1835296868 || i39 == 1836476516 || i39 == 1751411826 || i39 == 1937011556 || i39 == 1937011827 || i39 == 1937011571 || i39 == 1668576371 || i39 == 1701606260 || i39 == 1937011555 || i39 == 1937011578 || i39 == 1937013298 || i39 == 1937007471 || i39 == 1668232756 || i39 == 1953196132 || i39 == 1718909296 || i39 == 1969517665 || i39 == 1801812339 || i39 == 1768715124) {
                    d5.a.i(i38 == 8);
                    d5.a.i(this.f48334j <= 2147483647L);
                    z zVar9 = new z((int) this.f48334j);
                    System.arraycopy(zVar8.f4858a, 0, zVar9.f4858a, 0, 8);
                    this.f48336l = zVar9;
                    this.h = 1;
                } else {
                    long position5 = lVar.getPosition();
                    long j25 = this.f48335k;
                    long j26 = position5 - j25;
                    if (this.f48333i == 1836086884) {
                        new f4.b(0L, j26, -9223372036854775807L, j26 + j25, this.f48334j - j25);
                    }
                    this.f48336l = null;
                    this.h = 1;
                }
            }
        }
    }

    @Override
    public final void c(m3.m mVar) {
        this.f48341q = mVar;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f(m3.l lVar) {
        return j.i(lVar, false, false);
    }

    @Override
    public final void g(long j10, long j11) {
        this.f48330e.clear();
        this.f48335k = 0;
        this.f48337m = -1;
        this.f48338n = 0;
        this.f48339o = 0;
        this.f48340p = 0;
        if (j10 == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.f48335k = 0;
                return;
            } else {
                o oVar = this.f48331f;
                oVar.f48349a.clear();
                oVar.f48350b = 0;
                this.f48332g.clear();
                return;
            }
        }
        for (l lVar : this.f48342r) {
            s sVar = lVar.f48324b;
            int iE = g0.e(sVar.f48384f, j11, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((sVar.f48385g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = sVar.a(j11);
            }
            lVar.f48326e = iE;
            x xVar = lVar.d;
            if (xVar != null) {
                xVar.f17641b = false;
                xVar.f17642c = 0;
            }
        }
    }

    @Override
    public final m3.s h(long j10) {
        long j11;
        long j12;
        long j13;
        long jMin;
        int i10;
        l[] lVarArr;
        s sVar;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iE;
        int iA;
        int iE2;
        int iA2;
        l[] lVarArr2 = this.f48342r;
        int length = lVarArr2.length;
        u uVar = u.f17634c;
        if (length == 0) {
            return new m3.s(uVar, uVar);
        }
        int i11 = this.f48344t;
        boolean z10 = false;
        int i12 = -1;
        long jMin2 = -1;
        if (i11 != -1) {
            s sVar2 = lVarArr2[i11].f48324b;
            long[] jArr3 = sVar2.f48384f;
            int iE3 = g0.e(jArr3, j10, false);
            while (true) {
                if (iE3 < 0) {
                    iE3 = -1;
                    break;
                }
                if ((sVar2.f48385g[iE3] & 1) != 0) {
                    break;
                }
                iE3--;
            }
            if (iE3 == -1) {
                iE3 = sVar2.a(j10);
            }
            long[] jArr4 = sVar2.f48382c;
            if (iE3 == -1) {
                return new m3.s(uVar, uVar);
            }
            j12 = jArr3[iE3];
            j11 = jArr4[iE3];
            if (j12 < j10 && iE3 < sVar2.f48381b - 1 && (iA2 = sVar2.a(j10)) != -1 && iA2 != iE3) {
                j13 = jArr3[iA2];
                jMin2 = jArr4[iA2];
            }
            jMin = j11;
            i10 = 0;
            while (true) {
                lVarArr = this.f48342r;
                if (i10 < lVarArr.length) {
                    break;
                }
                if (i10 != this.f48344t) {
                    sVar = lVarArr[i10].f48324b;
                    jArr = sVar.f48382c;
                    iArr = sVar.f48385g;
                    jArr2 = sVar.f48384f;
                    iE = g0.e(jArr2, j12, z10);
                    while (true) {
                        if (iE >= 0) {
                            iA = -1;
                            break;
                        }
                        if ((iArr[iE] & 1) != 0) {
                            iA = iE;
                            break;
                        }
                        iE--;
                    }
                    if (iA == i12) {
                        iA = sVar.a(j12);
                    }
                    if (iA == i12) {
                        jMin = Math.min(jArr[iA], jMin);
                    }
                    if (j13 != -9223372036854775807L) {
                        z10 = false;
                        iE2 = g0.e(jArr2, j13, false);
                        while (true) {
                            if (iE2 >= 0) {
                                iE2 = -1;
                                break;
                            }
                            if ((iArr[iE2] & 1) != 0) {
                                break;
                            }
                            iE2--;
                        }
                        if (iE2 == -1) {
                            iE2 = sVar.a(j13);
                        }
                        if (iE2 == -1) {
                            jMin2 = jMin2;
                        } else {
                            jMin2 = Math.min(jArr[iE2], jMin2);
                        }
                    } else {
                        jMin2 = jMin2;
                        z10 = false;
                    }
                }
                i10++;
                i12 = -1;
            }
            u uVar2 = new u(j12, jMin);
            return j13 == -9223372036854775807L ? new m3.s(uVar2, uVar2) : new m3.s(uVar2, new u(j13, jMin2));
        }
        j11 = Long.MAX_VALUE;
        j12 = j10;
        j13 = -9223372036854775807L;
        jMin = j11;
        i10 = 0;
        while (true) {
            lVarArr = this.f48342r;
            if (i10 < lVarArr.length) {
                break;
                break;
            }
            if (i10 != this.f48344t) {
                sVar = lVarArr[i10].f48324b;
                jArr = sVar.f48382c;
                iArr = sVar.f48385g;
                jArr2 = sVar.f48384f;
                iE = g0.e(jArr2, j12, z10);
                while (true) {
                    if (iE >= 0) {
                        iA = -1;
                        break;
                    }
                    if ((iArr[iE] & 1) != 0) {
                        iA = iE;
                        break;
                    }
                    iE--;
                }
                if (iA == i12) {
                    iA = sVar.a(j12);
                }
                if (iA == i12) {
                    jMin = Math.min(jArr[iA], jMin);
                }
                if (j13 != -9223372036854775807L) {
                    z10 = false;
                    iE2 = g0.e(jArr2, j13, false);
                    while (true) {
                        if (iE2 >= 0) {
                            iE2 = -1;
                            break;
                        }
                        if ((iArr[iE2] & 1) != 0) {
                            break;
                            break;
                        }
                        iE2--;
                    }
                    if (iE2 == -1) {
                        iE2 = sVar.a(j13);
                    }
                    if (iE2 == -1) {
                        jMin2 = jMin2;
                    } else {
                        jMin2 = Math.min(jArr[iE2], jMin2);
                    }
                } else {
                    jMin2 = jMin2;
                    z10 = false;
                }
            }
            i10++;
            i12 = -1;
        }
        u uVar3 = new u(j12, jMin);
        if (j13 == -9223372036854775807L) {
        }
    }

    @Override
    public final long i() {
        return this.f48345u;
    }

    public final void j(long j10) throws t1 {
        ArrayDeque arrayDeque;
        z3.c cVar;
        z3.c cVar2;
        z3.c cVar3;
        z3.c cVar4;
        a aVar;
        z3.c cVar5;
        int i10;
        z3.c cVar6;
        int i11;
        int i12;
        z3.c cVar7;
        z3.c cVar8;
        f4.a aVar2;
        ArrayDeque arrayDeque2;
        int i13;
        e4.j jVarF;
        String str;
        e4.j jVarG;
        while (true) {
            ArrayDeque arrayDeque3 = this.f48330e;
            if (arrayDeque3.isEmpty() || ((a) arrayDeque3.peek()).f48270c != j10) {
                break;
            }
            a aVar3 = (a) arrayDeque3.pop();
            if (aVar3.f18002b == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z10 = this.v == 1;
                m3.q qVar = new m3.q();
                b bVarF = aVar3.f(1969517665);
                int i14 = 1751411826;
                int i15 = 4;
                int i16 = 1768715124;
                int i17 = 1835365473;
                int i18 = 8;
                if (bVarF != null) {
                    byte[] bArr = e.f48280a;
                    z zVar = bVarF.f48272c;
                    zVar.C(8);
                    z3.c cVar9 = null;
                    z3.c cVar10 = null;
                    while (zVar.a() >= i18) {
                        int i19 = zVar.f4859b;
                        int iE = zVar.e();
                        int iE2 = zVar.e();
                        if (iE2 == i17) {
                            zVar.C(i19);
                            int i20 = i19 + iE;
                            zVar.D(i18);
                            int i21 = zVar.f4859b;
                            zVar.D(i15);
                            if (zVar.e() != i14) {
                                i21 += 4;
                            }
                            zVar.C(i21);
                            while (true) {
                                int i22 = zVar.f4859b;
                                if (i22 < i20) {
                                    int iE3 = zVar.e();
                                    if (zVar.e() == i16) {
                                        zVar.C(i22);
                                        int i23 = i22 + iE3;
                                        zVar.D(i18);
                                        ArrayList arrayList2 = new ArrayList();
                                        while (true) {
                                            int i24 = zVar.f4859b;
                                            if (i24 >= i23) {
                                                break;
                                            }
                                            int iE4 = zVar.e() + i24;
                                            int iE5 = zVar.e();
                                            int i25 = (iE5 >> 24) & 255;
                                            ArrayDeque arrayDeque4 = arrayDeque3;
                                            if (i25 == 169 || i25 == 253) {
                                                i13 = i23;
                                                int i26 = 16777215 & iE5;
                                                if (i26 == 6516084) {
                                                    jVarF = j.b(iE5, zVar);
                                                } else if (i26 == 7233901 || i26 == 7631467) {
                                                    jVarF = j.f(iE5, "TIT2", zVar);
                                                } else if (i26 == 6516589 || i26 == 7828084) {
                                                    jVarF = j.f(iE5, "TCOM", zVar);
                                                } else if (i26 == 6578553) {
                                                    jVarF = j.f(iE5, "TDRC", zVar);
                                                } else if (i26 == 4280916) {
                                                    jVarF = j.f(iE5, "TPE1", zVar);
                                                } else if (i26 == 7630703) {
                                                    jVarF = j.f(iE5, "TSSE", zVar);
                                                } else if (i26 == 6384738) {
                                                    jVarF = j.f(iE5, "TALB", zVar);
                                                } else if (i26 == 7108978) {
                                                    jVarF = j.f(iE5, "USLT", zVar);
                                                } else if (i26 == 6776174) {
                                                    jVarF = j.f(iE5, "TCON", zVar);
                                                } else if (i26 == 6779504) {
                                                    jVarF = j.f(iE5, "TIT1", zVar);
                                                } else {
                                                    d5.a.n("MetadataUtil", "Skipped unknown metadata entry: " + mc.k.a(iE5));
                                                    zVar.C(iE4);
                                                    jVarF = null;
                                                }
                                                zVar.C(iE4);
                                            } else {
                                                if (iE5 == 1735291493) {
                                                    try {
                                                        int iH = j.h(zVar);
                                                        if (iH > 0) {
                                                            String[] strArr = j.f48320a;
                                                            if (iH <= 192) {
                                                                str = strArr[iH - 1];
                                                            } else {
                                                                str = null;
                                                            }
                                                        } else {
                                                            str = null;
                                                        }
                                                        if (str != null) {
                                                            jVarF = new e4.n("TCON", null, p8.z.y(str));
                                                        } else {
                                                            d5.a.K("MetadataUtil", "Failed to parse standard genre code");
                                                            jVarF = null;
                                                        }
                                                    } catch (Throwable th) {
                                                        zVar.C(iE4);
                                                        throw th;
                                                    }
                                                } else if (iE5 == 1684632427) {
                                                    jVarF = j.d(iE5, "TPOS", zVar);
                                                } else if (iE5 == 1953655662) {
                                                    jVarF = j.d(iE5, "TRCK", zVar);
                                                } else {
                                                    if (iE5 == 1953329263) {
                                                        jVarG = j.g(iE5, "TBPM", zVar, true, false);
                                                    } else if (iE5 == 1668311404) {
                                                        jVarG = j.g(iE5, "TCMP", zVar, true, true);
                                                    } else if (iE5 == 1668249202) {
                                                        jVarF = j.c(zVar);
                                                    } else if (iE5 == 1631670868) {
                                                        jVarF = j.f(iE5, "TPE2", zVar);
                                                    } else if (iE5 == 1936682605) {
                                                        jVarF = j.f(iE5, "TSOT", zVar);
                                                    } else if (iE5 == 1936679276) {
                                                        jVarF = j.f(iE5, "TSO2", zVar);
                                                    } else if (iE5 == 1936679282) {
                                                        jVarF = j.f(iE5, "TSOA", zVar);
                                                    } else if (iE5 == 1936679265) {
                                                        jVarF = j.f(iE5, "TSOP", zVar);
                                                    } else if (iE5 == 1936679791) {
                                                        jVarF = j.f(iE5, "TSOC", zVar);
                                                    } else if (iE5 == 1920233063) {
                                                        jVarF = j.g(iE5, "ITUNESADVISORY", zVar, false, false);
                                                    } else if (iE5 == 1885823344) {
                                                        jVarG = j.g(iE5, "ITUNESGAPLESS", zVar, false, true);
                                                    } else if (iE5 == 1936683886) {
                                                        jVarF = j.f(iE5, "TVSHOWSORT", zVar);
                                                    } else if (iE5 == 1953919848) {
                                                        jVarF = j.f(iE5, "TVSHOW", zVar);
                                                    } else if (iE5 == 757935405) {
                                                        String strN = null;
                                                        String strN2 = null;
                                                        int i27 = -1;
                                                        int i28 = -1;
                                                        while (true) {
                                                            int i29 = zVar.f4859b;
                                                            if (i29 >= iE4) {
                                                                break;
                                                            }
                                                            int iE6 = zVar.e();
                                                            int iE7 = zVar.e();
                                                            int i30 = i23;
                                                            zVar.D(4);
                                                            if (iE7 == 1835360622) {
                                                                strN = zVar.n(iE6 - 12);
                                                            } else if (iE7 == 1851878757) {
                                                                strN2 = zVar.n(iE6 - 12);
                                                            } else {
                                                                if (iE7 == 1684108385) {
                                                                    i27 = i29;
                                                                    i28 = iE6;
                                                                }
                                                                zVar.D(iE6 - 12);
                                                            }
                                                            i23 = i30;
                                                        }
                                                        i13 = i23;
                                                        if (strN == null || strN2 == null || i27 == -1) {
                                                            jVarF = null;
                                                        } else {
                                                            zVar.C(i27);
                                                            zVar.D(16);
                                                            jVarF = new e4.k(strN, strN2, zVar.n(i28 - 16));
                                                        }
                                                        zVar.C(iE4);
                                                    } else {
                                                        i13 = i23;
                                                        d5.a.n("MetadataUtil", "Skipped unknown metadata entry: " + mc.k.a(iE5));
                                                        zVar.C(iE4);
                                                        jVarF = null;
                                                    }
                                                    zVar.C(iE4);
                                                    jVarF = jVarG;
                                                    i13 = i23;
                                                }
                                                zVar.C(iE4);
                                                i13 = i23;
                                            }
                                            if (jVarF != null) {
                                                arrayList2.add(jVarF);
                                            }
                                            arrayDeque3 = arrayDeque4;
                                            i23 = i13;
                                        }
                                        arrayDeque2 = arrayDeque3;
                                        if (!arrayList2.isEmpty()) {
                                            cVar9 = new z3.c(arrayList2);
                                            break;
                                        }
                                    } else {
                                        zVar.C(i22 + iE3);
                                        i18 = 8;
                                        i16 = 1768715124;
                                    }
                                } else {
                                    arrayDeque2 = arrayDeque3;
                                }
                                cVar9 = null;
                                break;
                            }
                        } else {
                            arrayDeque2 = arrayDeque3;
                            if (iE2 == 1936553057) {
                                zVar.C(i19);
                                int i31 = i19 + iE;
                                zVar.D(12);
                                while (true) {
                                    int i32 = zVar.f4859b;
                                    if (i32 < i31) {
                                        int iE8 = zVar.e();
                                        if (zVar.e() != 1935766900) {
                                            zVar.C(i32 + iE8);
                                        } else if (iE8 >= 14) {
                                            zVar.D(5);
                                            int iR = zVar.r();
                                            if (iR == 12 || iR == 13) {
                                                float f10 = iR == 12 ? 240.0f : 120.0f;
                                                zVar.D(1);
                                                cVar10 = new z3.c(new f4.f(f10, zVar.r()));
                                                break;
                                            }
                                        }
                                    }
                                    cVar10 = null;
                                    break;
                                }
                            }
                        }
                        zVar.C(i19 + iE);
                        arrayDeque3 = arrayDeque2;
                        i17 = 1835365473;
                        i14 = 1751411826;
                        i18 = 8;
                        i15 = 4;
                        i16 = 1768715124;
                    }
                    arrayDeque = arrayDeque3;
                    Pair pairCreate = Pair.create(cVar9, cVar10);
                    cVar2 = (z3.c) pairCreate.first;
                    cVar = (z3.c) pairCreate.second;
                    if (cVar2 != null) {
                        qVar.b(cVar2);
                    }
                    i17 = 1835365473;
                } else {
                    arrayDeque = arrayDeque3;
                    cVar = null;
                    cVar2 = null;
                }
                a aVarE = aVar3.e(i17);
                if (aVarE != null) {
                    byte[] bArr2 = e.f48280a;
                    b bVarF2 = aVarE.f(1751411826);
                    b bVarF3 = aVarE.f(1801812339);
                    b bVarF4 = aVarE.f(1768715124);
                    if (bVarF2 == null || bVarF3 == null || bVarF4 == null) {
                        cVar3 = cVar;
                        cVar4 = cVar2;
                        aVar = aVar3;
                        cVar5 = null;
                    } else {
                        z zVar2 = bVarF2.f48272c;
                        zVar2.C(16);
                        if (zVar2.e() != 1835299937) {
                            cVar3 = cVar;
                            cVar4 = cVar2;
                            aVar = aVar3;
                        } else {
                            z zVar3 = bVarF3.f48272c;
                            zVar3.C(12);
                            int iE9 = zVar3.e();
                            String[] strArr2 = new String[iE9];
                            for (int i33 = 0; i33 < iE9; i33++) {
                                int iE10 = zVar3.e();
                                zVar3.D(4);
                                strArr2[i33] = zVar3.p(iE10 - 8, o8.d.f19363c);
                            }
                            z zVar4 = bVarF4.f48272c;
                            zVar4.C(8);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i34 = 8; zVar4.a() > i34; i34 = 8) {
                                int i35 = zVar4.f4859b;
                                int iE11 = zVar4.e();
                                int iE12 = zVar4.e() - 1;
                                if (iE12 < 0 || iE12 >= iE9) {
                                    cVar7 = cVar;
                                    cVar8 = cVar2;
                                    aVar3 = aVar3;
                                    com.google.android.recaptcha.internal.a.s(iE12, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str2 = strArr2[iE12];
                                    int i36 = i35 + iE11;
                                    while (true) {
                                        int i37 = zVar4.f4859b;
                                        if (i37 >= i36) {
                                            cVar7 = cVar;
                                            cVar8 = cVar2;
                                            aVar2 = null;
                                            break;
                                        }
                                        int iE13 = zVar4.e();
                                        cVar7 = cVar;
                                        cVar8 = cVar2;
                                        if (zVar4.e() == 1684108385) {
                                            int iE14 = zVar4.e();
                                            int iE15 = zVar4.e();
                                            int i38 = iE13 - 16;
                                            byte[] bArr3 = new byte[i38];
                                            zVar4.c(0, i38, bArr3);
                                            aVar2 = new f4.a(str2, bArr3, iE15, iE14);
                                            break;
                                        }
                                        zVar4.C(i37 + iE13);
                                        cVar = cVar7;
                                        cVar2 = cVar8;
                                    }
                                    if (aVar2 != null) {
                                        arrayList3.add(aVar2);
                                    }
                                }
                                zVar4.C(i35 + iE11);
                                cVar = cVar7;
                                cVar2 = cVar8;
                                aVar3 = aVar3;
                            }
                            cVar3 = cVar;
                            cVar4 = cVar2;
                            aVar = aVar3;
                            if (!arrayList3.isEmpty()) {
                                cVar5 = new z3.c(arrayList3);
                            }
                        }
                        cVar5 = null;
                    }
                } else {
                    cVar3 = cVar;
                    cVar4 = cVar2;
                    aVar = aVar3;
                    cVar5 = null;
                }
                ArrayList arrayListE = e.e(aVar, qVar, -9223372036854775807L, null, false, z10, new k(0));
                int size = arrayListE.size();
                int size2 = -1;
                int i39 = 0;
                long jMax = -9223372036854775807L;
                while (i39 < size) {
                    s sVar = (s) arrayListE.get(i39);
                    int i40 = sVar.f48381b;
                    int i41 = sVar.f48383e;
                    if (i40 == 0) {
                        cVar6 = cVar5;
                    } else {
                        p pVar = sVar.f48380a;
                        long j11 = pVar.f48355e;
                        t0 t0Var = pVar.f48356f;
                        int i42 = pVar.f48353b;
                        if (j11 == -9223372036854775807L) {
                            j11 = sVar.h;
                        }
                        jMax = Math.max(jMax, j11);
                        l lVar = new l(pVar, sVar, this.f48341q.C(i39, i42));
                        int i43 = "audio/true-hd".equals(t0Var.B) ? i41 * 16 : i41 + 30;
                        s0 s0VarA = t0Var.a();
                        s0VarA.f8136p = i43;
                        if (i42 != 2 || j11 <= 0) {
                            i10 = 1;
                        } else {
                            int i44 = sVar.f48381b;
                            i10 = 1;
                            if (i44 > 1) {
                                s0VarA.v = i44 / (j11 / 1000000.0f);
                            }
                        }
                        if (i42 == i10 && (i11 = qVar.f17627a) != -1 && (i12 = qVar.f17628b) != -1) {
                            s0VarA.E = i11;
                            s0VarA.F = i12;
                        }
                        ArrayList arrayList4 = this.f48332g;
                        z3.c[] cVarArr = {cVar3, arrayList4.isEmpty() ? null : new z3.c(arrayList4)};
                        z3.c cVar11 = new z3.c(new z3.b[0]);
                        if (i42 != 1) {
                            if (i42 != 2 || cVar5 == null) {
                                cVar6 = cVar5;
                                break;
                            }
                            int i45 = 0;
                            while (true) {
                                z3.b[] bVarArr = cVar5.f50188a;
                                if (i45 >= bVarArr.length) {
                                    cVar6 = cVar5;
                                    break;
                                }
                                z3.b bVar = bVarArr[i45];
                                if (bVar instanceof f4.a) {
                                    f4.a aVar4 = (f4.a) bVar;
                                    cVar6 = cVar5;
                                    if ("com.android.capture.fps".equals(aVar4.f5869a)) {
                                        cVar11 = new z3.c(aVar4);
                                        break;
                                    }
                                } else {
                                    cVar6 = cVar5;
                                }
                                i45++;
                                cVar5 = cVar6;
                            }
                        } else if (cVar4 == null) {
                            cVar6 = cVar5;
                            break;
                        } else {
                            cVar6 = cVar5;
                            cVar11 = cVar4;
                        }
                        for (int i46 = 0; i46 < 2; i46++) {
                            cVar11 = cVar11.a(cVarArr[i46]);
                        }
                        if (cVar11.f50188a.length > 0) {
                            s0VarA.f8129i = cVar11;
                        }
                        lVar.f48325c.c(new t0(s0VarA));
                        if (i42 == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(lVar);
                    }
                    i39++;
                    arrayListE = arrayListE;
                    size = size;
                    cVar5 = cVar6;
                }
                long j12 = 0;
                this.f48344t = size2;
                this.f48345u = jMax;
                l[] lVarArr = (l[]) arrayList.toArray(new l[0]);
                this.f48342r = lVarArr;
                long[][] jArr = new long[lVarArr.length][];
                int[] iArr = new int[lVarArr.length];
                long[] jArr2 = new long[lVarArr.length];
                boolean[] zArr = new boolean[lVarArr.length];
                for (int i47 = 0; i47 < lVarArr.length; i47++) {
                    jArr[i47] = new long[lVarArr[i47].f48324b.f48381b];
                    jArr2[i47] = lVarArr[i47].f48324b.f48384f[0];
                }
                int i48 = 0;
                while (i48 < lVarArr.length) {
                    long j13 = Long.MAX_VALUE;
                    int i49 = -1;
                    for (int i50 = 0; i50 < lVarArr.length; i50++) {
                        if (!zArr[i50]) {
                            long j14 = jArr2[i50];
                            if (j14 <= j13) {
                                i49 = i50;
                                j13 = j14;
                            }
                        }
                    }
                    int i51 = iArr[i49];
                    long[] jArr3 = jArr[i49];
                    jArr3[i51] = j12;
                    s sVar2 = lVarArr[i49].f48324b;
                    j12 += (long) sVar2.d[i51];
                    int i52 = i51 + 1;
                    iArr[i49] = i52;
                    if (i52 < jArr3.length) {
                        jArr2[i49] = sVar2.f48384f[i52];
                    } else {
                        zArr[i49] = true;
                        i48++;
                    }
                }
                this.f48343s = jArr;
                this.f48341q.A();
                this.f48341q.n(this);
                arrayDeque.clear();
                this.h = 2;
            } else if (!arrayDeque3.isEmpty()) {
                ((a) arrayDeque3.peek()).f48271e.add(aVar3);
            }
        }
        if (this.h != 2) {
            this.h = 0;
            this.f48335k = 0;
        }
    }

    @Override
    public final void release() {
    }
}
