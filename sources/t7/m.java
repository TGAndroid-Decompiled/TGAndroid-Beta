package t7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.List;
public final class m implements Parcelable.Creator {
    public final int f54970a;

    public m(int i3) {
        this.f54970a = i3;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.f54970a) {
            case 0:
                int z10 = g6.e.z(parcel);
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
                    char c2 = (char) readInt;
                    if (c2 != 1) {
                        if (c2 != 5) {
                            switch (c2) {
                                case '\b':
                                    z11 = g6.e.n(parcel, readInt);
                                    continue;
                                case '\t':
                                    z12 = g6.e.n(parcel, readInt);
                                    continue;
                                case '\n':
                                    str = g6.e.h(parcel, readInt);
                                    continue;
                                case 11:
                                    z13 = g6.e.n(parcel, readInt);
                                    continue;
                                case '\f':
                                    z14 = g6.e.n(parcel, readInt);
                                    continue;
                                case '\r':
                                    str2 = g6.e.h(parcel, readInt);
                                    continue;
                                case 14:
                                    j10 = g6.e.w(parcel, readInt);
                                    continue;
                                default:
                                    g6.e.y(parcel, readInt);
                                    continue;
                            }
                        } else {
                            arrayList = g6.e.l(parcel, readInt, p6.e.CREATOR);
                        }
                    } else {
                        locationRequest = (LocationRequest) g6.e.g(parcel, readInt, LocationRequest.CREATOR);
                    }
                }
                g6.e.m(parcel, z10);
                return new l(locationRequest, arrayList, z11, z12, str, z13, z14, str2, j10);
            case 1:
                int z15 = g6.e.z(parcel);
                p pVar = r.f54977b;
                int i3 = 0;
                int i10 = 0;
                int i11 = 0;
                List list = s.f54978e;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                j jVar = null;
                while (parcel.dataPosition() < z15) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i3 = g6.e.u(parcel, readInt2);
                            break;
                        case 2:
                            i10 = g6.e.u(parcel, readInt2);
                            break;
                        case 3:
                            str3 = g6.e.h(parcel, readInt2);
                            break;
                        case 4:
                            str4 = g6.e.h(parcel, readInt2);
                            break;
                        case 5:
                            i11 = g6.e.u(parcel, readInt2);
                            break;
                        case 6:
                            str5 = g6.e.h(parcel, readInt2);
                            break;
                        case 7:
                            jVar = (j) g6.e.g(parcel, readInt2, j.CREATOR);
                            break;
                        case '\b':
                            list = g6.e.l(parcel, readInt2, m6.c.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt2);
                            break;
                    }
                }
                g6.e.m(parcel, z15);
                return new j(i3, i10, str3, str4, str5, i11, list, jVar);
            default:
                int z16 = g6.e.z(parcel);
                while (parcel.dataPosition() < z16) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        g6.e.y(parcel, readInt3);
                    } else {
                        status = (Status) g6.e.g(parcel, readInt3, Status.CREATOR);
                    }
                }
                g6.e.m(parcel, z16);
                return new t(status);
        }
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f54970a) {
            case 0:
                return new l[i3];
            case 1:
                return new j[i3];
            default:
                return new t[i3];
        }
    }
}
