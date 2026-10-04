package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f50442a;
    public final String f50443b;

    public a0(int i10, String str) {
        this.f50442a = i10;
        this.f50443b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50442a);
        w7.g0.l(parcel, 3, this.f50443b);
        w7.g0.r(parcel, q6);
    }
}
