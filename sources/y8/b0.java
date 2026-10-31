package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(25);
    public final int f54210a;
    public final String f54211b;

    public b0(int i10, String str) {
        this.f54210a = i10;
        this.f54211b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54210a);
        w7.h0.l(parcel, 3, this.f54211b);
        w7.h0.r(parcel, q6);
    }
}
