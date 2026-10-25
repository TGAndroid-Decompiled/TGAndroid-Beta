package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class l extends p6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final boolean f47003a;

    public l(boolean z10) {
        this.f47003a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f47003a == ((l) obj).f47003a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f47003a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f47003a ? 1 : 0);
        df.r(parcel, q5);
    }
}
