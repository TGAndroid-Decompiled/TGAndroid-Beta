package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new q4.x(9);
    public Bundle f55333a;
    public n6.c[] f55334b;
    public int f55335c;
    public f d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.b(parcel, 1, this.f55333a);
        yb.o(parcel, 2, this.f55334b, i7);
        int i10 = this.f55335c;
        yb.q(parcel, 3, 4);
        parcel.writeInt(i10);
        yb.k(parcel, 4, this.d, i7);
        yb.s(parcel, r10);
    }
}
