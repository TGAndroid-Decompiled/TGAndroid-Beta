package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new j(2);
    public final boolean f45392a;

    public m(boolean z10) {
        this.f45392a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f45392a == ((m) obj).f45392a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f45392a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f45392a ? 1 : 0);
        c0.r(parcel, q6);
    }
}
