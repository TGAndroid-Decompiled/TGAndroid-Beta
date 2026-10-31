package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.h0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(18);
    public String f52760a;
    public String f52761b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f52760a);
        h0.l(parcel, 3, this.f52761b);
        h0.r(parcel, q6);
    }
}
