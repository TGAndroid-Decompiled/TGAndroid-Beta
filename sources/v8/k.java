package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new p7.n(27);
    public int f50713a;
    public String f50714b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.f50713a;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        h0.l(parcel, 3, this.f50714b);
        h0.r(parcel, q6);
    }
}
