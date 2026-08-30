package z3;

import h5.d0;
import h5.w;
import j3.r1;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.jb;
import r3.v;
public final class m implements r3.k, r3.s {
    public int f47334i;
    public long f47335j;
    public int f47336k;
    public w f47337l;
    public int f47339n;
    public int f47340o;
    public int f47341p;
    public long[][] f47344s;
    public int f47345t;
    public long f47346u;
    public int v;
    public int h = 0;
    public final o f47332f = new o();
    public final ArrayList f47333g = new ArrayList();
    public final w d = new w(16);
    public final ArrayDeque e = new ArrayDeque();
    public final w f47329a = new w(h5.a.d);
    public final w f47330b = new w(4);
    public final w f47331c = new w();
    public int f47338m = -1;
    public r3.m f47342q = r3.m.A;
    public l[] f47343r = new l[0];

    public m(int i10) {
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void d(long j10, long j11) {
        l[] lVarArr;
        this.e.clear();
        this.f47336k = 0;
        this.f47338m = -1;
        this.f47339n = 0;
        this.f47340o = 0;
        this.f47341p = 0;
        if (j10 == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.f47336k = 0;
                return;
            }
            o oVar = this.f47332f;
            oVar.f47349a.clear();
            oVar.f47350b = 0;
            this.f47333g.clear();
            return;
        }
        for (l lVar : this.f47343r) {
            s sVar = lVar.f47327b;
            int e = d0.e(sVar.f47380f, j11, false);
            while (true) {
                if (e >= 0) {
                    if ((sVar.f47381g[e] & 1) != 0) {
                        break;
                    }
                    e--;
                } else {
                    e = -1;
                    break;
                }
            }
            if (e == -1) {
                e = sVar.a(j11);
            }
            lVar.e = e;
            r3.w wVar = lVar.d;
            if (wVar != null) {
                wVar.f43255b = false;
                wVar.f43256c = 0;
            }
        }
    }

    @Override
    public final void e(r3.m mVar) {
        this.f47342q = mVar;
    }

    @Override
    public final r3.r f(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: z3.m.f(long):r3.r");
    }

    @Override
    public final long g() {
        return this.f47346u;
    }

