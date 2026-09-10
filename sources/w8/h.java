package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(24);
    public String f43862a;
    public String f43863b;
    public f f43864c;
    public g d;
    public g e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f43862a);
        e0.l(parcel, 3, this.f43863b);
        e0.k(parcel, 4, this.f43864c, i10);
        e0.k(parcel, 5, this.d, i10);
        e0.k(parcel, 6, this.e, i10);
        e0.r(parcel, q6);
    }
}
