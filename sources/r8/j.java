package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.n(15);
    public String f46413a;
    public String f46414b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f46413a);
        h0.l(parcel, 3, this.f46414b);
        h0.r(parcel, q6);
    }
}
