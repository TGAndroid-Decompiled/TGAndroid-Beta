package x7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new w7.f(8);

    public final int f49379a;

    public final boolean f49380b;

    public h(int i10, boolean z10) {
        this.f49379a = i10;
        this.f49380b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f49379a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f49380b ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
