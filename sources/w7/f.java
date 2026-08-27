package w7;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import h7.q8;
import h7.r8;
import java.util.ArrayList;
import x7.h;
import y5.f0;
import y5.j;
import y5.n;
import y5.o;
import y5.u;
import y5.v;

public final class f implements Parcelable.Creator {

    public final int f49273a;

    public f(int i10) {
        this.f49273a = i10;
    }

    public static void a(y5.f fVar, Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = fVar.f49616a;
        r8.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.f49617b;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.f49618c;
        r8.s(parcel, 3, 4);
        parcel.writeInt(i13);
        r8.l(parcel, 4, fVar.d);
        r8.f(parcel, 5, fVar.f49619e);
        r8.o(parcel, 6, fVar.f49620f, i10);
        r8.b(parcel, 7, fVar.h);
        r8.k(parcel, 8, fVar.f49621n, i10);
        r8.o(parcel, 10, fVar.f49622r, i10);
        r8.o(parcel, 11, fVar.f49623s, i10);
        boolean z10 = fVar.v;
        r8.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.f49624w;
        r8.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.f49625x;
        r8.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        r8.l(parcel, 15, fVar.f49626y);
        r8.r(parcel, iQ);
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f49273a) {
            case 0:
                int iZ = q8.z(parcel);
                String strH = null;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        q8.y(parcel, i10);
                    } else {
                        strH = q8.h(parcel, i10);
                    }
                }
                q8.m(parcel, iZ);
                b bVar = new b();
                bVar.f49272a = strH;
                return bVar;
            case 1:
                int iZ2 = q8.z(parcel);
                while (parcel.dataPosition() < iZ2) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, iZ2);
                return new c();
            case 2:
                int iZ3 = q8.z(parcel);
                while (parcel.dataPosition() < iZ3) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, iZ3);
                return new d();
            case 3:
                int iZ4 = q8.z(parcel);
                int iU = 0;
                Uri uri = null;
                int iU2 = 0;
                int iU3 = 0;
                while (parcel.dataPosition() < iZ4) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iU = q8.u(parcel, i11);
                    } else if (c10 == 2) {
                        uri = (Uri) q8.g(parcel, i11, Uri.CREATOR);
                    } else if (c10 == 3) {
                        iU2 = q8.u(parcel, i11);
                    } else if (c10 != 4) {
                        q8.y(parcel, i11);
                    } else {
                        iU3 = q8.u(parcel, i11);
                    }
                }
                q8.m(parcel, iZ4);
                return new x5.a(iU, uri, iU2, iU3);
            case 4:
                int iZ5 = q8.z(parcel);
                String strH2 = null;
                while (parcel.dataPosition() < iZ5) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 2) {
                        q8.y(parcel, i12);
                    } else {
                        strH2 = q8.h(parcel, i12);
                    }
                }
                q8.m(parcel, iZ5);
                return new x7.e(strH2);
            case 5:
                int iZ6 = q8.z(parcel);
                String strH3 = null;
                byte[] bArrB = null;
                int iU4 = 0;
                while (parcel.dataPosition() < iZ6) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 2) {
                        strH3 = q8.h(parcel, i13);
                    } else if (c11 == 3) {
                        bArrB = q8.b(parcel, i13);
                    } else if (c11 != 4) {
                        q8.y(parcel, i13);
                    } else {
                        iU4 = q8.u(parcel, i13);
                    }
                }
                q8.m(parcel, iZ6);
                return new x7.a(strH3, bArrB, iU4);
            case 6:
                int iZ7 = q8.z(parcel);
                long jW = 0;
                x7.a[] aVarArr = null;
                int iU5 = 0;
                boolean zN = false;
                while (parcel.dataPosition() < iZ7) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 2) {
                        jW = q8.w(parcel, i14);
                    } else if (c12 == 3) {
                        aVarArr = (x7.a[]) q8.k(parcel, i14, x7.a.CREATOR);
                    } else if (c12 == 4) {
                        iU5 = q8.u(parcel, i14);
                    } else if (c12 != 5) {
                        q8.y(parcel, i14);
                    } else {
                        zN = q8.n(parcel, i14);
                    }
                }
                q8.m(parcel, iZ7);
                return new x7.f(jW, aVarArr, iU5, zN);
            case 7:
                int iZ8 = q8.z(parcel);
                String strH4 = null;
                while (parcel.dataPosition() < iZ8) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        q8.y(parcel, i15);
                    } else {
                        strH4 = q8.h(parcel, i15);
                    }
                }
                q8.m(parcel, iZ8);
                return new x7.g(strH4);
            case 8:
                int iZ9 = q8.z(parcel);
                int iU6 = 0;
                boolean zN2 = false;
                while (parcel.dataPosition() < iZ9) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 2) {
                        iU6 = q8.u(parcel, i16);
                    } else if (c13 != 3) {
                        q8.y(parcel, i16);
                    } else {
                        zN2 = q8.n(parcel, i16);
                    }
                }
                q8.m(parcel, iZ9);
                return new h(iU6, zN2);
            case 9:
                int iZ10 = q8.z(parcel);
                String strH5 = null;
                byte[] bArrB2 = null;
                long jW2 = 0;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iZ10) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 2) {
                        strH5 = q8.h(parcel, i17);
                    } else if (c14 == 3) {
                        dataHolder = (DataHolder) q8.g(parcel, i17, DataHolder.CREATOR);
                    } else if (c14 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) q8.g(parcel, i17, ParcelFileDescriptor.CREATOR);
                    } else if (c14 == 5) {
                        jW2 = q8.w(parcel, i17);
                    } else if (c14 != 6) {
                        q8.y(parcel, i17);
                    } else {
                        bArrB2 = q8.b(parcel, i17);
                    }
                }
                q8.m(parcel, iZ10);
                x7.b bVar2 = new x7.b();
                bVar2.f49369a = strH5;
                bVar2.f49370b = dataHolder;
                bVar2.f49371c = parcelFileDescriptor;
                bVar2.d = jW2;
                bVar2.f49372e = bArrB2;
                return bVar2;
            case 10:
                int iZ11 = q8.z(parcel);
                String strH6 = null;
                int iU7 = 0;
                while (parcel.dataPosition() < iZ11) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        iU7 = q8.u(parcel, i18);
                    } else if (c15 != 2) {
                        q8.y(parcel, i18);
                    } else {
                        strH6 = q8.h(parcel, i18);
                    }
                }
                q8.m(parcel, iZ11);
                return new y5.d(iU7, strH6);
            case 11:
                int iZ12 = q8.z(parcel);
                ArrayList arrayListL = null;
                int iU8 = 0;
                while (parcel.dataPosition() < iZ12) {
                    int i19 = parcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 1) {
                        iU8 = q8.u(parcel, i19);
                    } else if (c16 != 2) {
                        q8.y(parcel, i19);
                    } else {
                        arrayListL = q8.l(parcel, i19, j.CREATOR);
                    }
                }
                q8.m(parcel, iZ12);
                return new o(iU8, arrayListL);
            case 12:
                int iZ13 = q8.z(parcel);
                String strH7 = null;
                String strH8 = null;
                long jW3 = 0;
                long jW4 = 0;
                int iU9 = 0;
                int iU10 = 0;
                int iU11 = 0;
                int iU12 = 0;
                int iU13 = -1;
                while (parcel.dataPosition() < iZ13) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            iU9 = q8.u(parcel, i20);
                            break;
                        case 2:
                            iU10 = q8.u(parcel, i20);
                            break;
                        case 3:
                            iU11 = q8.u(parcel, i20);
                            break;
                        case 4:
                            jW3 = q8.w(parcel, i20);
                            break;
                        case 5:
                            jW4 = q8.w(parcel, i20);
                            break;
                        case 6:
                            strH7 = q8.h(parcel, i20);
                            break;
                        case 7:
                            strH8 = q8.h(parcel, i20);
                            break;
                        case '\b':
                            iU12 = q8.u(parcel, i20);
                            break;
                        case '\t':
                            iU13 = q8.u(parcel, i20);
                            break;
                        default:
                            q8.y(parcel, i20);
                            break;
                    }
                }
                q8.m(parcel, iZ13);
                return new j(iU9, iU10, iU11, jW3, jW4, strH7, strH8, iU12, iU13);
            case 13:
                int iZ14 = q8.z(parcel);
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int iU14 = 0;
                int iU15 = 0;
                while (parcel.dataPosition() < iZ14) {
                    int i21 = parcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 1) {
                        iU14 = q8.u(parcel, i21);
                    } else if (c17 == 2) {
                        account = (Account) q8.g(parcel, i21, Account.CREATOR);
                    } else if (c17 == 3) {
                        iU15 = q8.u(parcel, i21);
                    } else if (c17 != 4) {
                        q8.y(parcel, i21);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) q8.g(parcel, i21, GoogleSignInAccount.CREATOR);
                    }
                }
                q8.m(parcel, iZ14);
                return new u(iU14, account, iU15, googleSignInAccount);
            case 14:
                int iZ15 = q8.z(parcel);
                IBinder iBinderT = null;
                v5.a aVar = null;
                int iU16 = 0;
                boolean zN3 = false;
                boolean zN4 = false;
                while (parcel.dataPosition() < iZ15) {
                    int i22 = parcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 1) {
                        iU16 = q8.u(parcel, i22);
                    } else if (c18 == 2) {
                        iBinderT = q8.t(parcel, i22);
                    } else if (c18 == 3) {
                        aVar = (v5.a) q8.g(parcel, i22, v5.a.CREATOR);
                    } else if (c18 == 4) {
                        zN3 = q8.n(parcel, i22);
                    } else if (c18 != 5) {
                        q8.y(parcel, i22);
                    } else {
                        zN4 = q8.n(parcel, i22);
                    }
                }
                q8.m(parcel, iZ15);
                return new v(iU16, iBinderT, aVar, zN3, zN4);
            case 15:
                int iZ16 = q8.z(parcel);
                int iU17 = 0;
                int iU18 = 0;
                int iU19 = 0;
                boolean zN5 = false;
                boolean zN6 = false;
                while (parcel.dataPosition() < iZ16) {
                    int i23 = parcel.readInt();
                    char c19 = (char) i23;
                    if (c19 == 1) {
                        iU17 = q8.u(parcel, i23);
                    } else if (c19 == 2) {
                        zN5 = q8.n(parcel, i23);
                    } else if (c19 == 3) {
                        zN6 = q8.n(parcel, i23);
                    } else if (c19 == 4) {
                        iU18 = q8.u(parcel, i23);
                    } else if (c19 != 5) {
                        q8.y(parcel, i23);
                    } else {
                        iU19 = q8.u(parcel, i23);
                    }
                }
                q8.m(parcel, iZ16);
                return new n(iU17, iU18, iU19, zN5, zN6);
            case 16:
                return new BinderWrapper(parcel);
            case 17:
                int iZ17 = q8.z(parcel);
                Bundle bundleA = null;
                v5.c[] cVarArr = null;
                y5.e eVar = null;
                int iU20 = 0;
                while (parcel.dataPosition() < iZ17) {
                    int i24 = parcel.readInt();
                    char c20 = (char) i24;
                    if (c20 == 1) {
                        bundleA = q8.a(parcel, i24);
                    } else if (c20 == 2) {
                        cVarArr = (v5.c[]) q8.k(parcel, i24, v5.c.CREATOR);
                    } else if (c20 == 3) {
                        iU20 = q8.u(parcel, i24);
                    } else if (c20 != 4) {
                        q8.y(parcel, i24);
                    } else {
                        eVar = (y5.e) q8.g(parcel, i24, y5.e.CREATOR);
                    }
                }
                q8.m(parcel, iZ17);
                f0 f0Var = new f0();
                f0Var.f49627a = bundleA;
                f0Var.f49628b = cVarArr;
                f0Var.f49629c = iU20;
                f0Var.d = eVar;
                return f0Var;
            case 18:
                int iZ18 = q8.z(parcel);
                n nVar = null;
                int[] iArrD = null;
                int[] iArrD2 = null;
                boolean zN7 = false;
                boolean zN8 = false;
                int iU21 = 0;
                while (parcel.dataPosition() < iZ18) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            nVar = (n) q8.g(parcel, i25, n.CREATOR);
                            break;
                        case 2:
                            zN7 = q8.n(parcel, i25);
                            break;
                        case 3:
                            zN8 = q8.n(parcel, i25);
                            break;
                        case 4:
                            iArrD = q8.d(parcel, i25);
                            break;
                        case 5:
                            iU21 = q8.u(parcel, i25);
                            break;
                        case 6:
                            iArrD2 = q8.d(parcel, i25);
                            break;
                        default:
                            q8.y(parcel, i25);
                            break;
                    }
                }
                q8.m(parcel, iZ18);
                return new y5.e(nVar, zN7, zN8, iArrD, iU21, iArrD2);
            case 19:
                int iZ19 = q8.z(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = y5.f.A;
                String strH9 = null;
                IBinder iBinderT2 = null;
                Account account2 = null;
                String strH10 = null;
                v5.c[] cVarArr2 = y5.f.B;
                v5.c[] cVarArr3 = cVarArr2;
                int iU22 = 0;
                int iU23 = 0;
                int iU24 = 0;
                boolean zN9 = false;
                int iU25 = 0;
                boolean zN10 = false;
                while (parcel.dataPosition() < iZ19) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            iU22 = q8.u(parcel, i26);
                            break;
                        case 2:
                            iU23 = q8.u(parcel, i26);
                            break;
                        case 3:
                            iU24 = q8.u(parcel, i26);
                            break;
                        case 4:
                            strH9 = q8.h(parcel, i26);
                            break;
                        case 5:
                            iBinderT2 = q8.t(parcel, i26);
                            break;
                        case 6:
                            scopeArr = (Scope[]) q8.k(parcel, i26, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = q8.a(parcel, i26);
                            break;
                        case '\b':
                            account2 = (Account) q8.g(parcel, i26, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            q8.y(parcel, i26);
                            break;
                        case '\n':
                            cVarArr2 = (v5.c[]) q8.k(parcel, i26, v5.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (v5.c[]) q8.k(parcel, i26, v5.c.CREATOR);
                            break;
                        case '\f':
                            zN9 = q8.n(parcel, i26);
                            break;
                        case '\r':
                            iU25 = q8.u(parcel, i26);
                            break;
                        case 14:
                            zN10 = q8.n(parcel, i26);
                            break;
                        case 15:
                            strH10 = q8.h(parcel, i26);
                            break;
                    }
                }
                q8.m(parcel, iZ19);
                return new y5.f(iU22, iU23, iU24, strH9, iBinderT2, scopeArr, bundle, account2, cVarArr2, cVarArr3, zN9, iU25, zN10, strH10);
            case 20:
                int iZ20 = q8.z(parcel);
                String strH11 = null;
                String strH12 = null;
                String strH13 = null;
                String strH14 = null;
                y8.a aVar2 = null;
                String strH15 = null;
                Bundle bundleA2 = null;
                while (parcel.dataPosition() < iZ20) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            strH11 = q8.h(parcel, i27);
                            break;
                        case 2:
                            strH12 = q8.h(parcel, i27);
                            break;
                        case 3:
                            strH13 = q8.h(parcel, i27);
                            break;
                        case 4:
                            strH14 = q8.h(parcel, i27);
                            break;
                        case 5:
                            aVar2 = (y8.a) q8.g(parcel, i27, y8.a.CREATOR);
                            break;
                        case 6:
                            strH15 = q8.h(parcel, i27);
                            break;
                        case 7:
                            bundleA2 = q8.a(parcel, i27);
                            break;
                        default:
                            q8.y(parcel, i27);
                            break;
                    }
                }
                q8.m(parcel, iZ20);
                return new y8.b(strH11, strH12, strH13, strH14, aVar2, strH15, bundleA2);
            case 21:
                int iZ21 = q8.z(parcel);
                String strH16 = null;
                String strH17 = null;
                byte[] bArrB3 = null;
                int iU26 = 0;
                boolean zN11 = false;
                boolean zN12 = false;
                while (parcel.dataPosition() < iZ21) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            iU26 = q8.u(parcel, i28);
                            break;
                        case 2:
                            zN11 = q8.n(parcel, i28);
                            break;
                        case 3:
                            strH16 = q8.h(parcel, i28);
                            break;
                        case 4:
                            strH17 = q8.h(parcel, i28);
                            break;
                        case 5:
                            bArrB3 = q8.b(parcel, i28);
                            break;
                        case 6:
                            zN12 = q8.n(parcel, i28);
                            break;
                        default:
                            q8.y(parcel, i28);
                            break;
                    }
                }
                q8.m(parcel, iZ21);
                return new y8.a(iU26, zN11, strH16, strH17, bArrB3, zN12);
            case 22:
                int iZ22 = q8.z(parcel);
                Intent intent = null;
                int iU27 = 0;
                int iU28 = 0;
                while (parcel.dataPosition() < iZ22) {
                    int i29 = parcel.readInt();
                    char c21 = (char) i29;
                    if (c21 == 1) {
                        iU27 = q8.u(parcel, i29);
                    } else if (c21 == 2) {
                        iU28 = q8.u(parcel, i29);
                    } else if (c21 != 3) {
                        q8.y(parcel, i29);
                    } else {
                        intent = (Intent) q8.g(parcel, i29, Intent.CREATOR);
                    }
                }
                q8.m(parcel, iZ22);
                return new z7.b(iU27, iU28, intent);
            case 23:
                int iZ23 = q8.z(parcel);
                ArrayList arrayListJ = null;
                String strH18 = null;
                while (parcel.dataPosition() < iZ23) {
                    int i30 = parcel.readInt();
                    char c22 = (char) i30;
                    if (c22 == 1) {
                        arrayListJ = q8.j(parcel, i30);
                    } else if (c22 != 2) {
                        q8.y(parcel, i30);
                    } else {
                        strH18 = q8.h(parcel, i30);
                    }
                }
                q8.m(parcel, iZ23);
                return new z7.f(strH18, arrayListJ);
            case 24:
                int iZ24 = q8.z(parcel);
                u uVar = null;
                int iU29 = 0;
                while (parcel.dataPosition() < iZ24) {
                    int i31 = parcel.readInt();
                    char c23 = (char) i31;
                    if (c23 == 1) {
                        iU29 = q8.u(parcel, i31);
                    } else if (c23 != 2) {
                        q8.y(parcel, i31);
                    } else {
                        uVar = (u) q8.g(parcel, i31, u.CREATOR);
                    }
                }
                q8.m(parcel, iZ24);
                return new z7.g(iU29, uVar);
            default:
                int iZ25 = q8.z(parcel);
                v5.a aVar3 = null;
                v vVar = null;
                int iU30 = 0;
                while (parcel.dataPosition() < iZ25) {
                    int i32 = parcel.readInt();
                    char c24 = (char) i32;
                    if (c24 == 1) {
                        iU30 = q8.u(parcel, i32);
                    } else if (c24 == 2) {
                        aVar3 = (v5.a) q8.g(parcel, i32, v5.a.CREATOR);
                    } else if (c24 != 3) {
                        q8.y(parcel, i32);
                    } else {
                        vVar = (v) q8.g(parcel, i32, v.CREATOR);
                    }
                }
                q8.m(parcel, iZ25);
                return new z7.h(iU30, aVar3, vVar);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f49273a) {
            case 0:
                return new b[i10];
            case 1:
                return new c[i10];
            case 2:
                return new d[i10];
            case 3:
                return new x5.a[i10];
            case 4:
                return new x7.e[i10];
            case 5:
                return new x7.a[i10];
            case 6:
                return new x7.f[i10];
            case 7:
                return new x7.g[i10];
            case 8:
                return new h[i10];
            case 9:
                return new x7.b[i10];
            case 10:
                return new y5.d[i10];
            case 11:
                return new o[i10];
            case 12:
                return new j[i10];
            case 13:
                return new u[i10];
            case 14:
                return new v[i10];
            case 15:
                return new n[i10];
            case 16:
                return new BinderWrapper[i10];
            case 17:
                return new f0[i10];
            case 18:
                return new y5.e[i10];
            case 19:
                return new y5.f[i10];
            case 20:
                return new y8.b[i10];
            case 21:
                return new y8.a[i10];
            case 22:
                return new z7.b[i10];
            case 23:
                return new z7.f[i10];
            case 24:
                return new z7.g[i10];
            default:
                return new z7.h[i10];
        }
    }
}
