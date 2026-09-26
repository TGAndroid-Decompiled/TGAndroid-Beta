package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p7.j(11);
    public int f42381a;
    public int f42382b;
    public int f42383c;
    public int d;
    public int e;
    public int f42384f;
    public boolean h;
    public String f42385n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f42381a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f42382b;
        f0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f42383c;
        f0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        f0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.e;
        f0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f42384f;
        f0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        f0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.l(parcel, 9, this.f42385n);
        f0.r(parcel, q6);
    }
}
