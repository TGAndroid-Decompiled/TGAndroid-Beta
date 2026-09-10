package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new h(0);
    public final boolean f44675a;

    public d(boolean z10) {
        this.f44675a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f44675a != ((d) obj).f44675a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f44675a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f44675a ? 1 : 0);
        e0.r(parcel, q6);
    }
}
