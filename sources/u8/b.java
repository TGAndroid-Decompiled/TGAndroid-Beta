package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(2);
    public int f57903a;
    public int f57904b;
    public int f57905c;
    public int d;
    public int f57906e;
    public int f57907f;
    public boolean h;
    public String f57908n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f57903a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f57904b;
        yb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f57905c;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        yb.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f57906e;
        yb.q(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f57907f;
        yb.q(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z10 = this.h;
        yb.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.l(parcel, 9, this.f57908n);
        yb.s(parcel, r10);
    }
}
