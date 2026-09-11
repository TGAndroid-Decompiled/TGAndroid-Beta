package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new j(2);
    public final boolean f43984a;

    public m(boolean z10) {
        this.f43984a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f43984a == ((m) obj).f43984a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f43984a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f43984a ? 1 : 0);
        e0.r(parcel, q6);
    }
}
