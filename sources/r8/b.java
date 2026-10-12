package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p7.j(11);
    public int f47254a;
    public int f47255b;
    public int f47256c;
    public int d;
    public int f47257e;
    public int f47258f;
    public boolean h;
    public String f47259n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        int i11 = this.f47254a;
        c0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f47255b;
        c0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f47256c;
        c0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        c0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.f47257e;
        c0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f47258f;
        c0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        c0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c0.l(parcel, 9, this.f47259n);
        c0.r(parcel, q6);
    }
}
