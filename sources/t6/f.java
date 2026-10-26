package t6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.util.SparseArray;
import b2.o;
import b2.x0;
import c3.i0;
import c3.p;
import c3.t;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.x;
import java.util.Arrays;
public final class f implements r, w2.d {
    public final Object f48718a;

    public f(Object obj) {
        this.f48718a = obj;
    }

    public void a(int i10, int i11, p pVar) {
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
        u3.f fVar = (u3.f) this.f48718a;
        u3.g gVar = fVar.f49540b;
        SparseArray sparseArray = fVar.f49542c;
        x xVar = fVar.f49555k;
        x xVar2 = fVar.f49551i;
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
                                        fVar.f49568y.f49530x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw x0.a(null, "Unexpected id: " + i10);
                                }
                                fVar.h(i10);
                                byte[] bArr3 = new byte[i11];
                                fVar.f49568y.f49519l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(xVar.f9732a, (byte) 0);
                            pVar.readFully(xVar.f9732a, 4 - i11, i11);
                            xVar.N(0);
                            fVar.A = (int) xVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        fVar.h(i10);
                        fVar.f49568y.f49518k = new i0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i10);
                    byte[] bArr5 = new byte[i11];
                    fVar.f49568y.f49517j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                fVar.h(i10);
                u3.e eVar = fVar.f49568y;
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
                x xVar3 = fVar.f49560p;
                if (i26 == 4 && "V_VP9".equals(eVar2.f49512c)) {
                    xVar3.K(i11);
                    pVar.readFully(xVar3.f9732a, 0, i11);
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
            fVar.V = gVar.f49572c;
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
        eVar3.f49509a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i27 = (xVar2.f9732a[2] & 6) >> 1;
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
                int i28 = (xVar2.f9732a[3] & 255) + 1;
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
                            int i33 = xVar2.f9732a[i32] & 255;
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
                            if (xVar2.f9732a[i36] != 0) {
                                int i39 = i23;
                                while (true) {
                                    if (i39 < 8) {
                                        int i40 = i24 << (7 - i39);
                                        i15 = i22;
                                        if ((xVar2.f9732a[i36] & i40) != 0) {
                                            int i41 = i38 + i39;
                                            fVar.l(pVar, i41);
                                            i16 = i24;
                                            j10 = xVar2.f9732a[i36] & b10 & (~i40);
                                            while (i38 < i41) {
                                                j10 = (j10 << 8) | (xVar2.f9732a[i38] & b10);
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
                                throw x0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            i12 = i22;
                            i13 = i23;
                            i14 = i24;
                            fVar.T[i37] = ((i11 - fVar.V) - i36) - i35;
                            break;
                        }
                    }
                    throw x0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw x0.a(null, "Unexpected lacing value: " + i27);
                }
            }
            i12 = 2;
            i13 = 0;
            i14 = 1;
            int i43 = xVar2.f9732a[i14] & 255;
            fVar.P = fVar.n(i43 | (bArr[i13] << 8)) + fVar.M;
            if (eVar3.e != i14 && (i10 != 163 || (xVar2.f9732a[i12] & 128) != 128)) {
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
                    fVar.i(eVar3, ((fVar.R * eVar3.f49514f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i44], false), 0);
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
    public void accept(Object obj, Object obj2) {
        g gVar = new g(0, (TaskCompletionSource) obj2);
        e eVar = (e) ((i) obj).u();
        Parcel H0 = eVar.H0();
        l7.a.d(H0, gVar);
        l7.a.c(H0, (a) this.f48718a);
        eVar.I0(H0, 1);
    }

    public PackageInfo b(int i10, String str) {
        return ((Context) this.f48718a).getPackageManager().getPackageInfo(str, i10);
    }

    public void c(int i10, long j10) {
        u3.f fVar = (u3.f) this.f48718a;
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
                                                fVar.f49568y.e = -1;
                                                return;
                                            }
                                            fVar.h(i10);
                                            fVar.f49568y.e = 5;
                                            return;
                                        }
                                        fVar.h(i10);
                                        fVar.f49568y.e = 3;
                                        return;
                                    }
                                    fVar.h(i10);
                                    fVar.f49568y.e = 1;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f49568y.e = 2;
                                return;
                            case 136:
                                fVar.h(i10);
                                u3.e eVar = fVar.f49568y;
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
                                fVar.f49568y.Q = (int) j10;
                                return;
                            case 176:
                                fVar.h(i10);
                                fVar.f49568y.f49521n = (int) j10;
                                return;
                            case 179:
                                if (!fVar.f49569z) {
                                    fVar.g(i10);
                                    fVar.E = fVar.n(j10);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i10);
                                fVar.f49568y.f49522o = (int) j10;
                                return;
                            case 215:
                                fVar.h(i10);
                                fVar.f49568y.d = (int) j10;
                                return;
                            case 231:
                                fVar.M = fVar.n(j10);
                                return;
                            case 238:
                                fVar.X = (int) j10;
                                return;
                            case 247:
                                if (!fVar.f49569z) {
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
                                fVar.f49568y.h = (int) j10;
                                return;
                            case 16980:
                                if (j10 != 3) {
                                    throw x0.a(null, "ContentCompAlgo " + j10 + " not supported");
                                }
                                return;
                            case 17029:
                                if (j10 < 1 || j10 > 2) {
                                    throw x0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 17143:
                                if (j10 != 1) {
                                    throw x0.a(null, "EBMLReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 18401:
                                if (j10 != 5) {
                                    throw x0.a(null, "ContentEncAlgo " + j10 + " not supported");
                                }
                                return;
                            case 18408:
                                if (j10 != 1) {
                                    throw x0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
                                }
                                return;
                            case 21420:
                                fVar.B = j10 + fVar.f49563s;
                                return;
                            case 21432:
                                int i12 = (int) j10;
                                fVar.h(i10);
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        if (i12 != 3) {
                                            if (i12 == 15) {
                                                fVar.f49568y.f49531y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f49568y.f49531y = 1;
                                        return;
                                    }
                                    fVar.f49568y.f49531y = 2;
                                    return;
                                }
                                fVar.f49568y.f49531y = 0;
                                return;
                            case 21680:
                                fVar.h(i10);
                                fVar.f49568y.f49524q = (int) j10;
                                return;
                            case 21682:
                                fVar.h(i10);
                                fVar.f49568y.f49526s = (int) j10;
                                return;
                            case 21690:
                                fVar.h(i10);
                                fVar.f49568y.f49525r = (int) j10;
                                return;
                            case 21930:
                                fVar.h(i10);
                                u3.e eVar2 = fVar.f49568y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                eVar2.X = z10;
                                return;
                            case 21938:
                                fVar.h(i10);
                                u3.e eVar3 = fVar.f49568y;
                                eVar3.f49532z = true;
                                eVar3.f49523p = (int) j10;
                                return;
                            case 21998:
                                fVar.h(i10);
                                fVar.f49568y.f49515g = (int) j10;
                                return;
                            case 22186:
                                fVar.h(i10);
                                fVar.f49568y.T = j10;
                                return;
                            case 22203:
                                fVar.h(i10);
                                fVar.f49568y.U = j10;
                                return;
                            case 25188:
                                fVar.h(i10);
                                fVar.f49568y.R = (int) j10;
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
                                                fVar.f49568y.f49527t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f49568y.f49527t = 2;
                                        return;
                                    }
                                    fVar.f49568y.f49527t = 1;
                                    return;
                                }
                                fVar.f49568y.f49527t = 0;
                                return;
                            case 2352003:
                                fVar.h(i10);
                                fVar.f49568y.f49514f = (int) j10;
                                return;
                            case 2807729:
                                fVar.f49564t = j10;
                                return;
                            default:
                                switch (i10) {
                                    case 21945:
                                        fVar.h(i10);
                                        int i14 = (int) j10;
                                        if (i14 != 1) {
                                            if (i14 == 2) {
                                                fVar.f49568y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f49568y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i10);
                                        int g7 = o.g((int) j10);
                                        if (g7 != -1) {
                                            fVar.f49568y.B = g7;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i10);
                                        fVar.f49568y.f49532z = true;
                                        int f7 = o.f((int) j10);
                                        if (f7 != -1) {
                                            fVar.f49568y.A = f7;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i10);
                                        fVar.f49568y.D = (int) j10;
                                        return;
                                    case 21949:
                                        fVar.h(i10);
                                        fVar.f49568y.E = (int) j10;
                                        return;
                                    default:
                                        return;
                                }
                        }
                    } else if (j10 != 1) {
                        throw x0.a(null, "ContentEncodingScope " + j10 + " not supported");
                    }
                } else if (j10 != 0) {
                    throw x0.a(null, "ContentEncodingOrder " + j10 + " not supported");
                }
            } else if (!fVar.f49569z) {
                fVar.g(i10);
                if (fVar.G == -1) {
                    fVar.G = j10;
                }
            }
        } else if (!fVar.f49569z) {
            fVar.g(i10);
            if (fVar.H == -1) {
                fVar.H = j10;
            }
        }
    }

    public void d(int i10, long j10, long j11) {
        u3.f fVar = (u3.f) this.f48718a;
        fVar.f49554j0.getClass();
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 183) {
                    if (i10 != 187) {
                        if (i10 != 19899) {
                            if (i10 != 20533) {
                                if (i10 != 21968) {
                                    if (i10 != 408125543) {
                                        if (i10 != 475249515) {
                                            if (i10 == 524531317 && !fVar.f49569z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f49554j0.D1(new t(fVar.v));
                                                fVar.f49569z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f49569z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j12 = fVar.f49563s;
                                    if (j12 != -1 && j12 != j10) {
                                        throw x0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f49563s = j10;
                                    fVar.f49562r = j11;
                                    return;
                                }
                                fVar.h(i10);
                                fVar.f49568y.f49532z = true;
                                return;
                            }
                            fVar.h(i10);
                            fVar.f49568y.f49516i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f49569z) {
                        fVar.g(i10);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f49569z) {
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
            obj.f49521n = -1;
            obj.f49522o = -1;
            obj.f49523p = -1;
            obj.f49524q = -1;
            obj.f49525r = -1;
            obj.f49526s = 0;
            obj.f49527t = -1;
            obj.f49528u = 0.0f;
            obj.v = 0.0f;
            obj.f49529w = 0.0f;
            obj.f49530x = null;
            obj.f49531y = -1;
            obj.f49532z = false;
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
            fVar.f49568y = obj;
            obj.f49508a = fVar.f49566w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    public void e(int i10, String str) {
        u3.f fVar = (u3.f) this.f48718a;
        if (i10 != 134) {
            if (i10 != 17026) {
                if (i10 != 21358) {
                    if (i10 != 2274716) {
                        return;
                    }
                    fVar.h(i10);
                    fVar.f49568y.Z = str;
                    return;
                }
                fVar.h(i10);
                fVar.f49568y.f49510b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw x0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f49566w = str.equals("webm");
                return;
            }
        }
        fVar.h(i10);
        fVar.f49568y.f49512c = str;
    }

    public f() {
        this.f48718a = new qb.a(28);
    }
}
