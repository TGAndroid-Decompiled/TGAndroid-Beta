package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p7.m(12);
    public int f43759a;
    public String f43760b;
    public String f43761c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f43759a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.f43760b);
        f0.l(parcel, 4, this.f43761c);
        f0.l(parcel, 5, this.d);
        f0.r(parcel, q6);
    }
}
