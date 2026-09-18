package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(9);
    public final int f46420a;
    public final int f46421b;

    public n(int i10, int i11) {
        this.f46420a = i10;
        this.f46421b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46420a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46421b);
        w7.e0.r(parcel, q6);
    }
}
