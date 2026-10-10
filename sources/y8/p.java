package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p extends o6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int f51853a;
    public final b f51854b;

    public p(int i10, b bVar) {
        this.f51853a = i10;
        this.f51854b = bVar;
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
