package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c7.u;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import w7.b0;
public final class h implements Parcelable.Creator {
    public final int f50915a;

    public h(int i10) {
        this.f50915a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f50915a) {
            case 0:
                int z10 = b0.z(parcel);
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        b0.y(parcel, readInt);
                    } else {
                        z11 = b0.n(parcel, readInt);
                    }
                }
                b0.m(parcel, z10);
                return new d(z11);
            case 1:
                int z12 = b0.z(parcel);
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
                            str = b0.h(parcel, readInt2);
                            break;
                        case 2:
                            str2 = b0.h(parcel, readInt2);
                            break;
                        case 3:
                            str3 = b0.h(parcel, readInt2);
                            break;
                        case 4:
                            str4 = b0.h(parcel, readInt2);
                            break;
                        case 5:
                            uri = (Uri) b0.g(parcel, readInt2, Uri.CREATOR);
                            break;
                        case 6:
                            str5 = b0.h(parcel, readInt2);
                            break;
                        case 7:
                            str6 = b0.h(parcel, readInt2);
                            break;
                        case '\b':
                            str7 = b0.h(parcel, readInt2);
                            break;
                        case '\t':
                            uVar = (u) b0.g(parcel, readInt2, u.CREATOR);
                            break;
                        default:
                            b0.y(parcel, readInt2);
                            break;
                    }
                }
                b0.m(parcel, z12);
                return new g(str, str2, str3, str4, uri, str5, str6, str7, uVar);
            case 2:
                int z13 = b0.z(parcel);
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
                            str8 = b0.h(parcel, readInt3);
                            break;
                        case 3:
                            str9 = b0.h(parcel, readInt3);
                            break;
                        case 4:
                            i10 = b0.u(parcel, readInt3);
                            break;
                        case 5:
                            i11 = b0.u(parcel, readInt3);
                            break;
                        case 6:
                            z14 = b0.n(parcel, readInt3);
                            break;
                        case 7:
                            z15 = b0.n(parcel, readInt3);
                            break;
                        case '\b':
                            str10 = b0.h(parcel, readInt3);
                            break;
                        case '\t':
                            z16 = b0.n(parcel, readInt3);
                            break;
                        case '\n':
                            str11 = b0.h(parcel, readInt3);
                            break;
                        case 11:
                            str12 = b0.h(parcel, readInt3);
                            break;
                        case '\f':
                            i12 = b0.u(parcel, readInt3);
                            break;
                        case '\r':
                            arrayList = b0.j(parcel, readInt3);
                            break;
                        default:
                            b0.y(parcel, readInt3);
                            break;
                    }
                }
                b0.m(parcel, z13);
                return new ConnectionConfiguration(str8, str9, i10, i11, z14, z15, str10, z16, str11, str12, i12, arrayList);
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f50915a) {
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
