package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(9);
    public final int f50520a;
    public final int f50521b;

    public n(int i10, int i11) {
        this.f50520a = i10;
        this.f50521b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50520a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f50521b);
        w7.g0.r(parcel, q6);
    }
}
