package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ag extends o6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int f49343a;
    public final int f49344b;
    public final int f49345c;
    public final int d;
    public final long e;

    public ag(int i10, int i11, int i12, long j10, int i13) {
        this.f49343a = i10;
        this.f49344b = i11;
        this.f49345c = i12;
        this.d = i13;
        this.e = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f49343a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f49344b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f49345c);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.g0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.g0.r(parcel, q6);
    }
}
