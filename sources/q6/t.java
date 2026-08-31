package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class t extends c6.a {
    public static final Parcelable.Creator<t> CREATOR = new l4.j(23);
    public final boolean f44723a;

    public t(boolean z4) {
        this.f44723a = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || this.f44723a != ((t) obj).f44723a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f44723a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f44723a ? 1 : 0);
        g5.r(parcel, q10);
    }
}
