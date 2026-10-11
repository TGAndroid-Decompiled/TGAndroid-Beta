package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f51859a;
    public final String f51860b;

    public a0(int i10, String str) {
        this.f51859a = i10;
        this.f51860b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51859a);
        w7.d0.l(parcel, 3, this.f51860b);
        w7.d0.r(parcel, q6);
    }
}
