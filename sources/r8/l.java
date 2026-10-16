package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new p7.m(18);
    public String f43774a;
    public String f43775b;
    public int f43776c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f43774a);
        f0.l(parcel, 3, this.f43775b);
        int i11 = this.f43776c;
        f0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f0.r(parcel, q6);
    }
}
