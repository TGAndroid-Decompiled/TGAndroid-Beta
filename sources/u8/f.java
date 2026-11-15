package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new o(5);
    public int f57930a;
    public String f57931b;
    public String f57932c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.f57930a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 3, this.f57931b);
        yb.l(parcel, 4, this.f57932c);
        yb.l(parcel, 5, this.d);
        yb.s(parcel, r10);
    }
}
