package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.c0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(24);
    public String f50435a;
    public String f50436b;
    public f f50437c;
    public g d;
    public g f50438e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f50435a);
        c0.l(parcel, 3, this.f50436b);
        c0.k(parcel, 4, this.f50437c, i10);
        c0.k(parcel, 5, this.d, i10);
        c0.k(parcel, 6, this.f50438e, i10);
        c0.r(parcel, q6);
    }
}
