package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.d0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(24);
    public String f50206a;
    public String f50207b;
    public f f50208c;
    public g d;
    public g f50209e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f50206a);
        d0.l(parcel, 3, this.f50207b);
        d0.k(parcel, 4, this.f50208c, i10);
        d0.k(parcel, 5, this.d, i10);
        d0.k(parcel, 6, this.f50209e, i10);
        d0.r(parcel, q6);
    }
}
