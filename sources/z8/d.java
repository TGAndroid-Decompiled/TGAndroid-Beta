package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import y8.v;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int f61215a;
    public String f61216b;
    public double f61217c;
    public String d;
    public long f61218e;
    public int f61219f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f61215a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 3, this.f61216b);
        double d = this.f61217c;
        yb.q(parcel, 4, 8);
        parcel.writeDouble(d);
        yb.l(parcel, 5, this.d);
        long j3 = this.f61218e;
        yb.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f61219f;
        yb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        yb.s(parcel, r10);
    }
}
