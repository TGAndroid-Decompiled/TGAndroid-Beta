package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new c(4);
    public final int f54250a;

    public h(int i10) {
        this.f54250a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54250a);
        w7.h0.r(parcel, q6);
    }
}
