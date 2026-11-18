package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new o(5);
    public int f58495a;
    public String f58496b;
    public String f58497c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f58495a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f58496b);
        bc.l(parcel, 4, this.f58497c);
        bc.l(parcel, 5, this.d);
        bc.s(parcel, r10);
    }
}
