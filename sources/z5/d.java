package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import y8.i;
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(6);
    public final boolean f59775a;

    public d(boolean z10) {
        this.f59775a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f59775a != ((d) obj).f59775a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f59775a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f59775a ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
