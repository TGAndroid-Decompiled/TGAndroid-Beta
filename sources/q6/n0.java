package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class n0 extends c6.a {
    public static final Parcelable.Creator<n0> CREATOR = new l4.j(22);
    public final boolean f44730a;

    public n0(boolean z4) {
        this.f44730a = Boolean.valueOf(z4).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0) || this.f44730a != ((n0) obj).f44730a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f44730a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f44730a ? 1 : 0);
        g5.r(parcel, q10);
    }
}
