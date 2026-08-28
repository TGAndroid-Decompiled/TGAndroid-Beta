package v7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import q7.j;
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new j(24);

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        p8.r(parcel, p8.q(parcel, 20293));
    }
}
