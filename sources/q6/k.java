package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int f53910a;
    public final int f53911b;
    public final int f53912c;
    public final long d;
    public final long f53913e;
    public final String f53914f;
    public final String h;
    public final int f53915n;
    public final int f53916r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.f53910a = i7;
        this.f53911b = i10;
        this.f53912c = i11;
        this.d = j3;
        this.f53913e = j10;
        this.f53914f = str;
        this.h = str2;
        this.f53915n = i12;
        this.f53916r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53910a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f53911b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f53912c);
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        xb.q(parcel, 5, 8);
        parcel.writeLong(this.f53913e);
        xb.l(parcel, 6, this.f53914f);
        xb.l(parcel, 7, this.h);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.f53915n);
        xb.q(parcel, 9, 4);
        parcel.writeInt(this.f53916r);
        xb.s(parcel, r10);
    }
}
