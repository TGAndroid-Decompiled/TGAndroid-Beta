package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ag extends o6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int f48447a;
    public final int f48448b;
    public final int f48449c;
    public final int d;
    public final long e;

    public ag(int i10, int i11, int i12, long j3, int i13) {
        this.f48447a = i10;
        this.f48448b = i11;
        this.f48449c = i12;
        this.d = i13;
        this.e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f48447a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48448b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f48449c);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.f0.r(parcel, q6);
    }
}
