package s6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;
public final class c implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int z10 = d0.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            d0.y(parcel, readInt);
                        } else {
                            str2 = d0.h(parcel, readInt);
                        }
                    } else {
                        str = d0.h(parcel, readInt);
                    }
                } else {
                    z11 = d0.n(parcel, readInt);
                }
            } else {
                arrayList = d0.l(parcel, readInt, k6.c.CREATOR);
            }
        }
        d0.m(parcel, z10);
        return new a(arrayList, z11, str, str2);
    }

    @Override
    public final Object[] newArray(int i10) {
        return new a[i10];
    }
}
