package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(24);
    public String f48926a;
    public String f48927b;
    public f f48928c;
    public g d;
    public g f48929e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f48926a);
        g0.l(parcel, 3, this.f48927b);
        g0.k(parcel, 4, this.f48928c, i10);
        g0.k(parcel, 5, this.d, i10);
        g0.k(parcel, 6, this.f48929e, i10);
        g0.r(parcel, q6);
    }
}
