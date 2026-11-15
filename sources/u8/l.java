package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new o(11);
    public String f57946a;
    public String f57947b;
    public int f57948c;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f57946a);
        yb.l(parcel, 3, this.f57947b);
        int i10 = this.f57948c;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        yb.s(parcel, r10);
    }
}
