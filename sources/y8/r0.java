package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class r0 extends o6.a {
    public static final Parcelable.Creator<r0> CREATOR = new n0(4);
    public final int f49641a;

    public r0(int i10) {
        this.f49641a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49641a);
        w7.e0.r(parcel, q6);
    }
}
