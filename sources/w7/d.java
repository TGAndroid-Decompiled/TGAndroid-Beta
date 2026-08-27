package w7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new f(2);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d);
    }

    public final int hashCode() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        r8.r(parcel, r8.q(parcel, 20293));
    }
}
