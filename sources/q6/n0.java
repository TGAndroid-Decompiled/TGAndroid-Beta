package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class n0 extends c6.a {
    public static final Parcelable.Creator<n0> CREATOR = new l4.j(22);
    public final boolean f42936a;

    public n0(boolean z4) {
        this.f42936a = Boolean.valueOf(z4).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0) || this.f42936a != ((n0) obj).f42936a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f42936a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f42936a ? 1 : 0);
        f5.r(parcel, q10);
    }
}
