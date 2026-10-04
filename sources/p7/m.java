package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new j(2);
    public final boolean f44326a;

    public m(boolean z10) {
        this.f44326a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f44326a == ((m) obj).f44326a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f44326a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f44326a ? 1 : 0);
        g0.r(parcel, q6);
    }
}
