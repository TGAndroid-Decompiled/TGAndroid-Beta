package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new h(0);
    public final boolean f49395a;

    public d(boolean z10) {
        this.f49395a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f49395a != ((d) obj).f49395a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49395a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f49395a ? 1 : 0);
        g0.r(parcel, q6);
    }
}
