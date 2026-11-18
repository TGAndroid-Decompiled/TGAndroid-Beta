package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String f61791a;
    public String f61792b;
    public f f61793c;
    public g d;
    public g f61794e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61791a);
        bc.l(parcel, 3, this.f61792b);
        bc.k(parcel, 4, this.f61793c, i7);
        bc.k(parcel, 5, this.d, i7);
        bc.k(parcel, 6, this.f61794e, i7);
        bc.s(parcel, r10);
    }
}
