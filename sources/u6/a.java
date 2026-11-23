package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import q4.x;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(27);
    public final boolean f58439a;
    public final int f58440b;

    public a(int i7, boolean z10) {
        this.f58439a = z10;
        this.f58440b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f58439a ? 1 : 0);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f58440b);
        cc.s(parcel, r10);
    }
}
