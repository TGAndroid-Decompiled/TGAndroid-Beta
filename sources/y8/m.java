package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new u8.o(24);
    public ArrayList f61091a;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.n(parcel, 1, this.f61091a);
        bc.s(parcel, r10);
    }
}
