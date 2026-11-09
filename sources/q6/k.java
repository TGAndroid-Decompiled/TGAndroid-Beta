package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int f53911a;
    public final int f53912b;
    public final int f53913c;
    public final long d;
    public final long f53914e;
    public final String f53915f;
    public final String h;
    public final int f53916n;
    public final int f53917r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.f53911a = i7;
        this.f53912b = i10;
        this.f53913c = i11;
        this.d = j3;
        this.f53914e = j10;
        this.f53915f = str;
        this.h = str2;
        this.f53916n = i12;
        this.f53917r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53911a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f53912b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f53913c);
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        xb.q(parcel, 5, 8);
        parcel.writeLong(this.f53914e);
        xb.l(parcel, 6, this.f53915f);
        xb.l(parcel, 7, this.h);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.f53916n);
        xb.q(parcel, 9, 4);
        parcel.writeInt(this.f53917r);
        xb.s(parcel, r10);
    }
}
