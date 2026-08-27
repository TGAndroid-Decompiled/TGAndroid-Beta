package w7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class c extends z5.a {
    public static final Parcelable.Creator<c> CREATOR = new f(1);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c);
    }

    public final int hashCode() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        r8.r(parcel, r8.q(parcel, 20293));
    }
}
