package x5;

import android.os.Parcel;
import android.os.Parcelable;
public final class d implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        return new f(parcel.readStrongBinder());
    }

    @Override
    public final Object[] newArray(int i10) {
        return new f[i10];
    }
}
