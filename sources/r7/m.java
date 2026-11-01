package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.List;
import w7.g0;
public final class m implements Parcelable.Creator {
    public final int f46368a;

    public m(int i10) {
        this.f46368a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.f46368a) {
            case 0:
                int z10 = g0.z(parcel);
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                LocationRequest locationRequest = null;
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                long j10 = Long.MAX_VALUE;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 5) {
                            switch (c10) {
                                case '\b':
                                    z11 = g0.n(parcel, readInt);
                                    continue;
                                case '\t':
                                    z12 = g0.n(parcel, readInt);
                                    continue;
                                case '\n':
                                    str = g0.h(parcel, readInt);
                                    continue;
                                case 11:
                                    z13 = g0.n(parcel, readInt);
                                    continue;
                                case '\f':
                                    z14 = g0.n(parcel, readInt);
                                    continue;
                                case '\r':
                                    str2 = g0.h(parcel, readInt);
                                    continue;
                                case 14:
                                    j10 = g0.w(parcel, readInt);
                                    continue;
                                default:
                                    g0.y(parcel, readInt);
                                    continue;
                            }
                        } else {
                            arrayList = g0.l(parcel, readInt, n6.d.CREATOR);
                        }
                    } else {
                        locationRequest = (LocationRequest) g0.g(parcel, readInt, LocationRequest.CREATOR);
                    }
                }
                g0.m(parcel, z10);
                return new l(locationRequest, arrayList, z11, z12, str, z13, z14, str2, j10);
            case 1:
                int z15 = g0.z(parcel);
                p pVar = r.f46374b;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                List list = s.e;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                j jVar = null;
                while (parcel.dataPosition() < z15) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i10 = g0.u(parcel, readInt2);
                            break;
                        case 2:
                            i11 = g0.u(parcel, readInt2);
                            break;
                        case 3:
                            str3 = g0.h(parcel, readInt2);
                            break;
                        case 4:
                            str4 = g0.h(parcel, readInt2);
                            break;
                        case 5:
                            i12 = g0.u(parcel, readInt2);
                            break;
                        case 6:
                            str5 = g0.h(parcel, readInt2);
                            break;
                        case 7:
                            jVar = (j) g0.g(parcel, readInt2, j.CREATOR);
                            break;
                        case '\b':
                            list = g0.l(parcel, readInt2, k6.c.CREATOR);
                            break;
                        default:
                            g0.y(parcel, readInt2);
                            break;
                    }
                }
                g0.m(parcel, z15);
                return new j(i10, i11, str3, str4, str5, i12, list, jVar);
            default:
                int z16 = g0.z(parcel);
                while (parcel.dataPosition() < z16) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        g0.y(parcel, readInt3);
                    } else {
                        status = (Status) g0.g(parcel, readInt3, Status.CREATOR);
                    }
                }
                g0.m(parcel, z16);
                return new t(status);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f46368a) {
            case 0:
                return new l[i10];
            case 1:
                return new j[i10];
            default:
                return new t[i10];
        }
    }
}
