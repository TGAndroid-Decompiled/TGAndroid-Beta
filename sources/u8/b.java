package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(2);
    public int f56404a;
    public int f56405b;
    public int f56406c;
    public int d;
    public int f56407e;
    public int f56408f;
    public boolean h;
    public String f56409n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f56404a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f56405b;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f56406c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f56407e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f56408f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z9 = this.h;
        xb.q(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 9, this.f56409n);
        xb.s(parcel, r10);
    }
}
