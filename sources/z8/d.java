package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int f61825a;
    public String f61826b;
    public double f61827c;
    public String d;
    public long f61828e;
    public int f61829f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f61825a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f61826b);
        double d = this.f61827c;
        bc.q(parcel, 4, 8);
        parcel.writeDouble(d);
        bc.l(parcel, 5, this.d);
        long j3 = this.f61828e;
        bc.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f61829f;
        bc.q(parcel, 7, 4);
        parcel.writeInt(i11);
        bc.s(parcel, r10);
    }
}
