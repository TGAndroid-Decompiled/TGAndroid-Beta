package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class n0 extends o6.a {
    public static final Parcelable.Creator<n0> CREATOR = new l0(2);
    public final int f54277a;
    public final String f54278b;

    public n0(int i10, String str) {
        this.f54277a = i10;
        this.f54278b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54277a);
        w7.h0.l(parcel, 3, this.f54278b);
        w7.h0.r(parcel, q6);
    }
}
