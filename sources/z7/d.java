package z7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import u6.p;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new p(27);

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
    public final void writeToParcel(Parcel parcel, int i10) {
        f5.r(parcel, f5.q(parcel, 20293));
    }
}
