package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q4.x;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new x(22);
    public final boolean f56528a;

    public l(boolean z10) {
        this.f56528a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f56528a == ((l) obj).f56528a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f56528a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f56528a ? 1 : 0);
        yb.s(parcel, r10);
    }
}