    @Override
    public final int h(r3.l lVar, jb jbVar) {
        boolean z4;
        long j10;
        int i10;
        w wVar;
        char c3;
        char c10;
        boolean z10;
        int i11;
        a aVar;
        boolean z11;
        boolean z12;
        while (true) {
            int i12 = this.h;
            ArrayDeque arrayDeque = this.e;
            w wVar2 = this.f47331c;
            int i13 = 4;
            if (i12 != 0) {
                int i14 = 2;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            o oVar = this.f47332f;
                            ArrayList arrayList = oVar.f47349a;
                            int i15 = oVar.f47350b;
                            if (i15 != 0) {
                                if (i15 != 1) {
                                    short s6 = 2816;
                                    short s9 = 2192;
                                    if (i15 != 2) {
                                        if (i15 == 3) {
                                            long position = lVar.getPosition();
                                            int length = (int) ((lVar.getLength() - lVar.getPosition()) - oVar.f47351c);
                                            w wVar3 = new w(length);
                                            lVar.readFully(wVar3.f7000a, 0, length);
                                            int i16 = 0;
                                            while (i16 < arrayList.size()) {
                                                n nVar = (n) arrayList.get(i16);
                                                wVar3.F((int) (nVar.f47347a - position));
                                                wVar3.G(i13);
                                                int i17 = wVar3.i();
                                                Charset charset = r8.d.f43389c;
                                                String s10 = wVar3.s(i17, charset);
                                                switch (s10.hashCode()) {
                                                    case -1711564334:
                                                        if (s10.equals("SlowMotion_Data")) {
                                                            c3 = 0;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case -1332107749:
                                                        if (s10.equals("Super_SlowMotion_Edit_Data")) {
                                                            c3 = 1;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case -1251387154:
                                                        if (s10.equals("Super_SlowMotion_Data")) {
                                                            c3 = 2;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case -830665521:
                                                        if (s10.equals("Super_SlowMotion_Deflickering_On")) {
                                                            c3 = 3;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case 1760745220:
                                                        if (s10.equals("Super_SlowMotion_BGM")) {
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
                                                        throw r1.a("Invalid SEF name", null);
                                                }
                                                int i18 = nVar.f47348b - (i17 + 8);
                                                if (c10 != 2192) {
                                                    if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                                                        throw new IllegalStateException();
                                                    }
                                                } else {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    List z13 = o.e.z(wVar3.s(i18, charset));
                                                    for (int i19 = 0; i19 < z13.size(); i19++) {
                                                        List z14 = o.d.z((CharSequence) z13.get(i19));
                                                        if (z14.size() == 3) {
                                                            try {
                                                                arrayList2.add(new k4.c(Long.parseLong((String) z14.get(0)), Long.parseLong((String) z14.get(1)), 1 << (Integer.parseInt((String) z14.get(2)) - 1)));
                                                            } catch (NumberFormatException e) {
                                                                throw r1.a(null, e);
                                                            }
                                                        } else {
                                                            throw r1.a(null, null);
                                                        }
                                                    }
                                                    this.f47333g.add(new k4.d(arrayList2));
                                                }
                                                i16++;
                                                i13 = 4;
                                            }
                                            jbVar.f25949a = 0L;
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else {
                                        long length2 = lVar.getLength();
                                        int i20 = oVar.f47351c - 20;
                                        w wVar4 = new w(i20);
                                        lVar.readFully(wVar4.f7000a, 0, i20);
                                        int i21 = 0;
                                        while (i21 < i20 / 12) {
                                            wVar4.G(i14);
                                            short k10 = wVar4.k();
                                            if (k10 != s9 && k10 != s6) {
                                                if (k10 != 2817 && k10 != 2819) {
                                                    if (k10 != 2820) {
                                                        wVar4.G(8);
                                                        wVar = wVar4;
                                                        i21++;
                                                        wVar4 = wVar;
                                                        s9 = 2192;
                                                        i14 = 2;
                                                        s6 = 2816;
                                                    }
                                                }
                                            }
                                            wVar = wVar4;
                                            arrayList.add(new n((length2 - oVar.f47351c) - wVar.i(), wVar.i()));
                                            i21++;
                                            wVar4 = wVar;
                                            s9 = 2192;
                                            i14 = 2;
                                            s6 = 2816;
                                        }
                                        if (arrayList.isEmpty()) {
                                            jbVar.f25949a = 0L;
                                        } else {
                                            oVar.f47350b = 3;
                                            jbVar.f25949a = ((n) arrayList.get(0)).f47347a;
                                        }
                                    }
                                } else {
                                    w wVar5 = new w(8);
                                    lVar.readFully(wVar5.f7000a, 0, 8);
                                    oVar.f47351c = wVar5.i() + 8;
                                    if (wVar5.g() != 1397048916) {
                                        jbVar.f25949a = 0L;
                                    } else {
                                        jbVar.f25949a = lVar.getPosition() - (oVar.f47351c - 12);
                                        oVar.f47350b = 2;
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
                                jbVar.f25949a = j10;
                                i10 = 1;
                                oVar.f47350b = 1;
                            }
                            if (jbVar.f25949a == 0) {
                                this.h = 0;
                                this.f47336k = 0;
                                return i10;
                            }
                            return i10;
                        }
                        throw new IllegalStateException();
                    }
                    long position2 = lVar.getPosition();
                    if (this.f47338m == -1) {
                        int i22 = -1;
                        int i23 = -1;
                        boolean z15 = true;
                        boolean z16 = true;
                        int i24 = 0;
                        long j11 = Long.MAX_VALUE;
                        long j12 = Long.MAX_VALUE;
                        long j13 = Long.MAX_VALUE;
                        while (true) {
                            l[] lVarArr = this.f47343r;
                            if (i24 >= lVarArr.length) {
                                break;
                            }
                            l lVar2 = lVarArr[i24];
                            int i25 = lVar2.e;
                            s sVar = lVar2.f47327b;
                            if (i25 != sVar.f47378b) {
                                long j14 = sVar.f47379c[i25];
                                long[][] jArr = this.f47344s;
                                int i26 = d0.f6937a;
                                long j15 = jArr[i24][i25];
                                long j16 = j14 - position2;
                                if (j16 >= 0 && j16 < 262144) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if ((!z4 && z16) || (z4 == z16 && j16 < j13)) {
                                    z16 = z4;
                                    i23 = i24;
                                    j13 = j16;
                                    j12 = j15;
                                }
                                if (j15 < j11) {
                                    z15 = z4;
                                    i22 = i24;
                                    j11 = j15;
                                }
                            }
                            i24++;
                        }
                        if (j11 == Long.MAX_VALUE || !z15 || j12 < j11 + 524288) {
                            i22 = i23;
                        }
                        this.f47338m = i22;
                        if (i22 == -1) {
                            return -1;
                        }
                    }
                    l lVar3 = this.f47343r[this.f47338m];
                    v vVar = lVar3.f47328c;
                    p pVar = lVar3.f47326a;
                    s sVar2 = lVar3.f47327b;
                    int i27 = lVar3.e;
                    long j17 = sVar2.f47379c[i27];
                    int i28 = sVar2.d[i27];
                    r3.w wVar6 = lVar3.d;
                    long j18 = (j17 - position2) + this.f47339n;
                    if (j18 >= 0 && j18 < 262144) {
                        if (pVar.f47356g == 1) {
                            j18 += 8;
                            i28 -= 8;
                        }
                        lVar.u((int) j18);
                        int i29 = pVar.f47358j;
                        if (i29 != 0) {
                            w wVar7 = this.f47330b;
                            byte[] bArr = wVar7.f7000a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i30 = 4 - i29;
                            while (this.f47340o < i28) {
                                int i31 = this.f47341p;
                                if (i31 == 0) {
                                    lVar.readFully(bArr, i30, i29);
                                    this.f47339n += i29;
                                    wVar7.F(0);
                                    int g10 = wVar7.g();
                                    if (g10 >= 0) {
                                        this.f47341p = g10;
                                        w wVar8 = this.f47329a;
                                        wVar8.F(0);
                                        vVar.d(4, wVar8);
                                        this.f47340o += 4;
                                        i28 += i30;
                                    } else {
                                        throw r1.a("Invalid NAL length", null);
                                    }
                                } else {
                                    int e6 = vVar.e(lVar, i31, false);
                                    this.f47339n += e6;
                                    this.f47340o += e6;
                                    this.f47341p -= e6;
                                }
                            }
                        } else {
                            if ("audio/ac4".equals(pVar.f47355f.C)) {
                                if (this.f47340o == 0) {
                                    l3.a.c(i28, wVar2);
                                    vVar.d(7, wVar2);
                                    this.f47340o += 7;
                                }
                                i28 += 7;
                            } else if (wVar6 != null) {
                                wVar6.c(lVar);
                            }
                            while (true) {
                                int i32 = this.f47340o;
                                if (i32 >= i28) {
                                    break;
                                }
                                int e10 = vVar.e(lVar, i28 - i32, false);
                                this.f47339n += e10;
                                this.f47340o += e10;
                                this.f47341p -= e10;
                            }
                        }
                        int i33 = i28;
                        long j19 = sVar2.f47380f[i27];
                        int i34 = sVar2.f47381g[i27];
                        if (wVar6 != null) {
                            wVar6.b(vVar, j19, i34, i33, 0, null);
                            if (i27 + 1 == sVar2.f47378b) {
                                wVar6.a(vVar, null);
                            }
                        } else {
                            vVar.c(j19, i34, i33, 0, null);
                        }
                        lVar3.e++;
                        this.f47338m = -1;
                        this.f47339n = 0;
                        this.f47340o = 0;
                        this.f47341p = 0;
                        return 0;
                    }
                    jbVar.f25949a = j17;
                    return 1;
                }
                long j20 = this.f47335j - this.f47336k;
                long position3 = lVar.getPosition() + j20;
                w wVar9 = this.f47337l;
                if (wVar9 != null) {
                    lVar.readFully(wVar9.f7000a, this.f47336k, (int) j20);
                    if (this.f47334i == 1718909296) {
                        wVar9.F(8);
                        int g11 = wVar9.g();
                        if (g11 != 1751476579) {
                            if (g11 != 1903435808) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                        } else {
                            i11 = 2;
                        }
                        if (i11 == 0) {
                            wVar9.G(4);
                            while (true) {
                                if (wVar9.a() > 0) {
                                    int g12 = wVar9.g();
                                    if (g12 != 1751476579) {
                                        if (g12 != 1903435808) {
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
                        ((a) arrayDeque.peek()).d.add(new b(this.f47334i, wVar9));
                    }
                } else if (j20 < 262144) {
                    lVar.u((int) j20);
                } else {
                    jbVar.f25949a = lVar.getPosition() + j20;
                    z10 = true;
                    j(position3);
                    if (z10 && this.h != 2) {
                        return 1;
                    }
                }
                z10 = false;
                j(position3);
                if (z10) {
                    return 1;
                }
                continue;
            } else {
                int i35 = this.f47336k;
                w wVar10 = this.d;
                if (i35 == 0) {
                    if (!lVar.d(wVar10.f7000a, 0, 8, true)) {
                        return -1;
                    }
                    this.f47336k = 8;
                    wVar10.F(0);
                    this.f47335j = wVar10.v();
                    this.f47334i = wVar10.g();
                }
                long j21 = this.f47335j;
                if (j21 == 1) {
                    lVar.readFully(wVar10.f7000a, 8, 8);
                    this.f47336k += 8;
                    this.f47335j = wVar10.y();
                } else if (j21 == 0) {
                    long length4 = lVar.getLength();
                    if (length4 == -1 && (aVar = (a) arrayDeque.peek()) != null) {
                        length4 = aVar.f47278c;
                    }
                    if (length4 != -1) {
                        this.f47335j = (length4 - lVar.getPosition()) + this.f47336k;
                    }
                }
                long j22 = this.f47335j;
                int i36 = this.f47336k;
                if (j22 >= i36) {
                    int i37 = this.f47334i;
                    if (i37 != 1836019574 && i37 != 1953653099 && i37 != 1835297121 && i37 != 1835626086 && i37 != 1937007212 && i37 != 1701082227 && i37 != 1835365473) {
                        if (i37 != 1835296868 && i37 != 1836476516 && i37 != 1751411826 && i37 != 1937011556 && i37 != 1937011827 && i37 != 1937011571 && i37 != 1668576371 && i37 != 1701606260 && i37 != 1937011555 && i37 != 1937011578 && i37 != 1937013298 && i37 != 1937007471 && i37 != 1668232756 && i37 != 1953196132 && i37 != 1718909296 && i37 != 1969517665 && i37 != 1801812339 && i37 != 1768715124) {
                            long position4 = lVar.getPosition();
                            long j23 = this.f47336k;
                            long j24 = position4 - j23;
                            if (this.f47334i == 1836086884) {
                                new k4.b(0L, j24, -9223372036854775807L, j24 + j23, this.f47335j - j23);
                            }
                            this.f47337l = null;
                            this.h = 1;
                        } else {
                            if (i36 == 8) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            h5.a.i(z11);
                            if (this.f47335j <= 2147483647L) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            h5.a.i(z12);
                            w wVar11 = new w((int) this.f47335j);
                            System.arraycopy(wVar10.f7000a, 0, wVar11.f7000a, 0, 8);
                            this.f47337l = wVar11;
                            this.h = 1;
                        }
                    } else {
                        long position5 = lVar.getPosition();
                        long j25 = this.f47335j;
                        long j26 = this.f47336k;
                        long j27 = (position5 + j25) - j26;
                        if (j25 != j26 && this.f47334i == 1835365473) {
                            wVar2.C(8);
                            lVar.c(0, 8, wVar2.f7000a);
                            byte[] bArr2 = e.f47286a;
                            int i38 = wVar2.f7001b;
                            wVar2.G(4);
                            if (wVar2.g() != 1751411826) {
                                i38 += 4;
                            }
                            wVar2.F(i38);
                            lVar.u(wVar2.f7001b);
                            lVar.t();
                        }
                        arrayDeque.push(new a(this.f47334i, j27));
                        if (this.f47335j == this.f47336k) {
                            j(j27);
                        } else {
                            this.h = 0;
                            this.f47336k = 0;
                        }
                    }
                } else {
                    throw r1.c("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override
    public final boolean i(r3.l lVar) {
        return j.j(lVar, false, false);
    }

    public final void j(long r34) {
        throw new UnsupportedOperationException("Method not decompiled: z3.m.j(long):void");
    }

    @Override
    public final void release() {
    }
}
