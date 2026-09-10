package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c7.u;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import w7.d0;
public final class h implements Parcelable.Creator {
    public final int f44688a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f44688a) {
            case 0:
                int z10 = d0.z(parcel);
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        d0.y(parcel, readInt);
                    } else {
                        z11 = d0.n(parcel, readInt);
                    }
                }
                d0.m(parcel, z10);
                return new d(z11);
            case 1:
                int z12 = d0.z(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                u uVar = null;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            str = d0.h(parcel, readInt2);
                            break;
                        case 2:
                            str2 = d0.h(parcel, readInt2);
                            break;
                        case 3:
                            str3 = d0.h(parcel, readInt2);
                            break;
                        case 4:
                            str4 = d0.h(parcel, readInt2);
                            break;
                        case 5:
                            uri = (Uri) d0.g(parcel, readInt2, Uri.CREATOR);
                            break;
                        case 6:
                            str5 = d0.h(parcel, readInt2);
                            break;
                        case 7:
                            str6 = d0.h(parcel, readInt2);
                            break;
                        case '\b':
                            str7 = d0.h(parcel, readInt2);
                            break;
                        case '\t':
                            uVar = (u) d0.g(parcel, readInt2, u.CREATOR);
                            break;
                        default:
                            d0.y(parcel, readInt2);
                            break;
                    }
                }
                d0.m(parcel, z12);
                return new g(str, str2, str3, str4, uri, str5, str6, str7, uVar);
            case 2:
                int z13 = d0.z(parcel);
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                ArrayList arrayList = null;
                int i10 = 0;
                int i11 = 0;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                int i12 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            str8 = d0.h(parcel, readInt3);
                            break;
                        case 3:
                            str9 = d0.h(parcel, readInt3);
                            break;
                        case 4:
                            i10 = d0.u(parcel, readInt3);
                            break;
                        case 5:
                            i11 = d0.u(parcel, readInt3);
                            break;
                        case 6:
                            z14 = d0.n(parcel, readInt3);
                            break;
                        case 7:
                            z15 = d0.n(parcel, readInt3);
                            break;
                        case '\b':
                            str10 = d0.h(parcel, readInt3);
                            break;
                        case '\t':
                            z16 = d0.n(parcel, readInt3);
                            break;
                        case '\n':
                            str11 = d0.h(parcel, readInt3);
                            break;
                        case 11:
                            str12 = d0.h(parcel, readInt3);
                            break;
                        case '\f':
                            i12 = d0.u(parcel, readInt3);
                            break;
                        case '\r':
                            arrayList = d0.j(parcel, readInt3);
                            break;
                        default:
                            d0.y(parcel, readInt3);
                            break;
                    }
                }
                d0.m(parcel, z13);
                return new ConnectionConfiguration(str8, str9, i10, i11, z14, z15, str10, z16, str11, str12, i12, arrayList);
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f44688a) {
            case 0:
                return new d[i10];
            case 1:
                return new g[i10];
            case 2:
                return new ConnectionConfiguration[i10];
            default:
                return new ParcelImpl[i10];
        }
    }
}
