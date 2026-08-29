package w3;

import f5.d0;
import f5.w;
import j3.t1;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import o3.t;
import o3.x;
public final class l implements o3.k, t {
    public int f49694i;
    public long f49695j;
    public int f49696k;
    public w f49697l;
    public int f49699n;
    public int f49700o;
    public int f49701p;
    public long[][] f49704s;
    public int f49705t;
    public long f49706u;
    public int v;
    public int h = 0;
    public final n f49692f = new n();
    public final ArrayList f49693g = new ArrayList();
    public final w d = new w(16);
    public final ArrayDeque f49691e = new ArrayDeque();
    public final w f49688a = new w(f5.a.d);
    public final w f49689b = new w(4);
    public final w f49690c = new w();
    public int f49698m = -1;
    public o3.m f49702q = o3.m.f19102u;
    public k[] f49703r = new k[0];

    public l(int i10) {
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final int d(o3.l lVar, o3.n nVar) {
        boolean z10;
        long j10;
        int i10;
        char c3;
        char c6;
        boolean z11;
        int i11;
        a aVar;
        boolean z12;
        boolean z13;
        while (true) {
            int i12 = this.h;
            ArrayDeque arrayDeque = this.f49691e;
            w wVar = this.f49690c;
            int i13 = 4;
            if (i12 != 0) {
                int i14 = 2;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            n nVar2 = this.f49692f;
                            ArrayList arrayList = nVar2.f49710a;
                            int i15 = nVar2.f49711b;
                            if (i15 != 0) {
                                if (i15 != 1) {
                                    short s10 = 2816;
                                    short s11 = 2192;
                                    if (i15 != 2) {
                                        if (i15 == 3) {
                                            long position = lVar.getPosition();
                                            int length = (int) ((lVar.getLength() - lVar.getPosition()) - nVar2.f49712c);
                                            w wVar2 = new w(length);
                                            lVar.readFully(wVar2.f6640a, 0, length);
                                            int i16 = 0;
                                            while (i16 < arrayList.size()) {
                                                m mVar = (m) arrayList.get(i16);
                                                wVar2.C((int) (mVar.f49707a - position));
                                                wVar2.D(i13);
                                                int g10 = wVar2.g();
                                                Charset charset = p8.d.f45658c;
                                                String p10 = wVar2.p(g10, charset);
                                                switch (p10.hashCode()) {
                                                    case -1711564334:
                                                        if (p10.equals("SlowMotion_Data")) {
                                                            c3 = 0;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case -1332107749:
                                                        if (p10.equals("Super_SlowMotion_Edit_Data")) {
                                                            c3 = 1;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case -1251387154:
                                                        if (p10.equals("Super_SlowMotion_Data")) {
                                                            c3 = 2;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case -830665521:
                                                        if (p10.equals("Super_SlowMotion_Deflickering_On")) {
                                                            c3 = 3;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case 1760745220:
                                                        if (p10.equals("Super_SlowMotion_BGM")) {
                                                            c3 = 4;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    default:
                                                        c3 = 65535;
                                                        break;
                                                }
                                                switch (c3) {
                                                    case 0:
                                                        c6 = 2192;
                                                        break;
                                                    case 1:
                                                        c6 = 2819;
                                                        break;
                                                    case 2:
                                                        c6 = 2816;
                                                        break;
                                                    case 3:
                                                        c6 = 2820;
                                                        break;
                                                    case 4:
                                                        c6 = 2817;
                                                        break;
                                                    default:
                                                        throw t1.a("Invalid SEF name", null);
                                                }
                                                int i17 = mVar.f49708b - (g10 + 8);
                                                if (c6 != 2192) {
                                                    if (c6 != 2816 && c6 != 2817 && c6 != 2819 && c6 != 2820) {
                                                        throw new IllegalStateException();
                                                    }
                                                } else {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    List o10 = n.f49709e.o(wVar2.p(i17, charset));
                                                    for (int i18 = 0; i18 < o10.size(); i18++) {
                                                        List o11 = n.d.o((CharSequence) o10.get(i18));
                                                        if (o11.size() == 3) {
                                                            try {
                                                                arrayList2.add(new h4.c(Long.parseLong((String) o11.get(0)), Long.parseLong((String) o11.get(1)), 1 << (Integer.parseInt((String) o11.get(2)) - 1)));
                                                            } catch (NumberFormatException e10) {
                                                                throw t1.a(null, e10);
                                                            }
                                                        } else {
                                                            throw t1.a(null, null);
                                                        }
                                                    }
                                                    this.f49693g.add(new h4.d(arrayList2));
                                                }
                                                i16++;
                                                i13 = 4;
                                            }
                                            nVar.f19103a = 0L;
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else {
                                        long length2 = lVar.getLength();
                                        int i19 = nVar2.f49712c - 20;
                                        w wVar3 = new w(i19);
                                        lVar.readFully(wVar3.f6640a, 0, i19);
                                        int i20 = 0;
                                        while (i20 < i19 / 12) {
                                            wVar3.D(i14);
                                            byte[] bArr = wVar3.f6640a;
                                            int i21 = wVar3.f6641b;
                                            int i22 = i21 + 1;
                                            wVar3.f6641b = i22;
                                            wVar3.f6641b = i21 + 2;
                                            short s12 = (short) (((bArr[i22] & 255) << 8) | (bArr[i21] & 255));
                                            if (s12 != s11 && s12 != s10) {
                                                if (s12 != 2817) {
                                                    if (s12 != 2819 && s12 != 2820) {
                                                        wVar3.D(8);
                                                        i20++;
                                                        s11 = 2192;
                                                        i14 = 2;
                                                        s10 = 2816;
                                                    }
                                                    arrayList.add(new m((length2 - nVar2.f49712c) - wVar3.g(), wVar3.g()));
                                                    i20++;
                                                    s11 = 2192;
                                                    i14 = 2;
                                                    s10 = 2816;
                                                }
                                            }
                                            arrayList.add(new m((length2 - nVar2.f49712c) - wVar3.g(), wVar3.g()));
                                            i20++;
                                            s11 = 2192;
                                            i14 = 2;
                                            s10 = 2816;
                                        }
                                        if (arrayList.isEmpty()) {
                                            nVar.f19103a = 0L;
                                        } else {
                                            nVar2.f49711b = 3;
                                            nVar.f19103a = ((m) arrayList.get(0)).f49707a;
                                        }
                                    }
                                } else {
                                    w wVar4 = new w(8);
                                    lVar.readFully(wVar4.f6640a, 0, 8);
                                    nVar2.f49712c = wVar4.g() + 8;
                                    if (wVar4.e() != 1397048916) {
                                        nVar.f19103a = 0L;
                                    } else {
                                        nVar.f19103a = lVar.getPosition() - (nVar2.f49712c - 12);
                                        nVar2.f49711b = 2;
                                    }
                                }
                                i10 = 1;
                            } else {
                                long length3 = lVar.getLength();
                                if (length3 != -1 && length3 >= 8) {
                                    j10 = length3 - 8;
                                } else {
                                    j10 = 0;
                                }
                                nVar.f19103a = j10;
                                i10 = 1;
                                nVar2.f49711b = 1;
                            }
                            if (nVar.f19103a == 0) {
                                this.h = 0;
                                this.f49696k = 0;
                                return i10;
                            }
                            return i10;
                        }
                        throw new IllegalStateException();
                    }
                    long position2 = lVar.getPosition();
                    if (this.f49698m == -1) {
                        int i23 = -1;
                        int i24 = -1;
                        boolean z14 = true;
                        boolean z15 = true;
                        int i25 = 0;
                        long j11 = Long.MAX_VALUE;
                        long j12 = Long.MAX_VALUE;
                        long j13 = Long.MAX_VALUE;
                        while (true) {
                            k[] kVarArr = this.f49703r;
                            if (i25 >= kVarArr.length) {
                                break;
                            }
                            k kVar = kVarArr[i25];
                            int i26 = kVar.f49687e;
                            r rVar = kVar.f49685b;
                            if (i26 != rVar.f49742b) {
                                long j14 = rVar.f49743c[i26];
                                long[][] jArr = this.f49704s;
                                int i27 = d0.f6579a;
                                long j15 = jArr[i25][i26];
                                long j16 = j14 - position2;
                                if (j16 >= 0 && j16 < 262144) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if ((!z10 && z15) || (z10 == z15 && j16 < j13)) {
                                    z15 = z10;
                                    i24 = i25;
                                    j13 = j16;
                                    j12 = j15;
                                }
                                if (j15 < j11) {
                                    z14 = z10;
                                    i23 = i25;
                                    j11 = j15;
                                }
                            }
                            i25++;
                        }
                        if (j11 == Long.MAX_VALUE || !z14 || j12 < j11 + 524288) {
                            i23 = i24;
                        }
                        this.f49698m = i23;
                        if (i23 == -1) {
                            return -1;
                        }
                    }
                    k kVar2 = this.f49703r[this.f49698m];
                    o3.w wVar5 = kVar2.f49686c;
                    o oVar = kVar2.f49684a;
                    r rVar2 = kVar2.f49685b;
                    int i28 = kVar2.f49687e;
                    long j17 = rVar2.f49743c[i28];
                    int i29 = rVar2.d[i28];
                    x xVar = kVar2.d;
                    long j18 = (j17 - position2) + this.f49699n;
                    if (j18 >= 0 && j18 < 262144) {
                        if (oVar.f49718g == 1) {
                            j18 += 8;
                            i29 -= 8;
                        }
                        lVar.t((int) j18);
                        int i30 = oVar.f49720j;
                        if (i30 != 0) {
                            w wVar6 = this.f49689b;
                            byte[] bArr2 = wVar6.f6640a;
                            bArr2[0] = 0;
                            bArr2[1] = 0;
                            bArr2[2] = 0;
                            int i31 = 4 - i30;
                            while (this.f49700o < i29) {
                                int i32 = this.f49701p;
                                if (i32 == 0) {
                                    lVar.readFully(bArr2, i31, i30);
                                    this.f49699n += i30;
                                    wVar6.C(0);
                                    int e11 = wVar6.e();
                                    if (e11 >= 0) {
                                        this.f49701p = e11;
                                        w wVar7 = this.f49688a;
                                        wVar7.C(0);
                                        wVar5.e(4, wVar7);
                                        this.f49700o += 4;
                                        i29 += i31;
                                    } else {
                                        throw t1.a("Invalid NAL length", null);
                                    }
                                } else {
                                    int a2 = wVar5.a(lVar, i32, false);
                                    this.f49699n += a2;
                                    this.f49700o += a2;
                                    this.f49701p -= a2;
                                }
                            }
                        } else {
                            if ("audio/ac4".equals(oVar.f49717f.B)) {
                                if (this.f49700o == 0) {
                                    l3.b.c(i29, wVar);
                                    wVar5.e(7, wVar);
                                    this.f49700o += 7;
                                }
                                i29 += 7;
                            } else if (xVar != null) {
                                xVar.c(lVar);
                            }
                            while (true) {
                                int i33 = this.f49700o;
                                if (i33 >= i29) {
                                    break;
                                }
                                int a10 = wVar5.a(lVar, i29 - i33, false);
                                this.f49699n += a10;
                                this.f49700o += a10;
                                this.f49701p -= a10;
                            }
                        }
                        int i34 = i29;
                        long j19 = rVar2.f49745f[i28];
                        int i35 = rVar2.f49746g[i28];
                        if (xVar != null) {
                            xVar.b(wVar5, j19, i35, i34, 0, null);
                            if (i28 + 1 == rVar2.f49742b) {
                                xVar.a(wVar5, null);
                            }
                        } else {
                            wVar5.c(j19, i35, i34, 0, null);
                        }
                        kVar2.f49687e++;
                        this.f49698m = -1;
                        this.f49699n = 0;
                        this.f49700o = 0;
                        this.f49701p = 0;
                        return 0;
                    }
                    nVar.f19103a = j17;
                    return 1;
                }
                long j20 = this.f49695j - this.f49696k;
                long position3 = lVar.getPosition() + j20;
                w wVar8 = this.f49697l;
                if (wVar8 != null) {
                    lVar.readFully(wVar8.f6640a, this.f49696k, (int) j20);
                    if (this.f49694i == 1718909296) {
                        wVar8.C(8);
                        int e12 = wVar8.e();
                        if (e12 != 1751476579) {
                            if (e12 != 1903435808) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                        } else {
                            i11 = 2;
                        }
                        if (i11 == 0) {
                            wVar8.D(4);
                            while (true) {
                                if (wVar8.a() > 0) {
                                    int e13 = wVar8.e();
                                    if (e13 != 1751476579) {
                                        if (e13 != 1903435808) {
                                            i11 = 0;
                                            continue;
                                        } else {
                                            i11 = 1;
                                            continue;
                                        }
                                    } else {
                                        i11 = 2;
                                        continue;
                                    }
                                    if (i11 != 0) {
                                        break;
                                    }
                                } else {
                                    i11 = 0;
                                    break;
                                }
                            }
                        }
                        this.v = i11;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).d.add(new b(this.f49694i, wVar8));
                    }
                } else if (j20 < 262144) {
                    lVar.t((int) j20);
                } else {
                    nVar.f19103a = lVar.getPosition() + j20;
                    z11 = true;
                    j(position3);
                    if (z11 && this.h != 2) {
                        return 1;
                    }
                }
                z11 = false;
                j(position3);
                if (z11) {
                    return 1;
                }
                continue;
            } else {
                int i36 = this.f49696k;
                w wVar9 = this.d;
                if (i36 == 0) {
                    if (!lVar.c(wVar9.f6640a, 0, 8, true)) {
                        return -1;
                    }
                    this.f49696k = 8;
                    wVar9.C(0);
                    this.f49695j = wVar9.s();
                    this.f49694i = wVar9.e();
                }
                long j21 = this.f49695j;
                if (j21 == 1) {
                    lVar.readFully(wVar9.f6640a, 8, 8);
                    this.f49696k += 8;
                    this.f49695j = wVar9.v();
                } else if (j21 == 0) {
                    long length4 = lVar.getLength();
                    if (length4 == -1 && (aVar = (a) arrayDeque.peek()) != null) {
                        length4 = aVar.f49632c;
                    }
                    if (length4 != -1) {
                        this.f49695j = (length4 - lVar.getPosition()) + this.f49696k;
                    }
                }
                long j22 = this.f49695j;
                int i37 = this.f49696k;
                if (j22 >= i37) {
                    int i38 = this.f49694i;
                    if (i38 != 1836019574 && i38 != 1953653099 && i38 != 1835297121 && i38 != 1835626086 && i38 != 1937007212 && i38 != 1701082227 && i38 != 1835365473) {
                        if (i38 != 1835296868 && i38 != 1836476516 && i38 != 1751411826 && i38 != 1937011556 && i38 != 1937011827 && i38 != 1937011571 && i38 != 1668576371 && i38 != 1701606260 && i38 != 1937011555 && i38 != 1937011578 && i38 != 1937013298 && i38 != 1937007471 && i38 != 1668232756 && i38 != 1953196132 && i38 != 1718909296 && i38 != 1969517665 && i38 != 1801812339 && i38 != 1768715124) {
                            long position4 = lVar.getPosition();
                            long j23 = this.f49696k;
                            long j24 = position4 - j23;
                            if (this.f49694i == 1836086884) {
                                new h4.b(0L, j24, -9223372036854775807L, j24 + j23, this.f49695j - j23);
                            }
                            this.f49697l = null;
                            this.h = 1;
                        } else {
                            if (i37 == 8) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            f5.a.i(z12);
                            if (this.f49695j <= 2147483647L) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            f5.a.i(z13);
                            w wVar10 = new w((int) this.f49695j);
                            System.arraycopy(wVar9.f6640a, 0, wVar10.f6640a, 0, 8);
                            this.f49697l = wVar10;
                            this.h = 1;
                        }
                    } else {
                        long position5 = lVar.getPosition();
                        long j25 = this.f49695j;
                        long j26 = this.f49696k;
                        long j27 = (position5 + j25) - j26;
                        if (j25 != j26 && this.f49694i == 1835365473) {
                            wVar.z(8);
                            lVar.a(0, 8, wVar.f6640a);
                            byte[] bArr3 = e.f49642a;
                            int i39 = wVar.f6641b;
                            wVar.D(4);
                            if (wVar.e() != 1751411826) {
                                i39 += 4;
                            }
                            wVar.C(i39);
                            lVar.t(wVar.f6641b);
                            lVar.s();
                        }
                        arrayDeque.push(new a(this.f49694i, j27));
                        if (this.f49695j == this.f49696k) {
                            j(j27);
                        } else {
                            this.h = 0;
                            this.f49696k = 0;
                        }
                    }
                } else {
                    throw t1.c("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override
    public final boolean e(o3.l lVar) {
        return j.i(lVar, false, false);
    }

    @Override
    public final void f(long j10, long j11) {
        k[] kVarArr;
        this.f49691e.clear();
        this.f49696k = 0;
        this.f49698m = -1;
        this.f49699n = 0;
        this.f49700o = 0;
        this.f49701p = 0;
        if (j10 == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.f49696k = 0;
                return;
            }
            n nVar = this.f49692f;
            nVar.f49710a.clear();
            nVar.f49711b = 0;
            this.f49693g.clear();
            return;
        }
        for (k kVar : this.f49703r) {
            r rVar = kVar.f49685b;
            int e10 = d0.e(rVar.f49745f, j11, false);
            while (true) {
                if (e10 >= 0) {
                    if ((rVar.f49746g[e10] & 1) != 0) {
                        break;
                    }
                    e10--;
                } else {
                    e10 = -1;
                    break;
                }
            }
            if (e10 == -1) {
                e10 = rVar.a(j11);
            }
            kVar.f49687e = e10;
            x xVar = kVar.d;
            if (xVar != null) {
                xVar.f19124b = false;
                xVar.f19125c = 0;
            }
        }
    }

    @Override
    public final o3.s g(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: w3.l.g(long):o3.s");
    }

    @Override
    public final long h() {
        return this.f49706u;
    }

    @Override
    public final void i(o3.m mVar) {
        this.f49702q = mVar;
    }

    public final void j(long r31) {
        throw new UnsupportedOperationException("Method not decompiled: w3.l.j(long):void");
    }

    @Override
    public final void release() {
    }
}
