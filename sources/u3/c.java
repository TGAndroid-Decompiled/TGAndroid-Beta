package u3;

import android.content.SharedPreferences;
import android.util.Log;
import android.util.SparseArray;
import b2.n;
import b2.w0;
import c3.i0;
import c3.p;
import c3.t;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e2.x;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import x8.m;
import y8.e0;
import zh.f0;
public final class c implements w2.a, OnCompleteListener {
    public final Object f47549a;

    public c(Object obj) {
        this.f47549a = obj;
    }

    @Override
    public long a(long j10) {
        ArrayList arrayList = (ArrayList) this.f47549a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((z3.a) arrayList.get(0)).f50682b) {
            return ((z3.a) arrayList.get(0)).f50682b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j11 = aVar.f50682b;
            long j12 = aVar.f50682b;
            if (j10 < j11) {
                long j13 = ((z3.a) arrayList.get(i10 - 1)).d;
                if (j13 != -9223372036854775807L && j13 > j10 && j13 < j12) {
                    return j13;
                }
                return j12;
            }
        }
        long j14 = ((z3.a) s.m(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override
    public n0 b(long j10) {
        int g10 = g(j10);
        if (g10 == 0) {
            l0 l0Var = n0.f8477b;
            return x1.e;
        }
        z3.a aVar = (z3.a) ((ArrayList) this.f47549a).get(g10 - 1);
        long j11 = aVar.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            l0 l0Var2 = n0.f8477b;
            return x1.e;
        }
        return aVar.f50681a;
    }

    @Override
    public boolean c(z3.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: u3.c.c(z3.a, long):boolean");
    }

    @Override
    public void clear() {
        ((ArrayList) this.f47549a).clear();
    }

    @Override
    public long d(long j10) {
        ArrayList arrayList = (ArrayList) this.f47549a;
        if (arrayList.isEmpty() || j10 < ((z3.a) arrayList.get(0)).f50682b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.a) arrayList.get(i10)).f50682b;
            int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            if (i11 == 0) {
                return j11;
            }
            if (i11 < 0) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j12 = aVar.d;
                if (j12 != -9223372036854775807L && j12 <= j10) {
                    return j12;
                }
                return aVar.f50682b;
            }
        }
        z3.a aVar2 = (z3.a) s.m(arrayList);
        long j13 = aVar2.d;
        if (j13 != -9223372036854775807L && j10 >= j13) {
            return j13;
        }
        return aVar2.f50682b;
    }

    @Override
    public void e(long j10) {
        ArrayList arrayList = (ArrayList) this.f47549a;
        int g10 = g(j10);
        if (g10 == 0) {
            return;
        }
        long j11 = ((z3.a) arrayList.get(g10 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            g10--;
        }
        arrayList.subList(0, g10).clear();
    }

    public void f(int i10, int i11, p pVar) {
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
        g gVar = (g) this.f47549a;
        h hVar = gVar.f47588b;
        SparseArray sparseArray = gVar.f47590c;
        x xVar = gVar.f47603k;
        x xVar2 = gVar.f47599i;
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
                                        gVar.h(i10);
                                        byte[] bArr2 = new byte[i11];
                                        gVar.f47616y.f47578x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw w0.a(null, "Unexpected id: " + i10);
                                }
                                gVar.h(i10);
                                byte[] bArr3 = new byte[i11];
                                gVar.f47616y.f47567l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(xVar.f8294a, (byte) 0);
                            pVar.readFully(xVar.f8294a, 4 - i11, i11);
                            xVar.N(0);
                            gVar.A = (int) xVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        gVar.h(i10);
                        gVar.f47616y.f47566k = new i0(1, 0, 0, bArr4);
                        return;
                    }
                    gVar.h(i10);
                    byte[] bArr5 = new byte[i11];
                    gVar.f47616y.f47565j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                gVar.h(i10);
                f fVar = gVar.f47616y;
                int i25 = fVar.h;
                if (i25 != 1685485123 && i25 != 1685480259) {
                    pVar.r(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                fVar.P = bArr6;
                pVar.readFully(bArr6, 0, i11);
                return;
            } else if (gVar.O == 2) {
                f fVar2 = (f) sparseArray.get(gVar.U);
                int i26 = gVar.X;
                x xVar3 = gVar.f47608p;
                if (i26 == 4 && "V_VP9".equals(fVar2.f47560c)) {
                    xVar3.K(i11);
                    pVar.readFully(xVar3.f8294a, 0, i11);
                    return;
                }
                pVar.r(i11);
                return;
            } else {
                return;
            }
        }
        if (gVar.O == 0) {
            gVar.U = (int) hVar.b(pVar, false, true, 8);
            gVar.V = hVar.f47620c;
            gVar.Q = -9223372036854775807L;
            gVar.O = 1;
            xVar2.K(0);
        }
        f fVar3 = (f) sparseArray.get(gVar.U);
        if (fVar3 == null) {
            pVar.r(i11 - gVar.V);
            gVar.O = 0;
            return;
        }
        fVar3.f47557a0.getClass();
        if (gVar.O == 1) {
            gVar.l(pVar, 3);
            int i27 = (xVar2.f8294a[2] & 6) >> 1;
            byte b10 = 255;
            if (i27 == 0) {
                gVar.S = 1;
                int[] iArr = gVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                gVar.T = iArr;
                iArr[0] = (i11 - gVar.V) - 3;
            } else {
                gVar.l(pVar, 4);
                int i28 = (xVar2.f8294a[3] & 255) + 1;
                gVar.S = i28;
                int[] iArr2 = gVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i28];
                } else if (iArr2.length < i28) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i28)];
                }
                gVar.T = iArr2;
                if (i27 == 2) {
                    int i29 = gVar.S;
                    Arrays.fill(iArr2, 0, i29, ((i11 - gVar.V) - 4) / i29);
                } else if (i27 == 1) {
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 4;
                    while (true) {
                        i18 = gVar.S - 1;
                        if (i30 >= i18) {
                            break;
                        }
                        gVar.T[i30] = 0;
                        while (true) {
                            i19 = i32 + 1;
                            gVar.l(pVar, i19);
                            int i33 = xVar2.f8294a[i32] & 255;
                            int[] iArr3 = gVar.T;
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
                    gVar.T[i18] = ((i11 - gVar.V) - i32) - i31;
                } else if (i27 == 3) {
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 4;
                    while (true) {
                        int i37 = gVar.S - i24;
                        if (i34 < i37) {
                            gVar.T[i34] = i23;
                            int i38 = i36 + 1;
                            gVar.l(pVar, i38);
                            if (xVar2.f8294a[i36] != 0) {
                                int i39 = i23;
                                while (true) {
                                    if (i39 < 8) {
                                        int i40 = i24 << (7 - i39);
                                        i15 = i22;
                                        if ((xVar2.f8294a[i36] & i40) != 0) {
                                            int i41 = i38 + i39;
                                            gVar.l(pVar, i41);
                                            i16 = i24;
                                            j10 = xVar2.f8294a[i36] & b10 & (~i40);
                                            while (i38 < i41) {
                                                j10 = (j10 << 8) | (xVar2.f8294a[i38] & b10);
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
                                int[] iArr4 = gVar.T;
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
                            gVar.T[i37] = ((i11 - gVar.V) - i36) - i35;
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
            int i43 = xVar2.f8294a[i14] & 255;
            gVar.P = gVar.n(i43 | (bArr[i13] << 8)) + gVar.M;
            if (fVar3.e != i14 && (i10 != 163 || (xVar2.f8294a[i12] & 128) != 128)) {
                i21 = i13;
            } else {
                i21 = 1;
            }
            gVar.W = i21;
            gVar.O = i12;
            gVar.R = i13;
        }
        if (i10 == 163) {
            while (true) {
                int i44 = gVar.R;
                if (i44 < gVar.S) {
                    gVar.i(fVar3, ((gVar.R * fVar3.f47562f) / 1000) + gVar.P, gVar.W, gVar.o(pVar, fVar3, gVar.T[i44], false), 0);
                    gVar.R++;
                } else {
                    gVar.O = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i45 = gVar.R;
                if (i45 < gVar.S) {
                    int[] iArr5 = gVar.T;
                    iArr5[i45] = gVar.o(pVar, fVar3, iArr5[i45], true);
                    gVar.R++;
                } else {
                    return;
                }
            }
        }
    }

    public int g(long j10) {
        ArrayList arrayList = (ArrayList) this.f47549a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j10 < ((z3.a) arrayList.get(i10)).f50682b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    public void h(int i10, long j10) {
        g gVar = (g) this.f47549a;
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
                                                gVar.h(i10);
                                                gVar.f47616y.e = -1;
                                                return;
                                            }
                                            gVar.h(i10);
                                            gVar.f47616y.e = 5;
                                            return;
                                        }
                                        gVar.h(i10);
                                        gVar.f47616y.e = 3;
                                        return;
                                    }
                                    gVar.h(i10);
                                    gVar.f47616y.e = 1;
                                    return;
                                }
                                gVar.h(i10);
                                gVar.f47616y.e = 2;
                                return;
                            case 136:
                                gVar.h(i10);
                                f fVar = gVar.f47616y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                fVar.Y = z10;
                                return;
                            case 155:
                                gVar.Q = gVar.n(j10);
                                return;
                            case 159:
                                gVar.h(i10);
                                gVar.f47616y.Q = (int) j10;
                                return;
                            case 176:
                                gVar.h(i10);
                                gVar.f47616y.f47569n = (int) j10;
                                return;
                            case 179:
                                if (!gVar.f47617z) {
                                    gVar.g(i10);
                                    gVar.E = gVar.n(j10);
                                    return;
                                }
                                return;
                            case 186:
                                gVar.h(i10);
                                gVar.f47616y.f47570o = (int) j10;
                                return;
                            case 215:
                                gVar.h(i10);
                                gVar.f47616y.d = (int) j10;
                                return;
                            case 231:
                                gVar.M = gVar.n(j10);
                                return;
                            case 238:
                                gVar.X = (int) j10;
                                return;
                            case 247:
                                if (!gVar.f47617z) {
                                    gVar.g(i10);
                                    gVar.F = (int) j10;
                                    return;
                                }
                                return;
                            case 251:
                                gVar.Y = true;
                                return;
                            case 16871:
                                gVar.h(i10);
                                gVar.f47616y.h = (int) j10;
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
                                gVar.B = j10 + gVar.f47611s;
                                return;
                            case 21432:
                                int i12 = (int) j10;
                                gVar.h(i10);
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        if (i12 != 3) {
                                            if (i12 == 15) {
                                                gVar.f47616y.f47579y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        gVar.f47616y.f47579y = 1;
                                        return;
                                    }
                                    gVar.f47616y.f47579y = 2;
                                    return;
                                }
                                gVar.f47616y.f47579y = 0;
                                return;
                            case 21680:
                                gVar.h(i10);
                                gVar.f47616y.f47572q = (int) j10;
                                return;
                            case 21682:
                                gVar.h(i10);
                                gVar.f47616y.f47574s = (int) j10;
                                return;
                            case 21690:
                                gVar.h(i10);
                                gVar.f47616y.f47573r = (int) j10;
                                return;
                            case 21930:
                                gVar.h(i10);
                                f fVar2 = gVar.f47616y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                fVar2.X = z10;
                                return;
                            case 21938:
                                gVar.h(i10);
                                f fVar3 = gVar.f47616y;
                                fVar3.f47580z = true;
                                fVar3.f47571p = (int) j10;
                                return;
                            case 21998:
                                gVar.h(i10);
                                gVar.f47616y.f47563g = (int) j10;
                                return;
                            case 22186:
                                gVar.h(i10);
                                gVar.f47616y.T = j10;
                                return;
                            case 22203:
                                gVar.h(i10);
                                gVar.f47616y.U = j10;
                                return;
                            case 25188:
                                gVar.h(i10);
                                gVar.f47616y.R = (int) j10;
                                return;
                            case 30114:
                                gVar.Z = j10;
                                return;
                            case 30321:
                                gVar.h(i10);
                                int i13 = (int) j10;
                                if (i13 != 0) {
                                    if (i13 != 1) {
                                        if (i13 != 2) {
                                            if (i13 == 3) {
                                                gVar.f47616y.f47575t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        gVar.f47616y.f47575t = 2;
                                        return;
                                    }
                                    gVar.f47616y.f47575t = 1;
                                    return;
                                }
                                gVar.f47616y.f47575t = 0;
                                return;
                            case 2352003:
                                gVar.h(i10);
                                gVar.f47616y.f47562f = (int) j10;
                                return;
                            case 2807729:
                                gVar.f47612t = j10;
                                return;
                            default:
                                switch (i10) {
                                    case 21945:
                                        gVar.h(i10);
                                        int i14 = (int) j10;
                                        if (i14 != 1) {
                                            if (i14 == 2) {
                                                gVar.f47616y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        gVar.f47616y.C = 2;
                                        return;
                                    case 21946:
                                        gVar.h(i10);
                                        int g10 = n.g((int) j10);
                                        if (g10 != -1) {
                                            gVar.f47616y.B = g10;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        gVar.h(i10);
                                        gVar.f47616y.f47580z = true;
                                        int f7 = n.f((int) j10);
                                        if (f7 != -1) {
                                            gVar.f47616y.A = f7;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        gVar.h(i10);
                                        gVar.f47616y.D = (int) j10;
                                        return;
                                    case 21949:
                                        gVar.h(i10);
                                        gVar.f47616y.E = (int) j10;
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
            } else if (!gVar.f47617z) {
                gVar.g(i10);
                if (gVar.G == -1) {
                    gVar.G = j10;
                }
            }
        } else if (!gVar.f47617z) {
            gVar.g(i10);
            if (gVar.H == -1) {
                gVar.H = j10;
            }
        }
    }

    public void i(int i10) {
        boolean z10;
        TLRPC.TL_exportedNoPaidMessagesToken b10;
        zh.i0 i0Var = ((f0) this.f47549a).e;
        if (i0Var != null) {
            int i11 = i0Var.f51783a;
            if (i0Var.d != i10) {
                boolean z11 = true;
                if (i0Var.f51785c.d && i10 == 2) {
                    i10 = 1;
                }
                i0Var.d = i10;
                SharedPreferences.Editor edit = MessagesController.getMainSettings(i11).edit();
                if (i0Var.d == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                edit.putBoolean("qrNoPaidPermanent", z10).apply();
                int i12 = i0Var.d;
                if (i12 == 0) {
                    if (i0Var.f51787n != 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(i0Var.f51787n, true);
                        i0Var.f51787n = 0;
                        return;
                    }
                    return;
                }
                if (i12 == 2 && (b10 = i0Var.b()) != null) {
                    i0Var.f51786f = b10;
                    i0Var.f51784b.setFreeLink(i0Var.c(b10));
                }
                if (i0Var.d != 1) {
                    z11 = false;
                }
                i0Var.h(false, z11);
            }
        }
    }

    public void j(int i10, long j10, long j11) {
        g gVar = (g) this.f47549a;
        gVar.f47602j0.getClass();
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 183) {
                    if (i10 != 187) {
                        if (i10 != 19899) {
                            if (i10 != 20533) {
                                if (i10 != 21968) {
                                    if (i10 != 408125543) {
                                        if (i10 != 475249515) {
                                            if (i10 == 524531317 && !gVar.f47617z) {
                                                if (gVar.d && gVar.K != -1) {
                                                    gVar.J = true;
                                                    return;
                                                }
                                                gVar.f47602j0.g0(new t(gVar.v));
                                                gVar.f47617z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!gVar.f47617z) {
                                            gVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j12 = gVar.f47611s;
                                    if (j12 != -1 && j12 != j10) {
                                        throw w0.a(null, "Multiple Segment elements not supported");
                                    }
                                    gVar.f47611s = j10;
                                    gVar.f47610r = j11;
                                    return;
                                }
                                gVar.h(i10);
                                gVar.f47616y.f47580z = true;
                                return;
                            }
                            gVar.h(i10);
                            gVar.f47616y.f47564i = true;
                            return;
                        }
                        gVar.A = -1;
                        gVar.B = -1L;
                        return;
                    } else if (!gVar.f47617z) {
                        gVar.g(i10);
                        gVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!gVar.f47617z) {
                    gVar.g(i10);
                    gVar.F = -1;
                    gVar.G = -1L;
                    gVar.H = -1L;
                    return;
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f47569n = -1;
            obj.f47570o = -1;
            obj.f47571p = -1;
            obj.f47572q = -1;
            obj.f47573r = -1;
            obj.f47574s = 0;
            obj.f47575t = -1;
            obj.f47576u = 0.0f;
            obj.v = 0.0f;
            obj.f47577w = 0.0f;
            obj.f47578x = null;
            obj.f47579y = -1;
            obj.f47580z = false;
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
            gVar.f47616y = obj;
            obj.f47556a = gVar.f47614w;
            return;
        }
        gVar.Y = false;
        gVar.Z = 0L;
    }

    public void k(int i10, String str) {
        g gVar = (g) this.f47549a;
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 != 2274716) {
                        return;
                    }
                    gVar.h(i10);
                    gVar.f47616y.Z = str;
                    return;
                }
                gVar.h(i10);
                gVar.f47616y.f47558b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw w0.a(null, "DocType " + str + " not supported");
            } else {
                gVar.f47614w = str.equals("webm");
                return;
            }
        }
        gVar.h(i10);
        gVar.f47616y.f47560c = str;
    }

    @Override
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.f47549a;
        if (task.isSuccessful()) {
            m.L0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        m.L0(e0Var, false, null);
    }

    public c() {
        this.f47549a = new ArrayList();
    }
}
