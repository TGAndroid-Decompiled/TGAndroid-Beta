package x5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class j extends y5.a {
    public static final Parcelable.Creator<j> CREATOR = new w7.i(4);
    public final int f48936a;
    public final int f48937b;
    public final int f48938c;
    public final long d;
    public final long f48939e;
    public final String f48940f;
    public final String h;
    public final int f48941n;
    public final int f48942r;

    public j(int i9, int i10, int i11, long j10, long j11, String str, String str2, int i12, int i13) {
        this.f48936a = i9;
        this.f48937b = i10;
        this.f48938c = i11;
        this.d = j10;
        this.f48939e = j11;
        this.f48940f = str;
        this.h = str2;
        this.f48941n = i12;
        this.f48942r = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f48936a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f48937b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f48938c);
        p8.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        p8.s(parcel, 5, 8);
        parcel.writeLong(this.f48939e);
        p8.l(parcel, 6, this.f48940f);
        p8.l(parcel, 7, this.h);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.f48941n);
        p8.s(parcel, 9, 4);
        parcel.writeInt(this.f48942r);
        p8.r(parcel, q10);
    }
}
