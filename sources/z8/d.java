package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int f61779a;
    public String f61780b;
    public double f61781c;
    public String d;
    public long f61782e;
    public int f61783f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f61779a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f61780b);
        double d = this.f61781c;
        bc.q(parcel, 4, 8);
        parcel.writeDouble(d);
        bc.l(parcel, 5, this.d);
        long j3 = this.f61782e;
        bc.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f61783f;
        bc.q(parcel, 7, 4);
        parcel.writeInt(i11);
        bc.s(parcel, r10);
    }
}
