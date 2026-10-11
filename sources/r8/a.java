package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new p7.j(9);
    public int f47128a;
    public String[] f47129b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f47128a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.m(parcel, 3, this.f47129b);
        d0.r(parcel, q6);
    }
}
