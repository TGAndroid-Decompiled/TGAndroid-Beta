package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new u8.o(22);
    public int f59185a;
    public Bundle f59186b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.f59185a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.b(parcel, 3, this.f59186b);
        wb.s(parcel, r10);
    }
}
