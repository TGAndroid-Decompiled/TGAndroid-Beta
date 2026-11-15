package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(27);
    public final boolean f57861a;
    public final int f57862b;

    public a(int i7, boolean z10) {
        this.f57861a = z10;
        this.f57862b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f57861a ? 1 : 0);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f57862b);
        yb.s(parcel, r10);
    }
}
