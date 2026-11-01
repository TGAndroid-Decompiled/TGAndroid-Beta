package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int f54324a;
    public final String f54325b;

    public y(int i10, String str) {
        this.f54324a = i10;
        this.f54325b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54324a);
        w7.h0.l(parcel, 3, this.f54325b);
        w7.h0.r(parcel, q6);
    }
}
