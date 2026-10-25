package y8;

import a8.bf;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
public final class o implements Parcelable.Creator {
    public final int f52400a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f52400a) {
            case 0:
                int z10 = bf.z(parcel);
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
                            str = bf.h(parcel, readInt);
                            break;
                        case 3:
                            str2 = bf.h(parcel, readInt);
                            break;
                        case 4:
                            i10 = bf.u(parcel, readInt);
                            break;
                        case 5:
                            i11 = bf.u(parcel, readInt);
                            break;
                        case 6:
                            z11 = bf.n(parcel, readInt);
                            break;
                        case 7:
                            z12 = bf.n(parcel, readInt);
                            break;
                        case '\b':
                            str3 = bf.h(parcel, readInt);
                            break;
                        case '\t':
                            z13 = bf.n(parcel, readInt);
                            break;
                        case '\n':
                            str4 = bf.h(parcel, readInt);
                            break;
                        case 11:
                            str5 = bf.h(parcel, readInt);
                            break;
                        case '\f':
                            i12 = bf.u(parcel, readInt);
                            break;
                        case '\r':
                            arrayList = bf.j(parcel, readInt);
                            break;
                        default:
                            bf.y(parcel, readInt);
                            break;
                    }
                }
                bf.m(parcel, z10);
                return new ConnectionConfiguration(str, str2, i10, i11, z11, z12, str3, z13, str4, str5, i12, arrayList);
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f52400a) {
            case 0:
                return new ConnectionConfiguration[i10];
            default:
                return new ParcelImpl[i10];
        }
    }
}
