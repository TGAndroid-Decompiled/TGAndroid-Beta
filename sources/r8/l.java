package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new p7.j(20);
    public String f41352a;
    public String f41353b;
    public int f41354c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f41352a);
        e0.l(parcel, 3, this.f41353b);
        int i11 = this.f41354c;
        e0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        e0.r(parcel, q6);
    }
}
