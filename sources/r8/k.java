package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new p7.j(21);
    public String f42432a;
    public String f42433b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f42432a);
        f0.l(parcel, 3, this.f42433b);
        f0.r(parcel, q6);
    }
}
