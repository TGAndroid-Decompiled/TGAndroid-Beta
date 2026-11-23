package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int f55931a;
    public final int f55932b;
    public final int f55933c;
    public final long d;
    public final long f55934e;
    public final String f55935f;
    public final String h;
    public final int f55936n;
    public final int f55937r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.f55931a = i7;
        this.f55932b = i10;
        this.f55933c = i11;
        this.d = j3;
        this.f55934e = j10;
        this.f55935f = str;
        this.h = str2;
        this.f55936n = i12;
        this.f55937r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f55931a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f55932b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f55933c);
        cc.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        cc.q(parcel, 5, 8);
        parcel.writeLong(this.f55934e);
        cc.l(parcel, 6, this.f55935f);
        cc.l(parcel, 7, this.h);
        cc.q(parcel, 8, 4);
        parcel.writeInt(this.f55936n);
        cc.q(parcel, 9, 4);
        parcel.writeInt(this.f55937r);
        cc.s(parcel, r10);
    }
}
