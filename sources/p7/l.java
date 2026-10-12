package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final boolean f43171a;

    public l(boolean z10) {
        this.f43171a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f43171a == ((l) obj).f43171a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f43171a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f43171a ? 1 : 0);
        g0.r(parcel, q6);
    }
}
