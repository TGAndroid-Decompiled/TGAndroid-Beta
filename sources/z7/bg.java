package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class bg extends o6.a {
    public static final Parcelable.Creator<bg> CREATOR = new dg(0);
    public final int f53834a;
    public final int f53835b;
    public final int f53836c;
    public final int d;
    public final long f53837e;

    public bg(int i10, int i11, int i12, long j3, int i13) {
        this.f53834a = i10;
        this.f53835b = i11;
        this.f53836c = i12;
        this.d = i13;
        this.f53837e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f53834a);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f53835b);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f53836c);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.c0.s(parcel, 5, 8);
        parcel.writeLong(this.f53837e);
        w7.c0.r(parcel, q6);
    }
}
