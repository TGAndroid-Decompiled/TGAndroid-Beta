package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t0 extends o6.a {
    public static final Parcelable.Creator<t0> CREATOR = new n0(6);
    public final int f51949a;
    public final int f51950b;

    public t0(int i10, int i11) {
        this.f51949a = i10;
        this.f51950b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51949a);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f51950b);
        w7.d0.r(parcel, q6);
    }
}
