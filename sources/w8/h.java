package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.f0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(24);
    public String f45157a;
    public String f45158b;
    public f f45159c;
    public g d;
    public g e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f45157a);
        f0.l(parcel, 3, this.f45158b);
        f0.k(parcel, 4, this.f45159c, i10);
        f0.k(parcel, 5, this.d, i10);
        f0.k(parcel, 6, this.e, i10);
        f0.r(parcel, q6);
    }
}
