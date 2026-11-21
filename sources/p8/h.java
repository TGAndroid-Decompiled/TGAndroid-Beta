package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(22);
    public final int f55539a;
    public final boolean f55540b;

    public h(int i7, boolean z10) {
        this.f55539a = i7;
        this.f55540b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f55539a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f55540b ? 1 : 0);
        bc.s(parcel, r10);
    }
}
