package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new q4.x(7);
    public final int f55942a;
    public final boolean f55943b;
    public final boolean f55944c;
    public final int d;
    public final int f55945e;

    public o(int i7, int i10, int i11, boolean z10, boolean z11) {
        this.f55942a = i7;
        this.f55943b = z10;
        this.f55944c = z11;
        this.d = i10;
        this.f55945e = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f55942a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f55943b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f55944c ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f55945e);
        bc.s(parcel, r10);
    }
}
