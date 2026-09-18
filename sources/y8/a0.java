package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f46361a;
    public final String f46362b;

    public a0(int i10, String str) {
        this.f46361a = i10;
        this.f46362b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46361a);
        w7.e0.l(parcel, 3, this.f46362b);
        w7.e0.r(parcel, q6);
    }
}
