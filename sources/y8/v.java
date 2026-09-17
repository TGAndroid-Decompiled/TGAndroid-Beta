package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f49687a;
    public final String f49688b;

    public v(int i10, String str) {
        this.f49687a = i10;
        this.f49688b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49687a);
        w7.e0.l(parcel, 3, this.f49688b);
        w7.e0.r(parcel, q6);
    }
}
