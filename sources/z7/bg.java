package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class bg extends o6.a {
    public static final Parcelable.Creator<bg> CREATOR = new dg(0);
    public final int f53723a;
    public final int f53724b;
    public final int f53725c;
    public final int d;
    public final long f53726e;

    public bg(int i10, int i11, int i12, long j3, int i13) {
        this.f53723a = i10;
        this.f53724b = i11;
        this.f53725c = i12;
        this.d = i13;
        this.f53726e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f53723a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f53724b);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f53725c);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.d0.s(parcel, 5, 8);
        parcel.writeLong(this.f53726e);
        w7.d0.r(parcel, q6);
    }
}
