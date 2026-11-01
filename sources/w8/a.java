package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new s(14);
    public String f52766a;
    public String f52767b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f52766a);
        h0.l(parcel, 3, this.f52767b);
        h0.r(parcel, q6);
    }
}
