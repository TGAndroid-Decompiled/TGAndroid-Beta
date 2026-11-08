package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(22);
    public final int f53504a;
    public final boolean f53505b;

    public h(int i7, boolean z9) {
        this.f53504a = i7;
        this.f53505b = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f53504a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f53505b ? 1 : 0);
        xb.s(parcel, r10);
    }
}
