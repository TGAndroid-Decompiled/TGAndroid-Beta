package y7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import w7.i;
import x5.u;
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new i(16);
    public final int f49616a;
    public final u f49617b;

    public g(int i9, u uVar) {
        this.f49616a = i9;
        this.f49617b = uVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f49616a);
        p8.k(parcel, 2, this.f49617b, i9);
        p8.r(parcel, q10);
    }
}
