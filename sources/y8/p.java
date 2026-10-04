package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p extends o6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int f50521a;
    public final b f50522b;

    public p(int i10, b bVar) {
        this.f50521a = i10;
        this.f50522b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50521a);
        w7.g0.k(parcel, 3, this.f50522b, i10);
        w7.g0.r(parcel, q6);
    }
}
