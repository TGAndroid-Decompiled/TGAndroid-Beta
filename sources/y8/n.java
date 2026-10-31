package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(11);
    public final int f54254a;
    public final b f54255b;

    public n(int i10, b bVar) {
        this.f54254a = i10;
        this.f54255b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54254a);
        w7.h0.k(parcel, 3, this.f54255b, i10);
        w7.h0.r(parcel, q6);
    }
}
