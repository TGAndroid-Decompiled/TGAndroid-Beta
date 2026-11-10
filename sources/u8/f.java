package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new o(5);
    public int f56431a;
    public String f56432b;
    public String f56433c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f56431a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f56432b);
        xb.l(parcel, 4, this.f56433c);
        xb.l(parcel, 5, this.d);
        xb.s(parcel, r10);
    }
}
