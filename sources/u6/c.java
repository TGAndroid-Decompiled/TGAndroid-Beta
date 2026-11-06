package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new x(29);
    public final int f56266a;
    public final boolean f56267b;

    public c(int i7, boolean z9) {
        this.f56266a = i7;
        this.f56267b = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f56266a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f56267b ? 1 : 0);
        xb.s(parcel, r10);
    }
}
