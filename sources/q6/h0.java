package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new q4.x(9);
    public Bundle f53791a;
    public n6.c[] f53792b;
    public int f53793c;
    public f d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.b(parcel, 1, this.f53791a);
        xb.o(parcel, 2, this.f53792b, i7);
        int i10 = this.f53793c;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i10);
        xb.k(parcel, 4, this.d, i7);
        xb.s(parcel, r10);
    }
}
