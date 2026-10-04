package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class d0 extends o6.a {
    public static final Parcelable.Creator<d0> CREATOR = new c(25);
    public final int f50477a;
    public final String f50478b;

    public d0(int i10, String str) {
        this.f50477a = i10;
        this.f50478b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50477a);
        w7.g0.l(parcel, 3, this.f50478b);
        w7.g0.r(parcel, q6);
    }
}
