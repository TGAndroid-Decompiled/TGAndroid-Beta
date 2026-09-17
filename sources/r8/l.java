package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new p7.j(20);
    public String f45017a;
    public String f45018b;
    public int f45019c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f45017a);
        e0.l(parcel, 3, this.f45018b);
        int i11 = this.f45019c;
        e0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        e0.r(parcel, q6);
    }
}
