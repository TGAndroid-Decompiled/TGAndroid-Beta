package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p7.j(11);
    public int f41314a;
    public int f41315b;
    public int f41316c;
    public int d;
    public int e;
    public int f41317f;
    public boolean h;
    public String f41318n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.f41314a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f41315b;
        e0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f41316c;
        e0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.e;
        e0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f41317f;
        e0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        e0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.l(parcel, 9, this.f41318n);
        e0.r(parcel, q6);
    }
}
