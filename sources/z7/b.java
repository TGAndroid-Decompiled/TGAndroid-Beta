package z7;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import java.util.Arrays;
import u6.p;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(25);
    public String f51124a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return m.l(this.f51124a, ((b) obj).f51124a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51124a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f51124a);
        g5.r(parcel, q10);
    }
}
