package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p7.j(11);
    public int f47164a;
    public int f47165b;
    public int f47166c;
    public int d;
    public int f47167e;
    public int f47168f;
    public boolean h;
    public String f47169n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f47164a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f47165b;
        d0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f47166c;
        d0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        d0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.f47167e;
        d0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f47168f;
        d0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        d0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.l(parcel, 9, this.f47169n);
        d0.r(parcel, q6);
    }
}
