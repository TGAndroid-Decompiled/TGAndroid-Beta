package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m8.i(29);
    public final boolean f44874a;

    public l(boolean z10) {
        this.f44874a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f44874a == ((l) obj).f44874a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f44874a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f44874a ? 1 : 0);
        h0.r(parcel, q6);
    }
}
