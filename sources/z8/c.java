package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new v(11);
    public String f60012a;
    public d f60013b;
    public f f60014c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f60012a);
        xb.k(parcel, 3, this.f60013b, i7);
        xb.k(parcel, 5, this.f60014c, i7);
        xb.s(parcel, r10);
    }
}
