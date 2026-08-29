package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
import w5.k;
import z5.l;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new k(4);
    public String f50100a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return l.l(this.f50100a, ((b) obj).f50100a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50100a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 1, this.f50100a);
        o.r(parcel, q6);
    }
}
