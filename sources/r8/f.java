package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p7.j(14);
    public int f47065a;
    public String f47066b;
    public String f47067c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f47065a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.l(parcel, 3, this.f47066b);
        d0.l(parcel, 4, this.f47067c);
        d0.l(parcel, 5, this.d);
        d0.r(parcel, q6);
    }
}
