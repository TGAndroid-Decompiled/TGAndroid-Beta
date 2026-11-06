package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int f59884a;
    public String f59885b;
    public double f59886c;
    public String d;
    public long f59887e;
    public int f59888f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f59884a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.l(parcel, 3, this.f59885b);
        double d = this.f59886c;
        wb.q(parcel, 4, 8);
        parcel.writeDouble(d);
        wb.l(parcel, 5, this.d);
        long j3 = this.f59887e;
        wb.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f59888f;
        wb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        wb.s(parcel, r10);
    }
}
