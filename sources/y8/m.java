package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new u8.o(24);
    public ArrayList f59306a;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.n(parcel, 1, this.f59306a);
        xb.s(parcel, r10);
    }
}
