package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ag extends o6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int f52459a;
    public final int f52460b;
    public final int f52461c;
    public final int d;
    public final long f52462e;

    public ag(int i10, int i11, int i12, long j3, int i13) {
        this.f52459a = i10;
        this.f52460b = i11;
        this.f52461c = i12;
        this.d = i13;
        this.f52462e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f52459a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f52460b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f52461c);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.g0.s(parcel, 5, 8);
        parcel.writeLong(this.f52462e);
        w7.g0.r(parcel, q6);
    }
}
