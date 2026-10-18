package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class z extends o6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(21);
    public final int f50074a;
    public final m f50075b;

    public z(int i10, m mVar) {
        this.f50074a = i10;
        this.f50075b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50074a);
        w7.f0.k(parcel, 3, this.f50075b, i10);
        w7.f0.r(parcel, q6);
    }
}
