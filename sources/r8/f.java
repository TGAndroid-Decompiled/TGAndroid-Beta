package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p7.j(14);
    public int f47067a;
    public String f47068b;
    public String f47069c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f47067a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.l(parcel, 3, this.f47068b);
        d0.l(parcel, 4, this.f47069c);
        d0.l(parcel, 5, this.d);
        d0.r(parcel, q6);
    }
}
