package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new q4.x(7);
    public final int f53826a;
    public final boolean f53827b;
    public final boolean f53828c;
    public final int d;
    public final int f53829e;

    public o(int i7, int i10, int i11, boolean z9, boolean z10) {
        this.f53826a = i7;
        this.f53827b = z9;
        this.f53828c = z10;
        this.d = i10;
        this.f53829e = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53826a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f53827b ? 1 : 0);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f53828c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f53829e);
        xb.s(parcel, r10);
    }
}
