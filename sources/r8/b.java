package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p7.j(11);
    public int f47130a;
    public int f47131b;
    public int f47132c;
    public int d;
    public int f47133e;
    public int f47134f;
    public boolean h;
    public String f47135n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.f47130a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f47131b;
        d0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f47132c;
        d0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        d0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.f47133e;
        d0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f47134f;
        d0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        d0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.l(parcel, 9, this.f47135n);
        d0.r(parcel, q6);
    }
}
