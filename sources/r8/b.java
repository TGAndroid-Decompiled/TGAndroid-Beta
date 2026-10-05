package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p7.j(11);
    public int f45888a;
    public int f45889b;
    public int f45890c;
    public int d;
    public int f45891e;
    public int f45892f;
    public boolean h;
    public String f45893n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f45888a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f45889b;
        g0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f45890c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.f45891e;
        g0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f45892f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        g0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.l(parcel, 9, this.f45893n);
        g0.r(parcel, q6);
    }
}
