package z5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class f0 extends a6.a {
    public static final Parcelable.Creator<f0> CREATOR = new w5.k(21);
    public Bundle f50610a;
    public w5.c[] f50611b;
    public int f50612c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.b(parcel, 1, this.f50610a);
        com.google.android.gms.internal.cast.o.o(parcel, 2, this.f50611b, i10);
        int i11 = this.f50612c;
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.d, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
