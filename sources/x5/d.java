package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new h(0);
    public final boolean f50793a;

    public d(boolean z10) {
        this.f50793a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f50793a != ((d) obj).f50793a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f50793a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f50793a ? 1 : 0);
        d0.r(parcel, q6);
    }
}
