package x5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class f0 extends y5.a {
    public static final Parcelable.Creator<f0> CREATOR = new w7.i(9);
    public Bundle f48910a;
    public u5.c[] f48911b;
    public int f48912c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.b(parcel, 1, this.f48910a);
        p8.o(parcel, 2, this.f48911b, i9);
        int i10 = this.f48912c;
        p8.s(parcel, 3, 4);
        parcel.writeInt(i10);
        p8.k(parcel, 4, this.d, i9);
        p8.r(parcel, q10);
    }
}
