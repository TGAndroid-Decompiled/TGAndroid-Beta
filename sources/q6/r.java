package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new q4.x(3);
    public final int f55991a;
    public final String f55992b;
    public final long f55993c;
    public final int d;
    public final boolean f55994e;

    public r(int i7, int i10, long j3, String str, boolean z10) {
        this.f55991a = i7;
        this.f55992b = str;
        this.f55993c = j3;
        this.d = i10;
        this.f55994e = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f55991a);
        bc.l(parcel, 2, this.f55992b);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f55993c);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f55994e ? 1 : 0);
        bc.s(parcel, r10);
    }
}
