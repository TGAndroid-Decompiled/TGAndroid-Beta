package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new u8.o(29);
    public ArrayList f60480a;
    public boolean f60481b;
    public boolean f60482c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.h(parcel, 1, this.f60480a);
        boolean z10 = this.f60481b;
        yb.q(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f60482c;
        yb.q(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i10 = this.d;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        yb.s(parcel, r10);
    }
}
