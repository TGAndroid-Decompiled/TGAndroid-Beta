package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int f56044a;
    public final int f56045b;
    public final int f56046c;
    public final long d;
    public final long f56047e;
    public final String f56048f;
    public final String h;
    public final int f56049n;
    public final int f56050r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.f56044a = i7;
        this.f56045b = i10;
        this.f56046c = i11;
        this.d = j3;
        this.f56047e = j10;
        this.f56048f = str;
        this.h = str2;
        this.f56049n = i12;
        this.f56050r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f56044a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f56045b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f56046c);
        cc.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        cc.q(parcel, 5, 8);
        parcel.writeLong(this.f56047e);
        cc.l(parcel, 6, this.f56048f);
        cc.l(parcel, 7, this.h);
        cc.q(parcel, 8, 4);
        parcel.writeInt(this.f56049n);
        cc.q(parcel, 9, 4);
        parcel.writeInt(this.f56050r);
        cc.s(parcel, r10);
    }
}
