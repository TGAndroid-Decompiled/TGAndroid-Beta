package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;
import q6.w;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(14);
    public final int f56486a;
    public final w f56487b;

    public g(int i7, w wVar) {
        this.f56486a = i7;
        this.f56487b = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f56486a);
        bc.k(parcel, 2, this.f56487b, i7);
        bc.s(parcel, r10);
    }
}
