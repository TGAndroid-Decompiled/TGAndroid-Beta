package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.List;
public final class m implements Parcelable.Creator {
    public final int f56290a;

    public m(int i7) {
        this.f56290a = i7;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.f56290a) {
            case 0:
                int z9 = wb.z(parcel);
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
                                    z10 = wb.n(parcel, readInt);
                                    continue;
                                case '\t':
                                    z11 = wb.n(parcel, readInt);
                                    continue;
                                case '\n':
                                    str = wb.h(parcel, readInt);
                                    continue;
                                case 11:
                                    z12 = wb.n(parcel, readInt);
                                    continue;
                                case '\f':
                                    z13 = wb.n(parcel, readInt);
                                    continue;
                                case '\r':
                                    str2 = wb.h(parcel, readInt);
                                    continue;
                                case 14:
                                    j3 = wb.w(parcel, readInt);
                                    continue;
                                default:
                                    wb.y(parcel, readInt);
                                    continue;
                            }
                        } else {
                            arrayList = wb.l(parcel, readInt, q6.e.CREATOR);
                        }
                    } else {
                        locationRequest = (LocationRequest) wb.g(parcel, readInt, LocationRequest.CREATOR);
                    }
                }
                wb.m(parcel, z9);
                return new l(locationRequest, arrayList, z10, z11, str, z12, z13, str2, j3);
            case 1:
                int z14 = wb.z(parcel);
                p pVar = r.f56297b;
                int i7 = 0;
                int i10 = 0;
                int i11 = 0;
                List list = s.f56298e;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                j jVar = null;
                while (parcel.dataPosition() < z14) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i7 = wb.u(parcel, readInt2);
                            break;
                        case 2:
                            i10 = wb.u(parcel, readInt2);
                            break;
                        case 3:
                            str3 = wb.h(parcel, readInt2);
                            break;
                        case 4:
                            str4 = wb.h(parcel, readInt2);
                            break;
                        case 5:
                            i11 = wb.u(parcel, readInt2);
                            break;
                        case 6:
                            str5 = wb.h(parcel, readInt2);
                            break;
                        case 7:
                            jVar = (j) wb.g(parcel, readInt2, j.CREATOR);
                            break;
                        case '\b':
                            list = wb.l(parcel, readInt2, n6.c.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt2);
                            break;
                    }
                }
                wb.m(parcel, z14);
                return new j(i7, i10, str3, str4, str5, i11, list, jVar);
            default:
                int z15 = wb.z(parcel);
                while (parcel.dataPosition() < z15) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        wb.y(parcel, readInt3);
                    } else {
                        status = (Status) wb.g(parcel, readInt3, Status.CREATOR);
                    }
                }
                wb.m(parcel, z15);
                return new t(status);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f56290a) {
            case 0:
                return new l[i7];
            case 1:
                return new j[i7];
            default:
                return new t[i7];
        }
    }
}
