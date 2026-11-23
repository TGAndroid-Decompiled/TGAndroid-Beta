package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new x(22);
    public final boolean f57147a;

    public l(boolean z10) {
        this.f57147a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f57147a == ((l) obj).f57147a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f57147a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f57147a ? 1 : 0);
        bc.s(parcel, r10);
    }
}
