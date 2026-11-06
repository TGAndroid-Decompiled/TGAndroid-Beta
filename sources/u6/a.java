package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(27);
    public final boolean f56263a;
    public final int f56264b;

    public a(int i7, boolean z9) {
        this.f56263a = z9;
        this.f56264b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f56263a ? 1 : 0);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f56264b);
        xb.s(parcel, r10);
    }
}
