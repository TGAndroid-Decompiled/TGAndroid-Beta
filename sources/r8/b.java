package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p7.j(11);
    public int f45001a;
    public int f45002b;
    public int f45003c;
    public int d;
    public int f45004e;
    public int f45005f;
    public boolean h;
    public String f45006n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f45001a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f45002b;
        e0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f45003c;
        e0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.f45004e;
        e0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f45005f;
        e0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        e0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.l(parcel, 9, this.f45006n);
        e0.r(parcel, q6);
    }
}
