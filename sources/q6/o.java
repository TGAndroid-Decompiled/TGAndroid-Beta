package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new q4.x(7);
    public final int f53919a;
    public final boolean f53920b;
    public final boolean f53921c;
    public final int d;
    public final int f53922e;

    public o(int i7, int i10, int i11, boolean z9, boolean z10) {
        this.f53919a = i7;
        this.f53920b = z9;
        this.f53921c = z10;
        this.d = i10;
        this.f53922e = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53919a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f53920b ? 1 : 0);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f53921c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f53922e);
        xb.s(parcel, r10);
    }
}
