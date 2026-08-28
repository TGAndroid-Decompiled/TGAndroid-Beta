package v7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import q7.j;
import x5.l;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new j(22);
    public String f48362a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return l.l(this.f48362a, ((b) obj).f48362a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48362a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f48362a);
        p8.r(parcel, q10);
    }
}
