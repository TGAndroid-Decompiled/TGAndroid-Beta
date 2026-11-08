package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int f53898a;
    public final int f53899b;
    public final int f53900c;
    public final long d;
    public final long f53901e;
    public final String f53902f;
    public final String h;
    public final int f53903n;
    public final int f53904r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.f53898a = i7;
        this.f53899b = i10;
        this.f53900c = i11;
        this.d = j3;
        this.f53901e = j10;
        this.f53902f = str;
        this.h = str2;
        this.f53903n = i12;
        this.f53904r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53898a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f53899b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f53900c);
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        xb.q(parcel, 5, 8);
        parcel.writeLong(this.f53901e);
        xb.l(parcel, 6, this.f53902f);
        xb.l(parcel, 7, this.h);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.f53903n);
        xb.q(parcel, 9, 4);
        parcel.writeInt(this.f53904r);
        xb.s(parcel, r10);
    }
}
