package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int f53806a;
    public final int f53807b;
    public final int f53808c;
    public final long d;
    public final long f53809e;
    public final String f53810f;
    public final String h;
    public final int f53811n;
    public final int f53812r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.f53806a = i7;
        this.f53807b = i10;
        this.f53808c = i11;
        this.d = j3;
        this.f53809e = j10;
        this.f53810f = str;
        this.h = str2;
        this.f53811n = i12;
        this.f53812r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f53806a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f53807b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f53808c);
        wb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        wb.q(parcel, 5, 8);
        parcel.writeLong(this.f53809e);
        wb.l(parcel, 6, this.f53810f);
        wb.l(parcel, 7, this.h);
        wb.q(parcel, 8, 4);
        parcel.writeInt(this.f53811n);
        wb.q(parcel, 9, 4);
        parcel.writeInt(this.f53812r);
        wb.s(parcel, r10);
    }
}
