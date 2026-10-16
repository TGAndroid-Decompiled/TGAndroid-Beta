package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f48673a;
    public final String f48674b;

    public v(int i10, String str) {
        this.f48673a = i10;
        this.f48674b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48673a);
        w7.f0.l(parcel, 3, this.f48674b);
        w7.f0.r(parcel, q6);
    }
}
