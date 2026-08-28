package v7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import q7.j;
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new j(23);

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof c)) {
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
