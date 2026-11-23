package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import q4.x;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new x(29);
    public final int f58442a;
    public final boolean f58443b;

    public c(int i7, boolean z10) {
        this.f58442a = i7;
        this.f58443b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f58442a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f58443b ? 1 : 0);
        cc.s(parcel, r10);
    }
}
