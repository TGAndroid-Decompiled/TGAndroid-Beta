package v4;

import a8.m8;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
public final class b implements e0, k1, q5.b, com.google.android.gms.common.api.internal.q {
    public final int f59185a;
    public Object f59186b;

    public b() {
        this.f59185a = 7;
    }

    @Override
    public void V(int i7, int i10) {
        ((i0) this.f59186b).o(i7, i10);
    }

    @Override
    public void V0(int i7, int i10) {
        ((i0) this.f59186b).n(i7, i10, null);
    }

    public void a(int i7, int i10, f3.p pVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j3;
        int i16;
        int i17;
        int i18;
        int i19;
        byte[] bArr;
        int i20;
        x3.f fVar = (x3.f) this.f59186b;
        x3.g gVar = fVar.f60475b;
        SparseArray sparseArray = fVar.f60477c;
        h2.x xVar = fVar.f60491k;
        h2.x xVar2 = fVar.f60487i;
        int i21 = 2;
        int i22 = 0;
        int i23 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 != 165) {
                if (i7 != 16877) {
                    if (i7 != 16981) {
                        if (i7 != 18402) {
                            if (i7 != 21419) {
                                if (i7 != 25506) {
                                    if (i7 == 30322) {
                                        fVar.h(i7);
                                        byte[] bArr2 = new byte[i10];
                                        fVar.f60504y.f60465x = bArr2;
                                        pVar.readFully(bArr2, 0, i10);
                                        return;
                                    }
                                    throw e2.t0.a(null, "Unexpected id: " + i7);
                                }
                                fVar.h(i7);
                                byte[] bArr3 = new byte[i10];
                                fVar.f60504y.f60454l = bArr3;
                                pVar.readFully(bArr3, 0, i10);
                                return;
                            }
                            Arrays.fill(xVar.f13828a, (byte) 0);
                            pVar.readFully(xVar.f13828a, 4 - i10, i10);
                            xVar.N(0);
                            fVar.A = (int) xVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i10];
                        pVar.readFully(bArr4, 0, i10);
                        fVar.h(i7);
                        fVar.f60504y.f60453k = new f3.i0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i7);
                    byte[] bArr5 = new byte[i10];
                    fVar.f60504y.f60452j = bArr5;
                    pVar.readFully(bArr5, 0, i10);
                    return;
                }
                fVar.h(i7);
                x3.e eVar = fVar.f60504y;
                int i24 = eVar.h;
                if (i24 != 1685485123 && i24 != 1685480259) {
                    pVar.q(i10);
                    return;
                }
                byte[] bArr6 = new byte[i10];
                eVar.P = bArr6;
                pVar.readFully(bArr6, 0, i10);
                return;
            } else if (fVar.O == 2) {
                x3.e eVar2 = (x3.e) sparseArray.get(fVar.U);
                int i25 = fVar.X;
                h2.x xVar3 = fVar.f60496p;
                if (i25 == 4 && "V_VP9".equals(eVar2.f60446c)) {
                    xVar3.K(i10);
                    pVar.readFully(xVar3.f13828a, 0, i10);
                    return;
                }
                pVar.q(i10);
                return;
            } else {
                return;
            }
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.f60508c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        x3.e eVar3 = (x3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.q(i10 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.f60443a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i26 = (xVar2.f13828a[2] & 6) >> 1;
            byte b10 = 255;
            if (i26 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i10 - fVar.V) - 3;
            } else {
                fVar.l(pVar, 4);
                int i27 = (xVar2.f13828a[3] & 255) + 1;
                fVar.S = i27;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i27];
                } else if (iArr2.length < i27) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i27)];
                }
                fVar.T = iArr2;
                if (i26 == 2) {
                    int i28 = fVar.S;
                    Arrays.fill(iArr2, 0, i28, ((i10 - fVar.V) - 4) / i28);
                } else if (i26 == 1) {
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 4;
                    while (true) {
                        i17 = fVar.S - 1;
                        if (i29 >= i17) {
                            break;
                        }
                        fVar.T[i29] = 0;
                        while (true) {
                            i18 = i31 + 1;
                            fVar.l(pVar, i18);
                            int i32 = xVar2.f13828a[i31] & 255;
                            int[] iArr3 = fVar.T;
                            i19 = iArr3[i29] + i32;
                            iArr3[i29] = i19;
                            if (i32 != 255) {
                                break;
                            }
                            i31 = i18;
                        }
                        i30 += i19;
                        i29++;
                        i31 = i18;
                    }
                    fVar.T[i17] = ((i10 - fVar.V) - i31) - i30;
                } else if (i26 == 3) {
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 4;
                    while (true) {
                        int i36 = fVar.S - i23;
                        if (i33 < i36) {
                            fVar.T[i33] = i22;
                            int i37 = i35 + 1;
                            fVar.l(pVar, i37);
                            if (xVar2.f13828a[i35] != 0) {
                                int i38 = i22;
                                while (true) {
                                    if (i38 < 8) {
                                        int i39 = i23 << (7 - i38);
                                        i14 = i21;
                                        if ((xVar2.f13828a[i35] & i39) != 0) {
                                            int i40 = i37 + i38;
                                            fVar.l(pVar, i40);
                                            i15 = i23;
                                            j3 = xVar2.f13828a[i35] & b10 & (~i39);
                                            while (i37 < i40) {
                                                j3 = (j3 << 8) | (xVar2.f13828a[i37] & b10);
                                                i37++;
                                                i40 = i40;
                                                b10 = 255;
                                            }
                                            i16 = i40;
                                            if (i33 > 0) {
                                                j3 -= (1 << ((i38 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i38++;
                                            i21 = i14;
                                            b10 = 255;
                                        }
                                    } else {
                                        i14 = i21;
                                        i15 = i23;
                                        j3 = 0;
                                        i16 = i37;
                                        break;
                                    }
                                }
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    break;
                                }
                                int i41 = (int) j3;
                                int[] iArr4 = fVar.T;
                                if (i33 != 0) {
                                    i41 += iArr4[i33 - 1];
                                }
                                iArr4[i33] = i41;
                                i34 += i41;
                                i33++;
                                i22 = i38;
                                i21 = i14;
                                i23 = i15;
                                i35 = i16;
                                b10 = 255;
                            } else {
                                throw e2.t0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            i11 = i21;
                            i12 = i22;
                            i13 = i23;
                            fVar.T[i36] = ((i10 - fVar.V) - i35) - i34;
                            break;
                        }
                    }
                    throw e2.t0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw e2.t0.a(null, "Unexpected lacing value: " + i26);
                }
            }
            i11 = 2;
            i12 = 0;
            i13 = 1;
            int i42 = xVar2.f13828a[i13] & 255;
            fVar.P = fVar.n(i42 | (bArr[i12] << 8)) + fVar.M;
            if (eVar3.f60448e != i13 && (i7 != 163 || (xVar2.f13828a[i11] & 128) != 128)) {
                i20 = i12;
            } else {
                i20 = 1;
            }
            fVar.W = i20;
            fVar.O = i11;
            fVar.R = i12;
        }
        if (i7 == 163) {
            while (true) {
                int i43 = fVar.R;
                if (i43 < fVar.S) {
                    fVar.i(eVar3, ((fVar.R * eVar3.f60449f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i43], false), 0);
                    fVar.R++;
                } else {
                    fVar.O = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i44 = fVar.R;
                if (i44 < fVar.S) {
                    int[] iArr5 = fVar.T;
                    iArr5[i44] = fVar.o(pVar, eVar3, iArr5[i44], true);
                    fVar.R++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        y8.e eVar = (y8.e) this.f59186b;
        h8.b bVar = (h8.b) obj;
        bVar.getClass();
        h8.a aVar = new h8.a(1, (TaskCompletionSource) obj2);
        try {
            h8.i iVar = (h8.i) bVar.n();
            Bundle B = bVar.B();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i7 = h8.c.f13947a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            B.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f13955a.transact(14, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
            Bundle bundle = Bundle.EMPTY;
            m8.a(Status.h, Boolean.FALSE, aVar.f13946b);
        }
    }

    public void b(int i7, long j3) {
        x3.f fVar = (x3.f) this.f59186b;
        if (i7 != 240) {
            if (i7 != 241) {
                if (i7 != 20529) {
                    if (i7 != 20530) {
                        boolean z10 = false;
                        switch (i7) {
                            case 131:
                                int i10 = (int) j3;
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 17) {
                                            if (i10 != 33) {
                                                fVar.h(i7);
                                                fVar.f60504y.f60448e = -1;
                                                return;
                                            }
                                            fVar.h(i7);
                                            fVar.f60504y.f60448e = 5;
                                            return;
                                        }
                                        fVar.h(i7);
                                        fVar.f60504y.f60448e = 3;
                                        return;
                                    }
                                    fVar.h(i7);
                                    fVar.f60504y.f60448e = 1;
                                    return;
                                }
                                fVar.h(i7);
                                fVar.f60504y.f60448e = 2;
                                return;
                            case 136:
                                fVar.h(i7);
                                x3.e eVar = fVar.f60504y;
                                if (j3 == 1) {
                                    z10 = true;
                                }
                                eVar.Y = z10;
                                return;
                            case 155:
                                fVar.Q = fVar.n(j3);
                                return;
                            case 159:
                                fVar.h(i7);
                                fVar.f60504y.Q = (int) j3;
                                return;
                            case 176:
                                fVar.h(i7);
                                fVar.f60504y.f60456n = (int) j3;
                                return;
                            case 179:
                                if (!fVar.f60505z) {
                                    fVar.g(i7);
                                    fVar.E = fVar.n(j3);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i7);
                                fVar.f60504y.f60457o = (int) j3;
                                return;
                            case 215:
                                fVar.h(i7);
                                fVar.f60504y.d = (int) j3;
                                return;
                            case 231:
                                fVar.M = fVar.n(j3);
                                return;
                            case 238:
                                fVar.X = (int) j3;
                                return;
                            case 247:
                                if (!fVar.f60505z) {
                                    fVar.g(i7);
                                    fVar.F = (int) j3;
                                    return;
                                }
                                return;
                            case 251:
                                fVar.Y = true;
                                return;
                            case 16871:
                                fVar.h(i7);
                                fVar.f60504y.h = (int) j3;
                                return;
                            case 16980:
                                if (j3 != 3) {
                                    throw e2.t0.a(null, "ContentCompAlgo " + j3 + " not supported");
                                }
                                return;
                            case 17029:
                                if (j3 < 1 || j3 > 2) {
                                    throw e2.t0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                                }
                                return;
                            case 17143:
                                if (j3 != 1) {
                                    throw e2.t0.a(null, "EBMLReadVersion " + j3 + " not supported");
                                }
                                return;
                            case 18401:
                                if (j3 != 5) {
                                    throw e2.t0.a(null, "ContentEncAlgo " + j3 + " not supported");
                                }
                                return;
                            case 18408:
                                if (j3 != 1) {
                                    throw e2.t0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
                                }
                                return;
                            case 21420:
                                fVar.B = j3 + fVar.f60499s;
                                return;
                            case 21432:
                                int i11 = (int) j3;
                                fVar.h(i7);
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        if (i11 != 3) {
                                            if (i11 == 15) {
                                                fVar.f60504y.f60466y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f60504y.f60466y = 1;
                                        return;
                                    }
                                    fVar.f60504y.f60466y = 2;
                                    return;
                                }
                                fVar.f60504y.f60466y = 0;
                                return;
                            case 21680:
                                fVar.h(i7);
                                fVar.f60504y.f60459q = (int) j3;
                                return;
                            case 21682:
                                fVar.h(i7);
                                fVar.f60504y.f60461s = (int) j3;
                                return;
                            case 21690:
                                fVar.h(i7);
                                fVar.f60504y.f60460r = (int) j3;
                                return;
                            case 21930:
                                fVar.h(i7);
                                x3.e eVar2 = fVar.f60504y;
                                if (j3 == 1) {
                                    z10 = true;
                                }
                                eVar2.X = z10;
                                return;
                            case 21938:
                                fVar.h(i7);
                                x3.e eVar3 = fVar.f60504y;
                                eVar3.f60467z = true;
                                eVar3.f60458p = (int) j3;
                                return;
                            case 21998:
                                fVar.h(i7);
                                fVar.f60504y.f60450g = (int) j3;
                                return;
                            case 22186:
                                fVar.h(i7);
                                fVar.f60504y.T = j3;
                                return;
                            case 22203:
                                fVar.h(i7);
                                fVar.f60504y.U = j3;
                                return;
                            case 25188:
                                fVar.h(i7);
                                fVar.f60504y.R = (int) j3;
                                return;
                            case 30114:
                                fVar.Z = j3;
                                return;
                            case 30321:
                                fVar.h(i7);
                                int i12 = (int) j3;
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        if (i12 != 2) {
                                            if (i12 == 3) {
                                                fVar.f60504y.f60462t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f60504y.f60462t = 2;
                                        return;
                                    }
                                    fVar.f60504y.f60462t = 1;
                                    return;
                                }
                                fVar.f60504y.f60462t = 0;
                                return;
                            case 2352003:
                                fVar.h(i7);
                                fVar.f60504y.f60449f = (int) j3;
                                return;
                            case 2807729:
                                fVar.f60500t = j3;
                                return;
                            default:
                                switch (i7) {
                                    case 21945:
                                        fVar.h(i7);
                                        int i13 = (int) j3;
                                        if (i13 != 1) {
                                            if (i13 == 2) {
                                                fVar.f60504y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f60504y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i7);
                                        int g10 = e2.m.g((int) j3);
                                        if (g10 != -1) {
                                            fVar.f60504y.B = g10;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i7);
                                        fVar.f60504y.f60467z = true;
                                        int f10 = e2.m.f((int) j3);
                                        if (f10 != -1) {
                                            fVar.f60504y.A = f10;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i7);
                                        fVar.f60504y.D = (int) j3;
                                        return;
                                    case 21949:
                                        fVar.h(i7);
                                        fVar.f60504y.E = (int) j3;
                                        return;
                                    default:
                                        return;
                                }
                        }
                    } else if (j3 != 1) {
                        throw e2.t0.a(null, "ContentEncodingScope " + j3 + " not supported");
                    }
                } else if (j3 != 0) {
                    throw e2.t0.a(null, "ContentEncodingOrder " + j3 + " not supported");
                }
            } else if (!fVar.f60505z) {
                fVar.g(i7);
                if (fVar.G == -1) {
                    fVar.G = j3;
                }
            }
        } else if (!fVar.f60505z) {
            fVar.g(i7);
            if (fVar.H == -1) {
                fVar.H = j3;
            }
        }
    }

    public void c(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.f59186b;
        View childAt = recyclerView.getChildAt(i7);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i7);
    }

    @Override
    public int d(View view) {
        return p0.x(view) - ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).leftMargin;
    }

    public void e(long j3, int i7, long j10) {
        x3.f fVar = (x3.f) this.f59186b;
        fVar.f60490j0.getClass();
        if (i7 != 160) {
            if (i7 != 174) {
                if (i7 != 183) {
                    if (i7 != 187) {
                        if (i7 != 19899) {
                            if (i7 != 20533) {
                                if (i7 != 21968) {
                                    if (i7 != 408125543) {
                                        if (i7 != 475249515) {
                                            if (i7 == 524531317 && !fVar.f60505z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f60490j0.h(new f3.t(fVar.v));
                                                fVar.f60505z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f60505z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j11 = fVar.f60499s;
                                    if (j11 != -1 && j11 != j3) {
                                        throw e2.t0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f60499s = j3;
                                    fVar.f60498r = j10;
                                    return;
                                }
                                fVar.h(i7);
                                fVar.f60504y.f60467z = true;
                                return;
                            }
                            fVar.h(i7);
                            fVar.f60504y.f60451i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f60505z) {
                        fVar.g(i7);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f60505z) {
                    fVar.g(i7);
                    fVar.F = -1;
                    fVar.G = -1L;
                    fVar.H = -1L;
                    return;
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f60456n = -1;
            obj.f60457o = -1;
            obj.f60458p = -1;
            obj.f60459q = -1;
            obj.f60460r = -1;
            obj.f60461s = 0;
            obj.f60462t = -1;
            obj.f60463u = 0.0f;
            obj.v = 0.0f;
            obj.f60464w = 0.0f;
            obj.f60465x = null;
            obj.f60466y = -1;
            obj.f60467z = false;
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
            fVar.f60504y = obj;
            obj.f60442a = fVar.f60502w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    public void f(int i7, String str) {
        x3.f fVar = (x3.f) this.f59186b;
        if (i7 != 134) {
            if (i7 != 17026) {
                if (i7 != 21358) {
                    if (i7 != 2274716) {
                        return;
                    }
                    fVar.h(i7);
                    fVar.f60504y.Z = str;
                    return;
                }
                fVar.h(i7);
                fVar.f60504y.f60444b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw e2.t0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f60502w = str.equals("webm");
                return;
            }
        }
        fVar.h(i7);
        fVar.f60504y.f60446c = str;
    }

    @Override
    public Object mo23get() {
        return new v5.i(Integer.valueOf(v5.i.d).intValue(), (Context) ((fd.a) this.f59186b).mo23get(), "com.google.android.datatransport.events");
    }

    @Override
    public int i() {
        return ((p0) this.f59186b).D();
    }

    @Override
    public int k() {
        p0 p0Var = (p0) this.f59186b;
        return p0Var.f59341m - p0Var.E();
    }

    @Override
    public View l(int i7) {
        return ((p0) this.f59186b).q(i7);
    }

    @Override
    public int m(View view) {
        return p0.y(view) + ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).rightMargin;
    }

    public String toString() {
        switch (this.f59185a) {
            case 7:
                ze.c cVar = ze.c.f62044e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ug.m0) this.f59186b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void y0(int i7, int i10) {
        ((i0) this.f59186b).p(i7, i10);
    }

    @Override
    public void z(int i7, int i10) {
        ((i0) this.f59186b).j(i7, i10);
    }

    public b(Object obj, int i7) {
        this.f59185a = i7;
        this.f59186b = obj;
    }
}
