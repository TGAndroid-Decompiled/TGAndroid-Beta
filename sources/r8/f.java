package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p7.j(14);
    public int f42405a;
    public String f42406b;
    public String f42407c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f42405a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f42406b);
        f0.l(parcel, 4, this.f42407c);
        f0.l(parcel, 5, this.d);
        f0.r(parcel, q6);
    }
}
