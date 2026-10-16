package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t0 extends o6.a {
    public static final Parcelable.Creator<t0> CREATOR = new n0(6);
    public final int f48666a;
    public final int f48667b;

    public t0(int i10, int i11) {
        this.f48666a = i10;
        this.f48667b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48666a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f48667b);
        w7.f0.r(parcel, q6);
    }
}
