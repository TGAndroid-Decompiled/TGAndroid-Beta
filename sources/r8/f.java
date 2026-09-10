package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p7.j(14);
    public int f41337a;
    public String f41338b;
    public String f41339c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f41337a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.f41338b);
        e0.l(parcel, 4, this.f41339c);
        e0.l(parcel, 5, this.d);
        e0.r(parcel, q6);
    }
}
