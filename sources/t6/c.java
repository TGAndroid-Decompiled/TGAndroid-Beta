package t6;

import a8.bf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class c implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int z10 = bf.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z11 = false;
        String str2 = null;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            bf.y(parcel, readInt);
                        } else {
                            str = bf.h(parcel, readInt);
                        }
                    } else {
                        str2 = bf.h(parcel, readInt);
                    }
                } else {
                    z11 = bf.n(parcel, readInt);
                }
            } else {
                arrayList = bf.l(parcel, readInt, l6.c.CREATOR);
            }
        }
        bf.m(parcel, z10);
        return new a(arrayList, z11, str2, str);
    }

    @Override
    public final Object[] newArray(int i10) {
        return new a[i10];
    }
}
