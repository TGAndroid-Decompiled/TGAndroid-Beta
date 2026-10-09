package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class z extends o6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(21);
    public final int f51853a;
    public final m f51854b;

    public z(int i10, m mVar) {
        this.f51853a = i10;
        this.f51854b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51853a);
        w7.d0.k(parcel, 3, this.f51854b, i10);
        w7.d0.r(parcel, q6);
    }
}
