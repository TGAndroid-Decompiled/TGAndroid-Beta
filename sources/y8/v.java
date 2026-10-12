package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f52067a;
    public final String f52068b;

    public v(int i10, String str) {
        this.f52067a = i10;
        this.f52068b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52067a);
        w7.c0.l(parcel, 3, this.f52068b);
        w7.c0.r(parcel, q6);
    }
}
