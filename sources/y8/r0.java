package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class r0 extends o6.a {
    public static final Parcelable.Creator<r0> CREATOR = new n0(4);
    public final int f50523a;

    public r0(int i10) {
        this.f50523a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50523a);
        w7.g0.r(parcel, q6);
    }
}
