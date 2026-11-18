package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(2);
    public int f58469a;
    public int f58470b;
    public int f58471c;
    public int d;
    public int f58472e;
    public int f58473f;
    public boolean h;
    public String f58474n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f58469a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f58470b;
        bc.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f58471c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f58472e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f58473f;
        bc.q(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z10 = this.h;
        bc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 9, this.f58474n);
        bc.s(parcel, r10);
    }
}
