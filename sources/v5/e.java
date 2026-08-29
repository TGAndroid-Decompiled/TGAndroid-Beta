package v5;

import android.os.Parcel;
import android.os.Parcelable;
public final class e implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        return new g(parcel.readStrongBinder());
    }

    @Override
    public final Object[] newArray(int i10) {
        return new g[i10];
    }
}
