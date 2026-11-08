package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(12);
    public String f60012a;
    public String f60013b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f60012a);
        xb.l(parcel, 3, this.f60013b);
        xb.s(parcel, r10);
    }
}
