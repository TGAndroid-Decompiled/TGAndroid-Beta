package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import w5.k;
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new k(6);

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
        o.r(parcel, o.q(parcel, 20293));
    }
}
