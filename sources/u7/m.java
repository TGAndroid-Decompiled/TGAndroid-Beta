package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.vb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.List;
public final class m implements Parcelable.Creator {
    public final int f56266a;

    public m(int i7) {
        this.f56266a = i7;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.f56266a) {
            case 0:
                int z9 = vb.z(parcel);
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                LocationRequest locationRequest = null;
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                long j3 = Long.MAX_VALUE;
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 5) {
                            switch (c10) {
                                case '\b':
                                    z10 = vb.n(parcel, readInt);
                                    continue;
                                case '\t':
                                    z11 = vb.n(parcel, readInt);
                                    continue;
                                case '\n':
                                    str = vb.h(parcel, readInt);
                                    continue;
                                case 11:
                                    z12 = vb.n(parcel, readInt);
                                    continue;
                                case '\f':
                                    z13 = vb.n(parcel, readInt);
                                    continue;
                                case '\r':
                                    str2 = vb.h(parcel, readInt);
                                    continue;
                                case 14:
                                    j3 = vb.w(parcel, readInt);
                                    continue;
                                default:
                                    vb.y(parcel, readInt);
                                    continue;
                            }
                        } else {
                            arrayList = vb.l(parcel, readInt, q6.e.CREATOR);
                        }
                    } else {
                        locationRequest = (LocationRequest) vb.g(parcel, readInt, LocationRequest.CREATOR);
                    }
                }
                vb.m(parcel, z9);
                return new l(locationRequest, arrayList, z10, z11, str, z12, z13, str2, j3);
            case 1:
                int z14 = vb.z(parcel);
                p pVar = r.f56273b;
                int i7 = 0;
                int i10 = 0;
                int i11 = 0;
                List list = s.f56274e;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                j jVar = null;
                while (parcel.dataPosition() < z14) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i7 = vb.u(parcel, readInt2);
                            break;
                        case 2:
                            i10 = vb.u(parcel, readInt2);
                            break;
                        case 3:
                            str3 = vb.h(parcel, readInt2);
                            break;
                        case 4:
                            str4 = vb.h(parcel, readInt2);
                            break;
                        case 5:
                            i11 = vb.u(parcel, readInt2);
                            break;
                        case 6:
                            str5 = vb.h(parcel, readInt2);
                            break;
                        case 7:
                            jVar = (j) vb.g(parcel, readInt2, j.CREATOR);
                            break;
                        case '\b':
                            list = vb.l(parcel, readInt2, n6.c.CREATOR);
                            break;
                        default:
                            vb.y(parcel, readInt2);
                            break;
                    }
                }
                vb.m(parcel, z14);
                return new j(i7, i10, str3, str4, str5, i11, list, jVar);
            default:
                int z15 = vb.z(parcel);
                while (parcel.dataPosition() < z15) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        vb.y(parcel, readInt3);
                    } else {
                        status = (Status) vb.g(parcel, readInt3, Status.CREATOR);
                    }
                }
                vb.m(parcel, z15);
                return new t(status);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f56266a) {
            case 0:
                return new l[i7];
            case 1:
                return new j[i7];
            default:
                return new t[i7];
        }
    }
}
