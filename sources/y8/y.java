package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class y extends o6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int f54303a;
    public final String f54304b;

    public y(int i10, String str) {
        this.f54303a = i10;
        this.f54304b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54303a);
        w7.h0.l(parcel, 3, this.f54304b);
        w7.h0.r(parcel, q6);
    }
}
