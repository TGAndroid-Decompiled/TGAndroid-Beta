package p7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new j(2);
    public final boolean f40985a;

    public m(boolean z10) {
        this.f40985a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f40985a == ((m) obj).f40985a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f40985a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f40985a ? 1 : 0);
        f0.r(parcel, q6);
    }
}
