package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final boolean f44282a;

    public l(boolean z10) {
        this.f44282a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f44282a == ((l) obj).f44282a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f44282a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f44282a ? 1 : 0);
        f0.r(parcel, q6);
    }
}
