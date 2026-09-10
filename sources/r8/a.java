package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new p7.j(9);
    public int f41312a;
    public String[] f41313b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f41312a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.m(parcel, 3, this.f41313b);
        e0.r(parcel, q6);
    }
}
