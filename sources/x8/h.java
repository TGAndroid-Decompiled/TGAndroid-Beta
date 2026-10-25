package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new s(22);
    public String f51698a;
    public String f51699b;
    public f f51700c;
    public g d;
    public g e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51698a);
        df.l(parcel, 3, this.f51699b);
        df.k(parcel, 4, this.f51700c, i10);
        df.k(parcel, 5, this.d, i10);
        df.k(parcel, 6, this.e, i10);
        df.r(parcel, q5);
    }
}
