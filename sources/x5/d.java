package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v8.s;
import w7.f0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(28);
    public final boolean f49314a;

    public d(boolean z10) {
        this.f49314a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f49314a != ((d) obj).f49314a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49314a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f49314a ? 1 : 0);
        f0.r(parcel, q6);
    }
}
