package w3;

import android.util.SparseArray;
import f2.g0;
import h3.s0;
import h3.t0;
import java.util.ArrayList;
import java.util.Arrays;

public final class p implements h {

    public final a0 f49139a;

    public final boolean f49140b;

    public final boolean f49141c;

    public long f49144g;

    public String f49145i;

    public m3.w f49146j;

    public o f49147k;

    public boolean f49148l;

    public boolean f49150n;
    public final boolean[] h = new boolean[3];
    public final g0 d = new g0(7);

    public final g0 f49142e = new g0(8);

    public final g0 f49143f = new g0(6);

    public long f49149m = -9223372036854775807L;

    public final d5.z f49151o = new d5.z();

    public p(a0 a0Var, boolean z10, boolean z11) {
        this.f49139a = a0Var;
        this.f49140b = z10;
        this.f49141c = z11;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean zH;
        boolean zH2;
        boolean z10;
        boolean z11;
        int iL;
        int i12;
        int iM;
        int iM2;
        int i13;
        int iM3;
        if (!this.f49148l || this.f49147k.f49125c) {
            this.d.a(i10, i11, bArr);
            this.f49142e.a(i10, i11, bArr);
        }
        this.f49143f.a(i10, i11, bArr);
        o oVar = this.f49147k;
        SparseArray sparseArray = oVar.f49126e;
        d5.y yVar = oVar.f49127f;
        if (oVar.f49131k) {
            int i14 = i11 - i10;
            byte[] bArr2 = oVar.f49128g;
            int length = bArr2.length;
            int i15 = oVar.h + i14;
            if (length < i15) {
                oVar.f49128g = Arrays.copyOf(bArr2, i15 * 2);
            }
            System.arraycopy(bArr, i10, oVar.f49128g, oVar.h, i14);
            int i16 = oVar.h + i14;
            oVar.h = i16;
            yVar.f4853b = oVar.f49128g;
            yVar.d = 0;
            yVar.f4854c = i16;
            yVar.f4855e = 0;
            yVar.a();
            if (yVar.d(8)) {
                yVar.r();
                int i17 = yVar.i(2);
                yVar.s(5);
                if (yVar.e()) {
                    yVar.l();
                    if (yVar.e()) {
                        int iL2 = yVar.l();
                        if (!oVar.f49125c) {
                            oVar.f49131k = false;
                            n nVar = oVar.f49134n;
                            nVar.f49112e = iL2;
                            nVar.f49110b = true;
                            return;
                        }
                        if (yVar.e()) {
                            int iL3 = yVar.l();
                            if (sparseArray.indexOfKey(iL3) < 0) {
                                oVar.f49131k = false;
                                return;
                            }
                            d5.s sVar = (d5.s) sparseArray.get(iL3);
                            SparseArray sparseArray2 = oVar.d;
                            int i18 = sVar.f4831a;
                            boolean z12 = sVar.f4832b;
                            d5.t tVar = (d5.t) sparseArray2.get(i18);
                            boolean z13 = tVar.h;
                            int i19 = tVar.f4842l;
                            int i20 = tVar.f4840j;
                            if (z13) {
                                if (!yVar.d(2)) {
                                    return;
                                } else {
                                    yVar.s(2);
                                }
                            }
                            if (yVar.d(i20)) {
                                int i21 = yVar.i(i20);
                                if (!tVar.f4839i) {
                                    if (yVar.d(1)) {
                                        zH = yVar.h();
                                        if (zH) {
                                            if (!yVar.d(1)) {
                                                return;
                                            }
                                            zH2 = yVar.h();
                                            z10 = true;
                                        }
                                        if (oVar.f49129i == 5) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            iL = 0;
                                        } else if (!yVar.e()) {
                                            return;
                                        } else {
                                            iL = yVar.l();
                                        }
                                        i12 = tVar.f4841k;
                                        if (i12 == 0) {
                                            if (i12 == 1 || tVar.f4843m) {
                                                iM = 0;
                                                iM2 = 0;
                                                i13 = 0;
                                            } else {
                                                if (!yVar.e()) {
                                                    return;
                                                }
                                                iM3 = yVar.m();
                                                if (!z12 || zH) {
                                                    iM = 0;
                                                    iM2 = 0;
                                                } else {
                                                    if (!yVar.e()) {
                                                        return;
                                                    }
                                                    iM2 = yVar.m();
                                                    iM = 0;
                                                }
                                                i13 = 0;
                                            }
                                            n nVar2 = oVar.f49134n;
                                            nVar2.f49111c = tVar;
                                            nVar2.d = i17;
                                            nVar2.f49112e = iL2;
                                            nVar2.f49113f = i21;
                                            nVar2.f49114g = iL3;
                                            nVar2.h = zH;
                                            nVar2.f49115i = z10;
                                            nVar2.f49116j = zH2;
                                            nVar2.f49117k = z11;
                                            nVar2.f49118l = iL;
                                            nVar2.f49119m = i13;
                                            nVar2.f49120n = iM;
                                            nVar2.f49121o = iM3;
                                            nVar2.f49122p = iM2;
                                            nVar2.f49109a = true;
                                            nVar2.f49110b = true;
                                            oVar.f49131k = false;
                                        }
                                        if (!yVar.d(i19)) {
                                            return;
                                        }
                                        i13 = yVar.i(i19);
                                        if (z12 || zH) {
                                            iM = 0;
                                        } else if (!yVar.e()) {
                                            return;
                                        } else {
                                            iM = yVar.m();
                                        }
                                        iM2 = 0;
                                        iM3 = 0;
                                        n nVar3 = oVar.f49134n;
                                        nVar3.f49111c = tVar;
                                        nVar3.d = i17;
                                        nVar3.f49112e = iL2;
                                        nVar3.f49113f = i21;
                                        nVar3.f49114g = iL3;
                                        nVar3.h = zH;
                                        nVar3.f49115i = z10;
                                        nVar3.f49116j = zH2;
                                        nVar3.f49117k = z11;
                                        nVar3.f49118l = iL;
                                        nVar3.f49119m = i13;
                                        nVar3.f49120n = iM;
                                        nVar3.f49121o = iM3;
                                        nVar3.f49122p = iM2;
                                        nVar3.f49109a = true;
                                        nVar3.f49110b = true;
                                        oVar.f49131k = false;
                                    }
                                    return;
                                }
                                zH = false;
                                zH2 = false;
                                z10 = false;
                                if (oVar.f49129i == 5) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    iL = 0;
                                } else if (!yVar.e()) {
                                    return;
                                } else {
                                    iL = yVar.l();
                                }
                                i12 = tVar.f4841k;
                                if (i12 == 0) {
                                    if (i12 == 1) {
                                    }
                                    iM = 0;
                                    iM2 = 0;
                                    i13 = 0;
                                } else {
                                    if (!yVar.d(i19)) {
                                        return;
                                    }
                                    i13 = yVar.i(i19);
                                    if (z12) {
                                        iM = 0;
                                    } else {
                                        iM = 0;
                                    }
                                    iM2 = 0;
                                }
                                iM3 = 0;
                                n nVar4 = oVar.f49134n;
                                nVar4.f49111c = tVar;
                                nVar4.d = i17;
                                nVar4.f49112e = iL2;
                                nVar4.f49113f = i21;
                                nVar4.f49114g = iL3;
                                nVar4.h = zH;
                                nVar4.f49115i = z10;
                                nVar4.f49116j = zH2;
                                nVar4.f49117k = z11;
                                nVar4.f49118l = iL;
                                nVar4.f49119m = i13;
                                nVar4.f49120n = iM;
                                nVar4.f49121o = iM3;
                                nVar4.f49122p = iM2;
                                nVar4.f49109a = true;
                                nVar4.f49110b = true;
                                oVar.f49131k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void b(d5.z zVar) {
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        long j10;
        long j11;
        int i13;
        long j12;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        d5.a.j(this.f49146j);
        int i18 = d5.g0.f4795a;
        int i19 = zVar.f4859b;
        int i20 = zVar.f4860c;
        byte[] bArr2 = zVar.f4858a;
        this.f49144g += (long) zVar.a();
        this.f49146j.a(zVar.a(), zVar);
        while (true) {
            int iR = d5.a.r(bArr2, i19, i20, this.h);
            if (iR == i20) {
                a(i19, i20, bArr2);
                return;
            }
            int i21 = iR + 3;
            int i22 = bArr2[i21] & 31;
            int i23 = iR - i19;
            if (i23 > 0) {
                a(i19, iR, bArr2);
            }
            int i24 = i20 - iR;
            long j13 = this.f49144g - ((long) i24);
            int i25 = i23 < 0 ? -i23 : 0;
            long j14 = this.f49149m;
            boolean z11 = this.f49148l;
            g0 g0Var = this.d;
            g0 g0Var2 = this.f49142e;
            if (!z11 || this.f49147k.f49125c) {
                g0Var.e(i25);
                g0Var2.e(i25);
                if (this.f49148l) {
                    i10 = i24;
                    i11 = i20;
                    bArr = bArr2;
                    i12 = i21;
                    j10 = j13;
                    if (g0Var.d) {
                        d5.t tVarC = d5.a.C(3, g0Var.f5674e, (byte[]) g0Var.f5675f);
                        this.f49147k.d.append(tVarC.d, tVarC);
                        g0Var.f();
                    } else if (g0Var2.d) {
                        d5.y yVar = new d5.y((byte[]) g0Var2.f5675f, 4, g0Var2.f5674e);
                        int iL = yVar.l();
                        int iL2 = yVar.l();
                        yVar.r();
                        this.f49147k.f49126e.append(iL, new d5.s(iL, iL2, yVar.h()));
                        g0Var2.f();
                    }
                } else if (g0Var.d && g0Var2.d) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf((byte[]) g0Var.f5675f, g0Var.f5674e));
                    arrayList.add(Arrays.copyOf((byte[]) g0Var2.f5675f, g0Var2.f5674e));
                    i10 = i24;
                    d5.t tVarC2 = d5.a.C(3, g0Var.f5674e, (byte[]) g0Var.f5675f);
                    i11 = i20;
                    bArr = bArr2;
                    d5.y yVar2 = new d5.y((byte[]) g0Var2.f5675f, 4, g0Var2.f5674e);
                    int iL3 = yVar2.l();
                    int iL4 = yVar2.l();
                    yVar2.r();
                    d5.s sVar = new d5.s(iL3, iL4, yVar2.h());
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(tVarC2.f4833a), Integer.valueOf(tVarC2.f4834b), Integer.valueOf(tVarC2.f4835c));
                    m3.w wVar = this.f49146j;
                    i12 = i21;
                    s0 s0Var = new s0();
                    j10 = j13;
                    s0Var.f8123a = this.f49145i;
                    s0Var.f8135o = "video/avc";
                    s0Var.h = str;
                    s0Var.f8140t = tVarC2.f4836e;
                    s0Var.f8141u = tVarC2.f4837f;
                    s0Var.f8143x = tVarC2.f4838g;
                    s0Var.f8137q = arrayList;
                    wVar.c(new t0(s0Var));
                    this.f49148l = true;
                    this.f49147k.d.append(tVarC2.d, tVarC2);
                    this.f49147k.f49126e.append(iL3, sVar);
                    g0Var.f();
                    g0Var2.f();
                } else {
                    i10 = i24;
                    i11 = i20;
                    bArr = bArr2;
                    i12 = i21;
                    j10 = j13;
                }
            } else {
                i10 = i24;
                i11 = i20;
                bArr = bArr2;
                i12 = i21;
                j10 = j13;
            }
            g0 g0Var3 = this.f49143f;
            if (g0Var3.e(i25)) {
                int iJ = d5.a.J(g0Var3.f5674e, (byte[]) g0Var3.f5675f);
                byte[] bArr3 = (byte[]) g0Var3.f5675f;
                d5.z zVar2 = this.f49151o;
                zVar2.A(iJ, bArr3);
                zVar2.C(4);
                h7.p.a(j14, zVar2, this.f49139a.f48985c);
            }
            o oVar = this.f49147k;
            boolean z12 = this.f49148l;
            boolean z13 = this.f49150n;
            if (oVar.f49129i == 9) {
                if (z12 && oVar.f49135o) {
                    j11 = oVar.f49130j;
                    i13 = i10 + ((int) (j10 - j11));
                    j12 = oVar.f49137q;
                    if (j12 != -9223372036854775807L) {
                        oVar.f49123a.e(j12, oVar.f49138r ? 1 : 0, (int) (j11 - oVar.f49136p), i13, null);
                    }
                }
                oVar.f49136p = oVar.f49130j;
                oVar.f49137q = oVar.f49132l;
                oVar.f49138r = false;
                oVar.f49135o = true;
            } else if (oVar.f49125c) {
                n nVar = oVar.f49134n;
                n nVar2 = oVar.f49133m;
                if (nVar.f49109a) {
                    if (nVar2.f49109a) {
                        d5.t tVar = nVar.f49111c;
                        d5.a.j(tVar);
                        d5.t tVar2 = nVar2.f49111c;
                        d5.a.j(tVar2);
                        int i26 = tVar2.f4841k;
                        if (nVar.f49113f != nVar2.f49113f || nVar.f49114g != nVar2.f49114g || nVar.h != nVar2.h || ((nVar.f49115i && nVar2.f49115i && nVar.f49116j != nVar2.f49116j) || (((i15 = nVar.d) != (i16 = nVar2.d) && (i15 == 0 || i16 == 0)) || (((i17 = tVar.f4841k) == 0 && i26 == 0 && (nVar.f49119m != nVar2.f49119m || nVar.f49120n != nVar2.f49120n)) || ((i17 == 1 && i26 == 1 && (nVar.f49121o != nVar2.f49121o || nVar.f49122p != nVar2.f49122p)) || (z10 = nVar.f49117k) != nVar2.f49117k || (z10 && nVar.f49118l != nVar2.f49118l)))))) {
                            if (z12) {
                                j11 = oVar.f49130j;
                                i13 = i10 + ((int) (j10 - j11));
                                j12 = oVar.f49137q;
                                if (j12 != -9223372036854775807L) {
                                    oVar.f49123a.e(j12, oVar.f49138r ? 1 : 0, (int) (j11 - oVar.f49136p), i13, null);
                                }
                            }
                            oVar.f49136p = oVar.f49130j;
                            oVar.f49137q = oVar.f49132l;
                            oVar.f49138r = false;
                            oVar.f49135o = true;
                        }
                    } else {
                        if (z12) {
                            j11 = oVar.f49130j;
                            i13 = i10 + ((int) (j10 - j11));
                            j12 = oVar.f49137q;
                            if (j12 != -9223372036854775807L) {
                                oVar.f49123a.e(j12, oVar.f49138r ? 1 : 0, (int) (j11 - oVar.f49136p), i13, null);
                            }
                        }
                        oVar.f49136p = oVar.f49130j;
                        oVar.f49137q = oVar.f49132l;
                        oVar.f49138r = false;
                        oVar.f49135o = true;
                    }
                }
            }
            if (oVar.f49124b) {
                n nVar3 = oVar.f49134n;
                z13 = nVar3.f49110b && ((i14 = nVar3.f49112e) == 7 || i14 == 2);
            }
            boolean z14 = oVar.f49138r;
            int i27 = oVar.f49129i;
            boolean z15 = z14 | (i27 == 5 || (z13 && i27 == 1));
            oVar.f49138r = z15;
            if (z15) {
                this.f49150n = false;
            }
            long j15 = this.f49149m;
            if (!this.f49148l || this.f49147k.f49125c) {
                g0Var.g(i22);
                g0Var2.g(i22);
            }
            g0Var3.g(i22);
            o oVar2 = this.f49147k;
            oVar2.f49129i = i22;
            oVar2.f49132l = j15;
            oVar2.f49130j = j10;
            if ((oVar2.f49124b && i22 == 1) || (oVar2.f49125c && (i22 == 5 || i22 == 1 || i22 == 2))) {
                n nVar4 = oVar2.f49133m;
                oVar2.f49133m = oVar2.f49134n;
                oVar2.f49134n = nVar4;
                nVar4.f49110b = false;
                nVar4.f49109a = false;
                oVar2.h = 0;
                oVar2.f49131k = true;
            }
            i20 = i11;
            bArr2 = bArr;
            i19 = i12;
        }
    }

    @Override
    public final void c() {
        this.f49144g = 0L;
        this.f49150n = false;
        this.f49149m = -9223372036854775807L;
        d5.a.m(this.h);
        this.d.f();
        this.f49142e.f();
        this.f49143f.f();
        o oVar = this.f49147k;
        if (oVar != null) {
            oVar.f49131k = false;
            oVar.f49135o = false;
            n nVar = oVar.f49134n;
            nVar.f49110b = false;
            nVar.f49109a = false;
        }
    }

    @Override
    public final void e(m3.m mVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f49145i = e0Var.f49053e;
        e0Var.b();
        m3.w wVarC = mVar.C(e0Var.d, 2);
        this.f49146j = wVarC;
        this.f49147k = new o(wVarC, this.f49140b, this.f49141c);
        this.f49139a.b(mVar, e0Var);
    }

    @Override
    public final void f(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f49149m = j10;
        }
        this.f49150n = ((i10 & 2) != 0) | this.f49150n;
    }

    @Override
    public final void d() {
    }
}
