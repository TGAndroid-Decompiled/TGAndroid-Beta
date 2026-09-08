package r7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.List;
import w7.d0;
public final class m implements Parcelable.Creator {
    public final int f44982a;

    public m(int i10) {
        this.f44982a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.f44982a) {
            case 0:
                int z10 = d0.z(parcel);
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                PendingIntent pendingIntent = null;
                String str = null;
                String str2 = null;
                int i10 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i10 = d0.u(parcel, readInt);
                            break;
                        case 2:
                            iBinder = d0.t(parcel, readInt);
                            break;
                        case 3:
                            iBinder2 = d0.t(parcel, readInt);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) d0.g(parcel, readInt, PendingIntent.CREATOR);
                            break;
                        case 5:
                            str = d0.h(parcel, readInt);
                            break;
                        case 6:
                            str2 = d0.h(parcel, readInt);
                            break;
                        default:
                            d0.y(parcel, readInt);
                            break;
                    }
                }
                d0.m(parcel, z10);
                return new l(i10, iBinder, iBinder2, pendingIntent, str, str2);
            case 1:
                int z11 = d0.z(parcel);
                LocationRequest locationRequest = null;
                ArrayList arrayList = null;
                String str3 = null;
                String str4 = null;
                long j3 = Long.MAX_VALUE;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 != 1) {
                        if (c10 != 5) {
                            switch (c10) {
                                case '\b':
                                    z12 = d0.n(parcel, readInt2);
                                    continue;
                                case '\t':
                                    z13 = d0.n(parcel, readInt2);
                                    continue;
                                case '\n':
                                    str3 = d0.h(parcel, readInt2);
                                    continue;
                                case 11:
                                    z14 = d0.n(parcel, readInt2);
                                    continue;
                                case '\f':
                                    z15 = d0.n(parcel, readInt2);
                                    continue;
                                case '\r':
                                    str4 = d0.h(parcel, readInt2);
                                    continue;
                                case 14:
                                    j3 = d0.w(parcel, readInt2);
                                    continue;
                                default:
                                    d0.y(parcel, readInt2);
                                    continue;
                            }
                        } else {
                            arrayList = d0.l(parcel, readInt2, n6.d.CREATOR);
                        }
                    } else {
                        locationRequest = (LocationRequest) d0.g(parcel, readInt2, LocationRequest.CREATOR);
                    }
                }
                d0.m(parcel, z11);
                return new n(locationRequest, arrayList, z12, z13, str3, z14, z15, str4, j3);
            case 2:
                int z16 = d0.z(parcel);
                n nVar = null;
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinder5 = null;
                String str5 = null;
                int i11 = 1;
                while (parcel.dataPosition() < z16) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i11 = d0.u(parcel, readInt3);
                            break;
                        case 2:
                            nVar = (n) d0.g(parcel, readInt3, n.CREATOR);
                            break;
                        case 3:
                            iBinder3 = d0.t(parcel, readInt3);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) d0.g(parcel, readInt3, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinder4 = d0.t(parcel, readInt3);
                            break;
                        case 6:
                            iBinder5 = d0.t(parcel, readInt3);
                            break;
                        case 7:
                        default:
                            d0.y(parcel, readInt3);
                            break;
                        case '\b':
                            str5 = d0.h(parcel, readInt3);
                            break;
                    }
                }
                d0.m(parcel, z16);
                return new o(i11, nVar, iBinder3, iBinder4, pendingIntent2, iBinder5, str5);
            case 3:
                int z17 = d0.z(parcel);
                r rVar = t.f44995b;
                List list = u.f44996e;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                j jVar = null;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i12 = d0.u(parcel, readInt4);
                            break;
                        case 2:
                            i13 = d0.u(parcel, readInt4);
                            break;
                        case 3:
                            str6 = d0.h(parcel, readInt4);
                            break;
                        case 4:
                            str7 = d0.h(parcel, readInt4);
                            break;
                        case 5:
                            i14 = d0.u(parcel, readInt4);
                            break;
                        case 6:
                            str8 = d0.h(parcel, readInt4);
                            break;
                        case 7:
                            jVar = (j) d0.g(parcel, readInt4, j.CREATOR);
                            break;
                        case '\b':
                            list = d0.l(parcel, readInt4, k6.c.CREATOR);
                            break;
                        default:
                            d0.y(parcel, readInt4);
                            break;
                    }
                }
                d0.m(parcel, z17);
                return new j(i12, i13, str6, str7, str8, i14, list, jVar);
            default:
                int z18 = d0.z(parcel);
                while (parcel.dataPosition() < z18) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        d0.y(parcel, readInt5);
                    } else {
                        status = (Status) d0.g(parcel, readInt5, Status.CREATOR);
                    }
                }
                d0.m(parcel, z18);
                return new v(status);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f44982a) {
            case 0:
                return new l[i10];
            case 1:
                return new n[i10];
            case 2:
                return new o[i10];
            case 3:
                return new j[i10];
            default:
                return new v[i10];
        }
    }
}
