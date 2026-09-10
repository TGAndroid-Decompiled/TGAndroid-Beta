package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f46576a;
    public final String f46577b;

    public v(int i10, String str) {
        this.f46576a = i10;
        this.f46577b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46576a);
        w7.e0.l(parcel, 3, this.f46577b);
        w7.e0.r(parcel, q6);
    }
}
