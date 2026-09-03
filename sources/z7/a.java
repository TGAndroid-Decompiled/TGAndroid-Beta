package z7;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import java.util.Arrays;
import u6.p;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new p(24);
    public String f51122a;
    public String f51123b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(this.f51122a, aVar.f51122a) && m.l(this.f51123b, aVar.f51123b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51122a, this.f51123b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f51122a);
        g5.l(parcel, 2, this.f51123b);
        g5.r(parcel, q10);
    }
}
