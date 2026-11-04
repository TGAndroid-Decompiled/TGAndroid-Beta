package p6;

import android.os.Parcel;
import android.os.Parcelable;
public final class k extends q6.a {
    public static final Parcelable.Creator<k> CREATOR = new n8.g(19);
    public final int f53275a;
    public final int f53276b;
    public final int f53277c;
    public final long d;
    public final long f53278e;
    public final String f53279f;
    public final String h;
    public final int f53280n;
    public final int f53281r;

    public k(int i3, int i10, int i11, long j10, long j11, String str, String str2, int i12, int i13) {
        this.f53275a = i3;
        this.f53276b = i10;
        this.f53277c = i11;
        this.d = j10;
        this.f53278e = j11;
        this.f53279f = str;
        this.h = str2;
        this.f53280n = i12;
        this.f53281r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f53275a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f53276b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f53277c);
        j8.a.r(parcel, 4, 8);
        parcel.writeLong(this.d);
        j8.a.r(parcel, 5, 8);
        parcel.writeLong(this.f53278e);
        j8.a.m(parcel, 6, this.f53279f);
        j8.a.m(parcel, 7, this.h);
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(this.f53280n);
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(this.f53281r);
        j8.a.t(parcel, s6);
    }
}
