package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(0);
    public int f56277a;
    public String[] f56278b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f56277a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.m(parcel, 3, this.f56278b);
        wb.s(parcel, r10);
    }
}
