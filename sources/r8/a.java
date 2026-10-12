package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new p7.m(7);
    public int f43975a;
    public String[] f43976b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f43975a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.m(parcel, 3, this.f43976b);
        g0.r(parcel, q6);
    }
}
