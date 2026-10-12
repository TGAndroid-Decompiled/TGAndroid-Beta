package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(19);
    public String f47499a;
    public String f47500b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f47499a);
        g0.l(parcel, 3, this.f47500b);
        g0.r(parcel, q6);
    }
}
