package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class d0 extends o6.a {
    public static final Parcelable.Creator<d0> CREATOR = new c(25);
    public final int f46660a;
    public final String f46661b;

    public d0(int i10, String str) {
        this.f46660a = i10;
        this.f46661b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46660a);
        w7.f0.l(parcel, 3, this.f46661b);
        w7.f0.r(parcel, q6);
    }
}
