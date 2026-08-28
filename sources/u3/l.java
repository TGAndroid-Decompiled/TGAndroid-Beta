package u3;

import d5.f0;
import d5.y;
import h3.t1;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import m3.t;
import m3.w;
import m3.x;
public final class l implements m3.k, t {
    public int f48035i;
    public long f48036j;
    public int f48037k;
    public y f48038l;
    public int f48040n;
    public int f48041o;
    public int f48042p;
    public long[][] f48045s;
    public int f48046t;
    public long f48047u;
    public int v;
    public int h = 0;
    public final n f48033f = new n();
    public final ArrayList f48034g = new ArrayList();
    public final y d = new y(16);
    public final ArrayDeque f48032e = new ArrayDeque();
    public final y f48029a = new y(d5.a.d);
    public final y f48030b = new y(4);
    public final y f48031c = new y();
    public int f48039m = -1;
    public m3.m f48043q = m3.m.f17243t;
    public k[] f48044r = new k[0];

    public l(int i9) {
    }

    @Override
    public final int b(m3.l lVar, m3.n nVar) {
        boolean z10;
        long j10;
        int i9;
        char c10;
        char c11;
        boolean z11;
        int i10;
        a aVar;
        boolean z12;
        boolean z13;
        while (true) {
            int i11 = this.h;
            ArrayDeque arrayDeque = this.f48032e;
            y yVar = this.f48031c;
            int i12 = 4;
            if (i11 != 0) {
                int i13 = 2;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            n nVar2 = this.f48033f;
                            ArrayList arrayList = nVar2.f48051a;
                            int i14 = nVar2.f48052b;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    short s10 = 2816;
                                    short s11 = 2192;
                                    if (i14 != 2) {
                                        if (i14 == 3) {
                                            long position = lVar.getPosition();
                                            int length = (int) ((lVar.getLength() - lVar.getPosition()) - nVar2.f48053c);
                                            y yVar2 = new y(length);
                                            lVar.readFully(yVar2.f4410a, 0, length);
                                            int i15 = 0;
                                            while (i15 < arrayList.size()) {
                                                m mVar = (m) arrayList.get(i15);
                                                yVar2.C((int) (mVar.f48048a - position));
                                                yVar2.D(i12);
                                                int g10 = yVar2.g();
                                                Charset charset = n8.d.f18513c;
                                                String p6 = yVar2.p(g10, charset);
                                                switch (p6.hashCode()) {
                                                    case -1711564334:
                                                        if (p6.equals("SlowMotion_Data")) {
                                                            c10 = 0;
                                                            break;
                                                        }
                                                        c10 = 65535;
                                                        break;
                                                    case -1332107749:
                                                        if (p6.equals("Super_SlowMotion_Edit_Data")) {
                                                            c10 = 1;
                                                            break;
                                                        }
                                                        c10 = 65535;
                                                        break;
                                                    case -1251387154:
                                                        if (p6.equals("Super_SlowMotion_Data")) {
                                                            c10 = 2;
                                                            break;
                                                        }
                                                        c10 = 65535;
                                                        break;
                                                    case -830665521:
                                                        if (p6.equals("Super_SlowMotion_Deflickering_On")) {
                                                            c10 = 3;
                                                            break;
                                                        }
                                                        c10 = 65535;
                                                        break;
                                                    case 1760745220:
                                                        if (p6.equals("Super_SlowMotion_BGM")) {
                                                            c10 = 4;
                                                            break;
                                                        }
                                                        c10 = 65535;
                                                        break;
                                                    default:
                                                        c10 = 65535;
                                                        break;
                                                }
                                                switch (c10) {
                                                    case 0:
                                                        c11 = 2192;
                                                        break;
                                                    case 1:
                                                        c11 = 2819;
                                                        break;
                                                    case 2:
                                                        c11 = 2816;
                                                        break;
                                                    case 3:
                                                        c11 = 2820;
                                                        break;
                                                    case 4:
                                                        c11 = 2817;
                                                        break;
                                                    default:
                                                        throw t1.a("Invalid SEF name", null);
                                                }
                                                int i16 = mVar.f48049b - (g10 + 8);
                                                if (c11 != 2192) {
                                                    if (c11 != 2816 && c11 != 2817 && c11 != 2819 && c11 != 2820) {
                                                        throw new IllegalStateException();
                                                    }
                                                } else {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    List m10 = n.f48050e.m(yVar2.p(i16, charset));
                                                    for (int i17 = 0; i17 < m10.size(); i17++) {
                                                        List m11 = n.d.m((CharSequence) m10.get(i17));
                                                        if (m11.size() == 3) {
                                                            try {
                                                                arrayList2.add(new f4.c(Long.parseLong((String) m11.get(0)), Long.parseLong((String) m11.get(1)), 1 << (Integer.parseInt((String) m11.get(2)) - 1)));
                                                            } catch (NumberFormatException e10) {
                                                                throw t1.a(null, e10);
                                                            }
                                                        } else {
                                                            throw t1.a(null, null);
                                                        }
                                                    }
                                                    this.f48034g.add(new f4.d(arrayList2));
                                                }
                                                i15++;
                                                i12 = 4;
                                            }
                                            nVar.f17244a = 0L;
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else {
                                        long length2 = lVar.getLength();
                                        int i18 = nVar2.f48053c - 20;
                                        y yVar3 = new y(i18);
                                        lVar.readFully(yVar3.f4410a, 0, i18);
                                        int i19 = 0;
                                        while (i19 < i18 / 12) {
                                            yVar3.D(i13);
                                            byte[] bArr = yVar3.f4410a;
                                            int i20 = yVar3.f4411b;
                                            int i21 = i20 + 1;
                                            yVar3.f4411b = i21;
                                            yVar3.f4411b = i20 + 2;
                                            short s12 = (short) (((bArr[i21] & 255) << 8) | (bArr[i20] & 255));
                                            if (s12 != s11 && s12 != s10) {
                                                if (s12 != 2817) {
                                                    if (s12 != 2819 && s12 != 2820) {
                                                        yVar3.D(8);
                                                        i19++;
                                                        s11 = 2192;
                                                        i13 = 2;
                                                        s10 = 2816;
                                                    }
                                                    arrayList.add(new m((length2 - nVar2.f48053c) - yVar3.g(), yVar3.g()));
                                                    i19++;
                                                    s11 = 2192;
                                                    i13 = 2;
                                                    s10 = 2816;
                                                }
                                            }
                                            arrayList.add(new m((length2 - nVar2.f48053c) - yVar3.g(), yVar3.g()));
                                            i19++;
                                            s11 = 2192;
                                            i13 = 2;
                                            s10 = 2816;
                                        }
                                        if (arrayList.isEmpty()) {
                                            nVar.f17244a = 0L;
                                        } else {
                                            nVar2.f48052b = 3;
                                            nVar.f17244a = ((m) arrayList.get(0)).f48048a;
                                        }
                                    }
                                } else {
                                    y yVar4 = new y(8);
                                    lVar.readFully(yVar4.f4410a, 0, 8);
                                    nVar2.f48053c = yVar4.g() + 8;
                                    if (yVar4.e() != 1397048916) {
                                        nVar.f17244a = 0L;
                                    } else {
                                        nVar.f17244a = lVar.getPosition() - (nVar2.f48053c - 12);
                                        nVar2.f48052b = 2;
                                    }
                                }
                                i9 = 1;
                            } else {
                                long length3 = lVar.getLength();
                                if (length3 != -1 && length3 >= 8) {
                                    j10 = length3 - 8;
                                } else {
                                    j10 = 0;
                                }
                                nVar.f17244a = j10;
                                i9 = 1;
                                nVar2.f48052b = 1;
                            }
                            if (nVar.f17244a == 0) {
                                this.h = 0;
                                this.f48037k = 0;
                                return i9;
                            }
                            return i9;
                        }
                        throw new IllegalStateException();
                    }
                    long position2 = lVar.getPosition();
                    if (this.f48039m == -1) {
                        int i22 = -1;
                        int i23 = -1;
                        boolean z14 = true;
                        boolean z15 = true;
                        int i24 = 0;
                        long j11 = Long.MAX_VALUE;
                        long j12 = Long.MAX_VALUE;
                        long j13 = Long.MAX_VALUE;
                        while (true) {
                            k[] kVarArr = this.f48044r;
                            if (i24 >= kVarArr.length) {
                                break;
                            }
                            k kVar = kVarArr[i24];
                            int i25 = kVar.f48028e;
                            r rVar = kVar.f48026b;
                            if (i25 != rVar.f48083b) {
                                long j14 = rVar.f48084c[i25];
                                long[][] jArr = this.f48045s;
                                int i26 = f0.f4349a;
                                long j15 = jArr[i24][i25];
                                long j16 = j14 - position2;
                                if (j16 >= 0 && j16 < 262144) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if ((!z10 && z15) || (z10 == z15 && j16 < j13)) {
                                    z15 = z10;
                                    i23 = i24;
                                    j13 = j16;
                                    j12 = j15;
                                }
                                if (j15 < j11) {
                                    z14 = z10;
                                    i22 = i24;
                                    j11 = j15;
                                }
                            }
                            i24++;
                        }
                        if (j11 == Long.MAX_VALUE || !z14 || j12 < j11 + 524288) {
                            i22 = i23;
                        }
                        this.f48039m = i22;
                        if (i22 == -1) {
                            return -1;
                        }
                    }
                    k kVar2 = this.f48044r[this.f48039m];
                    w wVar = kVar2.f48027c;
                    o oVar = kVar2.f48025a;
                    r rVar2 = kVar2.f48026b;
                    int i27 = kVar2.f48028e;
                    long j17 = rVar2.f48084c[i27];
                    int i28 = rVar2.d[i27];
                    x xVar = kVar2.d;
                    long j18 = (j17 - position2) + this.f48040n;
                    if (j18 >= 0 && j18 < 262144) {
                        if (oVar.f48059g == 1) {
                            j18 += 8;
                            i28 -= 8;
                        }
                        lVar.u((int) j18);
                        int i29 = oVar.f48061j;
                        if (i29 != 0) {
                            y yVar5 = this.f48030b;
                            byte[] bArr2 = yVar5.f4410a;
                            bArr2[0] = 0;
                            bArr2[1] = 0;
                            bArr2[2] = 0;
                            int i30 = 4 - i29;
                            while (this.f48041o < i28) {
                                int i31 = this.f48042p;
                                if (i31 == 0) {
                                    lVar.readFully(bArr2, i30, i29);
                                    this.f48040n += i29;
                                    yVar5.C(0);
                                    int e11 = yVar5.e();
                                    if (e11 >= 0) {
                                        this.f48042p = e11;
                                        y yVar6 = this.f48029a;
                                        yVar6.C(0);
                                        wVar.a(4, yVar6);
                                        this.f48041o += 4;
                                        i28 += i30;
                                    } else {
                                        throw t1.a("Invalid NAL length", null);
                                    }
                                } else {
                                    int b10 = wVar.b(lVar, i31, false);
                                    this.f48040n += b10;
                                    this.f48041o += b10;
                                    this.f48042p -= b10;
                                }
                            }
                        } else {
                            if ("audio/ac4".equals(oVar.f48058f.B)) {
                                if (this.f48041o == 0) {
                                    j3.b.c(i28, yVar);
                                    wVar.a(7, yVar);
                                    this.f48041o += 7;
                                }
                                i28 += 7;
                            } else if (xVar != null) {
                                xVar.c(lVar);
                            }
                            while (true) {
                                int i32 = this.f48041o;
                                if (i32 >= i28) {
                                    break;
                                }
                                int b11 = wVar.b(lVar, i28 - i32, false);
                                this.f48040n += b11;
                                this.f48041o += b11;
                                this.f48042p -= b11;
                            }
                        }
                        int i33 = i28;
                        long j19 = rVar2.f48086f[i27];
                        int i34 = rVar2.f48087g[i27];
                        if (xVar != null) {
                            xVar.b(wVar, j19, i34, i33, 0, null);
                            if (i27 + 1 == rVar2.f48083b) {
                                xVar.a(wVar, null);
                            }
                        } else {
                            wVar.e(j19, i34, i33, 0, null);
                        }
                        kVar2.f48028e++;
                        this.f48039m = -1;
                        this.f48040n = 0;
                        this.f48041o = 0;
                        this.f48042p = 0;
                        return 0;
                    }
                    nVar.f17244a = j17;
                    return 1;
                }
                long j20 = this.f48036j - this.f48037k;
                long position3 = lVar.getPosition() + j20;
                y yVar7 = this.f48038l;
                if (yVar7 != null) {
                    lVar.readFully(yVar7.f4410a, this.f48037k, (int) j20);
                    if (this.f48035i == 1718909296) {
                        yVar7.C(8);
                        int e12 = yVar7.e();
                        if (e12 != 1751476579) {
                            if (e12 != 1903435808) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                        } else {
                            i10 = 2;
                        }
                        if (i10 == 0) {
                            yVar7.D(4);
                            while (true) {
                                if (yVar7.a() > 0) {
                                    int e13 = yVar7.e();
                                    if (e13 != 1751476579) {
                                        if (e13 != 1903435808) {
                                            i10 = 0;
                                            continue;
                                        } else {
                                            i10 = 1;
                                            continue;
                                        }
                                    } else {
                                        i10 = 2;
                                        continue;
                                    }
                                    if (i10 != 0) {
                                        break;
                                    }
                                } else {
                                    i10 = 0;
                                    break;
                                }
                            }
                        }
                        this.v = i10;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).d.add(new b(this.f48035i, yVar7));
                    }
                } else if (j20 < 262144) {
                    lVar.u((int) j20);
                } else {
                    nVar.f17244a = lVar.getPosition() + j20;
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
                int i35 = this.f48037k;
                y yVar8 = this.d;
                if (i35 == 0) {
                    if (!lVar.d(yVar8.f4410a, 0, 8, true)) {
                        return -1;
                    }
                    this.f48037k = 8;
                    yVar8.C(0);
                    this.f48036j = yVar8.s();
                    this.f48035i = yVar8.e();
                }
                long j21 = this.f48036j;
                if (j21 == 1) {
                    lVar.readFully(yVar8.f4410a, 8, 8);
                    this.f48037k += 8;
                    this.f48036j = yVar8.v();
                } else if (j21 == 0) {
                    long length4 = lVar.getLength();
                    if (length4 == -1 && (aVar = (a) arrayDeque.peek()) != null) {
                        length4 = aVar.f47973c;
                    }
                    if (length4 != -1) {
                        this.f48036j = (length4 - lVar.getPosition()) + this.f48037k;
                    }
                }
                long j22 = this.f48036j;
                int i36 = this.f48037k;
                if (j22 >= i36) {
                    int i37 = this.f48035i;
                    if (i37 != 1836019574 && i37 != 1953653099 && i37 != 1835297121 && i37 != 1835626086 && i37 != 1937007212 && i37 != 1701082227 && i37 != 1835365473) {
                        if (i37 != 1835296868 && i37 != 1836476516 && i37 != 1751411826 && i37 != 1937011556 && i37 != 1937011827 && i37 != 1937011571 && i37 != 1668576371 && i37 != 1701606260 && i37 != 1937011555 && i37 != 1937011578 && i37 != 1937013298 && i37 != 1937007471 && i37 != 1668232756 && i37 != 1953196132 && i37 != 1718909296 && i37 != 1969517665 && i37 != 1801812339 && i37 != 1768715124) {
                            long position4 = lVar.getPosition();
                            long j23 = this.f48037k;
                            long j24 = position4 - j23;
                            if (this.f48035i == 1836086884) {
                                new f4.b(0L, j24, -9223372036854775807L, j24 + j23, this.f48036j - j23);
                            }
                            this.f48038l = null;
                            this.h = 1;
                        } else {
                            if (i36 == 8) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            d5.a.i(z12);
                            if (this.f48036j <= 2147483647L) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            d5.a.i(z13);
                            y yVar9 = new y((int) this.f48036j);
                            System.arraycopy(yVar8.f4410a, 0, yVar9.f4410a, 0, 8);
                            this.f48038l = yVar9;
                            this.h = 1;
                        }
                    } else {
                        long position5 = lVar.getPosition();
                        long j25 = this.f48036j;
                        long j26 = this.f48037k;
                        long j27 = (position5 + j25) - j26;
                        if (j25 != j26 && this.f48035i == 1835365473) {
                            yVar.z(8);
                            lVar.c(0, 8, yVar.f4410a);
                            byte[] bArr3 = e.f47983a;
                            int i38 = yVar.f4411b;
                            yVar.D(4);
                            if (yVar.e() != 1751411826) {
                                i38 += 4;
                            }
                            yVar.C(i38);
                            lVar.u(yVar.f4411b);
                            lVar.t();
                        }
                        arrayDeque.push(new a(this.f48035i, j27));
                        if (this.f48036j == this.f48037k) {
                            j(j27);
                        } else {
                            this.h = 0;
                            this.f48037k = 0;
                        }
                    }
                } else {
                    throw t1.c("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override
    public final void c(m3.m mVar) {
        this.f48043q = mVar;
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
        k[] kVarArr;
        this.f48032e.clear();
        this.f48037k = 0;
        this.f48039m = -1;
        this.f48040n = 0;
        this.f48041o = 0;
        this.f48042p = 0;
        if (j10 == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.f48037k = 0;
                return;
            }
            n nVar = this.f48033f;
            nVar.f48051a.clear();
            nVar.f48052b = 0;
            this.f48034g.clear();
            return;
        }
        for (k kVar : this.f48044r) {
            r rVar = kVar.f48026b;
            int e10 = f0.e(rVar.f48086f, j11, false);
            while (true) {
                if (e10 >= 0) {
                    if ((rVar.f48087g[e10] & 1) != 0) {
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
            kVar.f48028e = e10;
            x xVar = kVar.d;
            if (xVar != null) {
                xVar.f17265b = false;
                xVar.f17266c = 0;
            }
        }
    }

    @Override
    public final m3.s h(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: u3.l.h(long):m3.s");
    }

    @Override
    public final long i() {
        return this.f48047u;
    }

    public final void j(long r31) {
        throw new UnsupportedOperationException("Method not decompiled: u3.l.j(long):void");
    }

    @Override
    public final void release() {
    }
}
