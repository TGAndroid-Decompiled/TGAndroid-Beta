package v7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import q7.j;
import x5.l;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new j(21);
    public String f48360a;
    public String f48361b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(this.f48360a, aVar.f48360a) && l.l(this.f48361b, aVar.f48361b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48360a, this.f48361b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f48360a);
        p8.l(parcel, 2, this.f48361b);
        p8.r(parcel, q10);
    }
}
