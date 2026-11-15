package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new u8.o(26);
    public String f60545a;
    public Bundle f60546b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f60545a);
        yb.b(parcel, 3, this.f60546b);
        yb.s(parcel, r10);
    }
}
