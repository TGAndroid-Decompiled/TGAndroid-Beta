package s9;

import android.os.Build;
import android.support.v4.media.session.a0;
import android.util.SparseArray;
import android.view.TextureView;
import b2.w0;
import c3.j0;
import c3.t;
import e2.x;
import eg.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import m.p3;
import org.telegram.messenger.at;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.an0;
import org.telegram.ui.lx;
import org.telegram.ui.ns0;
import org.telegram.ui.un;
import sg.o;
import th.f7;
import th.z2;
import vh.b0;
import vh.o8;
import vh.s7;
import vh.t8;
import yh.c0;
import yh.d0;
import zf.k1;
import zf.l1;
public final class g implements fe.e, ns0, p, jg.c, t8, c0, l1 {
    public Object f48124a;

    public g(Object obj) {
        this.f48124a = obj;
    }

    @Override
    public void E(float f7, int i10) {
        o oVar = (o) this.f48124a;
        oVar.f48434c.setLayerType(0, null);
        if (f7 == 0.0f && !oVar.N) {
            oVar.f48434c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                oVar.E.setFocusableInTouchMode(false);
            }
        }
        at.e().k(at.f14735k1, 512);
    }

    @Override
    public void H0(kj kjVar) {
        ((f7) ((z2) this.f48124a).f49797z1).f(true);
    }

    @Override
    public void I(kj kjVar) {
        ((f7) ((z2) this.f48124a).f49797z1).f(false);
    }

    @Override
    public a0.h M() {
        return null;
    }

    @Override
    public boolean Y(int i10) {
        if (i10 == ((an0) this.f48124a).f55704d0) {
            return true;
        }
        return false;
    }

    @Override
    public void a(long j10) {
        ((yh.p) this.f48124a).presentFragment(un.ma(j10));
    }

    @Override
    public void b() {
        boolean z10;
        yh.p pVar = (yh.p) this.f48124a;
        fe.b bVar = pVar.f54517a;
        d0 d0Var = pVar.f54524w;
        if (d0Var.f54481n && d0Var.f54479l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        pVar.d.f31183f3.O(true);
    }

    public void c(int i10, int i11, c3.p pVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        byte[] bArr;
        int i21;
        u3.f fVar = (u3.f) this.f48124a;
        u3.g gVar = fVar.f50133b;
        SparseArray sparseArray = fVar.f50135c;
        x xVar = fVar.f50148k;
        x xVar2 = fVar.f50144i;
        int i22 = 2;
        int i23 = 0;
        int i24 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        fVar.h(i10);
                                        byte[] bArr2 = new byte[i11];
                                        fVar.f50161y.f50123x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw w0.a(null, "Unexpected id: " + i10);
                                }
                                fVar.h(i10);
                                byte[] bArr3 = new byte[i11];
                                fVar.f50161y.f50112l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(xVar.f6207a, (byte) 0);
                            pVar.readFully(xVar.f6207a, 4 - i11, i11);
                            xVar.N(0);
                            fVar.A = (int) xVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        fVar.h(i10);
                        fVar.f50161y.f50111k = new j0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i10);
                    byte[] bArr5 = new byte[i11];
                    fVar.f50161y.f50110j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                fVar.h(i10);
                u3.e eVar = fVar.f50161y;
                int i25 = eVar.h;
                if (i25 != 1685485123 && i25 != 1685480259) {
                    pVar.q(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                eVar.P = bArr6;
                pVar.readFully(bArr6, 0, i11);
                return;
            } else if (fVar.O == 2) {
                u3.e eVar2 = (u3.e) sparseArray.get(fVar.U);
                int i26 = fVar.X;
                x xVar3 = fVar.f50153p;
                if (i26 == 4 && "V_VP9".equals(eVar2.f50105c)) {
                    xVar3.K(i11);
                    pVar.readFully(xVar3.f6207a, 0, i11);
                    return;
                }
                pVar.q(i11);
                return;
            } else {
                return;
            }
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.f50165c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        u3.e eVar3 = (u3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.q(i11 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.f50102a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i27 = (xVar2.f6207a[2] & 6) >> 1;
            byte b10 = 255;
            if (i27 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i11 - fVar.V) - 3;
            } else {
                fVar.l(pVar, 4);
                int i28 = (xVar2.f6207a[3] & 255) + 1;
                fVar.S = i28;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i28];
                } else if (iArr2.length < i28) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i28)];
                }
                fVar.T = iArr2;
                if (i27 == 2) {
                    int i29 = fVar.S;
                    Arrays.fill(iArr2, 0, i29, ((i11 - fVar.V) - 4) / i29);
                } else if (i27 == 1) {
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 4;
                    while (true) {
                        i18 = fVar.S - 1;
                        if (i30 >= i18) {
                            break;
                        }
                        fVar.T[i30] = 0;
                        while (true) {
                            i19 = i32 + 1;
                            fVar.l(pVar, i19);
                            int i33 = xVar2.f6207a[i32] & 255;
                            int[] iArr3 = fVar.T;
                            i20 = iArr3[i30] + i33;
                            iArr3[i30] = i20;
                            if (i33 != 255) {
                                break;
                            }
                            i32 = i19;
                        }
                        i31 += i20;
                        i30++;
                        i32 = i19;
                    }
                    fVar.T[i18] = ((i11 - fVar.V) - i32) - i31;
                } else if (i27 == 3) {
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 4;
                    while (true) {
                        int i37 = fVar.S - i24;
                        if (i34 < i37) {
                            fVar.T[i34] = i23;
                            int i38 = i36 + 1;
                            fVar.l(pVar, i38);
                            if (xVar2.f6207a[i36] != 0) {
                                int i39 = i23;
                                while (true) {
                                    if (i39 < 8) {
                                        int i40 = i24 << (7 - i39);
                                        i15 = i22;
                                        if ((xVar2.f6207a[i36] & i40) != 0) {
                                            int i41 = i38 + i39;
                                            fVar.l(pVar, i41);
                                            i16 = i24;
                                            j10 = xVar2.f6207a[i36] & b10 & (~i40);
                                            while (i38 < i41) {
                                                j10 = (j10 << 8) | (xVar2.f6207a[i38] & b10);
                                                i38++;
                                                i41 = i41;
                                                b10 = 255;
                                            }
                                            i17 = i41;
                                            if (i34 > 0) {
                                                j10 -= (1 << ((i39 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i39++;
                                            i22 = i15;
                                            b10 = 255;
                                        }
                                    } else {
                                        i15 = i22;
                                        i16 = i24;
                                        j10 = 0;
                                        i17 = i38;
                                        break;
                                    }
                                }
                                if (j10 < -2147483648L || j10 > 2147483647L) {
                                    break;
                                }
                                int i42 = (int) j10;
                                int[] iArr4 = fVar.T;
                                if (i34 != 0) {
                                    i42 += iArr4[i34 - 1];
                                }
                                iArr4[i34] = i42;
                                i35 += i42;
                                i34++;
                                i23 = i39;
                                i22 = i15;
                                i24 = i16;
                                i36 = i17;
                                b10 = 255;
                            } else {
                                throw w0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            i12 = i22;
                            i13 = i23;
                            i14 = i24;
                            fVar.T[i37] = ((i11 - fVar.V) - i36) - i35;
                            break;
                        }
                    }
                    throw w0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw w0.a(null, "Unexpected lacing value: " + i27);
                }
            }
            i12 = 2;
            i13 = 0;
            i14 = 1;
            int i43 = xVar2.f6207a[i14] & 255;
            fVar.P = fVar.n(i43 | (bArr[i13] << 8)) + fVar.M;
            if (eVar3.e != i14 && (i10 != 163 || (xVar2.f6207a[i12] & 128) != 128)) {
                i21 = i13;
            } else {
                i21 = 1;
            }
            fVar.W = i21;
            fVar.O = i12;
            fVar.R = i13;
        }
        if (i10 == 163) {
            while (true) {
                int i44 = fVar.R;
                if (i44 < fVar.S) {
                    fVar.i(eVar3, ((fVar.R * eVar3.f50107f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i44], false), 0);
                    fVar.R++;
                } else {
                    fVar.O = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i45 = fVar.R;
                if (i45 < fVar.S) {
                    int[] iArr5 = fVar.T;
                    iArr5[i45] = fVar.o(pVar, eVar3, iArr5[i45], true);
                    fVar.R++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void c0(ArrayList arrayList) {
        boolean z10;
        an0 an0Var = (an0) this.f48124a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            an0Var.J.add(((k1) arrayList.get(i10)).f55574a);
        }
        lx lxVar = an0Var.U;
        if (lxVar != null) {
            if (an0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            lxVar.d(z10, false);
        }
        an0Var.f();
    }

    @Override
    public void close() {
        ((yh.p) this.f48124a).finishFragment();
    }

    @Override
    public void d() {
        ((b0) this.f48124a).d.invalidate();
    }

    @Override
    public jg.j g0() {
        return ((s7) this.f48124a).f50993s0;
    }

    @Override
    public void i(int i10) {
        boolean z10;
        an0 an0Var = (an0) this.f48124a;
        an0Var.D0--;
        an0Var.f55705e0 = i10;
        if (an0Var.f55707f0 != i10) {
            an0Var.f55721s.clear();
        }
        if (an0Var.f55708g0 != i10) {
            an0Var.I.clear();
        }
        an0Var.N = true;
        lx lxVar = an0Var.U;
        if (lxVar != null) {
            if (an0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            lxVar.d(z10, true);
        }
        an0Var.f();
        lx lxVar2 = an0Var.U;
        if (lxVar2 != null) {
            lxVar2.c();
        }
    }

    public void k(int i10, long j10) {
        u3.f fVar = (u3.f) this.f48124a;
        if (i10 != 240) {
            if (i10 != 241) {
                if (i10 != 20529) {
                    if (i10 != 20530) {
                        boolean z10 = false;
                        switch (i10) {
                            case 131:
                                int i11 = (int) j10;
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        if (i11 != 17) {
                                            if (i11 != 33) {
                                                fVar.h(i10);
                                                fVar.f50161y.e = -1;
                                                return;
                                            }
                                            fVar.h(i10);
                                            fVar.f50161y.e = 5;
                                            return;
                                        }
                                        fVar.h(i10);
                                        fVar.f50161y.e = 3;
                                        return;
                                    }
                                    fVar.h(i10);
                                    fVar.f50161y.e = 1;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f50161y.e = 2;
                                return;
                            case 136:
                                fVar.h(i10);
                                u3.e eVar = fVar.f50161y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                eVar.Y = z10;
                                return;
                            case 155:
                                fVar.Q = fVar.n(j10);
                                return;
                            case 159:
                                fVar.h(i10);
                                fVar.f50161y.Q = (int) j10;
                                return;
                            case 176:
                                fVar.h(i10);
                                fVar.f50161y.f50114n = (int) j10;
                                return;
                            case 179:
                                if (!fVar.f50162z) {
                                    fVar.g(i10);
                                    fVar.E = fVar.n(j10);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i10);
                                fVar.f50161y.f50115o = (int) j10;
                                return;
                            case 215:
                                fVar.h(i10);
                                fVar.f50161y.d = (int) j10;
                                return;
                            case 231:
                                fVar.M = fVar.n(j10);
                                return;
                            case 238:
                                fVar.X = (int) j10;
                                return;
                            case 247:
                                if (!fVar.f50162z) {
                                    fVar.g(i10);
                                    fVar.F = (int) j10;
                                    return;
                                }
                                return;
                            case 251:
                                fVar.Y = true;
                                return;
                            case 16871:
                                fVar.h(i10);
                                fVar.f50161y.h = (int) j10;
                                return;
                            case 16980:
                                if (j10 != 3) {
                                    throw w0.a(null, "ContentCompAlgo " + j10 + " not supported");
                                }
                                return;
                            case 17029:
                                if (j10 < 1 || j10 > 2) {
                                    throw w0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 17143:
                                if (j10 != 1) {
                                    throw w0.a(null, "EBMLReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 18401:
                                if (j10 != 5) {
                                    throw w0.a(null, "ContentEncAlgo " + j10 + " not supported");
                                }
                                return;
                            case 18408:
                                if (j10 != 1) {
                                    throw w0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
                                }
                                return;
                            case 21420:
                                fVar.B = j10 + fVar.f50156s;
                                return;
                            case 21432:
                                int i12 = (int) j10;
                                fVar.h(i10);
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        if (i12 != 3) {
                                            if (i12 == 15) {
                                                fVar.f50161y.f50124y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f50161y.f50124y = 1;
                                        return;
                                    }
                                    fVar.f50161y.f50124y = 2;
                                    return;
                                }
                                fVar.f50161y.f50124y = 0;
                                return;
                            case 21680:
                                fVar.h(i10);
                                fVar.f50161y.f50117q = (int) j10;
                                return;
                            case 21682:
                                fVar.h(i10);
                                fVar.f50161y.f50119s = (int) j10;
                                return;
                            case 21690:
                                fVar.h(i10);
                                fVar.f50161y.f50118r = (int) j10;
                                return;
                            case 21930:
                                fVar.h(i10);
                                u3.e eVar2 = fVar.f50161y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                eVar2.X = z10;
                                return;
                            case 21938:
                                fVar.h(i10);
                                u3.e eVar3 = fVar.f50161y;
                                eVar3.f50125z = true;
                                eVar3.f50116p = (int) j10;
                                return;
                            case 21998:
                                fVar.h(i10);
                                fVar.f50161y.f50108g = (int) j10;
                                return;
                            case 22186:
                                fVar.h(i10);
                                fVar.f50161y.T = j10;
                                return;
                            case 22203:
                                fVar.h(i10);
                                fVar.f50161y.U = j10;
                                return;
                            case 25188:
                                fVar.h(i10);
                                fVar.f50161y.R = (int) j10;
                                return;
                            case 30114:
                                fVar.Z = j10;
                                return;
                            case 30321:
                                fVar.h(i10);
                                int i13 = (int) j10;
                                if (i13 != 0) {
                                    if (i13 != 1) {
                                        if (i13 != 2) {
                                            if (i13 == 3) {
                                                fVar.f50161y.f50120t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f50161y.f50120t = 2;
                                        return;
                                    }
                                    fVar.f50161y.f50120t = 1;
                                    return;
                                }
                                fVar.f50161y.f50120t = 0;
                                return;
                            case 2352003:
                                fVar.h(i10);
                                fVar.f50161y.f50107f = (int) j10;
                                return;
                            case 2807729:
                                fVar.f50157t = j10;
                                return;
                            default:
                                switch (i10) {
                                    case 21945:
                                        fVar.h(i10);
                                        int i14 = (int) j10;
                                        if (i14 != 1) {
                                            if (i14 == 2) {
                                                fVar.f50161y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f50161y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i10);
                                        int g10 = b2.o.g((int) j10);
                                        if (g10 != -1) {
                                            fVar.f50161y.B = g10;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i10);
                                        fVar.f50161y.f50125z = true;
                                        int f7 = b2.o.f((int) j10);
                                        if (f7 != -1) {
                                            fVar.f50161y.A = f7;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i10);
                                        fVar.f50161y.D = (int) j10;
                                        return;
                                    case 21949:
                                        fVar.h(i10);
                                        fVar.f50161y.E = (int) j10;
                                        return;
                                    default:
                                        return;
                                }
                        }
                    } else if (j10 != 1) {
                        throw w0.a(null, "ContentEncodingScope " + j10 + " not supported");
                    }
                } else if (j10 != 0) {
                    throw w0.a(null, "ContentEncodingOrder " + j10 + " not supported");
                }
            } else if (!fVar.f50162z) {
                fVar.g(i10);
                if (fVar.G == -1) {
                    fVar.G = j10;
                }
            }
        } else if (!fVar.f50162z) {
            fVar.g(i10);
            if (fVar.H == -1) {
                fVar.H = j10;
            }
        }
    }

    @Override
    public TextureView k0() {
        return null;
    }

    public void o(a0 a0Var) {
        p3 p3Var = (p3) this.f48124a;
        p3Var.f12520b = a0Var;
        Iterator it = ((LinkedList) p3Var.f12521c).iterator();
        while (it.hasNext()) {
            ((x6.c) it.next()).b();
        }
        ((LinkedList) p3Var.f12521c).clear();
    }

    public void p(long j10, int i10, long j11) {
        u3.f fVar = (u3.f) this.f48124a;
        fVar.f50147j0.getClass();
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 183) {
                    if (i10 != 187) {
                        if (i10 != 19899) {
                            if (i10 != 20533) {
                                if (i10 != 21968) {
                                    if (i10 != 408125543) {
                                        if (i10 != 475249515) {
                                            if (i10 == 524531317 && !fVar.f50162z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f50147j0.G1(new t(fVar.v));
                                                fVar.f50162z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f50162z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j12 = fVar.f50156s;
                                    if (j12 != -1 && j12 != j10) {
                                        throw w0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f50156s = j10;
                                    fVar.f50155r = j11;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f50161y.f50125z = true;
                                return;
                            }
                            fVar.h(i10);
                            fVar.f50161y.f50109i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f50162z) {
                        fVar.g(i10);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f50162z) {
                    fVar.g(i10);
                    fVar.F = -1;
                    fVar.G = -1L;
                    fVar.H = -1L;
                    return;
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f50114n = -1;
            obj.f50115o = -1;
            obj.f50116p = -1;
            obj.f50117q = -1;
            obj.f50118r = -1;
            obj.f50119s = 0;
            obj.f50120t = -1;
            obj.f50121u = 0.0f;
            obj.v = 0.0f;
            obj.f50122w = 0.0f;
            obj.f50123x = null;
            obj.f50124y = -1;
            obj.f50125z = false;
            obj.A = -1;
            obj.B = -1;
            obj.C = -1;
            obj.D = 1000;
            obj.E = 200;
            obj.F = -1.0f;
            obj.G = -1.0f;
            obj.H = -1.0f;
            obj.I = -1.0f;
            obj.J = -1.0f;
            obj.K = -1.0f;
            obj.L = -1.0f;
            obj.M = -1.0f;
            obj.N = -1.0f;
            obj.O = -1.0f;
            obj.Q = 1;
            obj.R = -1;
            obj.S = 8000;
            obj.T = 0L;
            obj.U = 0L;
            obj.W = false;
            obj.Y = true;
            obj.Z = "eng";
            fVar.f50161y = obj;
            obj.f50101a = fVar.f50159w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    @Override
    public void q(boolean z10, float f7) {
        ((qh.d) this.f48124a).a(Boolean.FALSE, Float.valueOf(f7));
    }

    @Override
    public void s() {
        s7 s7Var = (s7) this.f48124a;
        s7Var.A0(null, true);
        if (s7Var.f50999v0) {
            o8 o8Var = s7Var.f51948j2;
            o8Var.f51628c1.f51355f.d();
            o8Var.k0(-1, false, true);
            s7Var.f50999v0 = false;
        }
        s7Var.L0(false);
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ((o) this.f48124a).j0(f7);
    }

    @Override
    public a0.h x() {
        return null;
    }

    public void y(int i10, String str) {
        u3.f fVar = (u3.f) this.f48124a;
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 != 2274716) {
                        return;
                    }
                    fVar.h(i10);
                    fVar.f50161y.Z = str;
                    return;
                }
                fVar.h(i10);
                fVar.f50161y.f50103b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw w0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f50159w = str.equals("webm");
                return;
            }
        }
        fVar.h(i10);
        fVar.f50161y.f50105c = str;
    }

    @Override
    public void K() {
    }

    @Override
    public void m() {
    }

    @Override
    public void n() {
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void D(float f7) {
    }

    @Override
    public void F(float f7) {
    }

    @Override
    public void J(float f7) {
    }

    @Override
    public void L(float f7) {
    }

    @Override
    public void O(long j10) {
    }

    @Override
    public void e(int i10) {
    }

    @Override
    public void f(float f7) {
    }

    @Override
    public void g(boolean z10) {
    }

    @Override
    public void h(float f7) {
    }

    @Override
    public void l(boolean z10) {
    }

    @Override
    public void r(float f7) {
    }

    @Override
    public void t(boolean z10) {
    }

    @Override
    public void w(float f7) {
    }

    @Override
    public void z(long j10) {
    }

    @Override
    public void B(float f7, int i10) {
    }

    @Override
    public void H(float f7, int i10) {
    }

    @Override
    public void N(int i10, long j10) {
    }

    @Override
    public void j(long j10, boolean z10) {
    }

    @Override
    public void u(float f7, int i10) {
    }
}
