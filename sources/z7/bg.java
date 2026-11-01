package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class bg extends o6.a {
    public static final Parcelable.Creator<bg> CREATOR = new dg(0);
    public final int f54676a;
    public final int f54677b;
    public final int f54678c;
    public final int d;
    public final long e;

    public bg(int i10, int i11, int i12, long j10, int i13) {
        this.f54676a = i10;
        this.f54677b = i11;
        this.f54678c = i12;
        this.d = i13;
        this.e = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f54676a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54677b);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f54678c);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.h0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.h0.r(parcel, q6);
    }
}
