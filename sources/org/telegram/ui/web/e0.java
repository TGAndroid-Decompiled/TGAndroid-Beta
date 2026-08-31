package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eg.z2;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k7.q7;
import oh.h4;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.y4;
import org.telegram.ui.m9;
import org.telegram.ui.ti0;
import org.telegram.ui.u9;
import org.telegram.ui.xn;
import qh.h5;
import qh.j5;
import wh.g4;
import wh.i4;
import wh.n3;
import wh.r3;
public final class e0 implements u9, com.google.android.gms.common.api.internal.s, zf.m, h71, OnCompleteListener, ra.m, t5.a, th.m0, v0.i, ki, go0, y4, wh.h0 {
    public final int f42527a;
    public Object f42528b;

    public e0(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f42527a = i10;
        this.f42528b = obj;
    }

    @Override
    public void B(CharSequence charSequence) {
        g4 g4Var = ((i4) this.f42528b).D;
        if (g4Var != null) {
            n3 n3Var = (n3) g4Var;
            n3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                n3Var.f49889a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public void B0(wg wgVar) {
        NotificationCenter.getInstance(vf.k.a0((vf.k) this.f42528b)).doOnIdle(wgVar);
    }

    @Override
    public l9 E() {
        return (i4) this.f42528b;
    }

    @Override
    public String E0() {
        return ((a1) this.f42528b).f42475f0;
    }

    @Override
    public wh.a G() {
        return ((i4) this.f42528b).f50174a;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        wh.z1 z1Var = (wh.z1) this.f42528b;
        z1Var.s0(i10, i11, z4);
        ti0 ti0Var = z1Var.L0;
        if (ti0Var != null) {
            ti0Var.i();
            z1Var.L0 = null;
        }
    }

    @Override
    public void J(String str) {
        a1 a1Var = (a1) this.f42528b;
        try {
            a1Var.M = System.currentTimeMillis();
            a1Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public boolean L() {
        i4 i4Var = (i4) this.f42528b;
        g4 g4Var = i4Var.D;
        if (g4Var != null) {
            wh.a aVar = i4Var.f50174a;
            if (((n3) g4Var).f49889a.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void M(int i10, int i11) {
        i4 i4Var = (i4) this.f42528b;
        g4 g4Var = i4Var.D;
        if (g4Var != null) {
            wh.a aVar = i4Var.f50174a;
            wh.d2 d2Var = ((n3) g4Var).f49889a.G3;
            if (d2Var != null) {
                d2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void Q() {
        i4 i4Var = (i4) this.f42528b;
        g4 g4Var = i4Var.D;
        if (g4Var != null) {
            wh.a aVar = i4Var.f50174a;
            r3 r3Var = ((n3) g4Var).f49889a;
            wh.d2 d2Var = r3Var.G3;
            if (d2Var != null) {
                d2Var.g();
            }
            r3Var.f49979e3.onContentChanged();
        }
    }

    @Override
    public void W() {
        i4 i4Var = (i4) this.f42528b;
        g4 g4Var = i4Var.D;
        if (g4Var != null) {
            wh.a aVar = i4Var.f50174a;
            r3.O1(((n3) g4Var).f49889a);
        }
    }

    @Override
    public void a(long j10) {
        ((th.q) this.f42528b).presentFragment(xn.R9(j10));
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f42527a) {
            case 2:
                p6.b bVar = new p6.b(0, (TaskCompletionSource) obj2);
                b7.r1 r1Var = (b7.r1) ((b7.q1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(r1Var.f1869b);
                int i10 = b7.l.f1837a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((q6.v) this.f42528b).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    r1Var.f1868a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 4:
                u5.x xVar = (u5.x) obj;
                u5.f fVar = (u5.f) xVar.u();
                q5.d0 d0Var = ((q5.e0) this.f42528b).f44540k;
                Parcel M0 = fVar.M0();
                com.google.android.gms.internal.cast.s.d(M0, d0Var);
                fVar.R0(M0, 18);
                u5.f fVar2 = (u5.f) xVar.u();
                fVar2.R0(fVar2.M0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 14:
                u5.r rVar = new u5.r(2, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((u5.t) obj).u();
                Parcel M02 = iVar.M0();
                com.google.android.gms.internal.cast.s.d(M02, rVar);
                M02.writeStringArray((String[]) this.f42528b);
                iVar.R0(M02, 7);
                return;
            case 16:
                v6.f fVar3 = new v6.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = e7.a.f4991a;
                obtain3.writeStrongBinder(fVar3);
                e7.a.b(obtain3, (u6.f) this.f42528b);
                e7.a.b(obtain3, gVar);
                ((v6.b) ((v6.d) ((v6.e) obj).u())).E0(obtain3, 6);
                return;
            default:
                w6.a aVar = new w6.a((TaskCompletionSource) obj2);
                w6.i iVar2 = (w6.i) ((w6.c) obj).u();
                String str = ((w6.b) this.f42528b).f49437k;
                Parcel I0 = iVar2.I0();
                int i12 = w6.f.f49441a;
                I0.writeStrongBinder(aVar);
                I0.writeString(str);
                iVar2.J0(I0, 2);
                return;
        }
    }

    @Override
    public void b(float f10) {
        wh.y yVar = (wh.y) this.f42528b;
        MessageObject messageObject = yVar.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(yVar.M, f10);
    }

    @Override
    public boolean b2() {
        return false;
    }

    @Override
    public void c(wh.e1 e1Var) {
        g4 g4Var = ((i4) this.f42528b).D;
        if (g4Var != null) {
            r3 r3Var = ((n3) g4Var).f49889a;
            r3.M1(r3Var, e1Var);
            r3Var.f49979e3.h(e1Var, true);
        }
    }

    @Override
    public void close() {
        ((th.q) this.f42528b).finishFragment();
    }

    @Override
    public void d(float f10) {
        MessageObject messageObject = ((wh.y) this.f42528b).M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
    }

    @Override
    public void e() {
        boolean z4;
        th.q qVar = (th.q) this.f42528b;
        xd.a aVar = qVar.f48182a;
        th.n0 n0Var = qVar.v;
        if (n0Var.f48174n && n0Var.f48172l == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        aVar.a(z4, true);
        qVar.d.V2.N(true);
    }

    @Override
    public boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public void f() {
        i4 i4Var = (i4) this.f42528b;
        g4 g4Var = i4Var.D;
        if (g4Var != null) {
            r3.P1(((n3) g4Var).f49889a, i4Var.f50174a);
        }
    }

    public void g(int i10, int i11, r3.l lVar) {
        char c3;
        char c10;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        x3.d dVar = (x3.d) this.f42528b;
        x3.e eVar = dVar.f50339b;
        SparseArray sparseArray = dVar.f50341c;
        h5.w wVar = dVar.f50345i;
        h5.w wVar2 = dVar.f50344g;
        int i17 = 1;
        int i18 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        dVar.b(i10);
                                        byte[] bArr2 = new byte[i11];
                                        dVar.f50357u.v = bArr2;
                                        lVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw j3.r1.a("Unexpected id: " + i10, null);
                                }
                                dVar.b(i10);
                                byte[] bArr3 = new byte[i11];
                                dVar.f50357u.f50316k = bArr3;
                                lVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(wVar.f7308a, (byte) 0);
                            lVar.readFully(wVar.f7308a, 4 - i11, i11);
                            wVar.F(0);
                            dVar.f50358w = (int) wVar.v();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        lVar.readFully(bArr4, 0, i11);
                        dVar.b(i10);
                        dVar.f50357u.f50315j = new r3.u(1, 0, 0, bArr4);
                        return;
                    }
                    dVar.b(i10);
                    byte[] bArr5 = new byte[i11];
                    dVar.f50357u.f50314i = bArr5;
                    lVar.readFully(bArr5, 0, i11);
                    return;
                }
                dVar.b(i10);
                x3.c cVar = dVar.f50357u;
                int i19 = cVar.f50313g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    lVar.s(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                cVar.N = bArr6;
                lVar.readFully(bArr6, 0, i11);
                return;
            } else if (dVar.G == 2) {
                x3.c cVar2 = (x3.c) sparseArray.get(dVar.M);
                int i20 = dVar.P;
                h5.w wVar3 = dVar.f50350n;
                if (i20 == 4 && "V_VP9".equals(cVar2.f50309b)) {
                    wVar3.C(i11);
                    lVar.readFully(wVar3.f7308a, 0, i11);
                    return;
                }
                lVar.s(i11);
                return;
            } else {
                return;
            }
        }
        if (dVar.G == 0) {
            dVar.M = (int) eVar.b(lVar, false, true, 8);
            dVar.N = eVar.f50364c;
            dVar.I = -9223372036854775807L;
            dVar.G = 1;
            wVar2.C(0);
        }
        x3.c cVar3 = (x3.c) sparseArray.get(dVar.M);
        if (cVar3 == null) {
            lVar.s(i11 - dVar.N);
            dVar.G = 0;
            return;
        }
        cVar3.X.getClass();
        if (dVar.G == 1) {
            dVar.g(lVar, 3);
            int i21 = (wVar2.f7308a[2] & 6) >> 1;
            byte b10 = 255;
            if (i21 == 0) {
                dVar.K = 1;
                int[] iArr = dVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.L = iArr;
                iArr[0] = (i11 - dVar.N) - 3;
            } else {
                dVar.g(lVar, 4);
                int i22 = (wVar2.f7308a[3] & 255) + 1;
                dVar.K = i22;
                int[] iArr2 = dVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                dVar.L = iArr2;
                if (i21 == 2) {
                    int i23 = dVar.K;
                    Arrays.fill(iArr2, 0, i23, ((i11 - dVar.N) - 4) / i23);
                } else if (i21 == 1) {
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 4;
                    while (true) {
                        i13 = dVar.K - 1;
                        if (i24 >= i13) {
                            break;
                        }
                        dVar.L[i24] = 0;
                        while (true) {
                            i14 = i26 + 1;
                            dVar.g(lVar, i14);
                            int i27 = wVar2.f7308a[i26] & 255;
                            int[] iArr3 = dVar.L;
                            i15 = iArr3[i24] + i27;
                            iArr3[i24] = i15;
                            if (i27 != 255) {
                                break;
                            }
                            i26 = i14;
                        }
                        i25 += i15;
                        i24++;
                        i26 = i14;
                    }
                    dVar.L[i13] = ((i11 - dVar.N) - i26) - i25;
                } else if (i21 == 3) {
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        int i31 = dVar.K - i17;
                        if (i28 < i31) {
                            dVar.L[i28] = i18;
                            int i32 = i30 + 1;
                            dVar.g(lVar, i32);
                            if (wVar2.f7308a[i30] != 0) {
                                int i33 = 0;
                                while (true) {
                                    if (i33 < 8) {
                                        int i34 = 1 << (7 - i33);
                                        if ((wVar2.f7308a[i30] & i34) != 0) {
                                            i12 = i32 + i33;
                                            dVar.g(lVar, i12);
                                            j10 = wVar2.f7308a[i30] & b10 & (~i34);
                                            while (i32 < i12) {
                                                j10 = (j10 << 8) | (wVar2.f7308a[i32] & b10);
                                                i32++;
                                                b10 = 255;
                                            }
                                            if (i28 > 0) {
                                                j10 -= (1 << ((i33 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i33++;
                                            b10 = 255;
                                        }
                                    } else {
                                        j10 = 0;
                                        i12 = i32;
                                        break;
                                    }
                                }
                                if (j10 < -2147483648L || j10 > 2147483647L) {
                                    break;
                                }
                                int i35 = (int) j10;
                                int[] iArr4 = dVar.L;
                                if (i28 != 0) {
                                    i35 += iArr4[i28 - 1];
                                }
                                iArr4[i28] = i35;
                                i29 += i35;
                                i28++;
                                i30 = i12;
                                b10 = 255;
                                i17 = 1;
                                i18 = 0;
                            } else {
                                throw j3.r1.a("No valid varint length mask found", null);
                            }
                        } else {
                            c3 = 1;
                            c10 = 0;
                            dVar.L[i31] = ((i11 - dVar.N) - i30) - i29;
                            break;
                        }
                    }
                    throw j3.r1.a("EBML lacing sample size out of range.", null);
                } else {
                    throw j3.r1.a("Unexpected lacing value: " + i21, null);
                }
            }
            c3 = 1;
            c10 = 0;
            int i36 = wVar2.f7308a[c3] & 255;
            dVar.H = dVar.k(i36 | (bArr[c10] << 8)) + dVar.B;
            if (cVar3.d != 2 && (i10 != 163 || (wVar2.f7308a[2] & 128) != 128)) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            dVar.O = i16;
            dVar.G = 2;
            dVar.J = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i37 = dVar.J;
                if (i37 < dVar.K) {
                    dVar.c(cVar3, ((dVar.J * cVar3.f50311e) / 1000) + dVar.H, dVar.O, dVar.l(lVar, cVar3, dVar.L[i37], false), 0);
                    dVar.J++;
                } else {
                    dVar.G = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i38 = dVar.J;
                if (i38 < dVar.K) {
                    int[] iArr5 = dVar.L;
                    iArr5[i38] = dVar.l(lVar, cVar3, iArr5[i38], true);
                    dVar.J++;
                } else {
                    return;
                }
            }
        }
    }

    public void h(int i10, long j10) {
        x3.d dVar = (x3.d) this.f42528b;
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z4 = false;
                switch (i10) {
                    case 131:
                        dVar.b(i10);
                        dVar.f50357u.d = (int) j10;
                        return;
                    case 136:
                        dVar.b(i10);
                        x3.c cVar = dVar.f50357u;
                        if (j10 == 1) {
                            z4 = true;
                        }
                        cVar.V = z4;
                        return;
                    case 155:
                        dVar.I = dVar.k(j10);
                        return;
                    case 159:
                        dVar.b(i10);
                        dVar.f50357u.O = (int) j10;
                        return;
                    case 176:
                        dVar.b(i10);
                        dVar.f50357u.f50318m = (int) j10;
                        return;
                    case 179:
                        dVar.a(i10);
                        dVar.C.c(dVar.k(j10));
                        return;
                    case 186:
                        dVar.b(i10);
                        dVar.f50357u.f50319n = (int) j10;
                        return;
                    case 215:
                        dVar.b(i10);
                        dVar.f50357u.f50310c = (int) j10;
                        return;
                    case 231:
                        dVar.B = dVar.k(j10);
                        return;
                    case 238:
                        dVar.P = (int) j10;
                        return;
                    case 241:
                        if (!dVar.E) {
                            dVar.a(i10);
                            dVar.D.c(j10);
                            dVar.E = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.Q = true;
                        return;
                    case 16871:
                        dVar.b(i10);
                        dVar.f50357u.f50313g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw j3.r1.a("ContentCompAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw j3.r1.a("DocTypeReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw j3.r1.a("EBMLReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw j3.r1.a("ContentEncAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw j3.r1.a("AESSettingsCipherMode " + j10 + " not supported", null);
                        }
                        return;
                    case 21420:
                        dVar.f50359x = j10 + dVar.f50353q;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        dVar.b(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f50357u.f50327w = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f50357u.f50327w = 1;
                                return;
                            }
                            dVar.f50357u.f50327w = 2;
                            return;
                        }
                        dVar.f50357u.f50327w = 0;
                        return;
                    case 21680:
                        dVar.b(i10);
                        dVar.f50357u.f50320o = (int) j10;
                        return;
                    case 21682:
                        dVar.b(i10);
                        dVar.f50357u.f50322q = (int) j10;
                        return;
                    case 21690:
                        dVar.b(i10);
                        dVar.f50357u.f50321p = (int) j10;
                        return;
                    case 21930:
                        dVar.b(i10);
                        x3.c cVar2 = dVar.f50357u;
                        if (j10 == 1) {
                            z4 = true;
                        }
                        cVar2.U = z4;
                        return;
                    case 21998:
                        dVar.b(i10);
                        dVar.f50357u.f50312f = (int) j10;
                        return;
                    case 22186:
                        dVar.b(i10);
                        dVar.f50357u.R = j10;
                        return;
                    case 22203:
                        dVar.b(i10);
                        dVar.f50357u.S = j10;
                        return;
                    case 25188:
                        dVar.b(i10);
                        dVar.f50357u.P = (int) j10;
                        return;
                    case 30114:
                        dVar.R = j10;
                        return;
                    case 30321:
                        dVar.b(i10);
                        int i12 = (int) j10;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        dVar.f50357u.f50323r = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f50357u.f50323r = 2;
                                return;
                            }
                            dVar.f50357u.f50323r = 1;
                            return;
                        }
                        dVar.f50357u.f50323r = 0;
                        return;
                    case 2352003:
                        dVar.b(i10);
                        dVar.f50357u.f50311e = (int) j10;
                        return;
                    case 2807729:
                        dVar.f50354r = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                dVar.b(i10);
                                int i13 = (int) j10;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f50357u.A = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f50357u.A = 2;
                                return;
                            case 21946:
                                dVar.b(i10);
                                int c3 = i5.b.c((int) j10);
                                if (c3 != -1) {
                                    dVar.f50357u.f50330z = c3;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.b(i10);
                                dVar.f50357u.f50328x = true;
                                int b10 = i5.b.b((int) j10);
                                if (b10 != -1) {
                                    dVar.f50357u.f50329y = b10;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.b(i10);
                                dVar.f50357u.B = (int) j10;
                                return;
                            case 21949:
                                dVar.b(i10);
                                dVar.f50357u.C = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw j3.r1.a("ContentEncodingScope " + j10 + " not supported", null);
            }
        } else if (j10 == 0) {
        } else {
            throw j3.r1.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
    }

    @Override
    public boolean h0() {
        return false;
    }

    public p9.a i(JSONObject jSONObject) {
        p9.b aVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            aVar = new z9.d(18);
        } else {
            aVar = new ab.a(19);
        }
        return aVar.f((db.a) this.f42528b, jSONObject);
    }

    public void j() {
        s5.h hVar = (s5.h) this.f42528b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f47051i.iterator();
            while (it2.hasNext()) {
                ((s5.g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public void onComplete(Task task) {
        r5.c.h((r5.c) ((r5.j) this.f42528b).f46722c, "launchApplication", task);
    }

    @Override
    public void onDismiss() {
        a1 a1Var = (a1) this.f42528b;
        a1Var.v("scan_qr_popup_closed", null);
        a1Var.f42473e0 = false;
    }

    @Override
    public void onError(Object obj) {
        w0.d e6 = (w0.d) obj;
        kotlin.jvm.internal.j.e(e6, "e");
        ld.m mVar = (ld.m) this.f42528b;
        if (mVar.w()) {
            mVar.resumeWith(q7.a(e6));
        }
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        ld.m mVar = (ld.m) this.f42528b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        j5 j5Var = (j5) this.f42528b;
        h5 h5Var = j5Var.J;
        k71 k71Var = j5Var.f45493x;
        if (k71Var == null) {
            return;
        }
        if (k71Var.y()) {
            AndroidUtilities.runOnUIThread(h5Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(h5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        j5 j5Var = (j5) this.f42528b;
        j5Var.getClass();
        j5Var.getClass();
        z2 z2Var = j5Var.f45491w;
        if (z2Var != null) {
            float f11 = i10 / i11;
            if (Math.abs(z2Var.f5594v0 - f11) >= 1.0E-4f) {
                z2Var.f5594v0 = f11;
                z2Var.requestLayout();
            }
        }
    }

    @Override
    public void t(Bitmap bitmap) {
        ((t5.h) this.f42528b).e(bitmap, 3);
    }

    @Override
    public void w() {
        ((qh.f0) this.f42528b).f45275e.invalidate();
    }

    @Override
    public Object y2() {
        Type type = (Type) this.f42528b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException("Invalid EnumMap type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + type.toString());
    }

    @Override
    public org.telegram.ui.Cells.m9 z() {
        g4 g4Var = ((i4) this.f42528b).D;
        if (g4Var != null) {
            return ((n3) g4Var).f49889a.getTextSelectionHelper();
        }
        return null;
    }

    public e0(Object obj, int i10) {
        this.f42527a = i10;
        this.f42528b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public e0(h4 h4Var) {
        this.f42527a = 1;
        this.f42528b = (com.google.android.gms.internal.play_billing.r) h4Var.f17180b;
    }

    public e0(int i10) {
        this.f42527a = i10;
        switch (i10) {
            case 23:
                return;
            default:
                this.f42528b = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    @Override
    public void onError(k71 k71Var, Exception exc) {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void S() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void F(boolean z4) {
    }

    @Override
    public void N(boolean z4) {
    }

    @Override
    public void P0(MrzRecognizer.Result result) {
    }

    @Override
    public void Z0(Object obj) {
    }

    @Override
    public void o1(TLRPC.User user) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override
    public void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
