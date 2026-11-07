package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new v(11);
    public String f59911a;
    public d f59912b;
    public f f59913c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59911a);
        xb.k(parcel, 3, this.f59912b, i7);
        xb.k(parcel, 5, this.f59913c, i7);
        xb.s(parcel, r10);
    }
}
