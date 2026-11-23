package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import q4.x;
import q6.w;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(14);
    public final int f56496a;
    public final w f56497b;

    public g(int i7, w wVar) {
        this.f56496a = i7;
        this.f56497b = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f56496a);
        cc.k(parcel, 2, this.f56497b, i7);
        cc.s(parcel, r10);
    }
}
