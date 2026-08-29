package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
import w5.k;
import z5.l;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new k(3);
    public String f50098a;
    public String f50099b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(this.f50098a, aVar.f50098a) && l.l(this.f50099b, aVar.f50099b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50098a, this.f50099b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 1, this.f50098a);
        o.l(parcel, 2, this.f50099b);
        o.r(parcel, q6);
    }
}
