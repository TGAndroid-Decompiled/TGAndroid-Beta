package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(27);
    public final boolean f56239a;
    public final int f56240b;

    public a(int i7, boolean z9) {
        this.f56239a = z9;
        this.f56240b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f56239a ? 1 : 0);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f56240b);
        wb.s(parcel, r10);
    }
}
