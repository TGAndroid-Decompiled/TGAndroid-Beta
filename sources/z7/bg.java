package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class bg extends o6.a {
    public static final Parcelable.Creator<bg> CREATOR = new dg(0);
    public final int f50747a;
    public final int f50748b;
    public final int f50749c;
    public final int d;
    public final long e;

    public bg(int i10, int i11, int i12, long j10, int i13) {
        this.f50747a = i10;
        this.f50748b = i11;
        this.f50749c = i12;
        this.d = i13;
        this.e = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f50747a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50748b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f50749c);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.f0.r(parcel, q6);
    }
}
