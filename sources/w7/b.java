package w7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import y5.l;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new f(0);

    public String f49272a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return l.l(this.f49272a, ((b) obj).f49272a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49272a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f49272a);
        r8.r(parcel, iQ);
    }
}
