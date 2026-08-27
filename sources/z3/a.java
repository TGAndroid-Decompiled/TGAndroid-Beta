package z3;

import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        return new c(parcel);
    }

    @Override
    public final Object[] newArray(int i10) {
        return new c[i10];
    }
}
