package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p extends o6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int f52033a;
    public final b f52034b;

    public p(int i10, b bVar) {
        this.f52033a = i10;
        this.f52034b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52033a);
        w7.c0.k(parcel, 3, this.f52034b, i10);
        w7.c0.r(parcel, q6);
    }
}
