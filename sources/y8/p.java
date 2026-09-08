package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p extends o6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int f49660a;
    public final b f49661b;

    public p(int i10, b bVar) {
        this.f49660a = i10;
        this.f49661b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49660a);
        w7.e0.k(parcel, 3, this.f49661b, i10);
        w7.e0.r(parcel, q6);
    }
}
