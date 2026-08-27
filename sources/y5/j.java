package y5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class j extends z5.a {
    public static final Parcelable.Creator<j> CREATOR = new w7.f(12);

    public final int f49653a;

    public final int f49654b;

    public final int f49655c;
    public final long d;

    public final long f49656e;

    public final String f49657f;
    public final String h;

    public final int f49658n;

    public final int f49659r;

    public j(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f49653a = i10;
        this.f49654b = i11;
        this.f49655c = i12;
        this.d = j10;
        this.f49656e = j11;
        this.f49657f = str;
        this.h = str2;
        this.f49658n = i13;
        this.f49659r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f49653a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f49654b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f49655c);
        r8.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        r8.s(parcel, 5, 8);
        parcel.writeLong(this.f49656e);
        r8.l(parcel, 6, this.f49657f);
        r8.l(parcel, 7, this.h);
        r8.s(parcel, 8, 4);
        parcel.writeInt(this.f49658n);
        r8.s(parcel, 9, 4);
        parcel.writeInt(this.f49659r);
        r8.r(parcel, iQ);
    }
}
