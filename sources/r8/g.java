package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;
import q6.w;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(14);
    public final int f54429a;
    public final w f54430b;

    public g(int i7, w wVar) {
        this.f54429a = i7;
        this.f54430b = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f54429a);
        xb.k(parcel, 2, this.f54430b, i7);
        xb.s(parcel, r10);
    }
}
