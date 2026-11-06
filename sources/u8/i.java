package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new o(10);
    public int f56316a;
    public String f56317b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f56316a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.l(parcel, 3, this.f56317b);
        wb.s(parcel, r10);
    }
}
