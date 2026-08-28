package w7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new i(0);
    public final int f48779a;
    public final boolean f48780b;

    public h(int i9, boolean z10) {
        this.f48779a = i9;
        this.f48780b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f48779a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f48780b ? 1 : 0);
        p8.r(parcel, q10);
    }
}
