package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.h0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new s(21);
    public String f52766a;
    public String f52767b;
    public f f52768c;
    public g d;
    public g e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f52766a);
        h0.l(parcel, 3, this.f52767b);
        h0.k(parcel, 4, this.f52768c, i10);
        h0.k(parcel, 5, this.d, i10);
        h0.k(parcel, 6, this.e, i10);
        h0.r(parcel, q6);
    }
}
