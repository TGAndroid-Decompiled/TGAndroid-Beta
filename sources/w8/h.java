package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.h0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new s(21);
    public String f52784a;
    public String f52785b;
    public f f52786c;
    public g d;
    public g e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f52784a);
        h0.l(parcel, 3, this.f52785b);
        h0.k(parcel, 4, this.f52786c, i10);
        h0.k(parcel, 5, this.d, i10);
        h0.k(parcel, 6, this.e, i10);
        h0.r(parcel, q6);
    }
}
