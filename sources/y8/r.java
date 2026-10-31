package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(15);
    public final int f54270a;
    public final boolean f54271b;
    public final boolean f54272c;

    public r(int i10, boolean z10, boolean z11) {
        this.f54270a = i10;
        this.f54271b = z10;
        this.f54272c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54270a);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f54271b ? 1 : 0);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.f54272c ? 1 : 0);
        w7.h0.r(parcel, q6);
    }
}
