package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(24);
    public String f48919a;
    public String f48920b;
    public f f48921c;
    public g d;
    public g f48922e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f48919a);
        g0.l(parcel, 3, this.f48920b);
        g0.k(parcel, 4, this.f48921c, i10);
        g0.k(parcel, 5, this.d, i10);
        g0.k(parcel, 6, this.f48922e, i10);
        g0.r(parcel, q6);
    }
}
