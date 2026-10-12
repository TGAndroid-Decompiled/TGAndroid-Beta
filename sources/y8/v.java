package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f48674a;
    public final String f48675b;

    public v(int i10, String str) {
        this.f48674a = i10;
        this.f48675b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f48674a);
        w7.g0.l(parcel, 3, this.f48675b);
        w7.g0.r(parcel, q6);
    }
}
