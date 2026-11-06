package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new u8.o(26);
    public String f59207a;
    public Bundle f59208b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f59207a);
        wb.b(parcel, 3, this.f59208b);
        wb.s(parcel, r10);
    }
}
