package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String f61836a;
    public String f61837b;
    public f f61838c;
    public g d;
    public g f61839e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61836a);
        bc.l(parcel, 3, this.f61837b);
        bc.k(parcel, 4, this.f61838c, i7);
        bc.k(parcel, 5, this.d, i7);
        bc.k(parcel, 6, this.f61839e, i7);
        bc.s(parcel, r10);
    }
}
