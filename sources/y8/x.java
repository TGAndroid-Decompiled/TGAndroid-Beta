package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(21);
    public final int f54298a;
    public final k f54299b;

    public x(int i10, k kVar) {
        this.f54298a = i10;
        this.f54299b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54298a);
        w7.h0.k(parcel, 3, this.f54299b, i10);
        w7.h0.r(parcel, q6);
    }
}
