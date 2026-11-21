package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int f55962a;
    public final int f55963b;
    public final int f55964c;
    public final long d;
    public final long f55965e;
    public final String f55966f;
    public final String h;
    public final int f55967n;
    public final int f55968r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.f55962a = i7;
        this.f55963b = i10;
        this.f55964c = i11;
        this.d = j3;
        this.f55965e = j10;
        this.f55966f = str;
        this.h = str2;
        this.f55967n = i12;
        this.f55968r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f55962a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f55963b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f55964c);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        bc.q(parcel, 5, 8);
        parcel.writeLong(this.f55965e);
        bc.l(parcel, 6, this.f55966f);
        bc.l(parcel, 7, this.h);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.f55967n);
        bc.q(parcel, 9, 4);
        parcel.writeInt(this.f55968r);
        bc.s(parcel, r10);
    }
}
