package r5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import q6.r0;
public final class a0 extends c6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(28);
    public final boolean f43342a;

    public a0(boolean z4) {
        this.f43342a = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f43342a ? 1 : 0);
        f5.r(parcel, q10);
    }
}
