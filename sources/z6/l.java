package z6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class l extends y5.a {
    public static final Parcelable.Creator<l> CREATOR = new w7.i(24);
    public final boolean f50335a;

    public l(boolean z10) {
        this.f50335a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f50335a == ((l) obj).f50335a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f50335a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f50335a ? 1 : 0);
        p8.r(parcel, q10);
    }
}
