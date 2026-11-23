package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new q4.x(9);
    public Bundle f55917a;
    public n6.c[] f55918b;
    public int f55919c;
    public f d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.b(parcel, 1, this.f55917a);
        cc.o(parcel, 2, this.f55918b, i7);
        int i10 = this.f55919c;
        cc.q(parcel, 3, 4);
        parcel.writeInt(i10);
        cc.k(parcel, 4, this.d, i7);
        cc.s(parcel, r10);
    }
}
