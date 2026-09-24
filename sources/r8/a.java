package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new p7.j(9);
    public int f42366a;
    public String[] f42367b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f42366a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.m(parcel, 3, this.f42367b);
        f0.r(parcel, q6);
    }
}
