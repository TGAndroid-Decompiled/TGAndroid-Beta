package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int f53781a;
    public final int f53782b;
    public final int f53783c;
    public final long d;
    public final long f53784e;
    public final String f53785f;
    public final String h;
    public final int f53786n;
    public final int f53787r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.f53781a = i7;
        this.f53782b = i10;
        this.f53783c = i11;
        this.d = j3;
        this.f53784e = j10;
        this.f53785f = str;
        this.h = str2;
        this.f53786n = i12;
        this.f53787r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f53781a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f53782b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f53783c);
        wb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        wb.q(parcel, 5, 8);
        parcel.writeLong(this.f53784e);
        wb.l(parcel, 6, this.f53785f);
        wb.l(parcel, 7, this.h);
        wb.q(parcel, 8, 4);
        parcel.writeInt(this.f53786n);
        wb.q(parcel, 9, 4);
        parcel.writeInt(this.f53787r);
        wb.s(parcel, r10);
    }
}
