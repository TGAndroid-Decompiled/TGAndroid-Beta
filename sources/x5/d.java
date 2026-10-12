package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.c0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new h(0);
    public final boolean f50908a;

    public d(boolean z10) {
        this.f50908a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f50908a != ((d) obj).f50908a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f50908a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f50908a ? 1 : 0);
        c0.r(parcel, q6);
    }
}
