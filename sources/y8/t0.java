package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t0 extends o6.a {
    public static final Parcelable.Creator<t0> CREATOR = new n0(6);
    public final int f50540a;
    public final int f50541b;

    public t0(int i10, int i11) {
        this.f50540a = i10;
        this.f50541b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50540a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50541b);
        w7.g0.r(parcel, q6);
    }
}
