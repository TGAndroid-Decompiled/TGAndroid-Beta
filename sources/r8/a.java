package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new p7.j(9);
    public int f47252a;
    public String[] f47253b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        int i11 = this.f47252a;
        c0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        c0.m(parcel, 3, this.f47253b);
        c0.r(parcel, q6);
    }
}
