package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class d0 extends o6.a {
    public static final Parcelable.Creator<d0> CREATOR = new c(25);
    public final int f48606a;
    public final String f48607b;

    public d0(int i10, String str) {
        this.f48606a = i10;
        this.f48607b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f48606a);
        w7.g0.l(parcel, 3, this.f48607b);
        w7.g0.r(parcel, q6);
    }
}
