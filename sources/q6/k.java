package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int f53899a;
    public final int f53900b;
    public final int f53901c;
    public final long d;
    public final long f53902e;
    public final String f53903f;
    public final String h;
    public final int f53904n;
    public final int f53905r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.f53899a = i7;
        this.f53900b = i10;
        this.f53901c = i11;
        this.d = j3;
        this.f53902e = j10;
        this.f53903f = str;
        this.h = str2;
        this.f53904n = i12;
        this.f53905r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53899a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f53900b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f53901c);
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        xb.q(parcel, 5, 8);
        parcel.writeLong(this.f53902e);
        xb.l(parcel, 6, this.f53903f);
        xb.l(parcel, 7, this.h);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.f53904n);
        xb.q(parcel, 9, 4);
        parcel.writeInt(this.f53905r);
        xb.s(parcel, r10);
    }
}
