package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v8.s;
import w7.h0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(27);
    public final boolean f53090a;

    public d(boolean z10) {
        this.f53090a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f53090a != ((d) obj).f53090a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f53090a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f53090a ? 1 : 0);
        h0.r(parcel, q6);
    }
}
