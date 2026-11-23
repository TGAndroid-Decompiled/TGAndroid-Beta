package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import y8.v;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int f61909a;
    public String f61910b;
    public double f61911c;
    public String d;
    public long f61912e;
    public int f61913f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f61909a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 3, this.f61910b);
        double d = this.f61911c;
        cc.q(parcel, 4, 8);
        parcel.writeDouble(d);
        cc.l(parcel, 5, this.d);
        long j3 = this.f61912e;
        cc.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f61913f;
        cc.q(parcel, 7, 4);
        parcel.writeInt(i11);
        cc.s(parcel, r10);
    }
}
