package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int f59909a;
    public String f59910b;
    public double f59911c;
    public String d;
    public long f59912e;
    public int f59913f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f59909a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.l(parcel, 3, this.f59910b);
        double d = this.f59911c;
        wb.q(parcel, 4, 8);
        parcel.writeDouble(d);
        wb.l(parcel, 5, this.d);
        long j3 = this.f59912e;
        wb.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f59913f;
        wb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        wb.s(parcel, r10);
    }
}
