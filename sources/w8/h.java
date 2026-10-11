package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.d0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(24);
    public String f50295a;
    public String f50296b;
    public f f50297c;
    public g d;
    public g f50298e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f50295a);
        d0.l(parcel, 3, this.f50296b);
        d0.k(parcel, 4, this.f50297c, i10);
        d0.k(parcel, 5, this.d, i10);
        d0.k(parcel, 6, this.f50298e, i10);
        d0.r(parcel, q6);
    }
}
