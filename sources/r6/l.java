package r6;

import android.app.PendingIntent;
import android.database.CursorWindow;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.clearcut.e2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import h7.q8;
import java.util.ArrayList;
import java.util.List;
import n2.b0;

public final class l implements Parcelable.Creator {

    public final int f46851a;

    public l(int i10) {
        this.f46851a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f46851a) {
            case 0:
                int iZ = q8.z(parcel);
                Bundle bundleA = null;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        q8.y(parcel, i10);
                    } else {
                        bundleA = q8.a(parcel, i10);
                    }
                }
                q8.m(parcel, iZ);
                return new k(bundleA);
            case 1:
                int iZ2 = q8.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        q8.y(parcel, i11);
                    } else {
                        pendingIntent = (PendingIntent) q8.g(parcel, i11, PendingIntent.CREATOR);
                    }
                }
                q8.m(parcel, iZ2);
                return new m(pendingIntent);
            case 2:
                int iZ3 = q8.z(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        q8.y(parcel, i12);
                    } else {
                        pendingIntent2 = (PendingIntent) q8.g(parcel, i12, PendingIntent.CREATOR);
                    }
                }
                q8.m(parcel, iZ3);
                return new n(pendingIntent2);
            case 3:
                int iZ4 = q8.z(parcel);
                while (parcel.dataPosition() < iZ4) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, iZ4);
                return new o();
            case 4:
                int iZ5 = q8.z(parcel);
                while (parcel.dataPosition() < iZ5) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, iZ5);
                return new p();
            case 5:
                int iZ6 = q8.z(parcel);
                while (parcel.dataPosition() < iZ6) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, iZ6);
                return new q();
            case 6:
                int iZ7 = q8.z(parcel);
                while (parcel.dataPosition() < iZ7) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, iZ7);
                return new r();
            case 7:
                int iZ8 = q8.z(parcel);
                Status status = null;
                r7.h hVar = null;
                while (parcel.dataPosition() < iZ8) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        status = (Status) q8.g(parcel, i13, Status.CREATOR);
                    } else if (c10 != 2) {
                        q8.y(parcel, i13);
                    } else {
                        hVar = (r7.h) q8.g(parcel, i13, r7.h.CREATOR);
                    }
                }
                q8.m(parcel, iZ8);
                return new r7.g(status, hVar);
            case 8:
                int iZ9 = q8.z(parcel);
                boolean zN = false;
                boolean zN2 = false;
                boolean zN3 = false;
                boolean zN4 = false;
                boolean zN5 = false;
                boolean zN6 = false;
                while (parcel.dataPosition() < iZ9) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            zN = q8.n(parcel, i14);
                            break;
                        case 2:
                            zN2 = q8.n(parcel, i14);
                            break;
                        case 3:
                            zN3 = q8.n(parcel, i14);
                            break;
                        case 4:
                            zN4 = q8.n(parcel, i14);
                            break;
                        case 5:
                            zN5 = q8.n(parcel, i14);
                            break;
                        case 6:
                            zN6 = q8.n(parcel, i14);
                            break;
                        default:
                            q8.y(parcel, i14);
                            break;
                    }
                }
                q8.m(parcel, iZ9);
                return new r7.h(zN, zN2, zN3, zN4, zN5, zN6);
            case 9:
                int iZ10 = q8.z(parcel);
                long jW = -1;
                long jW2 = -1;
                int iU = 1;
                int iU2 = 1;
                while (parcel.dataPosition() < iZ10) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        iU = q8.u(parcel, i15);
                    } else if (c11 == 2) {
                        iU2 = q8.u(parcel, i15);
                    } else if (c11 == 3) {
                        jW = q8.w(parcel, i15);
                    } else if (c11 != 4) {
                        q8.y(parcel, i15);
                    } else {
                        jW2 = q8.w(parcel, i15);
                    }
                }
                q8.m(parcel, iZ10);
                return new r7.j(jW, iU, iU2, jW2);
            case 10:
                int iZ11 = q8.z(parcel);
                long jW3 = Long.MAX_VALUE;
                String strH = null;
                c7.k kVar = null;
                int iU3 = 0;
                boolean zN7 = false;
                while (parcel.dataPosition() < iZ11) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        jW3 = q8.w(parcel, i16);
                    } else if (c12 == 2) {
                        iU3 = q8.u(parcel, i16);
                    } else if (c12 == 3) {
                        zN7 = q8.n(parcel, i16);
                    } else if (c12 == 4) {
                        strH = q8.h(parcel, i16);
                    } else if (c12 != 5) {
                        q8.y(parcel, i16);
                    } else {
                        kVar = (c7.k) q8.g(parcel, i16, c7.k.CREATOR);
                    }
                }
                q8.m(parcel, iZ11);
                return new r7.b(jW3, iU3, zN7, strH, kVar);
            case 11:
                int iZ12 = q8.z(parcel);
                long jW4 = 0;
                r7.j[] jVarArr = null;
                int iU4 = 1000;
                int iU5 = 1;
                int iU6 = 1;
                while (parcel.dataPosition() < iZ12) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iU5 = q8.u(parcel, i17);
                            break;
                        case 2:
                            iU6 = q8.u(parcel, i17);
                            break;
                        case 3:
                            jW4 = q8.w(parcel, i17);
                            break;
                        case 4:
                            iU4 = q8.u(parcel, i17);
                            break;
                        case 5:
                            jVarArr = (r7.j[]) q8.k(parcel, i17, r7.j.CREATOR);
                            break;
                        case 6:
                            q8.n(parcel, i17);
                            break;
                        default:
                            q8.y(parcel, i17);
                            break;
                    }
                }
                q8.m(parcel, iZ12);
                return new LocationAvailability(iU4, iU5, iU6, jW4, jVarArr);
            case 12:
                int iZ13 = q8.z(parcel);
                WorkSource workSource = new WorkSource();
                long jW5 = 3600000;
                long jW6 = 600000;
                long jW7 = 0;
                long jW8 = Long.MAX_VALUE;
                long jW9 = Long.MAX_VALUE;
                long jW10 = -1;
                String strH2 = null;
                c7.k kVar2 = null;
                int iU7 = 102;
                int iU8 = Integer.MAX_VALUE;
                float fR = 0.0f;
                boolean zN8 = false;
                int iU9 = 0;
                int iU10 = 0;
                boolean zN9 = false;
                while (parcel.dataPosition() < iZ13) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iU7 = q8.u(parcel, i18);
                            break;
                        case 2:
                            jW5 = q8.w(parcel, i18);
                            break;
                        case 3:
                            jW6 = q8.w(parcel, i18);
                            break;
                        case 4:
                        default:
                            q8.y(parcel, i18);
                            break;
                        case 5:
                            jW8 = q8.w(parcel, i18);
                            break;
                        case 6:
                            iU8 = q8.u(parcel, i18);
                            break;
                        case 7:
                            fR = q8.r(parcel, i18);
                            break;
                        case '\b':
                            jW7 = q8.w(parcel, i18);
                            break;
                        case '\t':
                            zN8 = q8.n(parcel, i18);
                            break;
                        case '\n':
                            jW9 = q8.w(parcel, i18);
                            break;
                        case 11:
                            jW10 = q8.w(parcel, i18);
                            break;
                        case '\f':
                            iU9 = q8.u(parcel, i18);
                            break;
                        case '\r':
                            iU10 = q8.u(parcel, i18);
                            break;
                        case 14:
                            strH2 = q8.h(parcel, i18);
                            break;
                        case 15:
                            zN9 = q8.n(parcel, i18);
                            break;
                        case 16:
                            workSource = (WorkSource) q8.g(parcel, i18, WorkSource.CREATOR);
                            break;
                        case 17:
                            kVar2 = (c7.k) q8.g(parcel, i18, c7.k.CREATOR);
                            break;
                    }
                }
                q8.m(parcel, iZ13);
                return new LocationRequest(iU7, jW5, jW6, jW7, jW8, jW9, iU8, fR, zN8, jW10, iU9, iU10, strH2, zN9, workSource, kVar2);
            case 13:
                int iZ14 = q8.z(parcel);
                List listL = LocationResult.f4348b;
                while (parcel.dataPosition() < iZ14) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        q8.y(parcel, i19);
                    } else {
                        listL = q8.l(parcel, i19, Location.CREATOR);
                    }
                }
                q8.m(parcel, iZ14);
                return new LocationResult(listL);
            case 14:
                int iZ15 = q8.z(parcel);
                ArrayList arrayListL = null;
                boolean zN10 = false;
                boolean zN11 = false;
                while (parcel.dataPosition() < iZ15) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 1) {
                        arrayListL = q8.l(parcel, i20, LocationRequest.CREATOR);
                    } else if (c13 == 2) {
                        zN10 = q8.n(parcel, i20);
                    } else if (c13 != 3) {
                        q8.y(parcel, i20);
                    } else {
                        zN11 = q8.n(parcel, i20);
                    }
                }
                q8.m(parcel, iZ15);
                return new r7.e(arrayListL, zN10, zN11);
            case 15:
                int iZ16 = q8.z(parcel);
                long jW11 = 0;
                long jW12 = 0;
                boolean zN12 = false;
                while (parcel.dataPosition() < iZ16) {
                    int i21 = parcel.readInt();
                    char c14 = (char) i21;
                    if (c14 == 1) {
                        zN12 = q8.n(parcel, i21);
                    } else if (c14 == 2) {
                        jW12 = q8.w(parcel, i21);
                    } else if (c14 != 3) {
                        q8.y(parcel, i21);
                    } else {
                        jW11 = q8.w(parcel, i21);
                    }
                }
                q8.m(parcel, iZ16);
                return new t5.b(jW11, jW12, zN12);
            case 16:
                int iZ17 = q8.z(parcel);
                e2 e2Var = null;
                byte[] bArrB = null;
                int[] iArrD = null;
                String[] strArrI = null;
                int[] iArrD2 = null;
                byte[][] bArrC = null;
                v7.a[] aVarArr = null;
                boolean zN13 = true;
                while (parcel.dataPosition() < iZ17) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            e2Var = (e2) q8.g(parcel, i22, e2.CREATOR);
                            break;
                        case 3:
                            bArrB = q8.b(parcel, i22);
                            break;
                        case 4:
                            iArrD = q8.d(parcel, i22);
                            break;
                        case 5:
                            strArrI = q8.i(parcel, i22);
                            break;
                        case 6:
                            iArrD2 = q8.d(parcel, i22);
                            break;
                        case 7:
                            bArrC = q8.c(parcel, i22);
                            break;
                        case '\b':
                            zN13 = q8.n(parcel, i22);
                            break;
                        case '\t':
                            aVarArr = (v7.a[]) q8.k(parcel, i22, v7.a.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i22);
                            break;
                    }
                }
                q8.m(parcel, iZ17);
                return new t5.c(e2Var, bArrB, iArrD, strArrI, iArrD2, bArrC, zN13, aVarArr);
            case 17:
                u0.h hVar2 = new u0.h(parcel);
                hVar2.f48247a = parcel.readInt();
                return hVar2;
            case 18:
                int iZ18 = q8.z(parcel);
                LatLng latLng = null;
                float fR2 = 0.0f;
                float fR3 = 0.0f;
                float fR4 = 0.0f;
                while (parcel.dataPosition() < iZ18) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 2) {
                        latLng = (LatLng) q8.g(parcel, i23, LatLng.CREATOR);
                    } else if (c15 == 3) {
                        fR2 = q8.r(parcel, i23);
                    } else if (c15 == 4) {
                        fR3 = q8.r(parcel, i23);
                    } else if (c15 != 5) {
                        q8.y(parcel, i23);
                    } else {
                        fR4 = q8.r(parcel, i23);
                    }
                }
                q8.m(parcel, iZ18);
                return new CameraPosition(latLng, fR2, fR3, fR4);
            case 19:
                int iZ19 = q8.z(parcel);
                LatLng latLng2 = null;
                double dQ = 0.0d;
                float fR5 = 0.0f;
                float fR6 = 0.0f;
                int iU11 = 0;
                int iU12 = 0;
                boolean zN14 = false;
                boolean zN15 = false;
                ArrayList arrayListL2 = null;
                while (parcel.dataPosition() < iZ19) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            latLng2 = (LatLng) q8.g(parcel, i24, LatLng.CREATOR);
                            break;
                        case 3:
                            dQ = q8.q(parcel, i24);
                            break;
                        case 4:
                            fR5 = q8.r(parcel, i24);
                            break;
                        case 5:
                            iU11 = q8.u(parcel, i24);
                            break;
                        case 6:
                            iU12 = q8.u(parcel, i24);
                            break;
                        case 7:
                            fR6 = q8.r(parcel, i24);
                            break;
                        case '\b':
                            zN14 = q8.n(parcel, i24);
                            break;
                        case '\t':
                            zN15 = q8.n(parcel, i24);
                            break;
                        case '\n':
                            arrayListL2 = q8.l(parcel, i24, u7.h.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i24);
                            break;
                    }
                }
                q8.m(parcel, iZ19);
                u7.b bVar = new u7.b();
                bVar.f48430a = latLng2;
                bVar.f48431b = dQ;
                bVar.f48432c = fR5;
                bVar.d = iU11;
                bVar.f48433e = iU12;
                bVar.f48434f = fR6;
                bVar.h = zN14;
                bVar.f48435n = zN15;
                bVar.f48436r = arrayListL2;
                return bVar;
            case 20:
                int iZ20 = q8.z(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < iZ20) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 2) {
                        latLng3 = (LatLng) q8.g(parcel, i25, LatLng.CREATOR);
                    } else if (c16 != 3) {
                        q8.y(parcel, i25);
                    } else {
                        latLng4 = (LatLng) q8.g(parcel, i25, LatLng.CREATOR);
                    }
                }
                q8.m(parcel, iZ20);
                return new LatLngBounds(latLng3, latLng4);
            case 21:
                int iZ21 = q8.z(parcel);
                double dQ2 = 0.0d;
                double dQ3 = 0.0d;
                while (parcel.dataPosition() < iZ21) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 2) {
                        dQ2 = q8.q(parcel, i26);
                    } else if (c17 != 3) {
                        q8.y(parcel, i26);
                    } else {
                        dQ3 = q8.q(parcel, i26);
                    }
                }
                q8.m(parcel, iZ21);
                return new LatLng(dQ2, dQ3);
            case 22:
                int iZ22 = q8.z(parcel);
                String strH3 = null;
                while (parcel.dataPosition() < iZ22) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 2) {
                        q8.y(parcel, i27);
                    } else {
                        strH3 = q8.h(parcel, i27);
                    }
                }
                q8.m(parcel, iZ22);
                return new u7.e(strH3);
            case 23:
                int iZ23 = q8.z(parcel);
                LatLng latLng5 = null;
                String strH4 = null;
                String strH5 = null;
                IBinder iBinderT = null;
                float fR7 = 0.0f;
                float fR8 = 0.0f;
                boolean zN16 = false;
                boolean zN17 = false;
                boolean zN18 = false;
                float fR9 = 0.0f;
                float fR10 = 0.5f;
                float fR11 = 0.0f;
                float fR12 = 1.0f;
                float fR13 = 0.0f;
                while (parcel.dataPosition() < iZ23) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 2:
                            latLng5 = (LatLng) q8.g(parcel, i28, LatLng.CREATOR);
                            break;
                        case 3:
                            strH4 = q8.h(parcel, i28);
                            break;
                        case 4:
                            strH5 = q8.h(parcel, i28);
                            break;
                        case 5:
                            iBinderT = q8.t(parcel, i28);
                            break;
                        case 6:
                            fR7 = q8.r(parcel, i28);
                            break;
                        case 7:
                            fR8 = q8.r(parcel, i28);
                            break;
                        case '\b':
                            zN16 = q8.n(parcel, i28);
                            break;
                        case '\t':
                            zN17 = q8.n(parcel, i28);
                            break;
                        case '\n':
                            zN18 = q8.n(parcel, i28);
                            break;
                        case 11:
                            fR9 = q8.r(parcel, i28);
                            break;
                        case '\f':
                            fR10 = q8.r(parcel, i28);
                            break;
                        case '\r':
                            fR11 = q8.r(parcel, i28);
                            break;
                        case 14:
                            fR12 = q8.r(parcel, i28);
                            break;
                        case 15:
                            fR13 = q8.r(parcel, i28);
                            break;
                        default:
                            q8.y(parcel, i28);
                            break;
                    }
                }
                q8.m(parcel, iZ23);
                u7.g gVar = new u7.g();
                gVar.f48446e = 0.5f;
                gVar.f48447f = 1.0f;
                gVar.f48448n = true;
                gVar.f48449r = false;
                gVar.f48450s = 0.0f;
                gVar.v = 0.5f;
                gVar.f48451w = 0.0f;
                gVar.f48452x = 1.0f;
                gVar.f48443a = latLng5;
                gVar.f48444b = strH4;
                gVar.f48445c = strH5;
                if (iBinderT == null) {
                    gVar.d = null;
                } else {
                    gVar.d = new b0(i6.b.J0(iBinderT));
                }
                gVar.f48446e = fR7;
                gVar.f48447f = fR8;
                gVar.h = zN16;
                gVar.f48448n = zN17;
                gVar.f48449r = zN18;
                gVar.f48450s = fR9;
                gVar.v = fR10;
                gVar.f48451w = fR11;
                gVar.f48452x = fR12;
                gVar.f48453y = fR13;
                return gVar;
            case 24:
                int iZ24 = q8.z(parcel);
                int iU13 = 0;
                Float fS = null;
                while (parcel.dataPosition() < iZ24) {
                    int i29 = parcel.readInt();
                    char c18 = (char) i29;
                    if (c18 == 2) {
                        iU13 = q8.u(parcel, i29);
                    } else if (c18 != 3) {
                        q8.y(parcel, i29);
                    } else {
                        fS = q8.s(parcel, i29);
                    }
                }
                q8.m(parcel, iZ24);
                return new u7.h(iU13, fS);
            case 25:
                int iZ25 = q8.z(parcel);
                PendingIntent pendingIntent3 = null;
                String strH6 = null;
                int iU14 = 0;
                int iU15 = 0;
                while (parcel.dataPosition() < iZ25) {
                    int i30 = parcel.readInt();
                    char c19 = (char) i30;
                    if (c19 == 1) {
                        iU14 = q8.u(parcel, i30);
                    } else if (c19 == 2) {
                        iU15 = q8.u(parcel, i30);
                    } else if (c19 == 3) {
                        pendingIntent3 = (PendingIntent) q8.g(parcel, i30, PendingIntent.CREATOR);
                    } else if (c19 != 4) {
                        q8.y(parcel, i30);
                    } else {
                        strH6 = q8.h(parcel, i30);
                    }
                }
                q8.m(parcel, iZ25);
                return new v5.a(iU14, iU15, pendingIntent3, strH6);
            case 26:
                int iZ26 = q8.z(parcel);
                long jW13 = -1;
                int iU16 = 0;
                String strH7 = null;
                while (parcel.dataPosition() < iZ26) {
                    int i31 = parcel.readInt();
                    char c20 = (char) i31;
                    if (c20 == 1) {
                        strH7 = q8.h(parcel, i31);
                    } else if (c20 == 2) {
                        iU16 = q8.u(parcel, i31);
                    } else if (c20 != 3) {
                        q8.y(parcel, i31);
                    } else {
                        jW13 = q8.w(parcel, i31);
                    }
                }
                q8.m(parcel, iZ26);
                return new v5.c(iU16, strH7, jW13);
            case 27:
                int iZ27 = q8.z(parcel);
                String strH8 = null;
                byte[] bArrB2 = null;
                byte[][] bArrC2 = null;
                byte[][] bArrC3 = null;
                byte[][] bArrC4 = null;
                byte[][] bArrC5 = null;
                int[] iArrD3 = null;
                byte[][] bArrC6 = null;
                while (parcel.dataPosition() < iZ27) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 2:
                            strH8 = q8.h(parcel, i32);
                            break;
                        case 3:
                            bArrB2 = q8.b(parcel, i32);
                            break;
                        case 4:
                            bArrC2 = q8.c(parcel, i32);
                            break;
                        case 5:
                            bArrC3 = q8.c(parcel, i32);
                            break;
                        case 6:
                            bArrC4 = q8.c(parcel, i32);
                            break;
                        case 7:
                            bArrC5 = q8.c(parcel, i32);
                            break;
                        case '\b':
                            iArrD3 = q8.d(parcel, i32);
                            break;
                        case '\t':
                            bArrC6 = q8.c(parcel, i32);
                            break;
                        default:
                            q8.y(parcel, i32);
                            break;
                    }
                }
                q8.m(parcel, iZ27);
                return new v7.a(strH8, bArrB2, bArrC2, bArrC3, bArrC4, bArrC5, iArrD3, bArrC6);
            case 28:
                int iZ28 = q8.z(parcel);
                String[] strArrI2 = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleA2 = null;
                int iU17 = 0;
                int iU18 = 0;
                while (parcel.dataPosition() < iZ28) {
                    int i33 = parcel.readInt();
                    char c21 = (char) i33;
                    if (c21 == 1) {
                        strArrI2 = q8.i(parcel, i33);
                    } else if (c21 == 2) {
                        cursorWindowArr = (CursorWindow[]) q8.k(parcel, i33, CursorWindow.CREATOR);
                    } else if (c21 == 3) {
                        iU18 = q8.u(parcel, i33);
                    } else if (c21 == 4) {
                        bundleA2 = q8.a(parcel, i33);
                    } else if (c21 != 1000) {
                        q8.y(parcel, i33);
                    } else {
                        iU17 = q8.u(parcel, i33);
                    }
                }
                q8.m(parcel, iZ28);
                DataHolder dataHolder = new DataHolder(iU17, strArrI2, cursorWindowArr, iU18, bundleA2);
                dataHolder.f3402c = new Bundle();
                int i34 = 0;
                while (true) {
                    String[] strArr = dataHolder.f3401b;
                    if (i34 >= strArr.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.h = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i35 = 0; i35 < cursorWindowArr2.length; i35++) {
                            dataHolder.h[i35] = numRows;
                            numRows += cursorWindowArr2[i35].getNumRows() - (numRows - cursorWindowArr2[i35].getStartPosition());
                        }
                        dataHolder.f3405n = numRows;
                        return dataHolder;
                    }
                    dataHolder.f3402c.putInt(strArr[i34], i34);
                    i34++;
                }
                break;
            default:
                int iZ29 = q8.z(parcel);
                String strH9 = null;
                String strH10 = null;
                while (parcel.dataPosition() < iZ29) {
                    int i36 = parcel.readInt();
                    char c22 = (char) i36;
                    if (c22 == 1) {
                        strH9 = q8.h(parcel, i36);
                    } else if (c22 != 2) {
                        q8.y(parcel, i36);
                    } else {
                        strH10 = q8.h(parcel, i36);
                    }
                }
                q8.m(parcel, iZ29);
                w7.a aVar = new w7.a();
                aVar.f49270a = strH9;
                aVar.f49271b = strH10;
                return aVar;
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f46851a) {
            case 0:
                return new k[i10];
            case 1:
                return new m[i10];
            case 2:
                return new n[i10];
            case 3:
                return new o[i10];
            case 4:
                return new p[i10];
            case 5:
                return new q[i10];
            case 6:
                return new r[i10];
            case 7:
                return new r7.g[i10];
            case 8:
                return new r7.h[i10];
            case 9:
                return new r7.j[i10];
            case 10:
                return new r7.b[i10];
            case 11:
                return new LocationAvailability[i10];
            case 12:
                return new LocationRequest[i10];
            case 13:
                return new LocationResult[i10];
            case 14:
                return new r7.e[i10];
            case 15:
                return new t5.b[i10];
            case 16:
                return new t5.c[i10];
            case 17:
                return new u0.h[i10];
            case 18:
                return new CameraPosition[i10];
            case 19:
                return new u7.b[i10];
            case 20:
                return new LatLngBounds[i10];
            case 21:
                return new LatLng[i10];
            case 22:
                return new u7.e[i10];
            case 23:
                return new u7.g[i10];
            case 24:
                return new u7.h[i10];
            case 25:
                return new v5.a[i10];
            case 26:
                return new v5.c[i10];
            case 27:
                return new v7.a[i10];
            case 28:
                return new DataHolder[i10];
            default:
                return new w7.a[i10];
        }
    }
}
