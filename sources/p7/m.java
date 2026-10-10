package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new j(2);
    public final boolean f45550a;

    public m(boolean z10) {
        this.f45550a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f45550a == ((m) obj).f45550a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f45550a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f45550a ? 1 : 0);
        d0.r(parcel, q6);
    }
}
