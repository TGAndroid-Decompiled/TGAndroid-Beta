package r5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import q6.r0;
public final class a0 extends c6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(28);
    public final boolean f46720a;

    public a0(boolean z4) {
        this.f46720a = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f46720a ? 1 : 0);
        g5.r(parcel, q10);
    }
}
