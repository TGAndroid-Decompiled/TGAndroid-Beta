package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class g0 extends o6.a {
    public static final Parcelable.Creator<g0> CREATOR = new c(28);
    public final int f49630a;

    public g0(int i10) {
        this.f49630a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49630a);
        w7.e0.r(parcel, q6);
    }
}
