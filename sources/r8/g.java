package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q4.x;
import q6.w;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(14);
    public final int f55912a;
    public final w f55913b;

    public g(int i7, w wVar) {
        this.f55912a = i7;
        this.f55913b = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f55912a);
        yb.k(parcel, 2, this.f55913b, i7);
        yb.s(parcel, r10);
    }
}
