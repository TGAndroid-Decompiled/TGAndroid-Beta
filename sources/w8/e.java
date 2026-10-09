package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(21);
    public String f50200a;
    public String f50201b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f50200a);
        d0.l(parcel, 3, this.f50201b);
        d0.r(parcel, q6);
    }
}
