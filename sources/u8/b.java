package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(2);
    public int f58510a;
    public int f58511b;
    public int f58512c;
    public int d;
    public int f58513e;
    public int f58514f;
    public boolean h;
    public String f58515n;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f58510a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f58511b;
        bc.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f58512c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f58513e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f58514f;
        bc.q(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z10 = this.h;
        bc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 9, this.f58515n);
        bc.s(parcel, r10);
    }
}
