package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new u8.o(26);
    public String f59326a;
    public Bundle f59327b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f59326a);
        xb.b(parcel, 3, this.f59327b);
        xb.s(parcel, r10);
    }
}
