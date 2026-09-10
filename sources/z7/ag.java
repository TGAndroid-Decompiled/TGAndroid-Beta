package z7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ag extends o6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int f47290a;
    public final int f47291b;
    public final int f47292c;
    public final int d;
    public final long e;

    public ag(int i10, int i11, int i12, long j3, int i13) {
        this.f47290a = i10;
        this.f47291b = i11;
        this.f47292c = i12;
        this.d = i13;
        this.e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f47290a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f47291b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f47292c);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.e0.r(parcel, q6);
    }
}
