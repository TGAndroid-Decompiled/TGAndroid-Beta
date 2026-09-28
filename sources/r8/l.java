package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new p7.j(20);
    public String f42420a;
    public String f42421b;
    public int f42422c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f42420a);
        f0.l(parcel, 3, this.f42421b);
        int i11 = this.f42422c;
        f0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f0.r(parcel, q6);
    }
}
