package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class i0 extends c6.a {
    public static final Parcelable.Creator<i0> CREATOR = new r0(9);
    public final boolean f44682a;

    public i0(boolean z4) {
        this.f44682a = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0) || this.f44682a != ((i0) obj).f44682a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f44682a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f44682a ? 1 : 0);
        g5.r(parcel, q10);
    }
}
