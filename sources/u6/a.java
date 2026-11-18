package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(27);
    public final boolean f58428a;
    public final int f58429b;

    public a(int i7, boolean z10) {
        this.f58428a = z10;
        this.f58429b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f58428a ? 1 : 0);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f58429b);
        bc.s(parcel, r10);
    }
}
