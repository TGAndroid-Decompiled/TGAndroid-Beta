package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(24);
    public String f48394a;
    public String f48395b;
    public f f48396c;
    public g d;
    public g f48397e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f48394a);
        e0.l(parcel, 3, this.f48395b);
        e0.k(parcel, 4, this.f48396c, i10);
        e0.k(parcel, 5, this.d, i10);
        e0.k(parcel, 6, this.f48397e, i10);
        e0.r(parcel, q6);
    }
}
