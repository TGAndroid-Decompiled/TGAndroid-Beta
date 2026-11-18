package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new q4.x(9);
    public Bundle f55907a;
    public n6.c[] f55908b;
    public int f55909c;
    public f d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.b(parcel, 1, this.f55907a);
        bc.o(parcel, 2, this.f55908b, i7);
        int i10 = this.f55909c;
        bc.q(parcel, 3, 4);
        parcel.writeInt(i10);
        bc.k(parcel, 4, this.d, i7);
        bc.s(parcel, r10);
    }
}
