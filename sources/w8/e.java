package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(21);
    public String f48913a;
    public String f48914b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f48913a);
        g0.l(parcel, 3, this.f48914b);
        g0.r(parcel, q6);
    }
}
