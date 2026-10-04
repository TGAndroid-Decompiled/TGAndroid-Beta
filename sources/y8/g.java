package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new c(3);
    public final int f50482a;

    public g(int i10) {
        this.f50482a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50482a);
        w7.g0.r(parcel, q6);
    }
}
