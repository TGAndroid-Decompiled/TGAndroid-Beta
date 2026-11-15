package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int f55347a;
    public final int f55348b;
    public final int f55349c;
    public final long d;
    public final long f55350e;
    public final String f55351f;
    public final String h;
    public final int f55352n;
    public final int f55353r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.f55347a = i7;
        this.f55348b = i10;
        this.f55349c = i11;
        this.d = j3;
        this.f55350e = j10;
        this.f55351f = str;
        this.h = str2;
        this.f55352n = i12;
        this.f55353r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f55347a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f55348b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f55349c);
        yb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        yb.q(parcel, 5, 8);
        parcel.writeLong(this.f55350e);
        yb.l(parcel, 6, this.f55351f);
        yb.l(parcel, 7, this.h);
        yb.q(parcel, 8, 4);
        parcel.writeInt(this.f55352n);
        yb.q(parcel, 9, 4);
        parcel.writeInt(this.f55353r);
        yb.s(parcel, r10);
    }
}
