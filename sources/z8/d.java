package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import y8.v;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int f61790a;
    public String f61791b;
    public double f61792c;
    public String d;
    public long f61793e;
    public int f61794f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f61790a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 3, this.f61791b);
        double d = this.f61792c;
        cc.q(parcel, 4, 8);
        parcel.writeDouble(d);
        cc.l(parcel, 5, this.d);
        long j3 = this.f61793e;
        cc.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f61794f;
        cc.q(parcel, 7, 4);
        parcel.writeInt(i11);
        cc.s(parcel, r10);
    }
}
