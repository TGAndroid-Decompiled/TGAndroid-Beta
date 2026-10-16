package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(22);
    public final int f48580a;
    public final String f48581b;

    public a0(int i10, String str) {
        this.f48580a = i10;
        this.f48581b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48580a);
        w7.f0.l(parcel, 3, this.f48581b);
        w7.f0.r(parcel, q6);
    }
}
