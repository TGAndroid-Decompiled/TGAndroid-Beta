package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String f61790a;
    public String f61791b;
    public f f61792c;
    public g d;
    public g f61793e;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61790a);
        bc.l(parcel, 3, this.f61791b);
        bc.k(parcel, 4, this.f61792c, i7);
        bc.k(parcel, 5, this.d, i7);
        bc.k(parcel, 6, this.f61793e, i7);
        bc.s(parcel, r10);
    }
}
