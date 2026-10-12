package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p7.m(9);
    public int f43977a;
    public int f43978b;
    public int f43979c;
    public int d;
    public int e;
    public int f43980f;
    public boolean h;
    public String f43981n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f43977a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f43978b;
        g0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f43979c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.e;
        g0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f43980f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        g0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.l(parcel, 9, this.f43981n);
        g0.r(parcel, q6);
    }
}
