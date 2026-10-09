package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f51833a;
    public final String f51834b;

    public v(int i10, String str) {
        this.f51833a = i10;
        this.f51834b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51833a);
        w7.d0.l(parcel, 3, this.f51834b);
        w7.d0.r(parcel, q6);
    }
}
