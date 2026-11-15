package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q4.x;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new x(29);
    public final int f57864a;
    public final boolean f57865b;

    public c(int i7, boolean z10) {
        this.f57864a = i7;
        this.f57865b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f57864a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f57865b ? 1 : 0);
        yb.s(parcel, r10);
    }
}
