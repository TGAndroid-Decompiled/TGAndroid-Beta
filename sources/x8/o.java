package x8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import w7.e0;
public final class o implements Parcelable.Creator {
    public final int f50103a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f50103a) {
            case 0:
                int z10 = e0.z(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                ArrayList arrayList = null;
                int i10 = 0;
                int i11 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                int i12 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str = e0.h(parcel, readInt);
                            break;
                        case 3:
                            str2 = e0.h(parcel, readInt);
                            break;
                        case 4:
                            i10 = e0.u(parcel, readInt);
                            break;
                        case 5:
                            i11 = e0.u(parcel, readInt);
                            break;
                        case 6:
                            z11 = e0.n(parcel, readInt);
                            break;
                        case 7:
                            z12 = e0.n(parcel, readInt);
                            break;
                        case '\b':
                            str3 = e0.h(parcel, readInt);
                            break;
                        case '\t':
                            z13 = e0.n(parcel, readInt);
                            break;
                        case '\n':
                            str4 = e0.h(parcel, readInt);
                            break;
                        case 11:
                            str5 = e0.h(parcel, readInt);
                            break;
                        case '\f':
                            i12 = e0.u(parcel, readInt);
                            break;
                        case '\r':
                            arrayList = e0.j(parcel, readInt);
                            break;
                        default:
                            e0.y(parcel, readInt);
                            break;
                    }
                }
                e0.m(parcel, z10);
                return new ConnectionConfiguration(str, str2, i10, i11, z11, z12, str3, z13, str4, str5, i12, arrayList);
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f50103a) {
            case 0:
                return new ConnectionConfiguration[i10];
            default:
                return new ParcelImpl[i10];
        }
    }
}
