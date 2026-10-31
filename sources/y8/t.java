package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(17);
    public final int f54280a;
    public final String f54281b;

    public t(int i10, String str) {
        this.f54280a = i10;
        this.f54281b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54280a);
        w7.h0.l(parcel, 3, this.f54281b);
        w7.h0.r(parcel, q6);
    }
}
