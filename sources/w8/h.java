package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new s(22);
    public String f47505a;
    public String f47506b;
    public f f47507c;
    public g d;
    public g e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f47505a);
        g0.l(parcel, 3, this.f47506b);
        g0.k(parcel, 4, this.f47507c, i10);
        g0.k(parcel, 5, this.d, i10);
        g0.k(parcel, 6, this.e, i10);
        g0.r(parcel, q6);
    }
}
