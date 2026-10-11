package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class bg extends o6.a {
    public static final Parcelable.Creator<bg> CREATOR = new dg(0);
    public final int f53689a;
    public final int f53690b;
    public final int f53691c;
    public final int d;
    public final long f53692e;

    public bg(int i10, int i11, int i12, long j3, int i13) {
        this.f53689a = i10;
        this.f53690b = i11;
        this.f53691c = i12;
        this.d = i13;
        this.f53692e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f53689a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f53690b);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f53691c);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.d0.s(parcel, 5, 8);
        parcel.writeLong(this.f53692e);
        w7.d0.r(parcel, q6);
    }
}
