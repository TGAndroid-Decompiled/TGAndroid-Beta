package r7;

import android.os.Parcel;
import android.os.Parcelable;
public final class l extends q6.a {
    public static final Parcelable.Creator<l> CREATOR = new q8.i(7);
    public final boolean f54428a;

    public l(boolean z10) {
        this.f54428a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f54428a == ((l) obj).f54428a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f54428a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f54428a ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
