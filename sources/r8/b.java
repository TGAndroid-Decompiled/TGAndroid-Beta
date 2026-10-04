package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p7.j(11);
    public int f45874a;
    public int f45875b;
    public int f45876c;
    public int d;
    public int f45877e;
    public int f45878f;
    public boolean h;
    public String f45879n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f45874a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f45875b;
        g0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f45876c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.f45877e;
        g0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f45878f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        g0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.l(parcel, 9, this.f45879n);
        g0.r(parcel, q6);
    }
}
