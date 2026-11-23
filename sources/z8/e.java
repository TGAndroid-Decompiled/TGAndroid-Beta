package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(12);
    public String f61830a;
    public String f61831b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61830a);
        bc.l(parcel, 3, this.f61831b);
        bc.s(parcel, r10);
    }
}
