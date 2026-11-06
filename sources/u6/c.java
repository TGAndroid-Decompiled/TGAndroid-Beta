package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q4.x;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new x(29);
    public final int f56242a;
    public final boolean f56243b;

    public c(int i7, boolean z9) {
        this.f56242a = i7;
        this.f56243b = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f56242a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f56243b ? 1 : 0);
        wb.s(parcel, r10);
    }
}
